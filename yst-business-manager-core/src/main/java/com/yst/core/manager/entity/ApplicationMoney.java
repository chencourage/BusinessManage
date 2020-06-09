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
@TableName("APPLICATION_MONEY")
public class ApplicationMoney extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 账户余额（单位元）
     */
	@TableField("ACCOUNT_BALANCE")
	private Double accountBalance;
    /**
     * 税点
     */
	@TableField("TAX_POINT")
	private Double taxPoint;
    /**
     * 税额（单位元）
     */
	@TableField("TAX_AMOUNT")
	private Double taxAmount;
    /**
     * 待发分润总额（单位元）
     */
	@TableField("TO_SHARE_AMOUNT")
	private Double toShareAmount;
    /**
     * 处理人
     */
	@TableField("APPLICATION_OPERATOR")
	private String applicationOperator;
    /**
     * 申请人
     */
	@TableField("APPLICATION_PERSON")
	private String applicationPerson;
    /**
     * 交易时间
     */
	@TableField("TRADE_TIME")
	private Date tradeTime;
    /**
     * 交易类型(1:转入，2：提现，3：挂账）
     */
	@TableField("TYPE")
	private String type;
    /**
     * 代理商名称
     */
	@TableField("AGENT_MERC_NAME")
	private String agentMercName;
    /**
     * 备注(或提现交易流水)
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 申请时间
     */
	@TableField("APPLICATION_TIME")
	private Date applicationTime;
    /**
     * 订单号
     */
	@TableField("ORDER_ID")
	private String orderId;
    /**
     * 状态（00：审核通过，99：驳回 10：待审核 50：已挂账 01:处理中）
     */
	@TableField("STATE")
	private String state;
    /**
     * 申请金额（单位元）
     */
	@TableField("APPLICATION_AMOUNT")
	private Double applicationAmount;
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


	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
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

	public Double getToShareAmount() {
		return toShareAmount;
	}

	public void setToShareAmount(Double toShareAmount) {
		this.toShareAmount = toShareAmount;
	}

	public String getApplicationOperator() {
		return applicationOperator;
	}

	public void setApplicationOperator(String applicationOperator) {
		this.applicationOperator = applicationOperator;
	}

	public String getApplicationPerson() {
		return applicationPerson;
	}

	public void setApplicationPerson(String applicationPerson) {
		this.applicationPerson = applicationPerson;
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAgentMercName() {
		return agentMercName;
	}

	public void setAgentMercName(String agentMercName) {
		this.agentMercName = agentMercName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getApplicationTime() {
		return applicationTime;
	}

	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getApplicationAmount() {
		return applicationAmount;
	}

	public void setApplicationAmount(Double applicationAmount) {
		this.applicationAmount = applicationAmount;
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

	@Override
	public String toString() {
		return "ApplicationMoney{" +
			", accountBalance=" + accountBalance +
			", taxPoint=" + taxPoint +
			", taxAmount=" + taxAmount +
			", toShareAmount=" + toShareAmount +
			", applicationOperator=" + applicationOperator +
			", applicationPerson=" + applicationPerson +
			", tradeTime=" + tradeTime +
			", type=" + type +
			", agentMercName=" + agentMercName +
			", remark=" + remark +
			", applicationTime=" + applicationTime +
			", orderId=" + orderId +
			", state=" + state +
			", applicationAmount=" + applicationAmount +
			", agentMercId=" + agentMercId +
			", sn=" + sn +
			"}";
	}
}
