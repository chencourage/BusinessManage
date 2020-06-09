package com.yst.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yst.core.base.BaseController;
import com.yst.service.dict.service.impl.PageDataService;
import com.yst.service.dict.vo.PageDataVo;
import com.yst.support.model.Response;
import com.yst.support.util.GoogleJsonUtils;

/**
 * 通用配置接口
 * @author chenk
 *
 */
@Controller
@RequestMapping("comm")
public class CommonController extends BaseController {
	
	@Autowired
	private PageDataService pageDataService;
	
	/**
	 * 取页面配置
	 * @param typeCode
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getPageConf")
	public Response<PageDataVo> getPageConf(String typeCode,HttpServletRequest request,HttpServletResponse response){
		Response<PageDataVo> resp = new Response<PageDataVo>();
		try {
			log.info("获取页面配置typeCode:{}",typeCode);
			PageDataVo pageDataVo = pageDataService.getPageData(typeCode);
			log.info("获取页面配置typeCode:{},结果：{}",typeCode,GoogleJsonUtils.toJson(pageDataVo));
			resp = success(pageDataVo);
		}catch(Exception e) {
			log.error(e.getMessage(),e);
			resp = failed();
		}
		return resp;
	}
	
	/**
	 * 取页面列表数据
	 * @param typeCode
	 * @param param
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getCommData")
	public Response<String> getCommData(String typeCode,String param,HttpServletRequest request,HttpServletResponse response){
		Response<String> resp = new Response<String>();
		try {
			log.info("获取页面数据typeCode:{},参数：{}",typeCode,param);
			Map<String, Object> res = pageDataService.getCommData(typeCode, param);
			String result = GoogleJsonUtils.toJson(res);
			log.info("获取页面数据typeCode:{},结果：{}",typeCode,result);
			resp = success(result);
		}catch(Exception e) {
			log.error(e.getMessage(),e);
			resp = failed();
		}
		return resp;
	}
	
	/**
	 * 取页面明细数据
	 * @param typeCode
	 * @param param
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getCommDetail")
	public Response<String> getCommDetail(String typeCode,String param,HttpServletRequest request,HttpServletResponse response){
		Response<String> resp = new Response<String>();
		try {
			log.info("获取明细配置typeCode:{},参数：{}",typeCode,param);
			Map<String, Object> res = pageDataService.getCommDetail(typeCode, param);
			String result = GoogleJsonUtils.toJson(res);
			log.info("获取明细配置typeCode:{},结果：{}",typeCode,result);
			resp = success(result);
		}catch(Exception e) {
			log.error(e.getMessage(),e);
			resp = failed();
		}
		return resp;
	}
	
	/**
	 * 执行按钮中的SQL
	 * @param typeCode
	 * @param actionCode
	 * @param param
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("executeData")
	public Response<String> executeData(String typeCode,String actionCode,String param,HttpServletRequest request,HttpServletResponse response){
		Response<String> resp = new Response<String>();
		try {
			log.info("获取执行指令配置typeCode:{},action:{},参数：{}",typeCode,actionCode,param);
			Map<String, Object> res = pageDataService.executeData(typeCode,actionCode, param);
			String result = GoogleJsonUtils.toJson(res);
			log.info("获取执行指令配置typeCode:{},action:{},结果：{}",typeCode,actionCode,result);
			resp = success(result);
		}catch(Exception e) {
			log.error(e.getMessage(),e);
			resp = failed();
		}
		return resp;
	}
	
	/**
	 * 修改页面数据
	 * @param typeCode
	 * @param param
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("updateData")
	public Response<String> updateData(String typeCode,String param,HttpServletRequest request,HttpServletResponse response){
		Response<String> resp = new Response<String>();
		try {
			log.info("获取执行指令配置typeCode:{},参数：{}",typeCode,param);
			Map<String, Object> res = pageDataService.updateData(typeCode, param);
			String result = GoogleJsonUtils.toJson(res);
			log.info("获取执行指令配置typeCode:{},结果：{}",typeCode,result);
			resp = success(result);
		}catch(Exception e) {
			log.error(e.getMessage(),e);
			resp = failed();
		}
		return resp;
	}
	
	/**
	 * 插入页面数据
	 * @param typeCode
	 * @param param
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("insertData")
	public Response<String> insertData(String typeCode,String param,HttpServletRequest request,HttpServletResponse response){
		Response<String> resp = new Response<String>();
		try {
			log.info("获取执行指令配置typeCode:{},参数：{}",typeCode,param);
			Map<String, Object> res = pageDataService.insertData(typeCode, param);
			String result = GoogleJsonUtils.toJson(res);
			log.info("获取执行指令配置typeCode:{},结果：{}",typeCode,result);
			resp = success(result);
		}catch(Exception e) {
			log.error(e.getMessage(),e);
			resp = failed();
		}
		return resp;
	}
	
}
