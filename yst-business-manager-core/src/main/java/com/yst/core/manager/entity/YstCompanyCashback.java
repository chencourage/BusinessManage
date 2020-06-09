package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 公司返现表，所有金额单位均为分（c_acc00：直营00户，c_purse：直营钱包，s_acc00：直签00户，s_acc11：直签11户，s_purse：直签钱包，total：总共返现金额）
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_COMPANY_CASHBACK")
public class YstCompanyCashback extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 返现类型：00-mpos直签可选规则，01-不可选规则，02-mpos分公司可选规则，03-大POS直签可选规则，04-大POS分公司可选规则，99-运营端可选（测试套餐）
     */
	@TableField("BACK_TYPE")
	private String backType;
    /**
     * 是否公司默认返现规则00是空或11否
     */
	@TableField("IS_DEFAULT")
	private String isDefault;
    /**
     * 返券规则ID
     */
	@TableField("MARKET_CODE")
	private String marketCode;
    /**
     * 更新时间
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
	@TableField("OPERA_NAME")
	private String operaName;
    /**
     * 操作人ID
     */
	@TableField("OPERA_ID")
	private String operaId;
    /**
     * 规则描述
     */
	@TableField("DESCRIPTION")
	private String description;
    /**
     * 开启返现_活动期外_返现规则
     */
	@TableField("Y_OUT_CB")
	private String yOutCb;
    /**
     * 开启返现_活动期内_返现规则
     */
	@TableField("Y_IN_CB")
	private String yInCb;
    /**
     * 关闭返现_活动期外_返现规则
     */
	@TableField("N_OUT_CB")
	private String nOutCb;
    /**
     * 关闭返现_活动期内_返现规则
     */
	@TableField("N_IN_CB")
	private String nInCb;
    /**
     * 活动期外返现激活总返现金额（单位分）
     */
	@TableField("OUT_TOTAL_AMT")
	private Double outTotalAmt;
    /**
     * 活动期内返现激活总返现金额（单位分）
     */
	@TableField("IN_TOTAL_AMT")
	private Double inTotalAmt;
    /**
     * 活动持续时间（单位天）
     */
	@TableField("VALIDITY_DAY")
	private Double validityDay;
    /**
     * 扣押金金额（单位分）
     */
	@TableField("DEPOSIT_AMT")
	private Double depositAmt;
    /**
     * 主键
     */
    @TableId("COMP_CB_ID")
	private String compCbId;


	public String getBackType() {
		return backType;
	}

	public void setBackType(String backType) {
		this.backType = backType;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getMarketCode() {
		return marketCode;
	}

	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
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

	public String getOperaName() {
		return operaName;
	}

	public void setOperaName(String operaName) {
		this.operaName = operaName;
	}

	public String getOperaId() {
		return operaId;
	}

	public void setOperaId(String operaId) {
		this.operaId = operaId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getyOutCb() {
		return yOutCb;
	}

	public void setyOutCb(String yOutCb) {
		this.yOutCb = yOutCb;
	}

	public String getyInCb() {
		return yInCb;
	}

	public void setyInCb(String yInCb) {
		this.yInCb = yInCb;
	}

	public String getnOutCb() {
		return nOutCb;
	}

	public void setnOutCb(String nOutCb) {
		this.nOutCb = nOutCb;
	}

	public String getnInCb() {
		return nInCb;
	}

	public void setnInCb(String nInCb) {
		this.nInCb = nInCb;
	}

	public Double getOutTotalAmt() {
		return outTotalAmt;
	}

	public void setOutTotalAmt(Double outTotalAmt) {
		this.outTotalAmt = outTotalAmt;
	}

	public Double getInTotalAmt() {
		return inTotalAmt;
	}

	public void setInTotalAmt(Double inTotalAmt) {
		this.inTotalAmt = inTotalAmt;
	}

	public Double getValidityDay() {
		return validityDay;
	}

	public void setValidityDay(Double validityDay) {
		this.validityDay = validityDay;
	}

	public Double getDepositAmt() {
		return depositAmt;
	}

	public void setDepositAmt(Double depositAmt) {
		this.depositAmt = depositAmt;
	}

	public String getCompCbId() {
		return compCbId;
	}

	public void setCompCbId(String compCbId) {
		this.compCbId = compCbId;
	}

	@Override
	public String toString() {
		return "YstCompanyCashback{" +
			", backType=" + backType +
			", isDefault=" + isDefault +
			", marketCode=" + marketCode +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", operaName=" + operaName +
			", operaId=" + operaId +
			", description=" + description +
			", yOutCb=" + yOutCb +
			", yInCb=" + yInCb +
			", nOutCb=" + nOutCb +
			", nInCb=" + nInCb +
			", outTotalAmt=" + outTotalAmt +
			", inTotalAmt=" + inTotalAmt +
			", validityDay=" + validityDay +
			", depositAmt=" + depositAmt +
			", compCbId=" + compCbId +
			"}";
	}
}
