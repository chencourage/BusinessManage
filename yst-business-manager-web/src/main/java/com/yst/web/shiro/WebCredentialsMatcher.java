package com.yst.web.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yst.web.jwt.JWTUtil;
import com.yst.web.util.UserDto;

public class WebCredentialsMatcher extends SimpleCredentialsMatcher {
	
	protected Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		log.info("认证密码.................");
		String tokenStr = (String) token.getCredentials();
		UserDto user = (UserDto)info.getPrincipals().getPrimaryPrincipal();
		String credential = (String) info.getCredentials();
		boolean res = JWTUtil.verify(tokenStr, user.getUsername(), credential);
		return res;
	}

}
