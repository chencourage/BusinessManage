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
@TableName("CARD_BIND_RELATION")
public class CardBindRelation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 有效状态 00有效 99无效
     */
	@TableField("STATE")
	private String state;
    /**
     * pay卡商户号
     */
	@TableField("MERC_ID")
	private String mercId;
    /**
     * 预留字段3
     */
	@TableField("ITEM_VALUE_3")
	private String itemValue3;
    /**
     * 预留字段2
     */
	@TableField("ITEM_VALUE_2")
	private String itemValue2;
    /**
     * 预留字段1
     */
	@TableField("ITEM_VALUE_1")
	private String itemValue1;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 当前手机的终端设备号
     */
	@TableField("TRM_DEVICE_NO")
	private String trmDeviceNo;
    /**
     * 绑卡时的ip
     */
	@TableField("BIND_CARD_IP")
	private String bindCardIp;
    /**
     * app端行为来源  01非实名认证入口 02已实名认证入口 03添加结算卡入口 04信用卡认证入口 05金服理财
     */
	@TableField("APP_SOURCE")
	private String appSource;
    /**
     * 绑卡失败原因
     */
	@TableField("BIND_CARD_FAIL_DESC")
	private String bindCardFailDesc;
    /**
     * 绑卡时间
     */
	@TableField("BIND_CARD_TIME")
	private Date bindCardTime;
    /**
     * 银行卡结束时间
     */
	@TableField("CARD_END_TIME")
	private Date cardEndTime;
    /**
     * 银行卡开始时间
     */
	@TableField("CARD_BEGIN_TIME")
	private Date cardBeginTime;
    /**
     * 银行卡背面三位数
     */
	@TableField("CARD_BACK_NO")
	private String cardBackNo;
    /**
     * 银行卡号
     */
	@TableField("BANK_CARD_NO")
	private String bankCardNo;
    /**
     * 所属银行
     */
	@TableField("BANK_NAME")
	private String bankName;
    /**
     * 卡片类型  00儲蓄卡  11信用卡
     */
	@TableField("CARD_TYPE")
	private String cardType;
    /**
     * 预留手机号 
     */
	@TableField("PRE_PHONE_NUMBER")
	private String prePhoneNumber;
    /**
     * 绑定状态 00成功 99失败 50已有成功记录
     */
	@TableField("BIND_STATE")
	private String bindState;
    /**
     * 身份证号
     */
	@TableField("ID_CARD")
	private String idCard;
    /**
     * 姓名
     */
	@TableField("USER_NAME")
	private String userName;
    /**
     * 用户号
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;
    /**
     * 银行卡归属地
     */
	@TableField("BANK_ADDR")
	private String bankAddr;
    /**
     * 手机归属地
     */
	@TableField("MOBILE_ADDR")
	private String mobileAddr;
    /**
     * 注册地理位置
     */
	@TableField("REGIST_ADDR")
	private String registAddr;


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMercId() {
		return mercId;
	}

	public void setMercId(String mercId) {
		this.mercId = mercId;
	}

	public String getItemValue3() {
		return itemValue3;
	}

	public void setItemValue3(String itemValue3) {
		this.itemValue3 = itemValue3;
	}

	public String getItemValue2() {
		return itemValue2;
	}

	public void setItemValue2(String itemValue2) {
		this.itemValue2 = itemValue2;
	}

	public String getItemValue1() {
		return itemValue1;
	}

	public void setItemValue1(String itemValue1) {
		this.itemValue1 = itemValue1;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTrmDeviceNo() {
		return trmDeviceNo;
	}

	public void setTrmDeviceNo(String trmDeviceNo) {
		this.trmDeviceNo = trmDeviceNo;
	}

	public String getBindCardIp() {
		return bindCardIp;
	}

	public void setBindCardIp(String bindCardIp) {
		this.bindCardIp = bindCardIp;
	}

	public String getAppSource() {
		return appSource;
	}

	public void setAppSource(String appSource) {
		this.appSource = appSource;
	}

	public String getBindCardFailDesc() {
		return bindCardFailDesc;
	}

	public void setBindCardFailDesc(String bindCardFailDesc) {
		this.bindCardFailDesc = bindCardFailDesc;
	}

	public Date getBindCardTime() {
		return bindCardTime;
	}

	public void setBindCardTime(Date bindCardTime) {
		this.bindCardTime = bindCardTime;
	}

	public Date getCardEndTime() {
		return cardEndTime;
	}

	public void setCardEndTime(Date cardEndTime) {
		this.cardEndTime = cardEndTime;
	}

	public Date getCardBeginTime() {
		return cardBeginTime;
	}

	public void setCardBeginTime(Date cardBeginTime) {
		this.cardBeginTime = cardBeginTime;
	}

	public String getCardBackNo() {
		return cardBackNo;
	}

	public void setCardBackNo(String cardBackNo) {
		this.cardBackNo = cardBackNo;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getPrePhoneNumber() {
		return prePhoneNumber;
	}

	public void setPrePhoneNumber(String prePhoneNumber) {
		this.prePhoneNumber = prePhoneNumber;
	}

	public String getBindState() {
		return bindState;
	}

	public void setBindState(String bindState) {
		this.bindState = bindState;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getBankAddr() {
		return bankAddr;
	}

	public void setBankAddr(String bankAddr) {
		this.bankAddr = bankAddr;
	}

	public String getMobileAddr() {
		return mobileAddr;
	}

	public void setMobileAddr(String mobileAddr) {
		this.mobileAddr = mobileAddr;
	}

	public String getRegistAddr() {
		return registAddr;
	}

	public void setRegistAddr(String registAddr) {
		this.registAddr = registAddr;
	}

	@Override
	public String toString() {
		return "CardBindRelation{" +
			", state=" + state +
			", mercId=" + mercId +
			", itemValue3=" + itemValue3 +
			", itemValue2=" + itemValue2 +
			", itemValue1=" + itemValue1 +
			", remark=" + remark +
			", trmDeviceNo=" + trmDeviceNo +
			", bindCardIp=" + bindCardIp +
			", appSource=" + appSource +
			", bindCardFailDesc=" + bindCardFailDesc +
			", bindCardTime=" + bindCardTime +
			", cardEndTime=" + cardEndTime +
			", cardBeginTime=" + cardBeginTime +
			", cardBackNo=" + cardBackNo +
			", bankCardNo=" + bankCardNo +
			", bankName=" + bankName +
			", cardType=" + cardType +
			", prePhoneNumber=" + prePhoneNumber +
			", bindState=" + bindState +
			", idCard=" + idCard +
			", userName=" + userName +
			", userCode=" + userCode +
			", id=" + id +
			", bankAddr=" + bankAddr +
			", mobileAddr=" + mobileAddr +
			", registAddr=" + registAddr +
			"}";
	}
}
