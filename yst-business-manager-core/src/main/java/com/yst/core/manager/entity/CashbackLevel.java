package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 刷卡满额返现设置表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("CASHBACK_LEVEL")
public class CashbackLevel extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 是否生效，1-生效，0-无效
     */
	@TableField("STATE")
	private String state;
    /**
     * 活动开始时间
     */
	@TableField("START_TIME")
	private Date startTime;
    /**
     * 活动截止时间
     */
	@TableField("END_TIME")
	private Date endTime;
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
     * 三档返现金额（分）
     */
	@TableField("CASH_BACK_AMOUNT_3")
	private Double cashBackAmount3;
    /**
     * 三档返现金额（分）
     */
	@TableField("SWING_CARD_AMOUNT_3")
	private Double swingCardAmount3;
    /**
     * 二档返现金额（分）
     */
	@TableField("CASH_BACK_AMOUNT_2")
	private Double cashBackAmount2;
    /**
     * 二档返现金额（分）
     */
	@TableField("SWING_CARD_AMOUNT_2")
	private Double swingCardAmount2;
    /**
     * 一档返现金额（分）
     */
	@TableField("CASH_BACK_AMOUNT_1")
	private Double cashBackAmount1;
    /**
     * 一档刷卡金额（分）
     */
	@TableField("SWING_CARD_AMOUNT_1")
	private Double swingCardAmount1;
    /**
     * 代理商号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 主键ID
     */
    @TableId("ID")
	private String id;


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public Double getCashBackAmount3() {
		return cashBackAmount3;
	}

	public void setCashBackAmount3(Double cashBackAmount3) {
		this.cashBackAmount3 = cashBackAmount3;
	}

	public Double getSwingCardAmount3() {
		return swingCardAmount3;
	}

	public void setSwingCardAmount3(Double swingCardAmount3) {
		this.swingCardAmount3 = swingCardAmount3;
	}

	public Double getCashBackAmount2() {
		return cashBackAmount2;
	}

	public void setCashBackAmount2(Double cashBackAmount2) {
		this.cashBackAmount2 = cashBackAmount2;
	}

	public Double getSwingCardAmount2() {
		return swingCardAmount2;
	}

	public void setSwingCardAmount2(Double swingCardAmount2) {
		this.swingCardAmount2 = swingCardAmount2;
	}

	public Double getCashBackAmount1() {
		return cashBackAmount1;
	}

	public void setCashBackAmount1(Double cashBackAmount1) {
		this.cashBackAmount1 = cashBackAmount1;
	}

	public Double getSwingCardAmount1() {
		return swingCardAmount1;
	}

	public void setSwingCardAmount1(Double swingCardAmount1) {
		this.swingCardAmount1 = swingCardAmount1;
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
		return "CashbackLevel{" +
			", state=" + state +
			", startTime=" + startTime +
			", endTime=" + endTime +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", cashBackAmount3=" + cashBackAmount3 +
			", swingCardAmount3=" + swingCardAmount3 +
			", cashBackAmount2=" + cashBackAmount2 +
			", swingCardAmount2=" + swingCardAmount2 +
			", cashBackAmount1=" + cashBackAmount1 +
			", swingCardAmount1=" + swingCardAmount1 +
			", agentMercId=" + agentMercId +
			", id=" + id +
			"}";
	}
}
