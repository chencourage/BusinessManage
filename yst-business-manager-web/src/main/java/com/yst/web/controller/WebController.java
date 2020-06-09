package com.yst.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yst.core.base.BaseController;

@Controller
@RequestMapping("api")
public class WebController extends BaseController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "hello,ketty";
	}

}
