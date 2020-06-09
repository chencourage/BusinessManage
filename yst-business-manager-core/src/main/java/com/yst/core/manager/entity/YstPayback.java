package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 还款记录表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_PAYBACK")
public class YstPayback extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 外部账户ID
     */
	@TableField("OUT_ACC_ID")
	private String outAccId;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 会计日期（更新时间）
     */
	@TableField("ACCOUNTDATE")
	private String accountdate;
    /**
     * 应还总额（单位分）
     */
	@TableField("TOTAL_AMT")
	private Double totalAmt;
    /**
     * 上期结转（单位分）
     */
	@TableField("PRE_PAY_AMT")
	private Double prePayAmt;
    /**
     * 本期应还（单位分）
     */
	@TableField("CUR_PAY_AMT")
	private Double curPayAmt;
    /**
     * 代理商客户ID
     */
	@TableField("CUST_ID")
	private String custId;
    /**
     * 代理商ID
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
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
     * 账户ID
     */
    @TableId("ACCOUNTID")
	private String accountid;


	public String getOutAccId() {
		return outAccId;
	}

	public void setOutAccId(String outAccId) {
		this.outAccId = outAccId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAccountdate() {
		return accountdate;
	}

	public void setAccountdate(String accountdate) {
		this.accountdate = accountdate;
	}

	public Double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public Double getPrePayAmt() {
		return prePayAmt;
	}

	public void setPrePayAmt(Double prePayAmt) {
		this.prePayAmt = prePayAmt;
	}

	public Double getCurPayAmt() {
		return curPayAmt;
	}

	public void setCurPayAmt(Double curPayAmt) {
		this.curPayAmt = curPayAmt;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
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

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	@Override
	public String toString() {
		return "YstPayback{" +
			", outAccId=" + outAccId +
			", remark=" + remark +
			", createTime=" + createTime +
			", accountdate=" + accountdate +
			", totalAmt=" + totalAmt +
			", prePayAmt=" + prePayAmt +
			", curPayAmt=" + curPayAmt +
			", custId=" + custId +
			", agentMercId=" + agentMercId +
			", detailId=" + detailId +
			", batchId=" + batchId +
			", accountid=" + accountid +
			"}";
	}
}
