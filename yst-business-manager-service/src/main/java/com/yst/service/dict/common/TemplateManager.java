package com.yst.service.dict.common;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.yst.support.util.SpringContext;
import com.yst.support.util.StringUtil;

/**
 * 模板管理
 * @author chenk
 *
 */
public class TemplateManager {
	
	private static ConcurrentHashMap<String,NamedParameterJdbcTemplate> templates = new ConcurrentHashMap<String,NamedParameterJdbcTemplate>();
	
	private static String defaultTemplateCode = "managerTemplate";
	
	public synchronized static NamedParameterJdbcTemplate getTemplate(String templateCode) {
		if(StringUtil.isEmpty(templateCode)) {
			templateCode = defaultTemplateCode;
		}
		if(null==templates.get(CommonKeys.TEMPLATE_KEY+templateCode)) {
			NamedParameterJdbcTemplate template = SpringContext.getBean(templateCode,NamedParameterJdbcTemplate.class);
			templates.put(CommonKeys.TEMPLATE_KEY+templateCode, template);
			return template;
		}else {
			return templates.get(CommonKeys.TEMPLATE_KEY+templateCode);
		}
	}
}
