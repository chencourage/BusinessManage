package com.yst.service.dict.service;

import java.util.Map;

import com.yst.service.dict.vo.PageDataVo;

public interface IPageDataService {
	
	/**
	 * 查询总配置
	 * 取数据类型配置
	 * @param typeCode
	 * @return
	 */
	public PageDataVo getPageData(String typeCode);
	
	/**
	 * 查询列表数据及分页
	 * 取接口数据
	 * @param typeCode
	 * @param param
	 * @return
	 */
	public Map<String, Object> getCommData(String typeCode,String param) throws Exception;
	
	/**
	 * 查询详细数据返回单条
	 * @param typeCode
	 * @param param
	 * @return
	 */
	public Map<String,Object> getCommDetail(String typeCode,String param) throws Exception;
	
	/**
	 * 执行增删改，批次之类按钮行为
	 * @param typeCode
	 * @param actionCode
	 * @param param
	 * @return
	 */
	public Map<String, Object> executeData(String typeCode,String actionCode,String param) throws Exception;
	
	/**
	 * 修改
	 * @param typeCode
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> updateData(String typeCode, String param) throws Exception;
	
	/**
	 * 新增
	 * @param typeCode
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> insertData(String typeCode, String param) throws Exception;
}
