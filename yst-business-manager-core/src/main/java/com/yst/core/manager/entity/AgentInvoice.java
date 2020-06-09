package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 代理商系统发票管理（分润发票）
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("AGENT_INVOICE")
public class AgentInvoice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
	@TableField("ORDER_ID")
	private String orderId;
    /**
     * 发票实际的税点（百分比，例如:2%填写2）
     */
	@TableField("REAL_TAX_POINT")
	private Double realTaxPoint;
    /**
     * 额外的税点（百分比，例如:2%填写2）
     */
	@TableField("EXTRA_TAX_POINT")
	private Double extraTaxPoint;
    /**
     * 额外的税额（元）
     */
	@TableField("EXTRA_TAX_AMOUNT")
	private Double extraTaxAmount;
    /**
     * 转账剩余金额
     */
	@TableField("REMAIN_TRANSFER_AMOUNT")
	private Double remainTransferAmount;
    /**
     * 已转账金额
     */
	@TableField("TRANSFERED_AMOUNT")
	private Double transferedAmount;
    /**
     * 00:自提发票  11:代开发票 01:自提发票到账银行卡
     */
	@TableField("TYPE")
	private String type;
    /**
     * OA单
     */
	@TableField("OA_LIST")
	private String oaList;
    /**
     * 发票代开，收取税点（百分比，例如:3%填写3）
     */
	@TableField("TAX_POINT")
	private Double taxPoint;
    /**
     * 发票代开，收取税额（元）
     */
	@TableField("TAX_AMOUNT")
	private Double taxAmount;
    /**
     * 代开票代理商号
     */
	@TableField("ISSUE_MERC_ID")
	private String issueMercId;
    /**
     * 账户余额
     */
	@TableField("BALANCE_AMOUNT")
	private Double balanceAmount;
    /**
     * 初审时间
     */
	@TableField("AUDIT_1_TIME")
	private Date audit1Time;
    /**
     * 价税合计（申请金额，单位元）
     */
	@TableField("INVOICE_TOTAL")
	private Double invoiceTotal;
    /**
     * 代理商名称
     */
	@TableField("AGENT_NAME")
	private String agentName;
	@TableField("CREATE_TIME")
	private Date createTime;
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 复审操作人
     */
	@TableField("LAST_VERIFY_OPERATOR")
	private String lastVerifyOperator;
    /**
     * 初审操作人
     */
	@TableField("FIRST_VERIFY_OPERATOR")
	private String firstVerifyOperator;
    /**
     * 驳回原因或者备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 00表示审核成功 10表示待审核 20表示初审成功 88初审驳回 99表示复审驳回 55代开票待审 66代开票驳回 01审核通过转账失败
     */
	@TableField("STATE")
	private String state;
    /**
     * 图片流水
     */
	@TableField("IMGSN")
	private String imgsn;
    /**
     * 快递单号
     */
	@TableField("COURIER_NUMBER")
	private String courierNumber;
    /**
     * 物流公司
     */
	@TableField("LOGISTICS_COMPANY")
	private String logisticsCompany;
    /**
     * 开票时间
     */
	@TableField("TICKET_OPENING_TIME")
	private Date ticketOpeningTime;
    /**
     * 开票单位
     */
	@TableField("ISSUING_OFFICE")
	private String issuingOffice;
    /**
     * 发票号（多个用逗号分隔）
     */
	@TableField("INVOICE_NUMBER")
	private String invoiceNumber;
    /**
     * 发票数量
     */
	@TableField("INVOICE_COUNT")
	private Double invoiceCount;
    /**
     * 发票税额
     */
	@TableField("INVOICE_TAX")
	private Double invoiceTax;
    /**
     * 发票金额(元)
     */
	@TableField("INVOICE_AMOUNT")
	private Double invoiceAmount;
    /**
     * 代理商号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 主键
     */
    @TableId("SN")
	private String sn;
    /**
     * 应税劳务、服务名称
     */
	@TableField("TAXABLE_SERVICE")
	private String taxableService;
    /**
     * 复审时间
     */
	@TableField("AUDIT_2_TIME")
	private Date audit2Time;


	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Double getRealTaxPoint() {
		return realTaxPoint;
	}

	public void setRealTaxPoint(Double realTaxPoint) {
		this.realTaxPoint = realTaxPoint;
	}

	public Double getExtraTaxPoint() {
		return extraTaxPoint;
	}

	public void setExtraTaxPoint(Double extraTaxPoint) {
		this.extraTaxPoint = extraTaxPoint;
	}

	public Double getExtraTaxAmount() {
		return extraTaxAmount;
	}

	public void setExtraTaxAmount(Double extraTaxAmount) {
		this.extraTaxAmount = extraTaxAmount;
	}

	public Double getRemainTransferAmount() {
		return remainTransferAmount;
	}

	public void setRemainTransferAmount(Double remainTransferAmount) {
		this.remainTransferAmount = remainTransferAmount;
	}

	public Double getTransferedAmount() {
		return transferedAmount;
	}

	public void setTransferedAmount(Double transferedAmount) {
		this.transferedAmount = transferedAmount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOaList() {
		return oaList;
	}

	public void setOaList(String oaList) {
		this.oaList = oaList;
	}

	public Double getTaxPoint() {
		return taxPoint;
	}

	public void setTaxPoint(Double taxPoint) {
		this.taxPoint = taxPoint;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getIssueMercId() {
		return issueMercId;
	}

	public void setIssueMercId(String issueMercId) {
		this.issueMercId = issueMercId;
	}

	public Double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(Double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Date getAudit1Time() {
		return audit1Time;
	}

	public void setAudit1Time(Date audit1Time) {
		this.audit1Time = audit1Time;
	}

	public Double getInvoiceTotal() {
		return invoiceTotal;
	}

	public void setInvoiceTotal(Double invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getLastVerifyOperator() {
		return lastVerifyOperator;
	}

	public void setLastVerifyOperator(String lastVerifyOperator) {
		this.lastVerifyOperator = lastVerifyOperator;
	}

	public String getFirstVerifyOperator() {
		return firstVerifyOperator;
	}

	public void setFirstVerifyOperator(String firstVerifyOperator) {
		this.firstVerifyOperator = firstVerifyOperator;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getImgsn() {
		return imgsn;
	}

	public void setImgsn(String imgsn) {
		this.imgsn = imgsn;
	}

	public String getCourierNumber() {
		return courierNumber;
	}

	public void setCourierNumber(String courierNumber) {
		this.courierNumber = courierNumber;
	}

	public String getLogisticsCompany() {
		return logisticsCompany;
	}

	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public Date getTicketOpeningTime() {
		return ticketOpeningTime;
	}

	public void setTicketOpeningTime(Date ticketOpeningTime) {
		this.ticketOpeningTime = ticketOpeningTime;
	}

	public String getIssuingOffice() {
		return issuingOffice;
	}

	public void setIssuingOffice(String issuingOffice) {
		this.issuingOffice = issuingOffice;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Double getInvoiceCount() {
		return invoiceCount;
	}

	public void setInvoiceCount(Double invoiceCount) {
		this.invoiceCount = invoiceCount;
	}

	public Double getInvoiceTax() {
		return invoiceTax;
	}

	public void setInvoiceTax(Double invoiceTax) {
		this.invoiceTax = invoiceTax;
	}

	public Double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getTaxableService() {
		return taxableService;
	}

	public void setTaxableService(String taxableService) {
		this.taxableService = taxableService;
	}

	public Date getAudit2Time() {
		return audit2Time;
	}

	public void setAudit2Time(Date audit2Time) {
		this.audit2Time = audit2Time;
	}

	@Override
	public String toString() {
		return "AgentInvoice{" +
			", orderId=" + orderId +
			", realTaxPoint=" + realTaxPoint +
			", extraTaxPoint=" + extraTaxPoint +
			", extraTaxAmount=" + extraTaxAmount +
			", remainTransferAmount=" + remainTransferAmount +
			", transferedAmount=" + transferedAmount +
			", type=" + type +
			", oaList=" + oaList +
			", taxPoint=" + taxPoint +
			", taxAmount=" + taxAmount +
			", issueMercId=" + issueMercId +
			", balanceAmount=" + balanceAmount +
			", audit1Time=" + audit1Time +
			", invoiceTotal=" + invoiceTotal +
			", agentName=" + agentName +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", lastVerifyOperator=" + lastVerifyOperator +
			", firstVerifyOperator=" + firstVerifyOperator +
			", remark=" + remark +
			", state=" + state +
			", imgsn=" + imgsn +
			", courierNumber=" + courierNumber +
			", logisticsCompany=" + logisticsCompany +
			", ticketOpeningTime=" + ticketOpeningTime +
			", issuingOffice=" + issuingOffice +
			", invoiceNumber=" + invoiceNumber +
			", invoiceCount=" + invoiceCount +
			", invoiceTax=" + invoiceTax +
			", invoiceAmount=" + invoiceAmount +
			", agentMercId=" + agentMercId +
			", sn=" + sn +
			", taxableService=" + taxableService +
			", audit2Time=" + audit2Time +
			"}";
	}
}
