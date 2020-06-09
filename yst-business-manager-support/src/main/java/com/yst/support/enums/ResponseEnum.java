package com.yst.support.enums;

import org.apache.commons.lang3.StringUtils;

public enum ResponseEnum {
	
	SUCCESS("00","成功"),
	SYSTEM_EXCEPTION("01","系统异常"),
	UNAUTHORIZED("401","你还未登陆");
	
	private String code;
	
	private String msg;

	
	private ResponseEnum(String code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	
	public ResponseEnum getResEnumByCode(String code) {
		if (StringUtils.isBlank(code))
			return null;
		for (ResponseEnum r : ResponseEnum.values()) {
			if (r.getCode().equals(code)) {
				return r;
			}
		}
		return null;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}

}
