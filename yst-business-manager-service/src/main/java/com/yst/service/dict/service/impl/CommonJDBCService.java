package com.yst.service.dict.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yst.service.dict.common.TemplateManager;
import com.yst.service.dict.service.ICommonJDBCService;

/**
 * 特用JDBC
 * @author chenkai
 *
 */
@Service
public class CommonJDBCService implements ICommonJDBCService {
	
	@Override
	public List<Map<String, Object>> getCommonData(String templateCode, String sql, Map<String,Object> param) throws Exception {
		return TemplateManager.getTemplate(templateCode).queryForList(sql, param);
	}
	
	@Override
	public Map<String,Object> getCountData(String templateCode,String sql, Map<String,Object> param) throws Exception  {
		return TemplateManager.getTemplate(templateCode).queryForMap(sql, param);
	}

	@Override
	public Map<String, Object> getCommonQuery(String templateCode, String sql, Map<String, Object> param) throws Exception  {
		return TemplateManager.getTemplate(templateCode).queryForMap(sql, param);
	}

	@Override
	public int update(String templateCode, String sql, Map<String, Object> param) throws Exception  {
		return TemplateManager.getTemplate(templateCode).update(sql, param);
	}

	@Override
	public int[] batchUpdate(String templateCode, String sql, Map<String, Object>[] params) throws Exception  {
		return TemplateManager.getTemplate(templateCode).batchUpdate(sql, params);
	}
}
