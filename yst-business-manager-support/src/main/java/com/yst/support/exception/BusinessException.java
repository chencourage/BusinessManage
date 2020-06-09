package com.yst.support.exception;

import com.yst.support.enums.ResponseEnum;

public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public BusinessException(ResponseEnum resEnum) {
		super(resEnum.getMsg());
		this.code = resEnum.getCode();
	}
	
	private String code;


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	

}
