package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 代理商订单表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_AGENT_ORDER")
public class YstAgentOrder extends BaseEntity {

    private static final long serialVersionUID = 1L;

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
     * 支付金额（单位分）
     */
	@TableField("PAY_AMOUNT")
	private Double payAmount;
    /**
     * 支付状态：00-支付成功，10-待支付
     */
	@TableField("PAY_STATE")
	private String payState;
    /**
     * 支付时间
     */
	@TableField("PAY_TIME")
	private Date payTime;
    /**
     * 申请人名称
     */
	@TableField("APPLY_NAME")
	private String applyName;
    /**
     * 申请人编号
     */
	@TableField("APPLY_ID")
	private String applyId;
    /**
     * 关联订单ID
     */
	@TableField("ORDER_ID")
	private String orderId;
    /**
     * 业务类型：0001-mpos正切库存
     */
	@TableField("BUS_TYPE")
	private String busType;
    /**
     * 交易请求流水号，关联表scan_pay_record
     */
	@TableField("REQUEST_NO")
	private String requestNo;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;


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

	public Double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayState() {
		return payState;
	}

	public void setPayState(String payState) {
		this.payState = payState;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getApplyName() {
		return applyName;
	}

	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}

	public String getApplyId() {
		return applyId;
	}

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "YstAgentOrder{" +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", payAmount=" + payAmount +
			", payState=" + payState +
			", payTime=" + payTime +
			", applyName=" + applyName +
			", applyId=" + applyId +
			", orderId=" + orderId +
			", busType=" + busType +
			", requestNo=" + requestNo +
			", id=" + id +
			"}";
	}
}
