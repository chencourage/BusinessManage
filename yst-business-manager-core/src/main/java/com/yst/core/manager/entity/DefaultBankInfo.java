package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 默认银行信息
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("DEFAULT_BANK_INFO")
public class DefaultBankInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 开户行所在城市
     */
	@TableField("BANK_CITY_NAME")
	private String bankCityName;
    /**
     * 开户行所在省
     */
	@TableField("BANK_PROVINCE_NAME")
	private String bankProvinceName;
    /**
     * 开户行联名行名
     */
	@TableField("BANK_BRANCH_NAME")
	private String bankBranchName;
	@TableField("OPERATOR")
	private String operator;
	@TableField("UPDATE_TIME")
	private Date updateTime;
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 状态
(00表示启动，99表示禁用)
     */
	@TableField("STATE")
	private String state;
    /**
     * 开户行所在城市代码

     */
	@TableField("BANK_CITY")
	private String bankCity;
    /**
     * 开户行所在省代码

     */
	@TableField("BANK_PROVINCE")
	private String bankProvince;
    /**
     * 开户行联名行号
     */
	@TableField("BANK_CODE")
	private String bankCode;
    /**
     * 开户行名称

     */
	@TableField("BANK_NAME")
	private String bankName;
    /**
     * 开户行行别（主键）

     */
    @TableId("BANK_TYPE")
	private String bankType;


	public String getBankCityName() {
		return bankCityName;
	}

	public void setBankCityName(String bankCityName) {
		this.bankCityName = bankCityName;
	}

	public String getBankProvinceName() {
		return bankProvinceName;
	}

	public void setBankProvinceName(String bankProvinceName) {
		this.bankProvinceName = bankProvinceName;
	}

	public String getBankBranchName() {
		return bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankProvince() {
		return bankProvince;
	}

	public void setBankProvince(String bankProvince) {
		this.bankProvince = bankProvince;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	@Override
	public String toString() {
		return "DefaultBankInfo{" +
			", bankCityName=" + bankCityName +
			", bankProvinceName=" + bankProvinceName +
			", bankBranchName=" + bankBranchName +
			", operator=" + operator +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", state=" + state +
			", bankCity=" + bankCity +
			", bankProvince=" + bankProvince +
			", bankCode=" + bankCode +
			", bankName=" + bankName +
			", bankType=" + bankType +
			"}";
	}
}
