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
@TableName("PURCHASE_INVOICE")
public class PurchaseInvoice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 物流公司
     */
	@TableField("LOGISTICS_COMPANY")
	private String logisticsCompany;
    /**
     * 驳回原因
     */
	@TableField("REJECT_REASON")
	private String rejectReason;
    /**
     * 发票流水
     */
	@TableField("INVOICE_SN")
	private String invoiceSn;
    /**
     * 银行付款回单流水
     */
	@TableField("PAYMENT_SN")
	private String paymentSn;
    /**
     * 快递单号
     */
	@TableField("EXPRESS_ORDER")
	private String expressOrder;
    /**
     * 收货人邮箱
     */
	@TableField("RECEIVER_EMAIL")
	private String receiverEmail;
    /**
     * 收货人详细地址
     */
	@TableField("RECEIVER_ADDR")
	private String receiverAddr;
    /**
     * 收货人联系电话
     */
	@TableField("RECEIVER_PHONE")
	private String receiverPhone;
    /**
     * 发票收货人
     */
	@TableField("RECEIVER")
	private String receiver;
    /**
     * 发票类型（11：增值税专用发票 22：增值税普票）
     */
	@TableField("INVOICE_TYPE")
	private String invoiceType;
    /**
     * 一般纳税人证明流水
     */
	@TableField("TAXPAYER_SN")
	private String taxpayerSn;
    /**
     * 营业执照流水
     */
	@TableField("LICENSE_SN")
	private String licenseSn;
    /**
     * 账号
     */
	@TableField("BANK_ACCOUNT")
	private String bankAccount;
    /**
     * 开户银行
     */
	@TableField("BANK")
	private String bank;
    /**
     * 开票电话
     */
	@TableField("INVOICE_PHONE")
	private String invoicePhone;
    /**
     * 开票地址
     */
	@TableField("INVOICE_ADDR")
	private String invoiceAddr;
    /**
     * 纳税识别号
     */
	@TableField("TAX_NUMBER")
	private String taxNumber;
    /**
     * 公司名称
     */
	@TableField("COMPANY_NM")
	private String companyNm;
    /**
     * 审核操作人
     */
	@TableField("CHECK_OPERATOR")
	private String checkOperator;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 开票时间
     */
	@TableField("INVOICE_TIME")
	private Date invoiceTime;
    /**
     * 审核时间
     */
	@TableField("CHECK_TIME")
	private Date checkTime;
    /**
     * 申请时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 审核状态(10:初始化，99：驳回，00：审核通过，88：开票成功,55:拒绝）
     */
	@TableField("STATE")
	private String state;
    /**
     * 发货机具总金额
     */
	@TableField("AMOUNT")
	private String amount;
    /**
     * 发货机具数
     */
	@TableField("QUANTITY")
	private Double quantity;
    /**
     * 发货流水号
     */
	@TableField("DELIVERY_SN")
	private String deliverySn;
    /**
     * 订单编号
     */
	@TableField("ORDER_ID")
	private String orderId;
    /**
     * 代理商名称
     */
	@TableField("AGENT_MERC_NM")
	private String agentMercNm;
    /**
     * 代理商号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;


	public String getLogisticsCompany() {
		return logisticsCompany;
	}

	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getInvoiceSn() {
		return invoiceSn;
	}

	public void setInvoiceSn(String invoiceSn) {
		this.invoiceSn = invoiceSn;
	}

	public String getPaymentSn() {
		return paymentSn;
	}

	public void setPaymentSn(String paymentSn) {
		this.paymentSn = paymentSn;
	}

	public String getExpressOrder() {
		return expressOrder;
	}

	public void setExpressOrder(String expressOrder) {
		this.expressOrder = expressOrder;
	}

	public String getReceiverEmail() {
		return receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getReceiverAddr() {
		return receiverAddr;
	}

	public void setReceiverAddr(String receiverAddr) {
		this.receiverAddr = receiverAddr;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getTaxpayerSn() {
		return taxpayerSn;
	}

	public void setTaxpayerSn(String taxpayerSn) {
		this.taxpayerSn = taxpayerSn;
	}

	public String getLicenseSn() {
		return licenseSn;
	}

	public void setLicenseSn(String licenseSn) {
		this.licenseSn = licenseSn;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getInvoicePhone() {
		return invoicePhone;
	}

	public void setInvoicePhone(String invoicePhone) {
		this.invoicePhone = invoicePhone;
	}

	public String getInvoiceAddr() {
		return invoiceAddr;
	}

	public void setInvoiceAddr(String invoiceAddr) {
		this.invoiceAddr = invoiceAddr;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getCompanyNm() {
		return companyNm;
	}

	public void setCompanyNm(String companyNm) {
		this.companyNm = companyNm;
	}

	public String getCheckOperator() {
		return checkOperator;
	}

	public void setCheckOperator(String checkOperator) {
		this.checkOperator = checkOperator;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getInvoiceTime() {
		return invoiceTime;
	}

	public void setInvoiceTime(Date invoiceTime) {
		this.invoiceTime = invoiceTime;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getDeliverySn() {
		return deliverySn;
	}

	public void setDeliverySn(String deliverySn) {
		this.deliverySn = deliverySn;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getAgentMercNm() {
		return agentMercNm;
	}

	public void setAgentMercNm(String agentMercNm) {
		this.agentMercNm = agentMercNm;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PurchaseInvoice{" +
			", logisticsCompany=" + logisticsCompany +
			", rejectReason=" + rejectReason +
			", invoiceSn=" + invoiceSn +
			", paymentSn=" + paymentSn +
			", expressOrder=" + expressOrder +
			", receiverEmail=" + receiverEmail +
			", receiverAddr=" + receiverAddr +
			", receiverPhone=" + receiverPhone +
			", receiver=" + receiver +
			", invoiceType=" + invoiceType +
			", taxpayerSn=" + taxpayerSn +
			", licenseSn=" + licenseSn +
			", bankAccount=" + bankAccount +
			", bank=" + bank +
			", invoicePhone=" + invoicePhone +
			", invoiceAddr=" + invoiceAddr +
			", taxNumber=" + taxNumber +
			", companyNm=" + companyNm +
			", checkOperator=" + checkOperator +
			", updateTime=" + updateTime +
			", invoiceTime=" + invoiceTime +
			", checkTime=" + checkTime +
			", createTime=" + createTime +
			", state=" + state +
			", amount=" + amount +
			", quantity=" + quantity +
			", deliverySn=" + deliverySn +
			", orderId=" + orderId +
			", agentMercNm=" + agentMercNm +
			", agentMercId=" + agentMercId +
			", id=" + id +
			"}";
	}
}
