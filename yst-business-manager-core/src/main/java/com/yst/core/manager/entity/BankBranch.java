package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 支行信息
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("BANK_BRANCH")
public class BankBranch extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("ONEPOINT")
	private String onepoint;
	@TableField("VIEW_BANKTYPE")
	private String viewBanktype;
	@TableField("SUPERIOR")
	private String superior;
    /**
     * 市代码
     */
	@TableField("CITYCODE")
	private String citycode;
    /**
     * 银行名称
     */
	@TableField("BANKNAME")
	private String bankname;
    /**
     * 行别
     */
	@TableField("BANKTYPE")
	private String banktype;
    /**
     * 银行代码
     */
    @TableId("BANKCODE")
	private String bankcode;


	public String getOnepoint() {
		return onepoint;
	}

	public void setOnepoint(String onepoint) {
		this.onepoint = onepoint;
	}

	public String getViewBanktype() {
		return viewBanktype;
	}

	public void setViewBanktype(String viewBanktype) {
		this.viewBanktype = viewBanktype;
	}

	public String getSuperior() {
		return superior;
	}

	public void setSuperior(String superior) {
		this.superior = superior;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBanktype() {
		return banktype;
	}

	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	@Override
	public String toString() {
		return "BankBranch{" +
			", onepoint=" + onepoint +
			", viewBanktype=" + viewBanktype +
			", superior=" + superior +
			", citycode=" + citycode +
			", bankname=" + bankname +
			", banktype=" + banktype +
			", bankcode=" + bankcode +
			"}";
	}
}
