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
@TableName("YST_AGENT_FEE_REC")
public class YstAgentFeeRec extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 外卡结算费率
     */
	@TableField("FORIGN_FEE")
	private Double forignFee;
    /**
     * 推荐分润明细
     */
	@TableField("ADVICE_FEE_DETAIL")
	private String adviceFeeDetail;
    /**
     * T1建议费率
     */
	@TableField("ADVICE_T1_FEE")
	private Double adviceT1Fee;
    /**
     * 闪付费率
     */
	@TableField("QUICK_PASS_FEE")
	private Double quickPassFee;
    /**
     * 代理商结算价id
     */
	@TableField("SETTLE_FEEID")
	private String settleFeeid;
    /**
     * 分润比 0-100（默认100）
     */
	@TableField("PROFIT_RATIO")
	private Double profitRatio;
    /**
     * 001，002时，结算费率，003时微信支付宝结算费率
     */
	@TableField("T1_FEE")
	private Double t1Fee;
    /**
     * 提现费率
     */
	@TableField("CASH_FEE")
	private Double cashFee;
    /**
     * 生效时间
     */
	@TableField("EFFECT_TIME")
	private Date effectTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * D0垫资金额
     */
	@TableField("D0_FEE_FIXED")
	private Double d0FeeFixed;
    /**
     * D0封顶金额
     */
	@TableField("D0_FEE_CAPS")
	private Double d0FeeCaps;
    /**
     * D0结算费率
     */
	@TableField("D0_FEE")
	private Double d0Fee;
    /**
     * T1封顶金额
     */
	@TableField("T1_FEE_CAPS")
	private Double t1FeeCaps;
    /**
     * 003时银联二档结算费率
     */
	@TableField("UNION_FEE2")
	private Double unionFee2;
    /**
     * 操作人ID
     */
	@TableField("OPERATOR_ID")
	private String operatorId;
    /**
     * 003时银联一档结算费率
     */
	@TableField("UNION_FEE1")
	private Double unionFee1;
    /**
     * 卡类型:001-mpos借记卡，002-mpos贷记卡，003-pay卡结算，004-大pos借记卡，005-大pos贷记卡
     */
	@TableField("CARD_TYPE")
	private String cardType;
    /**
     * 代理商名称
     */
	@TableField("AGENT_MERC_NAME")
	private String agentMercName;
    /**
     * 代理商编号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 费率ID
     */
    @TableId("FEE_ID")
	private String feeId;
    /**
     * 代理商会员过期提现结算费率
     */
	@TableField("MEM_OVER_CASH_FEE")
	private Double memOverCashFee;
    /**
     * 代理商会员过期结算费率
     */
	@TableField("MEM_OVER_T1_FEE")
	private Double memOverT1Fee;
    /**
     * 代理商会员提现结算费率
     */
	@TableField("MEM_CASH_FEE")
	private Double memCashFee;
    /**
     * 代理商会员结算费率
     */
	@TableField("MEM_T1_FEE")
	private Double memT1Fee;


	public Double getForignFee() {
		return forignFee;
	}

	public void setForignFee(Double forignFee) {
		this.forignFee = forignFee;
	}

	public String getAdviceFeeDetail() {
		return adviceFeeDetail;
	}

	public void setAdviceFeeDetail(String adviceFeeDetail) {
		this.adviceFeeDetail = adviceFeeDetail;
	}

	public Double getAdviceT1Fee() {
		return adviceT1Fee;
	}

	public void setAdviceT1Fee(Double adviceT1Fee) {
		this.adviceT1Fee = adviceT1Fee;
	}

	public Double getQuickPassFee() {
		return quickPassFee;
	}

	public void setQuickPassFee(Double quickPassFee) {
		this.quickPassFee = quickPassFee;
	}

	public String getSettleFeeid() {
		return settleFeeid;
	}

	public void setSettleFeeid(String settleFeeid) {
		this.settleFeeid = settleFeeid;
	}

	public Double getProfitRatio() {
		return profitRatio;
	}

	public void setProfitRatio(Double profitRatio) {
		this.profitRatio = profitRatio;
	}

	public Double getT1Fee() {
		return t1Fee;
	}

	public void setT1Fee(Double t1Fee) {
		this.t1Fee = t1Fee;
	}

	public Double getCashFee() {
		return cashFee;
	}

	public void setCashFee(Double cashFee) {
		this.cashFee = cashFee;
	}

	public Date getEffectTime() {
		return effectTime;
	}

	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Double getD0FeeFixed() {
		return d0FeeFixed;
	}

	public void setD0FeeFixed(Double d0FeeFixed) {
		this.d0FeeFixed = d0FeeFixed;
	}

	public Double getD0FeeCaps() {
		return d0FeeCaps;
	}

	public void setD0FeeCaps(Double d0FeeCaps) {
		this.d0FeeCaps = d0FeeCaps;
	}

	public Double getD0Fee() {
		return d0Fee;
	}

	public void setD0Fee(Double d0Fee) {
		this.d0Fee = d0Fee;
	}

	public Double getT1FeeCaps() {
		return t1FeeCaps;
	}

	public void setT1FeeCaps(Double t1FeeCaps) {
		this.t1FeeCaps = t1FeeCaps;
	}

	public Double getUnionFee2() {
		return unionFee2;
	}

	public void setUnionFee2(Double unionFee2) {
		this.unionFee2 = unionFee2;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Double getUnionFee1() {
		return unionFee1;
	}

	public void setUnionFee1(Double unionFee1) {
		this.unionFee1 = unionFee1;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
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

	public String getFeeId() {
		return feeId;
	}

	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}

	public Double getMemOverCashFee() {
		return memOverCashFee;
	}

	public void setMemOverCashFee(Double memOverCashFee) {
		this.memOverCashFee = memOverCashFee;
	}

	public Double getMemOverT1Fee() {
		return memOverT1Fee;
	}

	public void setMemOverT1Fee(Double memOverT1Fee) {
		this.memOverT1Fee = memOverT1Fee;
	}

	public Double getMemCashFee() {
		return memCashFee;
	}

	public void setMemCashFee(Double memCashFee) {
		this.memCashFee = memCashFee;
	}

	public Double getMemT1Fee() {
		return memT1Fee;
	}

	public void setMemT1Fee(Double memT1Fee) {
		this.memT1Fee = memT1Fee;
	}

	@Override
	public String toString() {
		return "YstAgentFeeRec{" +
			", forignFee=" + forignFee +
			", adviceFeeDetail=" + adviceFeeDetail +
			", adviceT1Fee=" + adviceT1Fee +
			", quickPassFee=" + quickPassFee +
			", settleFeeid=" + settleFeeid +
			", profitRatio=" + profitRatio +
			", t1Fee=" + t1Fee +
			", cashFee=" + cashFee +
			", effectTime=" + effectTime +
			", createTime=" + createTime +
			", d0FeeFixed=" + d0FeeFixed +
			", d0FeeCaps=" + d0FeeCaps +
			", d0Fee=" + d0Fee +
			", t1FeeCaps=" + t1FeeCaps +
			", unionFee2=" + unionFee2 +
			", operatorId=" + operatorId +
			", unionFee1=" + unionFee1 +
			", cardType=" + cardType +
			", agentMercName=" + agentMercName +
			", agentMercId=" + agentMercId +
			", feeId=" + feeId +
			", memOverCashFee=" + memOverCashFee +
			", memOverT1Fee=" + memOverT1Fee +
			", memCashFee=" + memCashFee +
			", memT1Fee=" + memT1Fee +
			"}";
	}
}
