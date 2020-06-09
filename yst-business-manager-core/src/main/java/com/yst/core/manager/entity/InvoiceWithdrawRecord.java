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
@TableName("INVOICE_WITHDRAW_RECORD")
public class InvoiceWithdrawRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("REMARK6")
	private String remark6;
	@TableField("REMARK5")
	private String remark5;
	@TableField("REMARK4")
	private String remark4;
	@TableField("REMARK3")
	private String remark3;
	@TableField("REMARK2")
	private String remark2;
    /**
     * 返回结果（原因）
     */
	@TableField("REMARK1")
	private String remark1;
    /**
     * 类型（1：转账，2：提现,3:挂账,4:自提发票到账银行卡）
     */
	@TableField("TYPE")
	private String type;
    /**
     * 流水号
     */
	@TableField("TRADE_SN")
	private String tradeSn;
    /**
     * 交易日期
     */
	@TableField("TRADE_TIME")
	private Date tradeTime;
    /**
     * 金额（元）
     */
	@TableField("AMOUNT")
	private Double amount;
    /**
     * 状态（00：成功，10：待处理：99：失败）
     */
	@TableField("STATE")
	private String state;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 订单说明
     */
	@TableField("ORDER_NODE")
	private String orderNode;
    /**
     * 发起方IP
     */
	@TableField("SRC_IP")
	private String srcIp;
    /**
     * 交易信息（流水号|日期|金额）
     */
	@TableField("TRADE_INFO")
	private String tradeInfo;
    /**
     * 代理商名称
     */
	@TableField("AGENT_MERC_NAME")
	private String agentMercName;
    /**
     * 代理商号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 订单号
     */
    @TableId("ORDER_ID")
	private String orderId;


	public String getRemark6() {
		return remark6;
	}

	public void setRemark6(String remark6) {
		this.remark6 = remark6;
	}

	public String getRemark5() {
		return remark5;
	}

	public void setRemark5(String remark5) {
		this.remark5 = remark5;
	}

	public String getRemark4() {
		return remark4;
	}

	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTradeSn() {
		return tradeSn;
	}

	public void setTradeSn(String tradeSn) {
		this.tradeSn = tradeSn;
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOrderNode() {
		return orderNode;
	}

	public void setOrderNode(String orderNode) {
		this.orderNode = orderNode;
	}

	public String getSrcIp() {
		return srcIp;
	}

	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}

	public String getTradeInfo() {
		return tradeInfo;
	}

	public void setTradeInfo(String tradeInfo) {
		this.tradeInfo = tradeInfo;
	}

	public String getAgentMercName() {
		return agentMercName;
	}

	public void setAgentMercName(String agentMercName) {
		this.agentMercName = agentMercName;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "InvoiceWithdrawRecord{" +
			", remark6=" + remark6 +
			", remark5=" + remark5 +
			", remark4=" + remark4 +
			", remark3=" + remark3 +
			", remark2=" + remark2 +
			", remark1=" + remark1 +
			", type=" + type +
			", tradeSn=" + tradeSn +
			", tradeTime=" + tradeTime +
			", amount=" + amount +
			", state=" + state +
			", remark=" + remark +
			", orderNode=" + orderNode +
			", srcIp=" + srcIp +
			", tradeInfo=" + tradeInfo +
			", agentMercName=" + agentMercName +
			", agentMercId=" + agentMercId +
			", orderId=" + orderId +
			"}";
	}
}
