package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 渠道商户池
 * </p>
 *
 * @author chenkai
 * @since 2019-06-22
 */
@TableName("CH_MERC_POOL")
public class ChMercPool extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 选择数
     */
	@TableField("HIT_NUM")
	private Double hitNum;
    /**
     * 点赞数
     */
	@TableField("PRAISE_NUM")
	private Double praiseNum;
    /**
     * 从业机构号
     */
	@TableField("JOB_ORG_NO")
	private String jobOrgNo;
    /**
     * 银联商户号
     */
	@TableField("UP_MERC_NO")
	private String upMercNo;
    /**
     * 业务类型 1:线上银联二维码
     */
	@TableField("BIZ_TYPE")
	private String bizType;
    /**
     * 是否真实商户，0：否，1：是
     */
	@TableField("IS_REAL")
	private String isReal;
    /**
     * 单笔最低交易额(分)
     */
	@TableField("MIN_AMOUNT")
	private Double minAmount;
    /**
     * 终端号
     */
	@TableField("CH_TERM_NO")
	private String chTermNo;
    /**
     * 是否标准商户 0:非标 1:标准
     */
	@TableField("STANDARD_STATE")
	private String standardState;
    /**
     * 代理商号
     */
	@TableField("AGENT_NO")
	private String agentNo;
    /**
     * 单笔限额(分)
     */
	@TableField("ONCE_AMOUNT")
	private Double onceAmount;
    /**
     * 日交易限额(分)
     */
	@TableField("DAILY_AMOUNT")
	private Double dailyAmount;
    /**
     * 交易结束时间 hh:mm
     */
	@TableField("END_TIME")
	private String endTime;
    /**
     * 交易起始时间 hh:mm
     */
	@TableField("START_TIME")
	private String startTime;
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
     * MCC码
     */
	@TableField("MCC")
	private String mcc;
    /**
     * 地区名称
     */
	@TableField("REGION_NAME")
	private String regionName;
    /**
     * 是否支持全国，1：是0：否
     */
	@TableField("NATIONAL_SUPPORT")
	private String nationalSupport;
    /**
     * 地区编码
     */
	@TableField("REGION_CODE")
	private String regionCode;
    /**
     * 状态
     */
	@TableField("STATUS")
	private String status;
    /**
     * 是否优质商户 0：否 1：是
     */
	@TableField("QUALITY")
	private String quality;
    /**
     * 机构号
     */
	@TableField("ORG_NO")
	private String orgNo;
    /**
     * 商户号
     */
	@TableField("CH_MERC_NO")
	private String chMercNo;
    /**
     * 商户名
     */
	@TableField("CH_MERC_NAME")
	private String chMercName;
    /**
     * 渠道号
     */
	@TableField("CHANNEL_NO")
	private String channelNo;
    @TableId("ID")
	private Double id;
    /**
     * 日交易总额(分)
     */
	@TableField("DAILY_TOTAL_AMT")
	private Double dailyTotalAmt;
    /**
     * 交易总额(分)
     */
	@TableField("TRANS_AMT")
	private Double transAmt;


	public Double getHitNum() {
		return hitNum;
	}

	public void setHitNum(Double hitNum) {
		this.hitNum = hitNum;
	}

	public Double getPraiseNum() {
		return praiseNum;
	}

	public void setPraiseNum(Double praiseNum) {
		this.praiseNum = praiseNum;
	}

	public String getJobOrgNo() {
		return jobOrgNo;
	}

	public void setJobOrgNo(String jobOrgNo) {
		this.jobOrgNo = jobOrgNo;
	}

	public String getUpMercNo() {
		return upMercNo;
	}

	public void setUpMercNo(String upMercNo) {
		this.upMercNo = upMercNo;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getIsReal() {
		return isReal;
	}

	public void setIsReal(String isReal) {
		this.isReal = isReal;
	}

	public Double getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(Double minAmount) {
		this.minAmount = minAmount;
	}

	public String getChTermNo() {
		return chTermNo;
	}

	public void setChTermNo(String chTermNo) {
		this.chTermNo = chTermNo;
	}

	public String getStandardState() {
		return standardState;
	}

	public void setStandardState(String standardState) {
		this.standardState = standardState;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}

	public Double getOnceAmount() {
		return onceAmount;
	}

	public void setOnceAmount(Double onceAmount) {
		this.onceAmount = onceAmount;
	}

	public Double getDailyAmount() {
		return dailyAmount;
	}

	public void setDailyAmount(Double dailyAmount) {
		this.dailyAmount = dailyAmount;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
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

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getNationalSupport() {
		return nationalSupport;
	}

	public void setNationalSupport(String nationalSupport) {
		this.nationalSupport = nationalSupport;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getChMercNo() {
		return chMercNo;
	}

	public void setChMercNo(String chMercNo) {
		this.chMercNo = chMercNo;
	}

	public String getChMercName() {
		return chMercName;
	}

	public void setChMercName(String chMercName) {
		this.chMercName = chMercName;
	}

	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public Double getDailyTotalAmt() {
		return dailyTotalAmt;
	}

	public void setDailyTotalAmt(Double dailyTotalAmt) {
		this.dailyTotalAmt = dailyTotalAmt;
	}

	public Double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(Double transAmt) {
		this.transAmt = transAmt;
	}

	@Override
	public String toString() {
		return "ChMercPool{" +
			", hitNum=" + hitNum +
			", praiseNum=" + praiseNum +
			", jobOrgNo=" + jobOrgNo +
			", upMercNo=" + upMercNo +
			", bizType=" + bizType +
			", isReal=" + isReal +
			", minAmount=" + minAmount +
			", chTermNo=" + chTermNo +
			", standardState=" + standardState +
			", agentNo=" + agentNo +
			", onceAmount=" + onceAmount +
			", dailyAmount=" + dailyAmount +
			", endTime=" + endTime +
			", startTime=" + startTime +
			", operator=" + operator +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", mcc=" + mcc +
			", regionName=" + regionName +
			", nationalSupport=" + nationalSupport +
			", regionCode=" + regionCode +
			", status=" + status +
			", quality=" + quality +
			", orgNo=" + orgNo +
			", chMercNo=" + chMercNo +
			", chMercName=" + chMercName +
			", channelNo=" + channelNo +
			", id=" + id +
			", dailyTotalAmt=" + dailyTotalAmt +
			", transAmt=" + transAmt +
			"}";
	}
}
