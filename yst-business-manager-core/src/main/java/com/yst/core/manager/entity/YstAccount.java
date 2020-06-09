package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 客户账户表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_ACCOUNT")
public class YstAccount extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("REVERSE6")
	private String reverse6;
	@TableField("REVERSE5")
	private String reverse5;
	@TableField("REVERSE4")
	private String reverse4;
	@TableField("REVERSE3")
	private Double reverse3;
	@TableField("REVERSE2")
	private Double reverse2;
	@TableField("REVERSE1")
	private Double reverse1;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 会计日期
     */
	@TableField("ACCOUNTDATE")
	private String accountdate;
    /**
     * 最后交易时间
     */
	@TableField("AMOUNT_CHANGETIME")
	private Date amountChangetime;
    /**
     * 状态变更操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 状态变更时间
     */
	@TableField("STATE_CHANGETIME")
	private Date stateChangetime;
    /**
     * 发起人
     */
	@TableField("PROMOTER")
	private String promoter;
    /**
     * 发起时间
     */
	@TableField("PROMOTETIME")
	private Date promotetime;
    /**
     * 创建时间
     */
	@TableField("CREATETIME")
	private Date createtime;
    /**
     * 00-生效
01-冻结
02-注销登记
03-注销
     */
	@TableField("STATE")
	private String state;
    /**
     * 账户借贷属性：1借记账户、2准贷记账户、3贷记账户
     */
	@TableField("PROPERTY")
	private String property;
    /**
     * 上日贷记余额
     */
	@TableField("LASTDAY_CREDITAMOUNT")
	private Double lastdayCreditamount;
    /**
     * 上日借记余额
     */
	@TableField("LASTDAY_DEBITAMOUNT")
	private Double lastdayDebitamount;
    /**
     * 消费授信额度
     */
	@TableField("CREDIT_LINE")
	private Double creditLine;
    /**
     * 消费贷记金额
     */
	@TableField("CREDIT_AMOUNT")
	private Double creditAmount;
    /**
     * 冻结授信金额
     */
	@TableField("FREEZE_CREDIT_LINEAMOUNT")
	private Double freezeCreditLineamount;
    /**
     * 冻结不可提现金额
     */
	@TableField("FREEZE_UNCASHAMOUNT")
	private Double freezeUncashamount;
    /**
     * 只给管理平台开放接口
     */
	@TableField("FREEZE_CASHAMOUNT")
	private Double freezeCashamount;
    /**
     * 保留授信金额
     */
	@TableField("HOLD_CREDIT_LINEAMOUNT")
	private Double holdCreditLineamount;
    /**
     * 保留不可提现金额
     */
	@TableField("HOLD_UNCASHAMOUNT")
	private Double holdUncashamount;
    /**
     * 保留可提现金额
     */
	@TableField("HOLD_CASHAMOUNT")
	private Double holdCashamount;
    /**
     * 不可提现（单位分）
     */
	@TableField("UNCASH_AMOUNT")
	private Double uncashAmount;
    /**
     * 可提现
     */
	@TableField("CASH_AMOUNT")
	private Double cashAmount;
    /**
     * 币种:CNY
     */
	@TableField("CURRENCY")
	private String currency;
    /**
     * 序号：1是默认账户，不可以删除
     */
	@TableField("SEQ")
	private Integer seq;
    /**
     * 账户类型(11:总账户，00：普通账户)
     */
	@TableField("ACCOUNT_TYPE")
	private String accountType;
    /**
     * 用户号,代理商号
     */
	@TableField("USERCODE")
	private String usercode;
    /**
     * 账户ID
     */
    @TableId("ACCOUNTID")
	private String accountid;


	public String getReverse6() {
		return reverse6;
	}

	public void setReverse6(String reverse6) {
		this.reverse6 = reverse6;
	}

	public String getReverse5() {
		return reverse5;
	}

	public void setReverse5(String reverse5) {
		this.reverse5 = reverse5;
	}

	public String getReverse4() {
		return reverse4;
	}

	public void setReverse4(String reverse4) {
		this.reverse4 = reverse4;
	}

	public Double getReverse3() {
		return reverse3;
	}

	public void setReverse3(Double reverse3) {
		this.reverse3 = reverse3;
	}

	public Double getReverse2() {
		return reverse2;
	}

	public void setReverse2(Double reverse2) {
		this.reverse2 = reverse2;
	}

	public Double getReverse1() {
		return reverse1;
	}

	public void setReverse1(Double reverse1) {
		this.reverse1 = reverse1;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAccountdate() {
		return accountdate;
	}

	public void setAccountdate(String accountdate) {
		this.accountdate = accountdate;
	}

	public Date getAmountChangetime() {
		return amountChangetime;
	}

	public void setAmountChangetime(Date amountChangetime) {
		this.amountChangetime = amountChangetime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getStateChangetime() {
		return stateChangetime;
	}

	public void setStateChangetime(Date stateChangetime) {
		this.stateChangetime = stateChangetime;
	}

	public String getPromoter() {
		return promoter;
	}

	public void setPromoter(String promoter) {
		this.promoter = promoter;
	}

	public Date getPromotetime() {
		return promotetime;
	}

	public void setPromotetime(Date promotetime) {
		this.promotetime = promotetime;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Double getLastdayCreditamount() {
		return lastdayCreditamount;
	}

	public void setLastdayCreditamount(Double lastdayCreditamount) {
		this.lastdayCreditamount = lastdayCreditamount;
	}

	public Double getLastdayDebitamount() {
		return lastdayDebitamount;
	}

	public void setLastdayDebitamount(Double lastdayDebitamount) {
		this.lastdayDebitamount = lastdayDebitamount;
	}

	public Double getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(Double creditLine) {
		this.creditLine = creditLine;
	}

	public Double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public Double getFreezeCreditLineamount() {
		return freezeCreditLineamount;
	}

	public void setFreezeCreditLineamount(Double freezeCreditLineamount) {
		this.freezeCreditLineamount = freezeCreditLineamount;
	}

	public Double getFreezeUncashamount() {
		return freezeUncashamount;
	}

	public void setFreezeUncashamount(Double freezeUncashamount) {
		this.freezeUncashamount = freezeUncashamount;
	}

	public Double getFreezeCashamount() {
		return freezeCashamount;
	}

	public void setFreezeCashamount(Double freezeCashamount) {
		this.freezeCashamount = freezeCashamount;
	}

	public Double getHoldCreditLineamount() {
		return holdCreditLineamount;
	}

	public void setHoldCreditLineamount(Double holdCreditLineamount) {
		this.holdCreditLineamount = holdCreditLineamount;
	}

	public Double getHoldUncashamount() {
		return holdUncashamount;
	}

	public void setHoldUncashamount(Double holdUncashamount) {
		this.holdUncashamount = holdUncashamount;
	}

	public Double getHoldCashamount() {
		return holdCashamount;
	}

	public void setHoldCashamount(Double holdCashamount) {
		this.holdCashamount = holdCashamount;
	}

	public Double getUncashAmount() {
		return uncashAmount;
	}

	public void setUncashAmount(Double uncashAmount) {
		this.uncashAmount = uncashAmount;
	}

	public Double getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(Double cashAmount) {
		this.cashAmount = cashAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	@Override
	public String toString() {
		return "YstAccount{" +
			", reverse6=" + reverse6 +
			", reverse5=" + reverse5 +
			", reverse4=" + reverse4 +
			", reverse3=" + reverse3 +
			", reverse2=" + reverse2 +
			", reverse1=" + reverse1 +
			", remark=" + remark +
			", accountdate=" + accountdate +
			", amountChangetime=" + amountChangetime +
			", operator=" + operator +
			", stateChangetime=" + stateChangetime +
			", promoter=" + promoter +
			", promotetime=" + promotetime +
			", createtime=" + createtime +
			", state=" + state +
			", property=" + property +
			", lastdayCreditamount=" + lastdayCreditamount +
			", lastdayDebitamount=" + lastdayDebitamount +
			", creditLine=" + creditLine +
			", creditAmount=" + creditAmount +
			", freezeCreditLineamount=" + freezeCreditLineamount +
			", freezeUncashamount=" + freezeUncashamount +
			", freezeCashamount=" + freezeCashamount +
			", holdCreditLineamount=" + holdCreditLineamount +
			", holdUncashamount=" + holdUncashamount +
			", holdCashamount=" + holdCashamount +
			", uncashAmount=" + uncashAmount +
			", cashAmount=" + cashAmount +
			", currency=" + currency +
			", seq=" + seq +
			", accountType=" + accountType +
			", usercode=" + usercode +
			", accountid=" + accountid +
			"}";
	}
}
