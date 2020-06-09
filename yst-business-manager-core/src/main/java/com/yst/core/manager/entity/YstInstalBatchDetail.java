package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 分期批次明细
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_INSTAL_BATCH_DETAIL")
public class YstInstalBatchDetail extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 支付审核状态：00-审核通过，01-审核中，02-审核拒绝
     */
	@TableField("PAY_AUDIT_STATUS")
	private String payAuditStatus;
    /**
     * 支付审核编号
     */
	@TableField("PAY_AUDIT_ID")
	private String payAuditId;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 状态，01:待还款02:已开始03:已终止04:结转下期
     */
	@TableField("STATUS")
	private String status;
    /**
     * 结束时间
     */
	@TableField("END_TIME")
	private Date endTime;
    /**
     * 开始时间
     */
	@TableField("START_TIME")
	private Date startTime;
    /**
     * 上期结转金额（月底写数据）
     */
	@TableField("PRE_PAY_AMT")
	private Double prePayAmt;
    /**
     * 本月已还（月底写数据）
     */
	@TableField("PAID_AMOUNT")
	private Double paidAmount;
    /**
     * 应还金额（单位分）
     */
	@TableField("AMOUNT")
	private Double amount;
    /**
     * 总期数
     */
	@TableField("TOTAL_INSTAL_NUM")
	private Double totalInstalNum;
    /**
     * 期数
     */
	@TableField("INSTAL_NUM")
	private Double instalNum;
    /**
     * 批次ID
     */
	@TableField("BATCH_ID")
	private String batchId;
    /**
     * 明细ID
     */
    @TableId("DETAIL_ID")
	private String detailId;


	public String getPayAuditStatus() {
		return payAuditStatus;
	}

	public void setPayAuditStatus(String payAuditStatus) {
		this.payAuditStatus = payAuditStatus;
	}

	public String getPayAuditId() {
		return payAuditId;
	}

	public void setPayAuditId(String payAuditId) {
		this.payAuditId = payAuditId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Double getPrePayAmt() {
		return prePayAmt;
	}

	public void setPrePayAmt(Double prePayAmt) {
		this.prePayAmt = prePayAmt;
	}

	public Double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getTotalInstalNum() {
		return totalInstalNum;
	}

	public void setTotalInstalNum(Double totalInstalNum) {
		this.totalInstalNum = totalInstalNum;
	}

	public Double getInstalNum() {
		return instalNum;
	}

	public void setInstalNum(Double instalNum) {
		this.instalNum = instalNum;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	@Override
	public String toString() {
		return "YstInstalBatchDetail{" +
			", payAuditStatus=" + payAuditStatus +
			", payAuditId=" + payAuditId +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", status=" + status +
			", endTime=" + endTime +
			", startTime=" + startTime +
			", prePayAmt=" + prePayAmt +
			", paidAmount=" + paidAmount +
			", amount=" + amount +
			", totalInstalNum=" + totalInstalNum +
			", instalNum=" + instalNum +
			", batchId=" + batchId +
			", detailId=" + detailId +
			"}";
	}
}
