package com.yst.service.dict.service;

import java.util.List;
import java.util.Map;

public interface ICommonJDBCService {
	
	/**
	 * 查询列表
	 * @param sql
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> getCommonData(String templateCode,String sql,Map<String,Object> param) throws Exception;
	
	/**
	 * 查询总数
	 * @param sql
	 * @param param
	 * @return
	 */
	public Map<String,Object> getCountData(String templateCode,String sql, Map<String,Object> param) throws Exception;
	
	/**
	 * 查询明细
	 * @param templateCode
	 * @param sql
	 * @param param
	 * @return
	 */
	public Map<String,Object> getCommonQuery(String templateCode,String sql, Map<String,Object> param) throws Exception;
	
	/**
	 * 修改数据
	 * @param templateCode
	 * @param sql
	 * @param param
	 * @return
	 */
	public int update(String templateCode,String sql, Map<String,Object> param) throws Exception;
	
	/**
	 * 批量修改数据
	 * @param templateCode
	 * @param sql
	 * @param param
	 * @return
	 */
	public int[] batchUpdate(String templateCode,String sql, Map<String,Object>[] param) throws Exception;
	
}
