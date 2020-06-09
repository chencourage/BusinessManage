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
@TableName("CASH_PLEDGE_RECORD")
public class CashPledgeRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 会员购买记录id
     */
	@TableField("MEM_BUY_RECORD_ID")
	private String memBuyRecordId;
    /**
     * 会员套餐id
     */
	@TableField("MEM_PACKAGE_ID")
	private String memPackageId;
    /**
     * 会员机具 0不是1是
     */
	@TableField("IS_MEMBER")
	private String isMember;
    /**
     * 会员订单，首笔需要扣除金额
     */
	@TableField("ACTUAL_CUT_MONEY")
	private Double actualCutMoney;
    /**
     * 卡券状态  00  成功 99 失败
     */
	@TableField("COUPON_STATE")
	private String couponState;
    /**
     * 代理商返现标识（0：未返现，1：已经返现）
     */
	@TableField("CASHBACK_FLAG")
	private String cashbackFlag;
    /**
     * 押金扣款创建订单日期shopDate
     */
	@TableField("ITEM_2")
	private String item2;
    /**
     * 卡券规则id
     */
	@TableField("ITEM_1")
	private String item1;
    /**
     * 类型 ：1或空 手刷或mpos黑机扣押金 2mpos蓝机扣激活费用 3线下大pos扣押金
     */
	@TableField("CASH_TYPE")
	private String cashType;
    /**
     * mpos允许返还押金的时间周期
     */
	@TableField("MPOS_BACK_CYCLE")
	private Integer mposBackCycle;
    /**
     * 提现订单表的tradesn
     */
	@TableField("ORDER_TRADE_SN")
	private String orderTradeSn;
    /**
     * 押金的流水
     */
	@TableField("CASH_PLEDGE_TRADESN")
	private String cashPledgeTradesn;
    /**
     * 是否需要扣押金  Y--是 N--否
     */
	@TableField("IS_NEED_TO_TAKEOUT")
	private String isNeedToTakeout;
    /**
     * 机构号
     */
	@TableField("ORG_NO")
	private String orgNo;
    /**
     * 更新时间
     */
	@TableField("UPDATETIME")
	private Date updatetime;
    /**
     * 创建时间
     */
	@TableField("CREATETIME")
	private Date createtime;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 来源
     */
	@TableField("SOURCE_AND_VERSION")
	private String sourceAndVersion;
    /**
     * 累计刷卡金额
     */
	@TableField("TOTAL_SWITCHCARD_AMOUNT")
	private Double totalSwitchcardAmount;
    /**
     * 押金返还时间
     */
	@TableField("AMOUNT_GIVEBACK_TIME")
	private Date amountGivebackTime;
    /**
     * 扣除押金完成时间
     */
	@TableField("TAKEOUT_FINISHED_TIME")
	private Date takeoutFinishedTime;
    /**
     * 待扣除金额
     */
	@TableField("WAIT_TAKEOUT_AMOUNT")
	private Double waitTakeoutAmount;
    /**
     * 押金状态  50--超时  99-调清算接口设置冻结金额失败  95-调清算接口设置冻结超时  55--待扣除状态   10--待返还状态    00--已返还  20-过期不返
     */
	@TableField("STATE")
	private String state;
    /**
     * 返还押金达标金额
     */
	@TableField("STANDARD_AMOUNT")
	private Double standardAmount;
    /**
     * 设备押金
     */
	@TableField("DEVICE_CASH_PLEDGE")
	private Double deviceCashPledge;
    /**
     * 设备绑定时间
     */
	@TableField("BIND_TIME")
	private Date bindTime;
    /**
     * 设备状态 00--已绑定  88--已解绑  55-初始化记录  
     */
	@TableField("DEVICESTATE")
	private String devicestate;
    /**
     * sn码
     */
	@TableField("SNCODE")
	private String sncode;
    /**
     * 终端号
     */
	@TableField("TRMNO")
	private String trmno;
    /**
     * 代理商号
     */
	@TableField("AGENTID")
	private String agentid;
    /**
     * 商户姓名
     */
	@TableField("MERCNAME")
	private String mercname;
    /**
     * 商户号
     */
	@TableField("MERCID")
	private String mercid;
    /**
     * 用户号
     */
	@TableField("USERCODE")
	private String usercode;
    @TableId("ID")
	private String id;


	public String getMemBuyRecordId() {
		return memBuyRecordId;
	}

	public void setMemBuyRecordId(String memBuyRecordId) {
		this.memBuyRecordId = memBuyRecordId;
	}

	public String getMemPackageId() {
		return memPackageId;
	}

	public void setMemPackageId(String memPackageId) {
		this.memPackageId = memPackageId;
	}

	public String getIsMember() {
		return isMember;
	}

	public void setIsMember(String isMember) {
		this.isMember = isMember;
	}

	public Double getActualCutMoney() {
		return actualCutMoney;
	}

	public void setActualCutMoney(Double actualCutMoney) {
		this.actualCutMoney = actualCutMoney;
	}

	public String getCouponState() {
		return couponState;
	}

	public void setCouponState(String couponState) {
		this.couponState = couponState;
	}

	public String getCashbackFlag() {
		return cashbackFlag;
	}

	public void setCashbackFlag(String cashbackFlag) {
		this.cashbackFlag = cashbackFlag;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getCashType() {
		return cashType;
	}

	public void setCashType(String cashType) {
		this.cashType = cashType;
	}

	public Integer getMposBackCycle() {
		return mposBackCycle;
	}

	public void setMposBackCycle(Integer mposBackCycle) {
		this.mposBackCycle = mposBackCycle;
	}

	public String getOrderTradeSn() {
		return orderTradeSn;
	}

	public void setOrderTradeSn(String orderTradeSn) {
		this.orderTradeSn = orderTradeSn;
	}

	public String getCashPledgeTradesn() {
		return cashPledgeTradesn;
	}

	public void setCashPledgeTradesn(String cashPledgeTradesn) {
		this.cashPledgeTradesn = cashPledgeTradesn;
	}

	public String getIsNeedToTakeout() {
		return isNeedToTakeout;
	}

	public void setIsNeedToTakeout(String isNeedToTakeout) {
		this.isNeedToTakeout = isNeedToTakeout;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSourceAndVersion() {
		return sourceAndVersion;
	}

	public void setSourceAndVersion(String sourceAndVersion) {
		this.sourceAndVersion = sourceAndVersion;
	}

	public Double getTotalSwitchcardAmount() {
		return totalSwitchcardAmount;
	}

	public void setTotalSwitchcardAmount(Double totalSwitchcardAmount) {
		this.totalSwitchcardAmount = totalSwitchcardAmount;
	}

	public Date getAmountGivebackTime() {
		return amountGivebackTime;
	}

	public void setAmountGivebackTime(Date amountGivebackTime) {
		this.amountGivebackTime = amountGivebackTime;
	}

	public Date getTakeoutFinishedTime() {
		return takeoutFinishedTime;
	}

	public void setTakeoutFinishedTime(Date takeoutFinishedTime) {
		this.takeoutFinishedTime = takeoutFinishedTime;
	}

	public Double getWaitTakeoutAmount() {
		return waitTakeoutAmount;
	}

	public void setWaitTakeoutAmount(Double waitTakeoutAmount) {
		this.waitTakeoutAmount = waitTakeoutAmount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getStandardAmount() {
		return standardAmount;
	}

	public void setStandardAmount(Double standardAmount) {
		this.standardAmount = standardAmount;
	}

	public Double getDeviceCashPledge() {
		return deviceCashPledge;
	}

	public void setDeviceCashPledge(Double deviceCashPledge) {
		this.deviceCashPledge = deviceCashPledge;
	}

	public Date getBindTime() {
		return bindTime;
	}

	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}

	public String getDevicestate() {
		return devicestate;
	}

	public void setDevicestate(String devicestate) {
		this.devicestate = devicestate;
	}

	public String getSncode() {
		return sncode;
	}

	public void setSncode(String sncode) {
		this.sncode = sncode;
	}

	public String getTrmno() {
		return trmno;
	}

	public void setTrmno(String trmno) {
		this.trmno = trmno;
	}

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public String getMercname() {
		return mercname;
	}

	public void setMercname(String mercname) {
		this.mercname = mercname;
	}

	public String getMercid() {
		return mercid;
	}

	public void setMercid(String mercid) {
		this.mercid = mercid;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CashPledgeRecord{" +
			", memBuyRecordId=" + memBuyRecordId +
			", memPackageId=" + memPackageId +
			", isMember=" + isMember +
			", actualCutMoney=" + actualCutMoney +
			", couponState=" + couponState +
			", cashbackFlag=" + cashbackFlag +
			", item2=" + item2 +
			", item1=" + item1 +
			", cashType=" + cashType +
			", mposBackCycle=" + mposBackCycle +
			", orderTradeSn=" + orderTradeSn +
			", cashPledgeTradesn=" + cashPledgeTradesn +
			", isNeedToTakeout=" + isNeedToTakeout +
			", orgNo=" + orgNo +
			", updatetime=" + updatetime +
			", createtime=" + createtime +
			", remark=" + remark +
			", sourceAndVersion=" + sourceAndVersion +
			", totalSwitchcardAmount=" + totalSwitchcardAmount +
			", amountGivebackTime=" + amountGivebackTime +
			", takeoutFinishedTime=" + takeoutFinishedTime +
			", waitTakeoutAmount=" + waitTakeoutAmount +
			", state=" + state +
			", standardAmount=" + standardAmount +
			", deviceCashPledge=" + deviceCashPledge +
			", bindTime=" + bindTime +
			", devicestate=" + devicestate +
			", sncode=" + sncode +
			", trmno=" + trmno +
			", agentid=" + agentid +
			", mercname=" + mercname +
			", mercid=" + mercid +
			", usercode=" + usercode +
			", id=" + id +
			"}";
	}
}
