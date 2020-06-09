package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 分期批次表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_INSTAL_BATCH")
public class YstInstalBatch extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 分期套餐ID
     */
	@TableField("PACKAGE_ID")
	private String packageId;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 生效时间
     */
	@TableField("ACTIVE_TIME")
	private Date activeTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 00:生效01:终止
     */
	@TableField("STATUS")
	private String status;
    /**
     * 分期金额（单位分）
     */
	@TableField("INSTAL_AMOUNT")
	private Double instalAmount;
    /**
     * 已付金额（单位分）
     */
	@TableField("PAY_AMOUNT")
	private Double payAmount;
    /**
     * 总期数
     */
	@TableField("TOTAL_INSTAL_NUM")
	private Double totalInstalNum;
    /**
     * 总金额（单位分）
     */
	@TableField("TOTAL_AMOUNT")
	private Double totalAmount;
    /**
     * 总台数
     */
	@TableField("TOTAL_COUNT")
	private Double totalCount;
    /**
     * 代理商名称
     */
	@TableField("AGENT_MERC_NAME")
	private String agentMercName;
    /**
     * 代理商编号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 订单编号
     */
	@TableField("ORDER_NO")
	private String orderNo;
    /**
     * 批次ID
     */
    @TableId("BATCH_ID")
	private String batchId;


	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getInstalAmount() {
		return instalAmount;
	}

	public void setInstalAmount(Double instalAmount) {
		this.instalAmount = instalAmount;
	}

	public Double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public Double getTotalInstalNum() {
		return totalInstalNum;
	}

	public void setTotalInstalNum(Double totalInstalNum) {
		this.totalInstalNum = totalInstalNum;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Double totalCount) {
		this.totalCount = totalCount;
	}

	public String getAgentMercName() {
		return agentMercName;
	}

	public void setAgentMercName(String agentMercName) {
		this.agentMercName = agentMercName;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	@Override
	public String toString() {
		return "YstInstalBatch{" +
			", packageId=" + packageId +
			", updateTime=" + updateTime +
			", activeTime=" + activeTime +
			", createTime=" + createTime +
			", status=" + status +
			", instalAmount=" + instalAmount +
			", payAmount=" + payAmount +
			", totalInstalNum=" + totalInstalNum +
			", totalAmount=" + totalAmount +
			", totalCount=" + totalCount +
			", agentMercName=" + agentMercName +
			", agentMercId=" + agentMercId +
			", orderNo=" + orderNo +
			", batchId=" + batchId +
			"}";
	}
}
