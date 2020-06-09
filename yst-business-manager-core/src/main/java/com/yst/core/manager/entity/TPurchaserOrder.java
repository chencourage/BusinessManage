package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 采购订单表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("T_PURCHASER_ORDER")
public class TPurchaserOrder extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 代理切换状态 0-初始化 1-成功 2-失败
     */
	@TableField("F_AGENT_SWITCH_STATUS")
	private String fAgentSwitchStatus;
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
     * 单价
     */
	@TableField("F_UNIT_PRICE")
	private Double fUnitPrice;
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
     * 审核状态 01-初始状态 02-运营审核通过 03-采购审核通过 04-财务审核通过 05-终端室审核通过 06-终端室上传密钥完成 07-工厂受理 08-工厂入库 09-已发货 10-已收货 11-已结款 12-已确认收款 99-审核不通过
     */
	@TableField("F_AUDIT_STATUS")
	private String fAuditStatus;
    /**
     * 付款流水号
     */
	@TableField("F_PAYMENT_ID")
	private String fPaymentId;
    /**
     * 财务结款时间
     */
	@TableField("F_SETTLE_TIME")
	private Date fSettleTime;
    /**
     * 结款状态 0-已结款  1-未结款  2-已通知结款
     */
	@TableField("F_SETTLE_STATUS")
	private String fSettleStatus;
    /**
     * 确认收货时间
     */
	@TableField("F_ARRIVE_TIME")
	private Date fArriveTime;
    /**
     * 入库时间
     */
	@TableField("F_STORAGE_TIME")
	private Date fStorageTime;
    /**
     * 订单状态 0-待发货 1-待收货 2-已收货
     */
	@TableField("F_STATUS")
	private String fStatus;
    /**
     * 完成时间
     */
	@TableField("F_COMPLETE_TIME")
	private Date fCompleteTime;
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
     * 来源流水ID
     */
	@TableField("F_SOURCE_ID")
	private String fSourceId;
    /**
     * 订单来源 0001代理商
     */
	@TableField("F_SOURCE")
	private String fSource;
    /**
     * 总付款金额
     */
	@TableField("F_PAYMENT_AMOUNT")
	private Double fPaymentAmount;
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
     * 订单号 yyyyMMdd + 12位序列号
     */
    @TableId("F_ORDER_ID")
	private String fOrderId;
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
     * 提醒发货 空或者00-初始状态,01-已提醒
     */
	@TableField("F_DELIVERY_STATE")
	private String fDeliveryState;
	@TableField("CASH_END_TIME")
	private Date cashEndTime;


	public String getfAgentSwitchStatus() {
		return fAgentSwitchStatus;
	}

	public void setfAgentSwitchStatus(String fAgentSwitchStatus) {
		this.fAgentSwitchStatus = fAgentSwitchStatus;
	}

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

	public Double getfUnitPrice() {
		return fUnitPrice;
	}

	public void setfUnitPrice(Double fUnitPrice) {
		this.fUnitPrice = fUnitPrice;
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

	public String getfAuditStatus() {
		return fAuditStatus;
	}

	public void setfAuditStatus(String fAuditStatus) {
		this.fAuditStatus = fAuditStatus;
	}

	public String getfPaymentId() {
		return fPaymentId;
	}

	public void setfPaymentId(String fPaymentId) {
		this.fPaymentId = fPaymentId;
	}

	public Date getfSettleTime() {
		return fSettleTime;
	}

	public void setfSettleTime(Date fSettleTime) {
		this.fSettleTime = fSettleTime;
	}

	public String getfSettleStatus() {
		return fSettleStatus;
	}

	public void setfSettleStatus(String fSettleStatus) {
		this.fSettleStatus = fSettleStatus;
	}

	public Date getfArriveTime() {
		return fArriveTime;
	}

	public void setfArriveTime(Date fArriveTime) {
		this.fArriveTime = fArriveTime;
	}

	public Date getfStorageTime() {
		return fStorageTime;
	}

	public void setfStorageTime(Date fStorageTime) {
		this.fStorageTime = fStorageTime;
	}

	public String getfStatus() {
		return fStatus;
	}

	public void setfStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public Date getfCompleteTime() {
		return fCompleteTime;
	}

	public void setfCompleteTime(Date fCompleteTime) {
		this.fCompleteTime = fCompleteTime;
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

	public Double getfPaymentAmount() {
		return fPaymentAmount;
	}

	public void setfPaymentAmount(Double fPaymentAmount) {
		this.fPaymentAmount = fPaymentAmount;
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

	public String getfOrderId() {
		return fOrderId;
	}

	public void setfOrderId(String fOrderId) {
		this.fOrderId = fOrderId;
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

	public String getfDeliveryState() {
		return fDeliveryState;
	}

	public void setfDeliveryState(String fDeliveryState) {
		this.fDeliveryState = fDeliveryState;
	}

	public Date getCashEndTime() {
		return cashEndTime;
	}

	public void setCashEndTime(Date cashEndTime) {
		this.cashEndTime = cashEndTime;
	}

	@Override
	public String toString() {
		return "TPurchaserOrder{" +
			", fAgentSwitchStatus=" + fAgentSwitchStatus +
			", fOperateTime=" + fOperateTime +
			", fOperator=" + fOperator +
			", fEndNo=" + fEndNo +
			", fBeginNo=" + fBeginNo +
			", fUnitPrice=" + fUnitPrice +
			", fShipType=" + fShipType +
			", fFactoryName=" + fFactoryName +
			", fFactoryNo=" + fFactoryNo +
			", fDeliveryAddress=" + fDeliveryAddress +
			", fAuditStatus=" + fAuditStatus +
			", fPaymentId=" + fPaymentId +
			", fSettleTime=" + fSettleTime +
			", fSettleStatus=" + fSettleStatus +
			", fArriveTime=" + fArriveTime +
			", fStorageTime=" + fStorageTime +
			", fStatus=" + fStatus +
			", fCompleteTime=" + fCompleteTime +
			", fOrderTime=" + fOrderTime +
			", fBatchId=" + fBatchId +
			", fRecvAccountNo=" + fRecvAccountNo +
			", fRecvBankName=" + fRecvBankName +
			", fRecvTransTime=" + fRecvTransTime +
			", fRecvVoucher=" + fRecvVoucher +
			", fRecvType=" + fRecvType +
			", fSourceId=" + fSourceId +
			", fSource=" + fSource +
			", fPaymentAmount=" + fPaymentAmount +
			", fQuantity=" + fQuantity +
			", fAgentPhone=" + fAgentPhone +
			", fAgentContractName=" + fAgentContractName +
			", fAgentName=" + fAgentName +
			", fAgentNo=" + fAgentNo +
			", fDeviceModel=" + fDeviceModel +
			", fOrderId=" + fOrderId +
			", fReceiverPhone=" + fReceiverPhone +
			", fReceiver=" + fReceiver +
			", fPosType=" + fPosType +
			", fIsMember=" + fIsMember +
			", fDeliveryState=" + fDeliveryState +
			", cashEndTime=" + cashEndTime +
			"}";
	}
}
