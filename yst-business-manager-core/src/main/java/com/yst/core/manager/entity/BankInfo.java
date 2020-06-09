package com.yst.core.manager.entity;

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
@TableName("BANK_INFO")
public class BankInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 排序
     */
	@TableField("SEQ")
	private String seq;
    /**
     * 银行url
     */
	@TableField("BANKURL")
	private String bankurl;
    /**
     * 银行英文名称
     */
	@TableField("BANK_ENGLISH_NAME")
	private String bankEnglishName;
    /**
     * 图片地址
     */
	@TableField("BANK_ICON")
	private String bankIcon;
    /**
     * 银行名称描述
     */
	@TableField("BANK_NAME_DESC")
	private String bankNameDesc;
    /**
     * 银行名称
     */
	@TableField("BANK_NAME")
	private String bankName;
    /**
     * 唯一主键
     */
    @TableId("ID")
	private String id;


	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getBankurl() {
		return bankurl;
	}

	public void setBankurl(String bankurl) {
		this.bankurl = bankurl;
	}

	public String getBankEnglishName() {
		return bankEnglishName;
	}

	public void setBankEnglishName(String bankEnglishName) {
		this.bankEnglishName = bankEnglishName;
	}

	public String getBankIcon() {
		return bankIcon;
	}

	public void setBankIcon(String bankIcon) {
		this.bankIcon = bankIcon;
	}

	public String getBankNameDesc() {
		return bankNameDesc;
	}

	public void setBankNameDesc(String bankNameDesc) {
		this.bankNameDesc = bankNameDesc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BankInfo{" +
			", seq=" + seq +
			", bankurl=" + bankurl +
			", bankEnglishName=" + bankEnglishName +
			", bankIcon=" + bankIcon +
			", bankNameDesc=" + bankNameDesc +
			", bankName=" + bankName +
			", id=" + id +
			"}";
	}
}
