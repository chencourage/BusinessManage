package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 定制终端签约费率（关联表mpos_fee_rate、yst_add_agent）
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("MPOS_FEE_RATE_CUST")
public class MposFeeRateCust extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 更新时间（新建时填写创建时间）
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 大POS定制可选费率（多个用逗号隔开）
     */
	@TableField("CUST_POS_FEE_IDS")
	private String custPosFeeIds;
    /**
     * 大POS默认费率
     */
	@TableField("POS_FEE_ID")
	private String posFeeId;
    /**
     * mPOS定制可选费率（多个用逗号隔开）
     */
	@TableField("CUST_MPOS_FEE_IDS")
	private String custMposFeeIds;
    /**
     * mPOS默认费率
     */
	@TableField("MPOS_FEE_ID")
	private String mposFeeId;
    /**
     * 代理商ID
     */
    @TableId("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * mPOS会员期外定制可选费率（多个用逗号隔开）
     */
	@TableField("CUST_MPOS_MEM_OVER_FEE_IDS")
	private String custMposMemOverFeeIds;
    /**
     * mPOS会员期外默认费率
     */
	@TableField("MPOS_MEM_OVER_FEE_ID")
	private String mposMemOverFeeId;
    /**
     * mPOS会员期内定制可选费率（多个用逗号隔开）
     */
	@TableField("CUST_MPOS_MEM_FEE_IDS")
	private String custMposMemFeeIds;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCustPosFeeIds() {
		return custPosFeeIds;
	}

	public void setCustPosFeeIds(String custPosFeeIds) {
		this.custPosFeeIds = custPosFeeIds;
	}

	public String getPosFeeId() {
		return posFeeId;
	}

	public void setPosFeeId(String posFeeId) {
		this.posFeeId = posFeeId;
	}

	public String getCustMposFeeIds() {
		return custMposFeeIds;
	}

	public void setCustMposFeeIds(String custMposFeeIds) {
		this.custMposFeeIds = custMposFeeIds;
	}

	public String getMposFeeId() {
		return mposFeeId;
	}

	public void setMposFeeId(String mposFeeId) {
		this.mposFeeId = mposFeeId;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getCustMposMemOverFeeIds() {
		return custMposMemOverFeeIds;
	}

	public void setCustMposMemOverFeeIds(String custMposMemOverFeeIds) {
		this.custMposMemOverFeeIds = custMposMemOverFeeIds;
	}

	public String getMposMemOverFeeId() {
		return mposMemOverFeeId;
	}

	public void setMposMemOverFeeId(String mposMemOverFeeId) {
		this.mposMemOverFeeId = mposMemOverFeeId;
	}

	public String getCustMposMemFeeIds() {
		return custMposMemFeeIds;
	}

	public void setCustMposMemFeeIds(String custMposMemFeeIds) {
		this.custMposMemFeeIds = custMposMemFeeIds;
	}

	@Override
	public String toString() {
		return "MposFeeRateCust{" +
			", remark=" + remark +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", operator=" + operator +
			", custPosFeeIds=" + custPosFeeIds +
			", posFeeId=" + posFeeId +
			", custMposFeeIds=" + custMposFeeIds +
			", mposFeeId=" + mposFeeId +
			", agentMercId=" + agentMercId +
			", custMposMemOverFeeIds=" + custMposMemOverFeeIds +
			", mposMemOverFeeId=" + mposMemOverFeeId +
			", custMposMemFeeIds=" + custMposMemFeeIds +
			"}";
	}
}
