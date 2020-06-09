package com.yst.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yst.core.base.BaseController;
import com.yst.support.Constants;
import com.yst.support.enums.ResponseEnum;
import com.yst.support.model.Response;
import com.yst.web.jwt.JWTUtil;
import com.yst.web.util.WebUtils;

@Controller
@RequestMapping
public class LoginController extends BaseController {
	

	@RequestMapping({"/","/index"})
	public String index() {
		log.info("进入首页");
		return "index";
	}
	
	@RequestMapping("login")
	public String loginPage() {
		log.info("进入登录页");
		return "login";
	}
	
	
	@PostMapping("/login")
	@ResponseBody
	public Response<String> login(String username,String password){
		log.info("用户开始登陆:" + username + "," + password);
		Response<String> response = new Response<>();
		//TODO
		String result = doLogin(username, password);
		log.info(result);
		result = "loginSuccess";
		if(Constants.LOGIN_SUCCESS.equals(result)) {
			response.setCode(ResponseEnum.SUCCESS.getCode());
			response.setMsg(ResponseEnum.SUCCESS.getMsg());
			response.setData(JWTUtil.sign(username, password));
		}else {
			response.setCode(ResponseEnum.SYSTEM_EXCEPTION.getCode());
			response.setMsg(result);
		}
		return response;
	}
	
	
	private String doLogin(String username,String password){
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		//JWTToken token = new JWTToken(username, password);
		Subject subject = SecurityUtils.getSubject();
/*		if(StringUtils.isBlank(username)) {
			return "用户名为空";
		}
		if(StringUtils.isBlank(password)) {
			return "密码为空";
		}*/
		try {
			subject.login(token);
		} catch (LockedAccountException e) {
			return "账户被锁定";
		} catch (DisabledAccountException e) {
			return "账户被禁用";
		} catch (UnknownAccountException |IncorrectCredentialsException e) {
			return "用户名或密码错误";
		} catch (AuthenticationException e) {
			return e.getMessage();
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return "系统异常";
		}
		return Constants.LOGIN_SUCCESS;
	}
	
	/**
     * 退出登录
     * @return
     */
    @GetMapping(value = "/logout")
    public Response<String> logout(HttpServletRequest request,HttpServletResponse response) {
    	Subject subject = SecurityUtils.getSubject();
    	WebUtils.removeCurrentUser(request);
    	subject.logout();
        return new Response<String>();
    }
	

}
