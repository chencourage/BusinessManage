package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 套餐购买记录表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("MEMBER_BUY_INFO")
public class MemberBuyInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 套餐金额(分)
     */
	@TableField("MEM_PACKAGE_AMOUNT")
	private Double memPackageAmount;
    /**
     * 提现交易流水
     */
	@TableField("WITHDRAW_TRADE_SN")
	private String withdrawTradeSn;
    /**
     * 是否首次购买 Y是 空或N：否
     */
	@TableField("FIRST")
	private String first;
    /**
     * 套餐名称
     */
	@TableField("PACKAGE_NAME")
	private String packageName;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 闪付费率
     */
	@TableField("FEE_RATE_QUICKPASS")
	private Double feeRateQuickpass;
    /**
     * 提现费(分)
     */
	@TableField("FEE_WITHDRAW")
	private Double feeWithdraw;
    /**
     * 终端号
     */
	@TableField("TERM_NO")
	private String termNo;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 状态(0:已下单1:已付款 2扣款中 3扣款超时)
     */
	@TableField("STATUS")
	private String status;
    /**
     * 交易流水ID
     */
	@TableField("TRADE_ID")
	private String tradeId;
    /**
     * 购买时间
     */
	@TableField("BUY_DATE")
	private Date buyDate;
    /**
     * 套餐费率
     */
	@TableField("FEE_RATE")
	private Double feeRate;
    /**
     * 套餐结束日期
     */
	@TableField("END_DATE")
	private Date endDate;
    /**
     * 套餐起始日期
     */
	@TableField("BEGIN_DATE")
	private Date beginDate;
    /**
     * 套餐ID
     */
	@TableField("PACKAGE_ID")
	private Double packageId;
    /**
     * 商户号
     */
	@TableField("MERCHANT_NO")
	private String merchantNo;
    /**
     * 用户号
     */
	@TableField("USER_CODE")
	private String userCode;
    @TableId("ID")
	private Double id;
    /**
     * 代付订单创建时间 需要考虑日切
     */
	@TableField("SHOP_DATE")
	private String shopDate;


	public Double getMemPackageAmount() {
		return memPackageAmount;
	}

	public void setMemPackageAmount(Double memPackageAmount) {
		this.memPackageAmount = memPackageAmount;
	}

	public String getWithdrawTradeSn() {
		return withdrawTradeSn;
	}

	public void setWithdrawTradeSn(String withdrawTradeSn) {
		this.withdrawTradeSn = withdrawTradeSn;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Double getFeeRateQuickpass() {
		return feeRateQuickpass;
	}

	public void setFeeRateQuickpass(Double feeRateQuickpass) {
		this.feeRateQuickpass = feeRateQuickpass;
	}

	public Double getFeeWithdraw() {
		return feeWithdraw;
	}

	public void setFeeWithdraw(Double feeWithdraw) {
		this.feeWithdraw = feeWithdraw;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public Double getFeeRate() {
		return feeRate;
	}

	public void setFeeRate(Double feeRate) {
		this.feeRate = feeRate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Double getPackageId() {
		return packageId;
	}

	public void setPackageId(Double packageId) {
		this.packageId = packageId;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getShopDate() {
		return shopDate;
	}

	public void setShopDate(String shopDate) {
		this.shopDate = shopDate;
	}

	@Override
	public String toString() {
		return "MemberBuyInfo{" +
			", memPackageAmount=" + memPackageAmount +
			", withdrawTradeSn=" + withdrawTradeSn +
			", first=" + first +
			", packageName=" + packageName +
			", createTime=" + createTime +
			", feeRateQuickpass=" + feeRateQuickpass +
			", feeWithdraw=" + feeWithdraw +
			", termNo=" + termNo +
			", remark=" + remark +
			", status=" + status +
			", tradeId=" + tradeId +
			", buyDate=" + buyDate +
			", feeRate=" + feeRate +
			", endDate=" + endDate +
			", beginDate=" + beginDate +
			", packageId=" + packageId +
			", merchantNo=" + merchantNo +
			", userCode=" + userCode +
			", id=" + id +
			", shopDate=" + shopDate +
			"}";
	}
}
