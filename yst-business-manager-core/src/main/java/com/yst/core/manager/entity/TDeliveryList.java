package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 发货流水表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("T_DELIVERY_LIST")
public class TDeliveryList extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 是否会员订单 0-否, 1-是
     */
	@TableField("F_IS_MEMBER")
	private String fIsMember;
    /**
     * 确认收货后的快递图片
     */
	@TableField("F_IMG_SN")
	private String fImgSn;
    /**
     * pos机器类型 0：mpos 1：大pos
     */
	@TableField("F_POS_TYPE")
	private String fPosType;
    /**
     * 代理切换状态 0-初始化 1-成功 2-失败
     */
	@TableField("F_AGENT_SWITCH_STATUS")
	private String fAgentSwitchStatus;
    /**
     * 操作员
     */
	@TableField("F_OPERATOR")
	private String fOperator;
    /**
     * 确认收货时间
     */
	@TableField("F_ARRIVE_TIME")
	private Date fArriveTime;
    /**
     * 发货时间
     */
	@TableField("F_SHIP_TIME")
	private Date fShipTime;
    /**
     * 号段止号
     */
	@TableField("F_END_NO")
	private String fEndNo;
    /**
     * 号段起号
     */
	@TableField("F_BEGIN_NO")
	private String fBeginNo;
    /**
     * 发货状态 1-待录入快递单号 2-待收货 3-已收货
     */
	@TableField("F_STATUS")
	private String fStatus;
    /**
     * 发货类型 0-未确定 1-工厂发货 2-总部发货
     */
	@TableField("F_SHIP_TYPE")
	private String fShipType;
    /**
     * 工厂名称
     */
	@TableField("F_FACTORY_NAME")
	private String fFactoryName;
    /**
     * 工厂编号
     */
	@TableField("F_FACTORY_NO")
	private String fFactoryNo;
    /**
     * 收货地址
     */
	@TableField("F_DELIVERY_ADDRESS")
	private String fDeliveryAddress;
    /**
     * 收货人联系电话
     */
	@TableField("F_RECEIVER_PHONE")
	private String fReceiverPhone;
    /**
     * 收货人
     */
	@TableField("F_RECEIVER")
	private String fReceiver;
    /**
     * 开团批次号
     */
	@TableField("F_BATCH_ID")
	private String fBatchId;
    /**
     * 发货数量
     */
	@TableField("F_QUANTITY")
	private Long fQuantity;
    /**
     * 代理商名称
     */
	@TableField("F_AGENT_NAME")
	private String fAgentName;
    /**
     * 代理商编号
     */
	@TableField("F_AGENT_NO")
	private String fAgentNo;
    /**
     * 机器型号
     */
	@TableField("F_DEVICE_MODEL")
	private String fDeviceModel;
    /**
     * 来源流水ID
     */
	@TableField("F_SOURCE_ID")
	private String fSourceId;
    /**
     * 订单来源 0001代理商 0002工厂发回
     */
	@TableField("F_SOURCE")
	private String fSource;
    /**
     * 发货订单号 yyyyMMdd + 12位序列号
     */
	@TableField("F_ORDER_ID")
	private String fOrderId;
    /**
     * 发货流水号 yyyyMMdd + 12位序列号
     */
    @TableId("F_DELIVERY_ID")
	private String fDeliveryId;


	public String getfIsMember() {
		return fIsMember;
	}

	public void setfIsMember(String fIsMember) {
		this.fIsMember = fIsMember;
	}

	public String getfImgSn() {
		return fImgSn;
	}

	public void setfImgSn(String fImgSn) {
		this.fImgSn = fImgSn;
	}

	public String getfPosType() {
		return fPosType;
	}

	public void setfPosType(String fPosType) {
		this.fPosType = fPosType;
	}

	public String getfAgentSwitchStatus() {
		return fAgentSwitchStatus;
	}

	public void setfAgentSwitchStatus(String fAgentSwitchStatus) {
		this.fAgentSwitchStatus = fAgentSwitchStatus;
	}

	public String getfOperator() {
		return fOperator;
	}

	public void setfOperator(String fOperator) {
		this.fOperator = fOperator;
	}

	public Date getfArriveTime() {
		return fArriveTime;
	}

	public void setfArriveTime(Date fArriveTime) {
		this.fArriveTime = fArriveTime;
	}

	public Date getfShipTime() {
		return fShipTime;
	}

	public void setfShipTime(Date fShipTime) {
		this.fShipTime = fShipTime;
	}

	public String getfEndNo() {
		return fEndNo;
	}

	public void setfEndNo(String fEndNo) {
		this.fEndNo = fEndNo;
	}

	public String getfBeginNo() {
		return fBeginNo;
	}

	public void setfBeginNo(String fBeginNo) {
		this.fBeginNo = fBeginNo;
	}

	public String getfStatus() {
		return fStatus;
	}

	public void setfStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public String getfShipType() {
		return fShipType;
	}

	public void setfShipType(String fShipType) {
		this.fShipType = fShipType;
	}

	public String getfFactoryName() {
		return fFactoryName;
	}

	public void setfFactoryName(String fFactoryName) {
		this.fFactoryName = fFactoryName;
	}

	public String getfFactoryNo() {
		return fFactoryNo;
	}

	public void setfFactoryNo(String fFactoryNo) {
		this.fFactoryNo = fFactoryNo;
	}

	public String getfDeliveryAddress() {
		return fDeliveryAddress;
	}

	public void setfDeliveryAddress(String fDeliveryAddress) {
		this.fDeliveryAddress = fDeliveryAddress;
	}

	public String getfReceiverPhone() {
		return fReceiverPhone;
	}

	public void setfReceiverPhone(String fReceiverPhone) {
		this.fReceiverPhone = fReceiverPhone;
	}

	public String getfReceiver() {
		return fReceiver;
	}

	public void setfReceiver(String fReceiver) {
		this.fReceiver = fReceiver;
	}

	public String getfBatchId() {
		return fBatchId;
	}

	public void setfBatchId(String fBatchId) {
		this.fBatchId = fBatchId;
	}

	public Long getfQuantity() {
		return fQuantity;
	}

	public void setfQuantity(Long fQuantity) {
		this.fQuantity = fQuantity;
	}

	public String getfAgentName() {
		return fAgentName;
	}

	public void setfAgentName(String fAgentName) {
		this.fAgentName = fAgentName;
	}

	public String getfAgentNo() {
		return fAgentNo;
	}

	public void setfAgentNo(String fAgentNo) {
		this.fAgentNo = fAgentNo;
	}

	public String getfDeviceModel() {
		return fDeviceModel;
	}

	public void setfDeviceModel(String fDeviceModel) {
		this.fDeviceModel = fDeviceModel;
	}

	public String getfSourceId() {
		return fSourceId;
	}

	public void setfSourceId(String fSourceId) {
		this.fSourceId = fSourceId;
	}

	public String getfSource() {
		return fSource;
	}

	public void setfSource(String fSource) {
		this.fSource = fSource;
	}

	public String getfOrderId() {
		return fOrderId;
	}

	public void setfOrderId(String fOrderId) {
		this.fOrderId = fOrderId;
	}

	public String getfDeliveryId() {
		return fDeliveryId;
	}

	public void setfDeliveryId(String fDeliveryId) {
		this.fDeliveryId = fDeliveryId;
	}

	@Override
	public String toString() {
		return "TDeliveryList{" +
			", fIsMember=" + fIsMember +
			", fImgSn=" + fImgSn +
			", fPosType=" + fPosType +
			", fAgentSwitchStatus=" + fAgentSwitchStatus +
			", fOperator=" + fOperator +
			", fArriveTime=" + fArriveTime +
			", fShipTime=" + fShipTime +
			", fEndNo=" + fEndNo +
			", fBeginNo=" + fBeginNo +
			", fStatus=" + fStatus +
			", fShipType=" + fShipType +
			", fFactoryName=" + fFactoryName +
			", fFactoryNo=" + fFactoryNo +
			", fDeliveryAddress=" + fDeliveryAddress +
			", fReceiverPhone=" + fReceiverPhone +
			", fReceiver=" + fReceiver +
			", fBatchId=" + fBatchId +
			", fQuantity=" + fQuantity +
			", fAgentName=" + fAgentName +
			", fAgentNo=" + fAgentNo +
			", fDeviceModel=" + fDeviceModel +
			", fSourceId=" + fSourceId +
			", fSource=" + fSource +
			", fOrderId=" + fOrderId +
			", fDeliveryId=" + fDeliveryId +
			"}";
	}
}
