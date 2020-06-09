package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 分期支付审核表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_INSTAL_PAY_AUDIT")
public class YstInstalPayAudit extends BaseEntity {

    private static final long serialVersionUID = 1L;

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
     * 审核时间
     */
	@TableField("AUDIT_TIME")
	private Date auditTime;
    /**
     * 申请时间
     */
	@TableField("APPLY_TIME")
	private Date applyTime;
    /**
     * 审核意见
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 审核人
     */
	@TableField("AUDITOR")
	private String auditor;
    /**
     * 状态：00-审核通过，01-审核中，02-审核拒绝
     */
	@TableField("AUDIT_STATUS")
	private String auditStatus;
    /**
     * 转账凭证图片地址
     */
	@TableField("IMG_URL")
	private String imgUrl;
    /**
     * 转账汇款时间
     */
	@TableField("PAY_TIME")
	private Date payTime;
    /**
     * 收款人支行名称
     */
	@TableField("PAYEE_BANK_SUB_BRANCH")
	private String payeeBankSubBranch;
    /**
     * 收款人账号
     */
	@TableField("PAYEE_BANK_ACC_NO")
	private String payeeBankAccNo;
    /**
     * 转账人账号
     */
	@TableField("PAYER_BANK_ACC_NO")
	private String payerBankAccNo;
    /**
     * 转账人户名
     */
	@TableField("PAYER_BANK_ACC_NAME")
	private String payerBankAccName;
    /**
     * 申请人代理商号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 还款金额（单位分）
     */
	@TableField("AMOUNT")
	private Double amount;
    /**
     * 支付审核编号
     */
    @TableId("PAY_AUDIT_ID")
	private String payAuditId;


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

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayeeBankSubBranch() {
		return payeeBankSubBranch;
	}

	public void setPayeeBankSubBranch(String payeeBankSubBranch) {
		this.payeeBankSubBranch = payeeBankSubBranch;
	}

	public String getPayeeBankAccNo() {
		return payeeBankAccNo;
	}

	public void setPayeeBankAccNo(String payeeBankAccNo) {
		this.payeeBankAccNo = payeeBankAccNo;
	}

	public String getPayerBankAccNo() {
		return payerBankAccNo;
	}

	public void setPayerBankAccNo(String payerBankAccNo) {
		this.payerBankAccNo = payerBankAccNo;
	}

	public String getPayerBankAccName() {
		return payerBankAccName;
	}

	public void setPayerBankAccName(String payerBankAccName) {
		this.payerBankAccName = payerBankAccName;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPayAuditId() {
		return payAuditId;
	}

	public void setPayAuditId(String payAuditId) {
		this.payAuditId = payAuditId;
	}

	@Override
	public String toString() {
		return "YstInstalPayAudit{" +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", auditTime=" + auditTime +
			", applyTime=" + applyTime +
			", remark=" + remark +
			", auditor=" + auditor +
			", auditStatus=" + auditStatus +
			", imgUrl=" + imgUrl +
			", payTime=" + payTime +
			", payeeBankSubBranch=" + payeeBankSubBranch +
			", payeeBankAccNo=" + payeeBankAccNo +
			", payerBankAccNo=" + payerBankAccNo +
			", payerBankAccName=" + payerBankAccName +
			", agentMercId=" + agentMercId +
			", amount=" + amount +
			", payAuditId=" + payAuditId +
			"}";
	}
}
