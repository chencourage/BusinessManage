package com.yst.support.model;

import com.yst.support.enums.ResponseEnum;

public class Response<T> {
	
	private String code;
	
	private String msg;
	
	private T data;
	
	public Response() {
		
	}
	
	public Response(String code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public Response(String code,String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Response(ResponseEnum resEnum) {
		this(resEnum,null);
	}
	
	public Response(ResponseEnum resEnum, T data) {
		super();
		this.code = resEnum.getCode();
		this.msg = resEnum.getMsg();
		this.data = data;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
