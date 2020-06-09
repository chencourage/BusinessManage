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
@TableName("CARDBIN_INFO")
public class CardbinInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("MIN_BANKTYPE")
	private String minBanktype;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 修改人名称
     */
	@TableField("UPDATOR_NAME")
	private String updatorName;
    /**
     * 修改人ID
     */
	@TableField("UPDATOR_ID")
	private String updatorId;
    /**
     * 区域标志:0－境内卡;1－境外卡
     */
	@TableField("AREA_FLAG")
	private String areaFlag;
    /**
     * 银行名称
     */
	@TableField("BANKNAME")
	private String bankname;
    /**
     * 主账号长度
     */
	@TableField("CARD_NO_LEN")
	private String cardNoLen;
    /**
     * 00:借记卡 01：贷记卡 02：准贷记卡 03：预付费卡 04为其它
     */
	@TableField("BANKACCOUNT_TYPE")
	private String bankaccountType;
	@TableField("BANKTYPE")
	private String banktype;
    @TableId("CARDBIN")
	private String cardbin;


	public String getMinBanktype() {
		return minBanktype;
	}

	public void setMinBanktype(String minBanktype) {
		this.minBanktype = minBanktype;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdatorName() {
		return updatorName;
	}

	public void setUpdatorName(String updatorName) {
		this.updatorName = updatorName;
	}

	public String getUpdatorId() {
		return updatorId;
	}

	public void setUpdatorId(String updatorId) {
		this.updatorId = updatorId;
	}

	public String getAreaFlag() {
		return areaFlag;
	}

	public void setAreaFlag(String areaFlag) {
		this.areaFlag = areaFlag;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getCardNoLen() {
		return cardNoLen;
	}

	public void setCardNoLen(String cardNoLen) {
		this.cardNoLen = cardNoLen;
	}

	public String getBankaccountType() {
		return bankaccountType;
	}

	public void setBankaccountType(String bankaccountType) {
		this.bankaccountType = bankaccountType;
	}

	public String getBanktype() {
		return banktype;
	}

	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}

	public String getCardbin() {
		return cardbin;
	}

	public void setCardbin(String cardbin) {
		this.cardbin = cardbin;
	}

	@Override
	public String toString() {
		return "CardbinInfo{" +
			", minBanktype=" + minBanktype +
			", updateTime=" + updateTime +
			", updatorName=" + updatorName +
			", updatorId=" + updatorId +
			", areaFlag=" + areaFlag +
			", bankname=" + bankname +
			", cardNoLen=" + cardNoLen +
			", bankaccountType=" + bankaccountType +
			", banktype=" + banktype +
			", cardbin=" + cardbin +
			"}";
	}
}
