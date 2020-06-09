package com.yst.core.base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yst.support.enums.ResponseEnum;
import com.yst.support.model.Response;

public abstract class BaseController {
	protected Logger log = LoggerFactory.getLogger(getClass());
//	@Autowired
//	private IUserService userService;
	
	private static Set<String> imgExts = new HashSet<>(Arrays.asList("jpg","jpeg","png","bmp","tif","gif"));
	

	protected <T>Response<T> failed(ResponseEnum resEnum,T data) {
		return new Response<T>(resEnum, data);
	}
	protected <T>Response<T> failed(ResponseEnum resEnum) {
		return new Response<T>(resEnum);
	}
	protected <T>Response<T> failed() {
		return new Response<T>(ResponseEnum.SYSTEM_EXCEPTION);
	}
	protected <T>Response<T> success() {
		return new Response<T>(ResponseEnum.SUCCESS);
	}
	protected <T>Response<T> success(String msg) {
		return new Response<T>(ResponseEnum.SUCCESS, null);
	}
	protected <T>Response<T> success(T data) {
		return new Response<T>(ResponseEnum.SUCCESS, data);
	}
	protected <T>Response<T> success(ResponseEnum resEnum,T data) {
		return new Response<T>(resEnum, data);
	}
	
//	protected Integer getCurrentUserId() {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		return new Integer(auth.getPrincipal().toString());
//	}
	
//	protected User getCurrentUserObj() {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User user = userService.selectById(new Integer(auth.getPrincipal().toString()));
//		if(user==null) {
//			log.error("can't get current user:{}",auth.getPrincipal());
//		}
//		return user;
//	}
	
	protected boolean isImage(String ext) {
		return imgExts.contains(ext);
	}
}
