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
@TableName("CARD_TRADE")
public class CardTrade extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 会员标识（0否 1是）
     */
	@TableField("MEMBER_FLAG")
	private String memberFlag;
    /**
     * 渠道商户号
     */
	@TableField("CH_MERC_NO")
	private String chMercNo;
    /**
     * 卡券面额
     */
	@TableField("COUPON_DENOMINATION")
	private Double couponDenomination;
    /**
     * 是否开通了提现权限  N--未开通  Y 或者 为空 表示开通
     */
	@TableField("HASWITHDRAWRIGHT")
	private String haswithdrawright;
    /**
     * 三要素验证结果   Y--验证成功  N--验证失败
     */
	@TableField("THREEELEMENTSVERIFYSTATE")
	private String threeelementsverifystate;
    /**
     * 是否需要三要素验证  Y--是  N--否
     */
	@TableField("ISNEEDTHREEELEMENTSVERIFY")
	private String isneedthreeelementsverify;
    /**
     * 结算日期
     */
	@TableField("SETTLE_DATE")
	private String settleDate;
    /**
     * 来源方与版本号
     */
	@TableField("SOURCE_VERSION")
	private String sourceVersion;
    /**
     * 快速到账类型 01：提现快速到账；02：银盛快付（D0）00：普通刷卡
     */
	@TableField("QUICK_TYPE")
	private String quickType;
    /**
     * 客户端来源 app/sdk
     */
	@TableField("CLIENT_SOURCE")
	private String clientSource;
    /**
     * 渠道编号
     */
	@TableField("CHANNEL_CODE")
	private String channelCode;
    /**
     * 商户自选 ，1：是，0：不是
     */
	@TableField("MCC_ROUTE")
	private String mccRoute;
    /**
     * 刷手动开户机子，存用户号
     */
	@TableField("SD_USER_CODE")
	private String sdUserCode;
    /**
     * 卡券类型  通用券:000;业务券:001 ;代金券:002;业务抵扣券;007
     */
	@TableField("COUPON_TYPE")
	private String couponType;
    /**
     * MCC大类编码
     */
	@TableField("MCC_CODE")
	private String mccCode;
    /**
     * 机构号
     */
	@TableField("ORG_NO")
	private String orgNo;
    /**
     * 是否为当天提现，1表示当天提现，0表示非当天提现，2表示未提现
     */
	@TableField("ISTHEDAYWITHDRAW")
	private String isthedaywithdraw;
    /**
     * 发起方订单ID
     */
	@TableField("SRC_ORDER_ID")
	private String srcOrderId;
    /**
     * 优惠券ID
     */
	@TableField("CARD_BAGS_ID")
	private String cardBagsId;
    /**
     * 优惠券抵扣金额 无卡支付可以使用优惠券
     */
	@TableField("COUPON_AMOUNT")
	private Double couponAmount;
    /**
     * 手续费
     */
	@TableField("FEE_AMOUNT")
	private Double feeAmount;
    /**
     * 交易类型 01:mpos,02:手刷,03:大pos,04:无卡支付 05会员支付
     */
	@TableField("TRADE_TYPE")
	private String tradeType;
    /**
     * 代理商名称
     */
	@TableField("AGENT_NAME")
	private String agentName;
    /**
     * 代理商编号
     */
	@TableField("AGENT_NO")
	private String agentNo;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * SN码
     */
	@TableField("SNCODE")
	private String sncode;
    /**
     * 提现记录表中的id
     */
	@TableField("WITHDRAW_RECORD_ID")
	private String withdrawRecordId;
    /**
     * 最后修改时间
     */
	@TableField("LAST_UPDATE_TIME")
	private Date lastUpdateTime;
    /**
     * 到账金额
     */
	@TableField("ARRIVAL_AMOUNT")
	private Double arrivalAmount;
    /**
     * 刷卡金额
     */
	@TableField("AMOUNT")
	private Double amount;
    /**
     * 备注信息
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 提现下次同步时间
     */
	@TableField("WITHDRAWALSTATENEXTSYNCTIME")
	private Date withdrawalstatenextsynctime;
    /**
     * 提现同步数次
     */
	@TableField("WITHDRAWALSTATESYNCCOUNT")
	private Double withdrawalstatesynccount;
    /**
     * 提现时间
     */
	@TableField("WITHDRAWALTIME")
	private Date withdrawaltime;
    /**
     * 提现状态 10未提现， 50提现超时， 55--提现中  00已提现，88已调账 98-调账中
     */
	@TableField("WITHDRAWALSTATE")
	private String withdrawalstate;
    /**
     * 是否为当天验证，1表示当天验证，0表示非当天验证
     */
	@TableField("ISTHEDAYVERIFY")
	private String isthedayverify;
    /**
     * 验证时间
     */
	@TableField("VERIFYTIME")
	private Date verifytime;
    /**
     * 验证状态 10未验证，00已验证， 99验证失败(放弃认证)  55处理中
     */
	@TableField("VERIFYSTATE")
	private String verifystate;
    /**
     * 下次同步时间
     */
	@TableField("TRADESTATENEXTSYNCTIME")
	private Date tradestatenextsynctime;
    /**
     * 交易同步数次
     */
	@TableField("TRADESTATESYNCCOUNT")
	private Double tradestatesynccount;
    /**
     * 交易错误描述
     */
	@TableField("TRADEERRORDESC")
	private String tradeerrordesc;
    /**
     * 交易状态代码   00--成功  50--超时  01--初始化状态  99--失败 10--待计费
     */
	@TableField("TRADEERRORCODE")
	private String tradeerrorcode;
    /**
     * 交易时间
     */
	@TableField("TRADETIME")
	private Date tradetime;
    /**
     * 交易银行卡号
     */
	@TableField("CARDNO")
	private String cardno;
    /**
     * 交易日期
     */
	@TableField("ACDT")
	private Date acdt;
    /**
     * 交易流水或者参考号
     */
	@TableField("LOGNO")
	private String logno;
    /**
     * 机具凭证号
     */
	@TableField("CERTNO")
	private String certno;
    /**
     * 终端号
     */
	@TableField("TRMNO")
	private String trmno;
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
    /**
     * 唯一流水
     */
    @TableId("ID")
	private String id;
    /**
     * 银行卡类型 0借记卡 1贷记卡
     */
	@TableField("BANK_CARD_TYPE")
	private String bankCardType;


	public String getMemberFlag() {
		return memberFlag;
	}

	public void setMemberFlag(String memberFlag) {
		this.memberFlag = memberFlag;
	}

	public String getChMercNo() {
		return chMercNo;
	}

	public void setChMercNo(String chMercNo) {
		this.chMercNo = chMercNo;
	}

	public Double getCouponDenomination() {
		return couponDenomination;
	}

	public void setCouponDenomination(Double couponDenomination) {
		this.couponDenomination = couponDenomination;
	}

	public String getHaswithdrawright() {
		return haswithdrawright;
	}

	public void setHaswithdrawright(String haswithdrawright) {
		this.haswithdrawright = haswithdrawright;
	}

	public String getThreeelementsverifystate() {
		return threeelementsverifystate;
	}

	public void setThreeelementsverifystate(String threeelementsverifystate) {
		this.threeelementsverifystate = threeelementsverifystate;
	}

	public String getIsneedthreeelementsverify() {
		return isneedthreeelementsverify;
	}

	public void setIsneedthreeelementsverify(String isneedthreeelementsverify) {
		this.isneedthreeelementsverify = isneedthreeelementsverify;
	}

	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	public String getSourceVersion() {
		return sourceVersion;
	}

	public void setSourceVersion(String sourceVersion) {
		this.sourceVersion = sourceVersion;
	}

	public String getQuickType() {
		return quickType;
	}

	public void setQuickType(String quickType) {
		this.quickType = quickType;
	}

	public String getClientSource() {
		return clientSource;
	}

	public void setClientSource(String clientSource) {
		this.clientSource = clientSource;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getMccRoute() {
		return mccRoute;
	}

	public void setMccRoute(String mccRoute) {
		this.mccRoute = mccRoute;
	}

	public String getSdUserCode() {
		return sdUserCode;
	}

	public void setSdUserCode(String sdUserCode) {
		this.sdUserCode = sdUserCode;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getMccCode() {
		return mccCode;
	}

	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getIsthedaywithdraw() {
		return isthedaywithdraw;
	}

	public void setIsthedaywithdraw(String isthedaywithdraw) {
		this.isthedaywithdraw = isthedaywithdraw;
	}

	public String getSrcOrderId() {
		return srcOrderId;
	}

	public void setSrcOrderId(String srcOrderId) {
		this.srcOrderId = srcOrderId;
	}

	public String getCardBagsId() {
		return cardBagsId;
	}

	public void setCardBagsId(String cardBagsId) {
		this.cardBagsId = cardBagsId;
	}

	public Double getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(Double couponAmount) {
		this.couponAmount = couponAmount;
	}

	public Double getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSncode() {
		return sncode;
	}

	public void setSncode(String sncode) {
		this.sncode = sncode;
	}

	public String getWithdrawRecordId() {
		return withdrawRecordId;
	}

	public void setWithdrawRecordId(String withdrawRecordId) {
		this.withdrawRecordId = withdrawRecordId;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Double getArrivalAmount() {
		return arrivalAmount;
	}

	public void setArrivalAmount(Double arrivalAmount) {
		this.arrivalAmount = arrivalAmount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getWithdrawalstatenextsynctime() {
		return withdrawalstatenextsynctime;
	}

	public void setWithdrawalstatenextsynctime(Date withdrawalstatenextsynctime) {
		this.withdrawalstatenextsynctime = withdrawalstatenextsynctime;
	}

	public Double getWithdrawalstatesynccount() {
		return withdrawalstatesynccount;
	}

	public void setWithdrawalstatesynccount(Double withdrawalstatesynccount) {
		this.withdrawalstatesynccount = withdrawalstatesynccount;
	}

	public Date getWithdrawaltime() {
		return withdrawaltime;
	}

	public void setWithdrawaltime(Date withdrawaltime) {
		this.withdrawaltime = withdrawaltime;
	}

	public String getWithdrawalstate() {
		return withdrawalstate;
	}

	public void setWithdrawalstate(String withdrawalstate) {
		this.withdrawalstate = withdrawalstate;
	}

	public String getIsthedayverify() {
		return isthedayverify;
	}

	public void setIsthedayverify(String isthedayverify) {
		this.isthedayverify = isthedayverify;
	}

	public Date getVerifytime() {
		return verifytime;
	}

	public void setVerifytime(Date verifytime) {
		this.verifytime = verifytime;
	}

	public String getVerifystate() {
		return verifystate;
	}

	public void setVerifystate(String verifystate) {
		this.verifystate = verifystate;
	}

	public Date getTradestatenextsynctime() {
		return tradestatenextsynctime;
	}

	public void setTradestatenextsynctime(Date tradestatenextsynctime) {
		this.tradestatenextsynctime = tradestatenextsynctime;
	}

	public Double getTradestatesynccount() {
		return tradestatesynccount;
	}

	public void setTradestatesynccount(Double tradestatesynccount) {
		this.tradestatesynccount = tradestatesynccount;
	}

	public String getTradeerrordesc() {
		return tradeerrordesc;
	}

	public void setTradeerrordesc(String tradeerrordesc) {
		this.tradeerrordesc = tradeerrordesc;
	}

	public String getTradeerrorcode() {
		return tradeerrorcode;
	}

	public void setTradeerrorcode(String tradeerrorcode) {
		this.tradeerrorcode = tradeerrorcode;
	}

	public Date getTradetime() {
		return tradetime;
	}

	public void setTradetime(Date tradetime) {
		this.tradetime = tradetime;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public Date getAcdt() {
		return acdt;
	}

	public void setAcdt(Date acdt) {
		this.acdt = acdt;
	}

	public String getLogno() {
		return logno;
	}

	public void setLogno(String logno) {
		this.logno = logno;
	}

	public String getCertno() {
		return certno;
	}

	public void setCertno(String certno) {
		this.certno = certno;
	}

	public String getTrmno() {
		return trmno;
	}

	public void setTrmno(String trmno) {
		this.trmno = trmno;
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

	public String getBankCardType() {
		return bankCardType;
	}

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	@Override
	public String toString() {
		return "CardTrade{" +
			", memberFlag=" + memberFlag +
			", chMercNo=" + chMercNo +
			", couponDenomination=" + couponDenomination +
			", haswithdrawright=" + haswithdrawright +
			", threeelementsverifystate=" + threeelementsverifystate +
			", isneedthreeelementsverify=" + isneedthreeelementsverify +
			", settleDate=" + settleDate +
			", sourceVersion=" + sourceVersion +
			", quickType=" + quickType +
			", clientSource=" + clientSource +
			", channelCode=" + channelCode +
			", mccRoute=" + mccRoute +
			", sdUserCode=" + sdUserCode +
			", couponType=" + couponType +
			", mccCode=" + mccCode +
			", orgNo=" + orgNo +
			", isthedaywithdraw=" + isthedaywithdraw +
			", srcOrderId=" + srcOrderId +
			", cardBagsId=" + cardBagsId +
			", couponAmount=" + couponAmount +
			", feeAmount=" + feeAmount +
			", tradeType=" + tradeType +
			", agentName=" + agentName +
			", agentNo=" + agentNo +
			", operator=" + operator +
			", sncode=" + sncode +
			", withdrawRecordId=" + withdrawRecordId +
			", lastUpdateTime=" + lastUpdateTime +
			", arrivalAmount=" + arrivalAmount +
			", amount=" + amount +
			", remark=" + remark +
			", withdrawalstatenextsynctime=" + withdrawalstatenextsynctime +
			", withdrawalstatesynccount=" + withdrawalstatesynccount +
			", withdrawaltime=" + withdrawaltime +
			", withdrawalstate=" + withdrawalstate +
			", isthedayverify=" + isthedayverify +
			", verifytime=" + verifytime +
			", verifystate=" + verifystate +
			", tradestatenextsynctime=" + tradestatenextsynctime +
			", tradestatesynccount=" + tradestatesynccount +
			", tradeerrordesc=" + tradeerrordesc +
			", tradeerrorcode=" + tradeerrorcode +
			", tradetime=" + tradetime +
			", cardno=" + cardno +
			", acdt=" + acdt +
			", logno=" + logno +
			", certno=" + certno +
			", trmno=" + trmno +
			", mercid=" + mercid +
			", usercode=" + usercode +
			", id=" + id +
			", bankCardType=" + bankCardType +
			"}";
	}
}
