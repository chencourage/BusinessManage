package com.yst.service.dict.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.google.gson.reflect.TypeToken;
import com.yst.core.manager.entity.TDictionaryAction;
import com.yst.core.manager.entity.TDictionarySet;
import com.yst.core.manager.entity.TDictionaryType;
import com.yst.core.manager.service.ITDictionarySetService;
import com.yst.core.manager.service.ITDictionaryTypeService;
import com.yst.core.manager.service.impl.TDictionaryActionService;
import com.yst.service.dict.constants.PageConstants;
import com.yst.service.dict.service.ICommonJDBCService;
import com.yst.service.dict.service.IPageDataService;
import com.yst.service.dict.vo.PageDataVo;
import com.yst.support.util.GoogleJsonUtils;
import com.yst.support.util.StringUtil;

/**
 * 查询页面配置，勿改动
 * @author chenk
 *
 */
@Service
public class PageDataService implements IPageDataService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ITDictionaryTypeService dictionaryTypeService;
	
	@Autowired
	private ITDictionarySetService dictionarySetService;
	
	@Autowired
	private TDictionaryActionService dictionaryActionService;
	
	@Autowired
	ICommonJDBCService commonJDBCService;

	/**
	 * 取数据类型配置
	 * @param typeCode
	 * @return
	 */
	@Override
	public PageDataVo getPageData(String typeCode) {
		PageDataVo pageDataVo = new PageDataVo();
		TDictionaryType dictionaryType = dictionaryTypeService.selectById(typeCode);//查询列表类型
		pageDataVo.setDictionaryType(dictionaryType);
		
		Wrapper<TDictionarySet> setwrapper = new EntityWrapper<TDictionarySet>();//查询列表列
		setwrapper.eq("DATA_TYPE_CODE", typeCode);
		setwrapper.orderBy("sort_sign", false);
		List<TDictionarySet> dictionarySet = dictionarySetService.selectList(setwrapper);
		pageDataVo.setDictionarySet(dictionarySet);
		setwrapper.eq("IS_SEARCH", "1");//查询条件
		List<TDictionarySet> conditionSet = dictionarySetService.selectList(setwrapper);
		pageDataVo.setDictionaryCondition(conditionSet);
		
		setwrapper = new EntityWrapper<TDictionarySet>();//查询键
		setwrapper.eq("DATA_TYPE_CODE", typeCode);
		setwrapper.eq("IS_EDIT", "1");//
		List<TDictionarySet> editableSet = dictionarySetService.selectList(setwrapper);
		pageDataVo.setEditableSet(editableSet);
		
		setwrapper = new EntityWrapper<TDictionarySet>();//查询键
		setwrapper.eq("DATA_TYPE_CODE", typeCode);
		setwrapper.eq("IS_PRIMARY", "1");//
		List<TDictionarySet> primarySet = dictionarySetService.selectList(setwrapper);
		pageDataVo.setPrimarySet(primarySet);
		
		if(StringUtils.isNotBlank(dictionaryType.getOtherFlag())) {//查询列按钮
			Wrapper<TDictionaryAction> actionwrapper = new EntityWrapper<TDictionaryAction>();
			actionwrapper.in("code", dictionaryType.getOtherFlag());
			List<TDictionaryAction> dictionaryActions = dictionaryActionService.selectList(actionwrapper);
			pageDataVo.setDictionaryAction(dictionaryActions);
		}
		return pageDataVo;
	}

	/**
	 * 
	 * 查通用列表返回多条数据
	 */
	@Override
	public Map<String, Object> getCommData(String typeCode, String param) throws Exception {
		logger.info("查询通用列表请求参数：{}，{}",typeCode,param);
		Map<String, Object> result = new HashMap<String, Object>();
		PageDataVo pageDataVo = getPageData(typeCode);
		String sql = pageDataVo.getQuerySql();
		Map<String,Object> params = GoogleJsonUtils.fromJson(param, Map.class);
		List<TDictionarySet> conditionSet = pageDataVo.getDictionaryCondition();//解析参数里面的条件字段
		if(conditionSet!=null&&conditionSet.size()>0) {
			for(TDictionarySet tds:conditionSet) {
				String dataType = tds.getDataType();
				//String fileCode = tds.getFieldCode();
				//如果字段类型是日期时间类型
				if(PageConstants.DATE_STR.equals(dataType)||PageConstants.DATETIME_STR.equals(dataType)||PageConstants.TIMESTAMP_STR.equals(dataType)) {
					Object minobj = params.get("min_"+tds.getFieldCode());
					if(minobj!=null) {
						sql +=" and " + tds.getBfsCode()+" >=:"+"min_"+tds.getFieldCode();
					}
					Object maxobj = params.get("max_"+tds.getFieldCode());
					if(maxobj!=null) {
						sql +=" and " + tds.getBfsCode()+" <=:"+"max_"+tds.getFieldCode();
					}
				}else {//否则
					Object obj = params.get(tds.getFieldCode());
					String queryType = tds.getQueryType();
					if(obj instanceof java.lang.String) {
						if(StringUtil.isEmpty(queryType)) {
							sql +=" and " + tds.getBfsCode()+" =:"+tds.getFieldCode();
						}else if(PageConstants.LIKE_STR.equals(queryType)) {
							sql +=" and " + tds.getBfsCode()+" like '%'|| :"+tds.getFieldCode()+" ||'%' ";
						}else if(PageConstants.IN_STR.equals(queryType)) {
							sql +=" and " + tds.getBfsCode()+" in ( :"+tds.getFieldCode()+" ) ";
						}else {
							sql +=" and " + tds.getBfsCode()+" =:"+tds.getFieldCode();
						}
					}else if(obj instanceof java.util.List) {
						sql +=" and " + tds.getBfsCode()+" in ( :"+tds.getFieldCode()+" ) ";
					}
				}
			}
			sql += " " + pageDataVo.getOrderFlag();
		}else {
			logger.info("没有配置列表信息");
			return result;
		}
		logger.info("请求SQL：{}",sql);
		List<Map<String, Object>> rows = null;
		//如果有分页信息
		if(params.get("pageInfo")!=null) {
			Map<String,Object> pageInfo = (Map<String, Object>) params.get("pageInfo");
			//查总数
			String countSql = StringUtil.replaceBetweenOut(sql, "select", "from", " count(*) as totalCount ");
			logger.info("分页sql为：{}",countSql);
			Map<String, Object> totalCount = commonJDBCService.getCountData(pageDataVo.getDictionaryType().getDbTemplate(),countSql, params);
			pageInfo.putAll(totalCount);
			//查分页  计算分页信息
			int pageSize = 10;
			int pageIndex = 1;
			if(null!=pageInfo.get("pageSize")) {
				pageSize = StringUtil.toInt(pageInfo.get("pageSize"));
			}
			if(null!=pageInfo.get("pageIndex")) {
				pageIndex = StringUtil.toInt(pageInfo.get("pageIndex"));
			}
			int startRow = (pageIndex-1)*pageSize+1;
			int endRow = pageIndex*pageSize;
			params.put("startRow", startRow);
			params.put("endRow", endRow);
			
			String pageSql = PageConstants.PAGE_SQL.replace("{Sql}", sql);
			logger.info("分页sql为：{}",pageSql);
			rows = commonJDBCService.getCommonData(pageDataVo.getDictionaryType().getDbTemplate(),pageSql, params);
			
			result.put("pageInfo", pageInfo);
		}else {//如果没有分页信息
			rows = commonJDBCService.getCommonData(pageDataVo.getDictionaryType().getDbTemplate(),sql, params);
		}
		result.put("data", rows);
		return result;
	}

	/**
	 * 通用明细查询 返回单条记录
	 */
	@Override
	public Map<String, Object> getCommDetail(String typeCode, String param) throws Exception {
		logger.info("查询通用明细请求参数：{}，{}",typeCode,param);
		Map<String, Object> result = new HashMap<String, Object>();
		PageDataVo pageDataVo = getPageData(typeCode);
		String sql = pageDataVo.getQuerySql();
		Map<String,Object> params = GoogleJsonUtils.fromJson(param, Map.class);
		List<TDictionarySet> conditionSet = pageDataVo.getDictionaryCondition();//解析参数里面的条件字段
		if(conditionSet!=null&&conditionSet.size()>0) {
			for(TDictionarySet tds:conditionSet) {
				String dataType = tds.getDataType();
				//String fileCode = tds.getFieldCode();
				//如果字段类型是日期时间类型
				if(PageConstants.DATE_STR.equals(dataType)||PageConstants.DATETIME_STR.equals(dataType)||PageConstants.TIMESTAMP_STR.equals(dataType)) {
					Object minobj = params.get("min_"+tds.getFieldCode());
					if(minobj!=null) {
						sql +=" and " + tds.getBfsCode()+" >=:"+"min_"+tds.getFieldCode();
					}
					Object maxobj = params.get("max_"+tds.getFieldCode());
					if(maxobj!=null) {
						sql +=" and " + tds.getBfsCode()+" <=:"+"max_"+tds.getFieldCode();
					}
				}else {//否则
					Object obj = params.get(tds.getFieldCode());
					String queryType = tds.getQueryType();
					if(obj instanceof java.lang.String) {
						if(StringUtil.isEmpty(queryType)) {
							sql +=" and " + tds.getBfsCode()+" =:"+tds.getFieldCode();
						}else if(PageConstants.LIKE_STR.equals(queryType)) {
							sql +=" and " + tds.getBfsCode()+" like '%'|| :"+tds.getFieldCode()+" ||'%' ";
						}else if(PageConstants.IN_STR.equals(queryType)) {
							sql +=" and " + tds.getBfsCode()+" in ( :"+tds.getFieldCode()+" ) ";
						}else {
							sql +=" and " + tds.getBfsCode()+" =:"+tds.getFieldCode();
						}
					}else if(obj instanceof java.util.List) {
						sql +=" and " + tds.getBfsCode()+" in ( :"+tds.getFieldCode()+" ) ";
					}
				}
			}
		}
		logger.info("请求SQL：{}",sql);
		Map<String, Object> data = commonJDBCService.getCommonQuery(pageDataVo.getDictionaryType().getDbTemplate(), sql, params);
		result.put("data", data);
		return result;
	}
	
	public Map<String, Object> getBatchRes(int[] res,List<Map<String,Object>> params){
		Map<String, Object> result = new HashMap<String, Object>();
		boolean isSuccess = true;
		for(int i=0;i<res.length;i++) {
			logger.info("执行请求结果为：{}，参数{}",res[i],GoogleJsonUtils.toJson(params.get(i)));
			if(isSuccess) {
				if(res[i]<=0) {
					isSuccess = false;
				}
			}
		}
		if(isSuccess) {
			result.put("code", "00");
			result.put("msg", "操作成功！");
		}else {
			result.put("code", "55");
			result.put("msg", "操作失败！");
		}
		return result;
	}

	/**
	 * 
	 * 某个行为需要触发一个或多个sql可批量执行
	 */
	@Override
	public Map<String, Object> executeData(String typeCode, String actionCode, String param) throws Exception {
		logger.info("通用执行请求参数：{}，{}",typeCode,param);
		Map<String, Object> result = new HashMap<String, Object>();
		PageDataVo pageDataVo = getPageData(typeCode);
		String actions = pageDataVo.getDictionaryType().getOtherFlag();//取配置的按钮
		if(StringUtil.isNotEmpty(actions)) {
			List<String> listAct = Arrays.asList(actions.split(","));
			if(listAct.contains(actionCode)) {
				TDictionaryAction action = pageDataVo.getAction(actionCode);//查询
				if(null!=action) {
					if(PageConstants.IS_BATCH_UPDATE.equals(action.getIsbatch())) {//批量执行，param必须是数组json
						List<Map<String,Object>> params = GoogleJsonUtils.fromJson(param, new TypeToken<List<Map<String,Object>>>(){}.getType());
						logger.info("通用批量执行sql为{}请求参数：{}",action.getExecuted(),param);
						int[] res = commonJDBCService.batchUpdate(pageDataVo.getDictionaryType().getDbTemplate(), action.getExecuted(), (Map<String,Object>[])params.toArray());
						logger.info("通用sql批量执行结果为：{}",GoogleJsonUtils.toJson(res));
						result = getBatchRes(res,params);
					}else {//非批量执行
						Map<String,Object> params = GoogleJsonUtils.fromJson(param, Map.class);
						String executeSql = action.getExecuted();
						logger.info("通用执行sql为{}请求参数：{}",executeSql,param);
						if(executeSql.indexOf(";")>0) {//如果是多条sql同时执行
							String executeSqls[] = executeSql.split(";");
							for(String sql:executeSqls) {
								logger.info("执行通用sql为：{}",sql);
								int res = commonJDBCService.update(pageDataVo.getDictionaryType().getDbTemplate(), sql, params);
								logger.info("执行通用sql为：{},结果为：",sql,res);
								if(res>0) {
									result.put("code", "00");
									result.put("msg", "操作成功！");
								}else {
									result.put("code", "55");
									result.put("msg", "操作失败！");
									break;
								}
							}
						}else {//单条sql
							logger.info("执行通用sql为：{}",action.getExecuted());
							int res = commonJDBCService.update(pageDataVo.getDictionaryType().getDbTemplate(), action.getExecuted(), params);
							logger.info("执行通用sql为：{},结果为：",action.getExecuted(),res);
							if(res>0) {
								result.put("code", "00");
								result.put("msg", "操作成功！");
							}
						}
					}
				}
				
			}else {
				logger.info("{}：配置行为按钮不存在{}",typeCode,actionCode);
				result.put("code", "99");
				result.put("msg", "没有该操作权限！");
			}
		}else {
			logger.info("{}：没有配置行为按钮",typeCode);
			result.put("code", "88");
			result.put("msg", "当前页面没有配置该操作！");
		}
		return result;
	}
	
	/**
	 * 通用修改数据
	 * 
	 */
	@Override
	public Map<String, Object> updateData(String typeCode, String param) throws Exception {
		logger.info("通用修改请求参数：{}，{}",typeCode,param);
		Map<String, Object> result = new HashMap<String, Object>();
		PageDataVo pageDataVo = getPageData(typeCode);
		String sql = pageDataVo.getUpdateSql();
		logger.info("通用批量执行sql为{}请求参数：{}",sql,param);
		Map<String,Object> params = GoogleJsonUtils.fromJson(param, Map.class);
		int res = commonJDBCService.update(pageDataVo.getDictionaryType().getDbTemplate(), sql, params);
		if(res>0) {
			result.put("code", "00");
			result.put("msg", "保存成功！");
		}else {
			result.put("code", "55");
			result.put("msg", "保存失败！");
		}
		return result;
	}
	
	/**
	 * 通用新增数据
	 * @param typeCode
	 * @param param
	 * @return
	 * @throws Exception
	 */
	@Override
	public Map<String, Object> insertData(String typeCode, String param) throws Exception {
		logger.info("通用新增请求参数：{}，{}",typeCode,param);
		Map<String, Object> result = new HashMap<String, Object>();
		PageDataVo pageDataVo = getPageData(typeCode);
		String sql = pageDataVo.getInsertSql();
		logger.info("通用新增执行sql为{}请求参数：{}",sql,param);
		Map<String,Object> params = GoogleJsonUtils.fromJson(param, Map.class);
		int res = commonJDBCService.update(pageDataVo.getDictionaryType().getDbTemplate(), sql, params);
		if(res>0) {
			result.put("code", "00");
			result.put("msg", "保存成功！");
		}else {
			result.put("code", "55");
			result.put("msg", "保存失败！");
		}
		return result;
	}
	
}
