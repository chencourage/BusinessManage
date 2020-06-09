package com.yst.web.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yst.web.util.UserDto;

public class UserRealm extends AuthorizingRealm {
	protected Logger log = LoggerFactory.getLogger(getClass());

	@Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        UserDto user = (UserDto) principals.getPrimaryPrincipal();
        //TODO
        /*List<String> roles = user.getRoles();
        if(roles == null) {
            roles = userService.getUserRoles(user.getUserId());
            user.setRoles(roles);
        }
        if (roles != null)
            simpleAuthorizationInfo.addRoles(roles);*/

        return simpleAuthorizationInfo;
	}

	/**
	 * 登录
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		log.info("开始认证.....................................");
		UsernamePasswordToken authcToken = (UsernamePasswordToken) token;
		String userName = authcToken.getUsername();
		String password = new String(authcToken.getPassword());
		//进行相关数据库业务查询处
		//TODO
		UserDto user = new UserDto();
		user.setUsername(userName);
		user.setEncryptPwd(password);
		AuthenticationInfo  authcInfo = new SimpleAuthenticationInfo(user,user.getEncryptPwd(),getName());
		return authcInfo;
	}
}
