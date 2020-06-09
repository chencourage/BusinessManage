package com.yst.support.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;

public class DecryptDruidDataSource extends DruidDataSource {

	protected Logger log = LoggerFactory.getLogger(getClass());

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public void setUsername(String username) {
		try {
			username = ConfigTools.decrypt(username);
		} catch (Exception e) {
			log.error("数据库用户名解密失败:" + e.getMessage(), e);;
		}
		super.setUsername(username);
		
	}
	
	public void setPassword(String password) {
		try {
			password = ConfigTools.decrypt(password);
		} catch (Exception e) {
			log.error("数据库密码解密失败:" + e.getMessage(), e);;
		}
		super.setPassword(password);
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(ConfigTools.encrypt("yspay_mobile"));
		System.out.println(ConfigTools.encrypt("mobile!123"));

	}

}
