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
 * @since 2019-06-22
 */
@TableName("YST_QRCODE_ORDER")
public class YstQrcodeOrder extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 收货地址关联ID
     */
	@TableField("ADDRESS_ID")
	private String addressId;
    /**
     * 邮费
     */
	@TableField("EXPRESS_PRICE")
	private Double expressPrice;
    /**
     * 制卡批次ID
     */
	@TableField("CARD_BATCH_ID")
	private String cardBatchId;
    /**
     * 单价
     */
	@TableField("SINGLE_PRICE")
	private Double singlePrice;
    /**
     * 订单过期时间
     */
	@TableField("EXPIRY_TIME")
	private Date expiryTime;
    /**
     * 申请数量
     */
	@TableField("QRCODE_NUM")
	private Long qrcodeNum;
    /**
     * 总金额
     */
	@TableField("AMOUNT")
	private Double amount;
    /**
     * 待支付10、已支付00, ，线下已支付02，线下已支付待审核03，线下已支付审核失败 04
     */
	@TableField("STATE")
	private String state;
    /**
     * 通码类型 0-电子码，1-实体码，2-mpos，3-传统pos
     */
	@TableField("QRCODE_TYPE")
	private String qrcodeType;
    /**
     * 用户号（可为代理商编号，用户号）
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * 支付时间
     */
	@TableField("PAY_TIME")
	private Date payTime;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 创建时间 即申请时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 流水号 关联派单表流水和支付系统流水
     */
	@TableField("TRADESN")
	private String tradesn;
    @TableId("ID")
	private String id;
    /**
     * 机器型号
     */
	@TableField("DEVICE_MODEL")
	private String deviceModel;
    /**
     * 开户行
     */
	@TableField("BANK_TYPE")
	private String bankType;
    /**
     * 照片凭证
     */
	@TableField("IMGSN")
	private String imgsn;
    /**
     * 转账卡号
     */
	@TableField("BANK_NO_FROM")
	private String bankNoFrom;
    /**
     * 转账用户名
     */
	@TableField("ACCOUNT_NAME")
	private String accountName;
    /**
     * 线下转账  被转银行卡号
     */
	@TableField("BANK_NO_TO")
	private String bankNoTo;
    /**
     * 线下转账  银行名称
     */
	@TableField("BANK_NAME")
	private String bankName;
    /**
     * 订单系统 关联id
     */
	@TableField("ORDER_ID")
	private String orderId;
    /**
     * 支付类型 00或者null表示为线上支付 ，01表示线下支付
     */
	@TableField("PAY_TYPE")
	private String payType;
    /**
     * 产品类型 00或者空-电子码，01-mpos，02-实体码，03-传统pos
     */
	@TableField("PRODUCT_TYPE")
	private String productType;
    /**
     * 是否会员订单 0-否, 1-是
     */
	@TableField("IS_MEMBER")
	private String isMember;


	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public Double getExpressPrice() {
		return expressPrice;
	}

	public void setExpressPrice(Double expressPrice) {
		this.expressPrice = expressPrice;
	}

	public String getCardBatchId() {
		return cardBatchId;
	}

	public void setCardBatchId(String cardBatchId) {
		this.cardBatchId = cardBatchId;
	}

	public Double getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(Double singlePrice) {
		this.singlePrice = singlePrice;
	}

	public Date getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
	}

	public Long getQrcodeNum() {
		return qrcodeNum;
	}

	public void setQrcodeNum(Long qrcodeNum) {
		this.qrcodeNum = qrcodeNum;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getQrcodeType() {
		return qrcodeType;
	}

	public void setQrcodeType(String qrcodeType) {
		this.qrcodeType = qrcodeType;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTradesn() {
		return tradesn;
	}

	public void setTradesn(String tradesn) {
		this.tradesn = tradesn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getImgsn() {
		return imgsn;
	}

	public void setImgsn(String imgsn) {
		this.imgsn = imgsn;
	}

	public String getBankNoFrom() {
		return bankNoFrom;
	}

	public void setBankNoFrom(String bankNoFrom) {
		this.bankNoFrom = bankNoFrom;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankNoTo() {
		return bankNoTo;
	}

	public void setBankNoTo(String bankNoTo) {
		this.bankNoTo = bankNoTo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getIsMember() {
		return isMember;
	}

	public void setIsMember(String isMember) {
		this.isMember = isMember;
	}

	@Override
	public String toString() {
		return "YstQrcodeOrder{" +
			", addressId=" + addressId +
			", expressPrice=" + expressPrice +
			", cardBatchId=" + cardBatchId +
			", singlePrice=" + singlePrice +
			", expiryTime=" + expiryTime +
			", qrcodeNum=" + qrcodeNum +
			", amount=" + amount +
			", state=" + state +
			", qrcodeType=" + qrcodeType +
			", userCode=" + userCode +
			", payTime=" + payTime +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", tradesn=" + tradesn +
			", id=" + id +
			", deviceModel=" + deviceModel +
			", bankType=" + bankType +
			", imgsn=" + imgsn +
			", bankNoFrom=" + bankNoFrom +
			", accountName=" + accountName +
			", bankNoTo=" + bankNoTo +
			", bankName=" + bankName +
			", orderId=" + orderId +
			", payType=" + payType +
			", productType=" + productType +
			", isMember=" + isMember +
			"}";
	}
}
