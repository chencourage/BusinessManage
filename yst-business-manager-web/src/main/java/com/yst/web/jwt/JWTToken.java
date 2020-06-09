package com.yst.web.jwt;

import org.apache.shiro.authc.AuthenticationToken;

public class JWTToken implements AuthenticationToken {
	
    //密钥
    private String token;
//    private String username;
//    private String password;
    
    public JWTToken(String token) {
        this.token = token;
    }
    
//    public JWTToken(String username,String password) {
//        this.username = username;
//        this.password = password;
//    }

	@Override
	public Object getPrincipal() {
		return token;
	}

	@Override
	public Object getCredentials() {
		return token;
	}

//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

}
