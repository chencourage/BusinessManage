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
@TableName("YST_REPCARD_BATCH")
public class YstRepcardBatch extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 操作人ID
     */
	@TableField("OPERATOR_ID")
	private String operatorId;
    /**
     * 操作时间 
     */
	@TableField("OPERATE_TIME")
	private Date operateTime;
    /**
     * 切换后的代理商编号
     */
	@TableField("TO_AGENT_ID")
	private String toAgentId;
    /**
     * 源代理商编号
     */
	@TableField("FROM_AGENT_ID")
	private String fromAgentId;
    /**
     * 批次状态：01处理中  00成功 55部分成功 99失败10反切时初始化状态
     */
	@TableField("BATCH_STATE")
	private String batchState;
    /**
     * 批次号
     */
    @TableId("BATCH_ID")
	private String batchId;
    /**
     * 源代理商名称
     */
	@TableField("FROM_AGENT_NAME")
	private String fromAgentName;
    /**
     * 审核时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 批次类型，001:正切，002:反切
     */
	@TableField("BATCH_TYPE")
	private String batchType;
    /**
     * 批次状态，00审核通过，50待审核，99审核拒绝，10正切时初始化状态
     */
	@TableField("BATCH_STATUS")
	private String batchStatus;
    /**
     * 操作人名称
     */
	@TableField("OPERATOR_NAME")
	private String operatorName;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 操作类型，01或空:mpos，02代表pay卡
     */
	@TableField("OPERATE_TYPE")
	private String operateType;
    /**
     * 切换后的代理商名称
     */
	@TableField("TO_AGENT_NAME")
	private String toAgentName;
    /**
     * 支付状态：00-支付成功，01-待支付，99-取消支付
     */
	@TableField("PAY_STATE")
	private String payState;


	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getToAgentId() {
		return toAgentId;
	}

	public void setToAgentId(String toAgentId) {
		this.toAgentId = toAgentId;
	}

	public String getFromAgentId() {
		return fromAgentId;
	}

	public void setFromAgentId(String fromAgentId) {
		this.fromAgentId = fromAgentId;
	}

	public String getBatchState() {
		return batchState;
	}

	public void setBatchState(String batchState) {
		this.batchState = batchState;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getFromAgentName() {
		return fromAgentName;
	}

	public void setFromAgentName(String fromAgentName) {
		this.fromAgentName = fromAgentName;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getBatchType() {
		return batchType;
	}

	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getToAgentName() {
		return toAgentName;
	}

	public void setToAgentName(String toAgentName) {
		this.toAgentName = toAgentName;
	}

	public String getPayState() {
		return payState;
	}

	public void setPayState(String payState) {
		this.payState = payState;
	}

	@Override
	public String toString() {
		return "YstRepcardBatch{" +
			", operatorId=" + operatorId +
			", operateTime=" + operateTime +
			", toAgentId=" + toAgentId +
			", fromAgentId=" + fromAgentId +
			", batchState=" + batchState +
			", batchId=" + batchId +
			", fromAgentName=" + fromAgentName +
			", updateTime=" + updateTime +
			", batchType=" + batchType +
			", batchStatus=" + batchStatus +
			", operatorName=" + operatorName +
			", remark=" + remark +
			", operateType=" + operateType +
			", toAgentName=" + toAgentName +
			", payState=" + payState +
			"}";
	}
}
