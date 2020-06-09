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
@TableName("CARD_MERCHANT_INFO")
public class CardMerchantInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * pay卡个人商户00／实体商户01 
     */
	@TableField("USER_TYPE")
	private String userType;
    /**
     * 加密的商户号
     */
	@TableField("QR_CODE")
	private String qrCode;
    /**
     * 1代表已下载，0或空代表未下载
     */
	@TableField("IS_DOWNLOAD1")
	private String isDownload1;
	@TableField("QUERY_QRCODE_JOB_TIMES1")
	private Double queryQrcodeJobTimes1;
    /**
     * 银联商户代码
     */
	@TableField("UNIONPAY_MERID")
	private String unionpayMerid;
    /**
     * 银联拓展人ID
     */
	@TableField("EXPAND_NAME")
	private String expandName;
    /**
     * 银联拓展机构
     */
	@TableField("EXPAND_CODE")
	private String expandCode;
    /**
     * 二维码url
     */
	@TableField("QRCODE_URL")
	private String qrcodeUrl;
    /**
     * 00-通用pay卡
01-聚合二维码 10待生成聚合二维码
     */
	@TableField("QRCODE_TYPE")
	private String qrcodeType;
    /**
     * 备注4
     */
	@TableField("REMARK_4")
	private String remark4;
    /**
     * 备注3
     */
	@TableField("REMARK_3")
	private String remark3;
    /**
     * 备注2
     */
	@TableField("REMARK_2")
	private String remark2;
    /**
     * 标示是否开通一户多码 Y 标识开通
     */
	@TableField("REMARK_1")
	private String remark1;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 机构名称
     */
	@TableField("ORG_NO")
	private String orgNo;
    /**
     * 代理名称
     */
	@TableField("AGT_MERC_NAME")
	private String agtMercName;
    /**
     * 订单上送数据
     */
	@TableField("ORDER_DATA")
	private String orderData;
    /**
     * 上游订单号
     */
	@TableField("CHANNEL_ORDER_NO")
	private String channelOrderNo;
    /**
     * 订单号
     */
	@TableField("ORDER_NO")
	private String orderNo;
    /**
     * 请求订单号
     */
	@TableField("REQUEST_ORDER_NO")
	private String requestOrderNo;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 创建人
     */
	@TableField("CREATOR")
	private String creator;
    /**
     * 激活时间
     */
	@TableField("ACTIVATE_TIME")
	private Date activateTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 状态 10已激活 00未激活 55已购买未激活
     */
	@TableField("STATE")
	private String state;
    /**
     * 代理商号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 商户号
     */
	@TableField("MERC_ID")
	private String mercId;
    /**
     * 批次号
     */
	@TableField("BATCH_ID")
	private String batchId;
    /**
     * 唯一主键
     */
    @TableId("ID")
	private String id;
    /**
     * 交易通知地址（作废）
     */
	@TableField("NOTIFY_URL")
	private String notifyUrl;


	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getIsDownload1() {
		return isDownload1;
	}

	public void setIsDownload1(String isDownload1) {
		this.isDownload1 = isDownload1;
	}

	public Double getQueryQrcodeJobTimes1() {
		return queryQrcodeJobTimes1;
	}

	public void setQueryQrcodeJobTimes1(Double queryQrcodeJobTimes1) {
		this.queryQrcodeJobTimes1 = queryQrcodeJobTimes1;
	}

	public String getUnionpayMerid() {
		return unionpayMerid;
	}

	public void setUnionpayMerid(String unionpayMerid) {
		this.unionpayMerid = unionpayMerid;
	}

	public String getExpandName() {
		return expandName;
	}

	public void setExpandName(String expandName) {
		this.expandName = expandName;
	}

	public String getExpandCode() {
		return expandCode;
	}

	public void setExpandCode(String expandCode) {
		this.expandCode = expandCode;
	}

	public String getQrcodeUrl() {
		return qrcodeUrl;
	}

	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

	public String getQrcodeType() {
		return qrcodeType;
	}

	public void setQrcodeType(String qrcodeType) {
		this.qrcodeType = qrcodeType;
	}

	public String getRemark4() {
		return remark4;
	}

	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getAgtMercName() {
		return agtMercName;
	}

	public void setAgtMercName(String agtMercName) {
		this.agtMercName = agtMercName;
	}

	public String getOrderData() {
		return orderData;
	}

	public void setOrderData(String orderData) {
		this.orderData = orderData;
	}

	public String getChannelOrderNo() {
		return channelOrderNo;
	}

	public void setChannelOrderNo(String channelOrderNo) {
		this.channelOrderNo = channelOrderNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequestOrderNo() {
		return requestOrderNo;
	}

	public void setRequestOrderNo(String requestOrderNo) {
		this.requestOrderNo = requestOrderNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getActivateTime() {
		return activateTime;
	}

	public void setActivateTime(Date activateTime) {
		this.activateTime = activateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getMercId() {
		return mercId;
	}

	public void setMercId(String mercId) {
		this.mercId = mercId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	@Override
	public String toString() {
		return "CardMerchantInfo{" +
			", userType=" + userType +
			", qrCode=" + qrCode +
			", isDownload1=" + isDownload1 +
			", queryQrcodeJobTimes1=" + queryQrcodeJobTimes1 +
			", unionpayMerid=" + unionpayMerid +
			", expandName=" + expandName +
			", expandCode=" + expandCode +
			", qrcodeUrl=" + qrcodeUrl +
			", qrcodeType=" + qrcodeType +
			", remark4=" + remark4 +
			", remark3=" + remark3 +
			", remark2=" + remark2 +
			", remark1=" + remark1 +
			", updateTime=" + updateTime +
			", orgNo=" + orgNo +
			", agtMercName=" + agtMercName +
			", orderData=" + orderData +
			", channelOrderNo=" + channelOrderNo +
			", orderNo=" + orderNo +
			", requestOrderNo=" + requestOrderNo +
			", remark=" + remark +
			", creator=" + creator +
			", activateTime=" + activateTime +
			", createTime=" + createTime +
			", state=" + state +
			", agentMercId=" + agentMercId +
			", mercId=" + mercId +
			", batchId=" + batchId +
			", id=" + id +
			", notifyUrl=" + notifyUrl +
			"}";
	}
}
