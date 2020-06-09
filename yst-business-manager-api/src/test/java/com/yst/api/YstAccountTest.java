package com.yst.api;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.druid.filter.config.ConfigTools;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.yst.core.manager.entity.YstAccount;
import com.yst.core.manager.service.IYstAccountService;
import com.yst.core.mobile.entity.TUser;
import com.yst.core.mobile.service.ITUserService;
import com.yst.service.dict.service.IPageDataService;
import com.yst.support.util.AliJsonUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YstAccountTest {
	
	
	@Autowired(required=false)
	private IYstAccountService accountService;
	
	@Autowired
	private ITUserService userService;
	
	@Autowired
	IPageDataService pageDataService;
	
	@Test
	public void testYstAccount() {
		Wrapper<YstAccount> wa = new EntityWrapper<>();
		wa.eq("ACCOUNTID", "D20180523201037");
		List<YstAccount> li = accountService.selectList(wa);
		System.out.println(AliJsonUtils.toJson(li));

//		System.out.println("-----------" + PropertyUtil.getProperty("app.ver"));
		
		Wrapper<TUser>  uw = new EntityWrapper<>();
		uw.eq("USERCODE", "m18824648705");
		List<TUser> users = userService.selectList(uw);
		System.out.println(AliJsonUtils.toJson(users));
	}
	
	@Test
	public void testComm() {//查列表
		Map<String, Object> res = null;
		try {
			res = pageDataService.getCommData("14", "{'userCode':'m158','pageInfo':{'pageSize':'10','pageIndex':'1'}}");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(AliJsonUtils.toJson(res));
	}
	
	@Test
	public void testCommDetail() throws Exception {//查明细
		Map<String, Object> res = pageDataService.getCommDetail("14", "{'userCode':'mmm15807550195'}");
		System.out.println(AliJsonUtils.toJson(res));
	}
	
	@Test
	public void testexeComm() throws Exception {//执行sql
		Map<String, Object> res = pageDataService.executeData("14","103", "{'userCode':'mmm15807550195','status':'10'}");
		System.out.println(AliJsonUtils.toJson(res));
	}
	
	@Test
	public void testupComm() throws Exception {//修改
		Map<String, Object> res = pageDataService.updateData("14", "{'userCode':'mmm15807550195','ID_CARD':'453412198611256533','BANK_CARD_NO':'6217710300987146','BANK_ACCOUNT_NAME':'测试2','TD_CARD_NO':'m00000000020189','CREATETIME':'2019-02-10'}");
		System.out.println(AliJsonUtils.toJson(res));
	}
	
	@Test
	public void testinComm() throws Exception {//新增
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		Map<String, Object> res = pageDataService.insertData("14", "{\"ID\":\""+id+"\",\"CREATETIME\":\"2018-12-12\",\"PROVINCE_CODE\":\"1600\",\"CITY_CODE\":\"1610\",\"PROVINCE\":\"山西省\",\"CITY\":\"太原市\",\"BANK_TYPE\":\"03020000\",\"BANK_CODE\":\"105161004291\",\"BRACH_BANK_ADDR\":\"太原柳南支行\",\"OPEAN_BANK_NAME\":\"建设银行\",\"PRE_PHONE_NUMBER\":\"18902459037\",\"BANK_CARD_NO\":\"6217710300987146\",\"ID_CARD\":\"453412198611256533\",\"BANK_ACCOUNT_NAME\":\"测试2\",\"userCode\":\"mmm15807550195\",\"TD_CARD_NO\":\"m00000000020187\"}");
		System.out.println(AliJsonUtils.toJson(res));
	}
	
	@Test
	public void testEncrypt() {
		try {
			//#mobilegate.username=WuCNT8kX1HS+VaFKEEKwcg== ys_mobile
			//#mobilegate.password=YAiTW/REr1UmXrROodCeiQ== mobile123
			System.out.println(ConfigTools.encrypt("ys_mobile"));
			System.out.println(ConfigTools.encrypt("mobile123"));
			System.out.println();
			System.out.println(ConfigTools.encrypt("manager!123"));
			System.out.println(ConfigTools.decrypt("S2z5FR6T5B7bEdaJH0fhkN25sTGV0ami2sDC0VuLqhbPHfgEP6JUg9qBzGpdhLcQqPBSD4tGP7RaAYvsn+MCQg=="));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
