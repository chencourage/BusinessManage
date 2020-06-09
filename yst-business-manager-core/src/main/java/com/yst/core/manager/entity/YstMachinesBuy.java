package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_MACHINES_BUY")
public class YstMachinesBuy extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 快递公司
     */
	@TableField("EXPRESS_COM")
	private String expressCom;
    /**
     * 省会
     */
	@TableField("PROVINCE")
	private String province;
    /**
     * 流水号
     */
	@TableField("TRADE_SN")
	private String tradeSn;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 最后更新日期
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 快递单号
     */
	@TableField("EXPRESS_NO")
	private String expressNo;
    /**
     * 状态:01待寄件,22已寄件，33,已发送，00已发货 44 已退货，55已签收
     */
	@TableField("STATE")
	private String state;
    /**
     * 购买日期
     */
	@TableField("BUY_TIME")
	private Date buyTime;
    /**
     * 详细地址
     */
	@TableField("ADDRESS")
	private String address;
    /**
     * 城市
     */
	@TableField("CITY")
	private String city;
    /**
     * 手机13732445456
     */
	@TableField("MOBILE")
	private String mobile;
    /**
     * 姓名
     */
	@TableField("USERNAME")
	private String username;
    /**
     * 用户号  m13732445456
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;
    /**
     * 机具终端号
     */
	@TableField("TRM_NO")
	private String trmNo;
    /**
     * 来源与版本号
     */
	@TableField("SOURCE_VERSION")
	private String sourceVersion;
    /**
     * 机构号
     */
	@TableField("ORG_NO")
	private String orgNo;
    /**
     * 购买价格
     */
	@TableField("PRICE")
	private Double price;
    /**
     * 机具描述
     */
	@TableField("MACHINE_DESC")
	private String machineDesc;
    /**
     * 购买数量
     */
	@TableField("ORDER_QUANTITY")
	private Integer orderQuantity;
    /**
     * 综合评价0-5
     */
	@TableField("EVA_SYNTH")
	private Integer evaSynth;
    /**
     * 业务员姓名
     */
	@TableField("CLERK_USERNAME")
	private String clerkUsername;
    /**
     * 商户评价描述
     */
	@TableField("EVA_DESC")
	private String evaDesc;
    /**
     * 解决速度评价0-5
     */
	@TableField("EVA_SPEED")
	private Integer evaSpeed;
    /**
     * 服务态度0-5
     */
	@TableField("EVA_SERVICE")
	private Integer evaService;
    /**
     * 商户确认状态，00已确认，01未确认
     */
	@TableField("CONFIRM_STATE")
	private String confirmState;
    /**
     * 紧急程度,00正常，11紧急
     */
	@TableField("URGENCY_DEGREE")
	private String urgencyDegree;
    /**
     * 业务员用户号
     */
	@TableField("CLERK_USERCODE")
	private String clerkUsercode;
    /**
     * 加密手机号
     */
	@TableField("DES_MOBILE")
	private String desMobile;
    /**
     * 发货时间
     */
	@TableField("DELIVERY_TIME")
	private Date deliveryTime;
    /**
     * SN码
     */
	@TableField("SN")
	private String sn;
    /**
     * 产品类型  00 mpos  01 银盛通码
     */
	@TableField("PRODUCT_TYPE")
	private String productType;
    /**
     * 区
     */
	@TableField("DISTRICT")
	private String district;
    /**
     * 01-推销信用卡活动
     */
	@TableField("ACTIVITY_SOURCE")
	private String activitySource;


	public String getExpressCom() {
		return expressCom;
	}

	public void setExpressCom(String expressCom) {
		this.expressCom = expressCom;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getTradeSn() {
		return tradeSn;
	}

	public void setTradeSn(String tradeSn) {
		this.tradeSn = tradeSn;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrmNo() {
		return trmNo;
	}

	public void setTrmNo(String trmNo) {
		this.trmNo = trmNo;
	}

	public String getSourceVersion() {
		return sourceVersion;
	}

	public void setSourceVersion(String sourceVersion) {
		this.sourceVersion = sourceVersion;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getMachineDesc() {
		return machineDesc;
	}

	public void setMachineDesc(String machineDesc) {
		this.machineDesc = machineDesc;
	}

	public Integer getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Integer getEvaSynth() {
		return evaSynth;
	}

	public void setEvaSynth(Integer evaSynth) {
		this.evaSynth = evaSynth;
	}

	public String getClerkUsername() {
		return clerkUsername;
	}

	public void setClerkUsername(String clerkUsername) {
		this.clerkUsername = clerkUsername;
	}

	public String getEvaDesc() {
		return evaDesc;
	}

	public void setEvaDesc(String evaDesc) {
		this.evaDesc = evaDesc;
	}

	public Integer getEvaSpeed() {
		return evaSpeed;
	}

	public void setEvaSpeed(Integer evaSpeed) {
		this.evaSpeed = evaSpeed;
	}

	public Integer getEvaService() {
		return evaService;
	}

	public void setEvaService(Integer evaService) {
		this.evaService = evaService;
	}

	public String getConfirmState() {
		return confirmState;
	}

	public void setConfirmState(String confirmState) {
		this.confirmState = confirmState;
	}

	public String getUrgencyDegree() {
		return urgencyDegree;
	}

	public void setUrgencyDegree(String urgencyDegree) {
		this.urgencyDegree = urgencyDegree;
	}

	public String getClerkUsercode() {
		return clerkUsercode;
	}

	public void setClerkUsercode(String clerkUsercode) {
		this.clerkUsercode = clerkUsercode;
	}

	public String getDesMobile() {
		return desMobile;
	}

	public void setDesMobile(String desMobile) {
		this.desMobile = desMobile;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getActivitySource() {
		return activitySource;
	}

	public void setActivitySource(String activitySource) {
		this.activitySource = activitySource;
	}

	@Override
	public String toString() {
		return "YstMachinesBuy{" +
			", expressCom=" + expressCom +
			", province=" + province +
			", tradeSn=" + tradeSn +
			", remark=" + remark +
			", updateTime=" + updateTime +
			", expressNo=" + expressNo +
			", state=" + state +
			", buyTime=" + buyTime +
			", address=" + address +
			", city=" + city +
			", mobile=" + mobile +
			", username=" + username +
			", userCode=" + userCode +
			", id=" + id +
			", trmNo=" + trmNo +
			", sourceVersion=" + sourceVersion +
			", orgNo=" + orgNo +
			", price=" + price +
			", machineDesc=" + machineDesc +
			", orderQuantity=" + orderQuantity +
			", evaSynth=" + evaSynth +
			", clerkUsername=" + clerkUsername +
			", evaDesc=" + evaDesc +
			", evaSpeed=" + evaSpeed +
			", evaService=" + evaService +
			", confirmState=" + confirmState +
			", urgencyDegree=" + urgencyDegree +
			", clerkUsercode=" + clerkUsercode +
			", desMobile=" + desMobile +
			", deliveryTime=" + deliveryTime +
			", sn=" + sn +
			", productType=" + productType +
			", district=" + district +
			", activitySource=" + activitySource +
			"}";
	}
}
