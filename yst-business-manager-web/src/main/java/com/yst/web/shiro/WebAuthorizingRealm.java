package com.yst.web.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yst.web.jwt.JWTToken;
import com.yst.web.jwt.JWTUtil;
import com.yst.web.util.UserDto;

public class WebAuthorizingRealm extends AuthorizingRealm {
	
	protected Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	/**
	 * 验证请求中的token信息
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		log.info("开始认证.....................................");
		String tokenStr = (String) token.getCredentials();
        String username = JWTUtil.getUsername(tokenStr);
        if (username == null) {
            throw new AuthenticationException("token invalid");
        }
        //TODO
        UserDto user = new UserDto();
        
		user.setUsername("test");
		user.setEncryptPwd("098f6bcd4621d373cade4e832627b4f6");
		
        if (!JWTUtil.verify(tokenStr, username, user.getEncryptPwd())) {//验证token是否被修改过
            throw new AuthenticationException("token已过期");
        }
        return new SimpleAuthenticationInfo(user, user.getEncryptPwd(), this.getName());
	}

}
