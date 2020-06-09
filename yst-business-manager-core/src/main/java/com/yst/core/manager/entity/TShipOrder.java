package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 发货订单表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("T_SHIP_ORDER")
public class TShipOrder extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 操作时间
     */
	@TableField("F_OPERATE_TIME")
	private Date fOperateTime;
    /**
     * 操作员
     */
	@TableField("F_OPERATOR")
	private String fOperator;
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
     * 发货状态 0-未发货 1-部分发货 2-发货完成
     */
	@TableField("F_SHIP_STATUS")
	private String fShipStatus;
    /**
     * 审核状态 01-初始状态 02-运营审核通过 03-财务审核通过  98-财务审核不通过 99-运营审核不通过
     */
	@TableField("F_AUDIT_STATUS")
	private String fAuditStatus;
    /**
     * 下单时间
     */
	@TableField("F_ORDER_TIME")
	private Date fOrderTime;
    /**
     * 开团批次号
     */
	@TableField("F_BATCH_ID")
	private String fBatchId;
    /**
     * 转入账号
     */
	@TableField("F_RECV_ACCOUNT_NO")
	private String fRecvAccountNo;
    /**
     * 转入银行名称
     */
	@TableField("F_RECV_BANK_NAME")
	private String fRecvBankName;
    /**
     * 收款转账时间
     */
	@TableField("F_RECV_TRANS_TIME")
	private Date fRecvTransTime;
    /**
     * 收款支付凭证 当是线上是为支付流水号,当时线下时是凭证链接地址
     */
	@TableField("F_RECV_VOUCHER")
	private String fRecvVoucher;
    /**
     * 收款支付方式 1-线上,2-线下
     */
	@TableField("F_RECV_TYPE")
	private String fRecvType;
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
     * 总付款金额
     */
	@TableField("F_PAYMENT_AMOUNT")
	private Double fPaymentAmount;
    /**
     * 单价
     */
	@TableField("F_UNIT_PRICE")
	private Double fUnitPrice;
    /**
     * 发货数量
     */
	@TableField("F_SHIP_QUANTITY")
	private Long fShipQuantity;
    /**
     * 采购数量
     */
	@TableField("F_QUANTITY")
	private Long fQuantity;
    /**
     * 代理商联系电话
     */
	@TableField("F_AGENT_PHONE")
	private String fAgentPhone;
    /**
     * 代理商联系人
     */
	@TableField("F_AGENT_CONTRACT_NAME")
	private String fAgentContractName;
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
    @TableId("F_ORDER_ID")
	private String fOrderId;
    /**
     * pos机器类型 0：mpos 1：大pos
     */
	@TableField("F_POS_TYPE")
	private String fPosType;
    /**
     * 是否会员订单 0-否, 1-是
     */
	@TableField("F_IS_MEMBER")
	private String fIsMember;
    /**
     * 是否能够发货 0-不能 1-能
     */
	@TableField("F_CAN_SHIP")
	private String fCanShip;
    /**
     * 发货次数
     */
	@TableField("F_SHIP_TIMES")
	private Integer fShipTimes;
    /**
     * 参考发货数量
     */
	@TableField("F_REF_SHIP_QUANTITY")
	private Long fRefShipQuantity;


	public Date getfOperateTime() {
		return fOperateTime;
	}

	public void setfOperateTime(Date fOperateTime) {
		this.fOperateTime = fOperateTime;
	}

	public String getfOperator() {
		return fOperator;
	}

	public void setfOperator(String fOperator) {
		this.fOperator = fOperator;
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

	public String getfShipStatus() {
		return fShipStatus;
	}

	public void setfShipStatus(String fShipStatus) {
		this.fShipStatus = fShipStatus;
	}

	public String getfAuditStatus() {
		return fAuditStatus;
	}

	public void setfAuditStatus(String fAuditStatus) {
		this.fAuditStatus = fAuditStatus;
	}

	public Date getfOrderTime() {
		return fOrderTime;
	}

	public void setfOrderTime(Date fOrderTime) {
		this.fOrderTime = fOrderTime;
	}

	public String getfBatchId() {
		return fBatchId;
	}

	public void setfBatchId(String fBatchId) {
		this.fBatchId = fBatchId;
	}

	public String getfRecvAccountNo() {
		return fRecvAccountNo;
	}

	public void setfRecvAccountNo(String fRecvAccountNo) {
		this.fRecvAccountNo = fRecvAccountNo;
	}

	public String getfRecvBankName() {
		return fRecvBankName;
	}

	public void setfRecvBankName(String fRecvBankName) {
		this.fRecvBankName = fRecvBankName;
	}

	public Date getfRecvTransTime() {
		return fRecvTransTime;
	}

	public void setfRecvTransTime(Date fRecvTransTime) {
		this.fRecvTransTime = fRecvTransTime;
	}

	public String getfRecvVoucher() {
		return fRecvVoucher;
	}

	public void setfRecvVoucher(String fRecvVoucher) {
		this.fRecvVoucher = fRecvVoucher;
	}

	public String getfRecvType() {
		return fRecvType;
	}

	public void setfRecvType(String fRecvType) {
		this.fRecvType = fRecvType;
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

	public Double getfPaymentAmount() {
		return fPaymentAmount;
	}

	public void setfPaymentAmount(Double fPaymentAmount) {
		this.fPaymentAmount = fPaymentAmount;
	}

	public Double getfUnitPrice() {
		return fUnitPrice;
	}

	public void setfUnitPrice(Double fUnitPrice) {
		this.fUnitPrice = fUnitPrice;
	}

	public Long getfShipQuantity() {
		return fShipQuantity;
	}

	public void setfShipQuantity(Long fShipQuantity) {
		this.fShipQuantity = fShipQuantity;
	}

	public Long getfQuantity() {
		return fQuantity;
	}

	public void setfQuantity(Long fQuantity) {
		this.fQuantity = fQuantity;
	}

	public String getfAgentPhone() {
		return fAgentPhone;
	}

	public void setfAgentPhone(String fAgentPhone) {
		this.fAgentPhone = fAgentPhone;
	}

	public String getfAgentContractName() {
		return fAgentContractName;
	}

	public void setfAgentContractName(String fAgentContractName) {
		this.fAgentContractName = fAgentContractName;
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

	public String getfPosType() {
		return fPosType;
	}

	public void setfPosType(String fPosType) {
		this.fPosType = fPosType;
	}

	public String getfIsMember() {
		return fIsMember;
	}

	public void setfIsMember(String fIsMember) {
		this.fIsMember = fIsMember;
	}

	public String getfCanShip() {
		return fCanShip;
	}

	public void setfCanShip(String fCanShip) {
		this.fCanShip = fCanShip;
	}

	public Integer getfShipTimes() {
		return fShipTimes;
	}

	public void setfShipTimes(Integer fShipTimes) {
		this.fShipTimes = fShipTimes;
	}

	public Long getfRefShipQuantity() {
		return fRefShipQuantity;
	}

	public void setfRefShipQuantity(Long fRefShipQuantity) {
		this.fRefShipQuantity = fRefShipQuantity;
	}

	@Override
	public String toString() {
		return "TShipOrder{" +
			", fOperateTime=" + fOperateTime +
			", fOperator=" + fOperator +
			", fShipType=" + fShipType +
			", fFactoryName=" + fFactoryName +
			", fFactoryNo=" + fFactoryNo +
			", fDeliveryAddress=" + fDeliveryAddress +
			", fShipStatus=" + fShipStatus +
			", fAuditStatus=" + fAuditStatus +
			", fOrderTime=" + fOrderTime +
			", fBatchId=" + fBatchId +
			", fRecvAccountNo=" + fRecvAccountNo +
			", fRecvBankName=" + fRecvBankName +
			", fRecvTransTime=" + fRecvTransTime +
			", fRecvVoucher=" + fRecvVoucher +
			", fRecvType=" + fRecvType +
			", fReceiverPhone=" + fReceiverPhone +
			", fReceiver=" + fReceiver +
			", fPaymentAmount=" + fPaymentAmount +
			", fUnitPrice=" + fUnitPrice +
			", fShipQuantity=" + fShipQuantity +
			", fQuantity=" + fQuantity +
			", fAgentPhone=" + fAgentPhone +
			", fAgentContractName=" + fAgentContractName +
			", fAgentName=" + fAgentName +
			", fAgentNo=" + fAgentNo +
			", fDeviceModel=" + fDeviceModel +
			", fSourceId=" + fSourceId +
			", fSource=" + fSource +
			", fOrderId=" + fOrderId +
			", fPosType=" + fPosType +
			", fIsMember=" + fIsMember +
			", fCanShip=" + fCanShip +
			", fShipTimes=" + fShipTimes +
			", fRefShipQuantity=" + fRefShipQuantity +
			"}";
	}
}
