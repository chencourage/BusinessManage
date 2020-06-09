package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 还款流水表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_PAYBACKSEQ")
public class YstPaybackseq extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 交易状态，00：成功，01：失败，02：待确认
     */
	@TableField("TRADE_STATUS")
	private String tradeStatus;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 记账时间
     */
	@TableField("CREATETIME")
	private Date createtime;
    /**
     * 本期应还发生额（单位分）
     */
	@TableField("CUR_PAY_AMT")
	private Double curPayAmt;
    /**
     * 结转金额（单位分）
     */
	@TableField("PRE_PAY_AMT")
	private Double prePayAmt;
    /**
     * 发生额（单位分）
     */
	@TableField("ACC_AMOUNT")
	private Double accAmount;
    /**
     * 当前总额（单位分）
     */
	@TableField("TOTAL_AMT")
	private Double totalAmt;
    /**
     * 前次总额（单位分）
     */
	@TableField("PRE_AMOUNT")
	private Double preAmount;
    /**
     * 交易类型，01:还款02:转入03:结转
     */
	@TableField("TRANS_TYPE")
	private String transType;
    /**
     * 账户ID
     */
	@TableField("ACCOUNTID")
	private String accountid;
    /**
     * 明细ID
     */
	@TableField("DETAIL_ID")
	private String detailId;
    /**
     * 批次ID
     */
	@TableField("BATCH_ID")
	private String batchId;
    /**
     * 流水号
     */
    @TableId("PAYMENT_SEQ")
	private String paymentSeq;


	public String getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Double getCurPayAmt() {
		return curPayAmt;
	}

	public void setCurPayAmt(Double curPayAmt) {
		this.curPayAmt = curPayAmt;
	}

	public Double getPrePayAmt() {
		return prePayAmt;
	}

	public void setPrePayAmt(Double prePayAmt) {
		this.prePayAmt = prePayAmt;
	}

	public Double getAccAmount() {
		return accAmount;
	}

	public void setAccAmount(Double accAmount) {
		this.accAmount = accAmount;
	}

	public Double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public Double getPreAmount() {
		return preAmount;
	}

	public void setPreAmount(Double preAmount) {
		this.preAmount = preAmount;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getPaymentSeq() {
		return paymentSeq;
	}

	public void setPaymentSeq(String paymentSeq) {
		this.paymentSeq = paymentSeq;
	}

	@Override
	public String toString() {
		return "YstPaybackseq{" +
			", tradeStatus=" + tradeStatus +
			", remark=" + remark +
			", createtime=" + createtime +
			", curPayAmt=" + curPayAmt +
			", prePayAmt=" + prePayAmt +
			", accAmount=" + accAmount +
			", totalAmt=" + totalAmt +
			", preAmount=" + preAmount +
			", transType=" + transType +
			", accountid=" + accountid +
			", detailId=" + detailId +
			", batchId=" + batchId +
			", paymentSeq=" + paymentSeq +
			"}";
	}
}
