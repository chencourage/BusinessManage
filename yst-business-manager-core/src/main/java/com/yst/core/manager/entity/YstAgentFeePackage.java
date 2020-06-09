package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 代理商费率套餐
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_AGENT_FEE_PACKAGE")
public class YstAgentFeePackage extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 优先级，0最高优先级（唯一），9999最低优先级，5000默认优先级
     */
	@TableField("PRIORITY")
	private Integer priority;
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
     * 操作人名称
     */
	@TableField("OPERATE_NAME")
	private String operateName;
    /**
     * 操作人ID
     */
	@TableField("OPERATE_ID")
	private String operateId;
    /**
     * 银联二档费率（百分比）
     */
	@TableField("UNION_FEE2")
	private Double unionFee2;
    /**
     * 银联一档费率（百分比）
     */
	@TableField("UNION_FEE1")
	private Double unionFee1;
    /**
     * pay卡费率（百分比）
     */
	@TableField("PAYCARD_FEE")
	private Double paycardFee;
    /**
     * 提现手续费（元）
     */
	@TableField("CASH_FEE")
	private Double cashFee;
    /**
     * 闪付费率（百分比）
     */
	@TableField("QUICK_PASS_FEE")
	private Double quickPassFee;
    /**
     * 大POS封顶金额（元）
     */
	@TableField("POS_T1_CAPS")
	private Double posT1Caps;
    /**
     * 大POS费率（百分比）
     */
	@TableField("POS_T1_FEE")
	private Double posT1Fee;
    /**
     * mpos借记卡费率（百分比）
     */
	@TableField("MPOS_DEBIT_T1_FEE")
	private Double mposDebitT1Fee;
    /**
     * mpos借记卡封顶金额（元）
     */
	@TableField("MPOS_DEBIT_T1_CAPS")
	private Double mposDebitT1Caps;
    /**
     * mpos贷记卡费率（百分比）
     */
	@TableField("MPOS_CREDIT_T1_FEE")
	private Double mposCreditT1Fee;
    /**
     * 代理商号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 费率套餐名称
     */
	@TableField("FEE_PACKAGE_NAME")
	private String feePackageName;
    /**
     * 费率套餐ID
     */
    @TableId("FEE_PACKAGE_ID")
	private String feePackageId;
    /**
     * mPOS会员过期提现结算费（元）
     */
	@TableField("MPOS_MEM_OVER_CASH_FEE")
	private Double mposMemOverCashFee;
    /**
     * mPOS会员过期结算费率
     */
	@TableField("MPOS_MEM_OVER_T1_FEE")
	private Double mposMemOverT1Fee;
    /**
     * mPOS会员结算费率
     */
	@TableField("MPOS_MEM_T1_FEE")
	private Double mposMemT1Fee;
    /**
     * mPOS会员提现结算费（元）
     */
	@TableField("MPOS_MEM_CASH_FEE")
	private Double mposMemCashFee;


	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
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

	public String getOperateName() {
		return operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}

	public String getOperateId() {
		return operateId;
	}

	public void setOperateId(String operateId) {
		this.operateId = operateId;
	}

	public Double getUnionFee2() {
		return unionFee2;
	}

	public void setUnionFee2(Double unionFee2) {
		this.unionFee2 = unionFee2;
	}

	public Double getUnionFee1() {
		return unionFee1;
	}

	public void setUnionFee1(Double unionFee1) {
		this.unionFee1 = unionFee1;
	}

	public Double getPaycardFee() {
		return paycardFee;
	}

	public void setPaycardFee(Double paycardFee) {
		this.paycardFee = paycardFee;
	}

	public Double getCashFee() {
		return cashFee;
	}

	public void setCashFee(Double cashFee) {
		this.cashFee = cashFee;
	}

	public Double getQuickPassFee() {
		return quickPassFee;
	}

	public void setQuickPassFee(Double quickPassFee) {
		this.quickPassFee = quickPassFee;
	}

	public Double getPosT1Caps() {
		return posT1Caps;
	}

	public void setPosT1Caps(Double posT1Caps) {
		this.posT1Caps = posT1Caps;
	}

	public Double getPosT1Fee() {
		return posT1Fee;
	}

	public void setPosT1Fee(Double posT1Fee) {
		this.posT1Fee = posT1Fee;
	}

	public Double getMposDebitT1Fee() {
		return mposDebitT1Fee;
	}

	public void setMposDebitT1Fee(Double mposDebitT1Fee) {
		this.mposDebitT1Fee = mposDebitT1Fee;
	}

	public Double getMposDebitT1Caps() {
		return mposDebitT1Caps;
	}

	public void setMposDebitT1Caps(Double mposDebitT1Caps) {
		this.mposDebitT1Caps = mposDebitT1Caps;
	}

	public Double getMposCreditT1Fee() {
		return mposCreditT1Fee;
	}

	public void setMposCreditT1Fee(Double mposCreditT1Fee) {
		this.mposCreditT1Fee = mposCreditT1Fee;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getFeePackageName() {
		return feePackageName;
	}

	public void setFeePackageName(String feePackageName) {
		this.feePackageName = feePackageName;
	}

	public String getFeePackageId() {
		return feePackageId;
	}

	public void setFeePackageId(String feePackageId) {
		this.feePackageId = feePackageId;
	}

	public Double getMposMemOverCashFee() {
		return mposMemOverCashFee;
	}

	public void setMposMemOverCashFee(Double mposMemOverCashFee) {
		this.mposMemOverCashFee = mposMemOverCashFee;
	}

	public Double getMposMemOverT1Fee() {
		return mposMemOverT1Fee;
	}

	public void setMposMemOverT1Fee(Double mposMemOverT1Fee) {
		this.mposMemOverT1Fee = mposMemOverT1Fee;
	}

	public Double getMposMemT1Fee() {
		return mposMemT1Fee;
	}

	public void setMposMemT1Fee(Double mposMemT1Fee) {
		this.mposMemT1Fee = mposMemT1Fee;
	}

	public Double getMposMemCashFee() {
		return mposMemCashFee;
	}

	public void setMposMemCashFee(Double mposMemCashFee) {
		this.mposMemCashFee = mposMemCashFee;
	}

	@Override
	public String toString() {
		return "YstAgentFeePackage{" +
			", priority=" + priority +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", operateName=" + operateName +
			", operateId=" + operateId +
			", unionFee2=" + unionFee2 +
			", unionFee1=" + unionFee1 +
			", paycardFee=" + paycardFee +
			", cashFee=" + cashFee +
			", quickPassFee=" + quickPassFee +
			", posT1Caps=" + posT1Caps +
			", posT1Fee=" + posT1Fee +
			", mposDebitT1Fee=" + mposDebitT1Fee +
			", mposDebitT1Caps=" + mposDebitT1Caps +
			", mposCreditT1Fee=" + mposCreditT1Fee +
			", agentMercId=" + agentMercId +
			", feePackageName=" + feePackageName +
			", feePackageId=" + feePackageId +
			", mposMemOverCashFee=" + mposMemOverCashFee +
			", mposMemOverT1Fee=" + mposMemOverT1Fee +
			", mposMemT1Fee=" + mposMemT1Fee +
			", mposMemCashFee=" + mposMemCashFee +
			"}";
	}
}
