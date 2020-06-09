package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 激活返现设置表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("INDEPENDENT_MARKETING")
public class IndependentMarketing extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 激活分润描述
     */
	@TableField("PROFIT_DESC")
	private String profitDesc;
    /**
     * 活动期外返现金额（分）
     */
	@TableField("OUT_CASH_BACK_AMOUNT")
	private Double outCashBackAmount;
    /**
     * 激活分润详情
     */
	@TableField("PROFIT_DETAIL")
	private String profitDetail;
    /**
     * 00-mpos返现，01机构大POS返现，02-机构mPOS返现，03-大POS返现，04-机构会员POS返现
     */
	@TableField("TYPE")
	private String type;
    /**
     * 是否生效，1-生效，0-无效
     */
	@TableField("STATE")
	private String state;
    /**
     * 创建人
     */
	@TableField("CREATER")
	private String creater;
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
     * 返现结束时间（作废，由INDEPENDENT_MARKETING_TIME替代）
     */
	@TableField("END_TIME")
	private Date endTime;
    /**
     * 返现开始时间（作废，由INDEPENDENT_MARKETING_TIME替代）
     */
	@TableField("START_TIME")
	private Date startTime;
    /**
     * 返现金额（分）
     */
	@TableField("CASH_BACK_AMOUNT")
	private Double cashBackAmount;
    /**
     * 代理商号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    @TableId("ID")
	private String id;


	public String getProfitDesc() {
		return profitDesc;
	}

	public void setProfitDesc(String profitDesc) {
		this.profitDesc = profitDesc;
	}

	public Double getOutCashBackAmount() {
		return outCashBackAmount;
	}

	public void setOutCashBackAmount(Double outCashBackAmount) {
		this.outCashBackAmount = outCashBackAmount;
	}

	public String getProfitDetail() {
		return profitDetail;
	}

	public void setProfitDetail(String profitDetail) {
		this.profitDetail = profitDetail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
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

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Double getCashBackAmount() {
		return cashBackAmount;
	}

	public void setCashBackAmount(Double cashBackAmount) {
		this.cashBackAmount = cashBackAmount;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "IndependentMarketing{" +
			", profitDesc=" + profitDesc +
			", outCashBackAmount=" + outCashBackAmount +
			", profitDetail=" + profitDetail +
			", type=" + type +
			", state=" + state +
			", creater=" + creater +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", endTime=" + endTime +
			", startTime=" + startTime +
			", cashBackAmount=" + cashBackAmount +
			", agentMercId=" + agentMercId +
			", id=" + id +
			"}";
	}
}
