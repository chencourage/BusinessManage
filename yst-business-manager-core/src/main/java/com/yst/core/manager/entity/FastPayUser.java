package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 快捷支付用户状态表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("FAST_PAY_USER")
public class FastPayUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 提现计费方式    01--按照百分比（封顶金额 不足两块 ）  02--按固定金额   03--按笔数 
     */
	@TableField("WITHDRAW_CAL_METHOD")
	private String withdrawCalMethod;
    /**
     * 消费计费方式    01--按照百分比（封顶金额 不足两块 ）  02--按固定金额   03--按笔数 
     */
	@TableField("SALE_CAL_METHOD")
	private String saleCalMethod;
    /**
     * 结算卡记录表Id
     */
	@TableField("HISTORY_ACCOUNT_CARD_ID")
	private String historyAccountCardId;
    /**
     * 费率信息Id
     */
	@TableField("FEEID")
	private String feeid;
    /**
     * 贷记卡消费手续费最低收费金额
     */
	@TableField("CREDIT_CARD_BEGIN_AMOUNT")
	private Double creditCardBeginAmount;
    /**
     * 借记卡消费手续费最低收费金额
     */
	@TableField("DEBIT_CARD_BEGIN_AMOUNT")
	private Double debitCardBeginAmount;
    /**
     * 提现最高收费金额
     */
	@TableField("WITHDRAW_CAP_FEE_AMOUNT")
	private Double withdrawCapFeeAmount;
	@TableField("ITEM_VALUE_5")
	private String itemValue5;
	@TableField("ITEM_VALUE_4")
	private String itemValue4;
	@TableField("ITEM_VALUE_3")
	private String itemValue3;
	@TableField("ITEM_VALUE_2")
	private String itemValue2;
    /**
     * 备用字段
     */
	@TableField("ITEM_VALUE_1")
	private String itemValue1;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
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
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 提现最低收费金额
     */
	@TableField("WITHDRAW_BEGIN_CAL_FEE_AMOUNT")
	private Double withdrawBeginCalFeeAmount;
    /**
     * APP显示的费率信息
     */
	@TableField("APP_FEE_DESC")
	private String appFeeDesc;
    /**
     * 开户状态  00成功 60开户失败  63待计费  55--待开户
     */
	@TableField("STATE")
	private String state;
    /**
     * 提现手续费固定金额
     */
	@TableField("FIXED_AMOUNT")
	private Double fixedAmount;
    /**
     * 提现费率
     */
	@TableField("WITHDRAW_RATE")
	private Double withdrawRate;
    /**
     * 贷记卡封顶金额
     */
	@TableField("CREDIT_CARD_CAP_AMOUNT")
	private Double creditCardCapAmount;
    /**
     * 借记卡封顶金额
     */
	@TableField("DEBIT_CARD_CAP_AMOUNT")
	private Double debitCardCapAmount;
    /**
     * 贷记卡费率
     */
	@TableField("CREDIT_CARD_RATE")
	private Double creditCardRate;
    /**
     * 借记卡费率
     */
	@TableField("DEBIT_CARD_RATE")
	private Double debitCardRate;
    /**
     * 结算卡号
     */
	@TableField("BANK_ACCOUNT_NO")
	private String bankAccountNo;
    /**
     * 用户号
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;


	public String getWithdrawCalMethod() {
		return withdrawCalMethod;
	}

	public void setWithdrawCalMethod(String withdrawCalMethod) {
		this.withdrawCalMethod = withdrawCalMethod;
	}

	public String getSaleCalMethod() {
		return saleCalMethod;
	}

	public void setSaleCalMethod(String saleCalMethod) {
		this.saleCalMethod = saleCalMethod;
	}

	public String getHistoryAccountCardId() {
		return historyAccountCardId;
	}

	public void setHistoryAccountCardId(String historyAccountCardId) {
		this.historyAccountCardId = historyAccountCardId;
	}

	public String getFeeid() {
		return feeid;
	}

	public void setFeeid(String feeid) {
		this.feeid = feeid;
	}

	public Double getCreditCardBeginAmount() {
		return creditCardBeginAmount;
	}

	public void setCreditCardBeginAmount(Double creditCardBeginAmount) {
		this.creditCardBeginAmount = creditCardBeginAmount;
	}

	public Double getDebitCardBeginAmount() {
		return debitCardBeginAmount;
	}

	public void setDebitCardBeginAmount(Double debitCardBeginAmount) {
		this.debitCardBeginAmount = debitCardBeginAmount;
	}

	public Double getWithdrawCapFeeAmount() {
		return withdrawCapFeeAmount;
	}

	public void setWithdrawCapFeeAmount(Double withdrawCapFeeAmount) {
		this.withdrawCapFeeAmount = withdrawCapFeeAmount;
	}

	public String getItemValue5() {
		return itemValue5;
	}

	public void setItemValue5(String itemValue5) {
		this.itemValue5 = itemValue5;
	}

	public String getItemValue4() {
		return itemValue4;
	}

	public void setItemValue4(String itemValue4) {
		this.itemValue4 = itemValue4;
	}

	public String getItemValue3() {
		return itemValue3;
	}

	public void setItemValue3(String itemValue3) {
		this.itemValue3 = itemValue3;
	}

	public String getItemValue2() {
		return itemValue2;
	}

	public void setItemValue2(String itemValue2) {
		this.itemValue2 = itemValue2;
	}

	public String getItemValue1() {
		return itemValue1;
	}

	public void setItemValue1(String itemValue1) {
		this.itemValue1 = itemValue1;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getWithdrawBeginCalFeeAmount() {
		return withdrawBeginCalFeeAmount;
	}

	public void setWithdrawBeginCalFeeAmount(Double withdrawBeginCalFeeAmount) {
		this.withdrawBeginCalFeeAmount = withdrawBeginCalFeeAmount;
	}

	public String getAppFeeDesc() {
		return appFeeDesc;
	}

	public void setAppFeeDesc(String appFeeDesc) {
		this.appFeeDesc = appFeeDesc;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getFixedAmount() {
		return fixedAmount;
	}

	public void setFixedAmount(Double fixedAmount) {
		this.fixedAmount = fixedAmount;
	}

	public Double getWithdrawRate() {
		return withdrawRate;
	}

	public void setWithdrawRate(Double withdrawRate) {
		this.withdrawRate = withdrawRate;
	}

	public Double getCreditCardCapAmount() {
		return creditCardCapAmount;
	}

	public void setCreditCardCapAmount(Double creditCardCapAmount) {
		this.creditCardCapAmount = creditCardCapAmount;
	}

	public Double getDebitCardCapAmount() {
		return debitCardCapAmount;
	}

	public void setDebitCardCapAmount(Double debitCardCapAmount) {
		this.debitCardCapAmount = debitCardCapAmount;
	}

	public Double getCreditCardRate() {
		return creditCardRate;
	}

	public void setCreditCardRate(Double creditCardRate) {
		this.creditCardRate = creditCardRate;
	}

	public Double getDebitCardRate() {
		return debitCardRate;
	}

	public void setDebitCardRate(Double debitCardRate) {
		this.debitCardRate = debitCardRate;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FastPayUser{" +
			", withdrawCalMethod=" + withdrawCalMethod +
			", saleCalMethod=" + saleCalMethod +
			", historyAccountCardId=" + historyAccountCardId +
			", feeid=" + feeid +
			", creditCardBeginAmount=" + creditCardBeginAmount +
			", debitCardBeginAmount=" + debitCardBeginAmount +
			", withdrawCapFeeAmount=" + withdrawCapFeeAmount +
			", itemValue5=" + itemValue5 +
			", itemValue4=" + itemValue4 +
			", itemValue3=" + itemValue3 +
			", itemValue2=" + itemValue2 +
			", itemValue1=" + itemValue1 +
			", operator=" + operator +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", remark=" + remark +
			", withdrawBeginCalFeeAmount=" + withdrawBeginCalFeeAmount +
			", appFeeDesc=" + appFeeDesc +
			", state=" + state +
			", fixedAmount=" + fixedAmount +
			", withdrawRate=" + withdrawRate +
			", creditCardCapAmount=" + creditCardCapAmount +
			", debitCardCapAmount=" + debitCardCapAmount +
			", creditCardRate=" + creditCardRate +
			", debitCardRate=" + debitCardRate +
			", bankAccountNo=" + bankAccountNo +
			", userCode=" + userCode +
			", id=" + id +
			"}";
	}
}
