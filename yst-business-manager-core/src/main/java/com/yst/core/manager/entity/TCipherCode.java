package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 订单密钥
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("T_CIPHER_CODE")
public class TCipherCode extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 状态 0-初始化 1-成功 2-入库失败 3-出库失败
     */
	@TableField("F_STATUS")
	private String fStatus;
    /**
     * 工厂导入时间
     */
	@TableField("F_FACTORY_IMPORT_TIME")
	private Date fFactoryImportTime;
    /**
     * 终端管理员导入时间
     */
	@TableField("F_IMPORT_TIME")
	private Date fImportTime;
    /**
     * 设备机身号
     */
	@TableField("F_DEVICE_SN")
	private String fDeviceSn;
    /**
     * TMK2校验值
     */
	@TableField("F_TMK_TWO_VERIFY")
	private String fTmkTwoVerify;
    /**
     * 加密后TMK2
     */
	@TableField("F_TMK_TWO")
	private String fTmkTwo;
    /**
     * TMK1校验值
     */
	@TableField("F_TMK_ONE_VERIFY")
	private String fTmkOneVerify;
    /**
     * 加密后TMK1
     */
	@TableField("F_TMK_ONE")
	private String fTmkOne;
    /**
     * 终端号
     */
	@TableField("F_TERM_NO")
	private String fTermNo;
    /**
     * 订单号 yyyyMMdd + 12位序列号
     */
    @TableId("F_ORDER_ID")
	private String fOrderId;
    /**
     * 终端签约费率
     */
	@TableField("FEE_ID")
	private String feeId;
    /**
     * 终端结算费ID
     */
	@TableField("SETTLE_PRICE_ID")
	private String settlePriceId;
    /**
     * 终端数据同步时间
     */
	@TableField("SYNC_TIME")
	private Date syncTime;
    /**
     * 机构号
     */
	@TableField("ORG_NO")
	private String orgNo;
    /**
     * 注册标识（1:已注册，2:已出库，3:已入库，4:已报修，5:已报废，6:已注销）
     */
	@TableField("REG_FLG")
	private String regFlg;
    /**
     * 代理商名
     */
	@TableField("AGT_MERC_NM")
	private String agtMercNm;
    /**
     * 代理商号
     */
	@TableField("AGT_MERC_ID")
	private String agtMercId;
    /**
     * 商户名
     */
	@TableField("MERC_NM")
	private String mercNm;
    /**
     * 商户号
     */
	@TableField("MERC_ID")
	private String mercId;
    /**
     * 会员结算费率
     */
	@TableField("MEM_SETTLE_PRICE_ID")
	private String memSettlePriceId;
    /**
     * 是否会员订单 0-否, 1-是
     */
	@TableField("F_IS_MEMBER")
	private String fIsMember;
    /**
     * 发货子订单号
     */
	@TableField("F_DELIVERY_ID")
	private String fDeliveryId;
    /**
     * 是否已激活，0-否，1-是
     */
	@TableField("IS_ACTIVE")
	private String isActive;
    /**
     * 大POS SIM卡信息
     */
	@TableField("BPOS_SIM")
	private String bposSim;


	public String getfStatus() {
		return fStatus;
	}

	public void setfStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public Date getfFactoryImportTime() {
		return fFactoryImportTime;
	}

	public void setfFactoryImportTime(Date fFactoryImportTime) {
		this.fFactoryImportTime = fFactoryImportTime;
	}

	public Date getfImportTime() {
		return fImportTime;
	}

	public void setfImportTime(Date fImportTime) {
		this.fImportTime = fImportTime;
	}

	public String getfDeviceSn() {
		return fDeviceSn;
	}

	public void setfDeviceSn(String fDeviceSn) {
		this.fDeviceSn = fDeviceSn;
	}

	public String getfTmkTwoVerify() {
		return fTmkTwoVerify;
	}

	public void setfTmkTwoVerify(String fTmkTwoVerify) {
		this.fTmkTwoVerify = fTmkTwoVerify;
	}

	public String getfTmkTwo() {
		return fTmkTwo;
	}

	public void setfTmkTwo(String fTmkTwo) {
		this.fTmkTwo = fTmkTwo;
	}

	public String getfTmkOneVerify() {
		return fTmkOneVerify;
	}

	public void setfTmkOneVerify(String fTmkOneVerify) {
		this.fTmkOneVerify = fTmkOneVerify;
	}

	public String getfTmkOne() {
		return fTmkOne;
	}

	public void setfTmkOne(String fTmkOne) {
		this.fTmkOne = fTmkOne;
	}

	public String getfTermNo() {
		return fTermNo;
	}

	public void setfTermNo(String fTermNo) {
		this.fTermNo = fTermNo;
	}

	public String getfOrderId() {
		return fOrderId;
	}

	public void setfOrderId(String fOrderId) {
		this.fOrderId = fOrderId;
	}

	public String getFeeId() {
		return feeId;
	}

	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}

	public String getSettlePriceId() {
		return settlePriceId;
	}

	public void setSettlePriceId(String settlePriceId) {
		this.settlePriceId = settlePriceId;
	}

	public Date getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getRegFlg() {
		return regFlg;
	}

	public void setRegFlg(String regFlg) {
		this.regFlg = regFlg;
	}

	public String getAgtMercNm() {
		return agtMercNm;
	}

	public void setAgtMercNm(String agtMercNm) {
		this.agtMercNm = agtMercNm;
	}

	public String getAgtMercId() {
		return agtMercId;
	}

	public void setAgtMercId(String agtMercId) {
		this.agtMercId = agtMercId;
	}

	public String getMercNm() {
		return mercNm;
	}

	public void setMercNm(String mercNm) {
		this.mercNm = mercNm;
	}

	public String getMercId() {
		return mercId;
	}

	public void setMercId(String mercId) {
		this.mercId = mercId;
	}

	public String getMemSettlePriceId() {
		return memSettlePriceId;
	}

	public void setMemSettlePriceId(String memSettlePriceId) {
		this.memSettlePriceId = memSettlePriceId;
	}

	public String getfIsMember() {
		return fIsMember;
	}

	public void setfIsMember(String fIsMember) {
		this.fIsMember = fIsMember;
	}

	public String getfDeliveryId() {
		return fDeliveryId;
	}

	public void setfDeliveryId(String fDeliveryId) {
		this.fDeliveryId = fDeliveryId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getBposSim() {
		return bposSim;
	}

	public void setBposSim(String bposSim) {
		this.bposSim = bposSim;
	}

	@Override
	public String toString() {
		return "TCipherCode{" +
			", fStatus=" + fStatus +
			", fFactoryImportTime=" + fFactoryImportTime +
			", fImportTime=" + fImportTime +
			", fDeviceSn=" + fDeviceSn +
			", fTmkTwoVerify=" + fTmkTwoVerify +
			", fTmkTwo=" + fTmkTwo +
			", fTmkOneVerify=" + fTmkOneVerify +
			", fTmkOne=" + fTmkOne +
			", fTermNo=" + fTermNo +
			", fOrderId=" + fOrderId +
			", feeId=" + feeId +
			", settlePriceId=" + settlePriceId +
			", syncTime=" + syncTime +
			", orgNo=" + orgNo +
			", regFlg=" + regFlg +
			", agtMercNm=" + agtMercNm +
			", agtMercId=" + agtMercId +
			", mercNm=" + mercNm +
			", mercId=" + mercId +
			", memSettlePriceId=" + memSettlePriceId +
			", fIsMember=" + fIsMember +
			", fDeliveryId=" + fDeliveryId +
			", isActive=" + isActive +
			", bposSim=" + bposSim +
			"}";
	}
}
