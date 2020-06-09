package com.yst.web.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserCredentialsMatcher extends SimpleCredentialsMatcher {
	protected Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		log.info("认证密码.................");
		String pwd = new String(((UsernamePasswordToken) token).getPassword());
		return pwd.equals(info.getCredentials().toString());
	}
}
