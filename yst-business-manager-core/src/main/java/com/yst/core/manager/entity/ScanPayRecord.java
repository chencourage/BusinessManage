package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 微信、支付宝反扫记录表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("SCAN_PAY_RECORD")
public class ScanPayRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 二维码链接，此参数可直接生成二维码展示出来进行扫码支付。请求成功时返回
     */
	@TableField("CODE_URL")
	private String codeUrl;
    /**
     * 交易码
     */
	@TableField("BACK_FIELD_11")
	private String backField11;
    /**
     * 银联正扫时存自己生成的流水号
     */
	@TableField("BACK_FIELD_10")
	private String backField10;
    /**
     * 交易参考号
     */
	@TableField("BACK_FIELD_9")
	private String backField9;
    /**
     * 通知地址
     */
	@TableField("BACK_FIELD_8")
	private String backField8;
    /**
     * 外部流水号
     */
	@TableField("BACK_FIELD_7")
	private String backField7;
    /**
     * 路由渠道号
     */
	@TableField("BACK_FIELD_6")
	private String backField6;
    /**
     * 路由系统商户Id
     */
	@TableField("BACK_FIELD_5")
	private String backField5;
    /**
     * 正扫时存上游渠道商户
     */
	@TableField("BACK_FIELD_4")
	private String backField4;
    /**
     * 扫码方gps
     */
	@TableField("BACK_FIELD_3")
	private String backField3;
    /**
     * 扫码方IP
     */
	@TableField("BACK_FIELD_2")
	private String backField2;
    /**
     * 二维码有效时间 
     */
	@TableField("BACK_FIELD_1")
	private String backField1;
    /**
     * 订单来源 00 内部调用  01 外部调用
     */
	@TableField("ORDER_NO")
	private String orderNo;
    /**
     * 银盛通方IP
     */
	@TableField("CLIENT_IP")
	private String clientIp;
    /**
     * 正扫银盛通方GPS定位
     */
	@TableField("GPS")
	private String gps;
    /**
     * 错误描述
     */
	@TableField("ERROR_DESC")
	private String errorDesc;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 交易状态,00初始化、66成功、99失败
     */
	@TableField("STATE")
	private String state;
    /**
     * 验签字段
     */
	@TableField("SIGN")
	private String sign;
    /**
     * 交易金额
     */
	@TableField("TRANSAMT")
	private String transamt;
    /**
     * 交易时间
     */
	@TableField("TRANSTIME")
	private String transtime;
    /**
     * 银盛商户号
     */
	@TableField("MERID")
	private String merid;
    /**
     * 接入机构号
     */
	@TableField("INORGNO")
	private String inorgno;
    /**
     * 交易类型 2018001:静态码支付 2080008:微信正扫 2080001:微信反扫 2070008:支付宝正扫 207001:支付宝反扫
     */
	@TableField("TRANSID")
	private String transid;
    /**
     * 交易请求流水号
     */
	@TableField("REQUESTNO")
	private String requestno;
    @TableId("ID")
	private String id;
    /**
     * 备注信息
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 银盛终端号
     */
	@TableField("TRMNO")
	private String trmno;


	public String getCodeUrl() {
		return codeUrl;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public String getBackField11() {
		return backField11;
	}

	public void setBackField11(String backField11) {
		this.backField11 = backField11;
	}

	public String getBackField10() {
		return backField10;
	}

	public void setBackField10(String backField10) {
		this.backField10 = backField10;
	}

	public String getBackField9() {
		return backField9;
	}

	public void setBackField9(String backField9) {
		this.backField9 = backField9;
	}

	public String getBackField8() {
		return backField8;
	}

	public void setBackField8(String backField8) {
		this.backField8 = backField8;
	}

	public String getBackField7() {
		return backField7;
	}

	public void setBackField7(String backField7) {
		this.backField7 = backField7;
	}

	public String getBackField6() {
		return backField6;
	}

	public void setBackField6(String backField6) {
		this.backField6 = backField6;
	}

	public String getBackField5() {
		return backField5;
	}

	public void setBackField5(String backField5) {
		this.backField5 = backField5;
	}

	public String getBackField4() {
		return backField4;
	}

	public void setBackField4(String backField4) {
		this.backField4 = backField4;
	}

	public String getBackField3() {
		return backField3;
	}

	public void setBackField3(String backField3) {
		this.backField3 = backField3;
	}

	public String getBackField2() {
		return backField2;
	}

	public void setBackField2(String backField2) {
		this.backField2 = backField2;
	}

	public String getBackField1() {
		return backField1;
	}

	public void setBackField1(String backField1) {
		this.backField1 = backField1;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTransamt() {
		return transamt;
	}

	public void setTransamt(String transamt) {
		this.transamt = transamt;
	}

	public String getTranstime() {
		return transtime;
	}

	public void setTranstime(String transtime) {
		this.transtime = transtime;
	}

	public String getMerid() {
		return merid;
	}

	public void setMerid(String merid) {
		this.merid = merid;
	}

	public String getInorgno() {
		return inorgno;
	}

	public void setInorgno(String inorgno) {
		this.inorgno = inorgno;
	}

	public String getTransid() {
		return transid;
	}

	public void setTransid(String transid) {
		this.transid = transid;
	}

	public String getRequestno() {
		return requestno;
	}

	public void setRequestno(String requestno) {
		this.requestno = requestno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTrmno() {
		return trmno;
	}

	public void setTrmno(String trmno) {
		this.trmno = trmno;
	}

	@Override
	public String toString() {
		return "ScanPayRecord{" +
			", codeUrl=" + codeUrl +
			", backField11=" + backField11 +
			", backField10=" + backField10 +
			", backField9=" + backField9 +
			", backField8=" + backField8 +
			", backField7=" + backField7 +
			", backField6=" + backField6 +
			", backField5=" + backField5 +
			", backField4=" + backField4 +
			", backField3=" + backField3 +
			", backField2=" + backField2 +
			", backField1=" + backField1 +
			", orderNo=" + orderNo +
			", clientIp=" + clientIp +
			", gps=" + gps +
			", errorDesc=" + errorDesc +
			", createTime=" + createTime +
			", state=" + state +
			", sign=" + sign +
			", transamt=" + transamt +
			", transtime=" + transtime +
			", merid=" + merid +
			", inorgno=" + inorgno +
			", transid=" + transid +
			", requestno=" + requestno +
			", id=" + id +
			", remark=" + remark +
			", trmno=" + trmno +
			"}";
	}
}
