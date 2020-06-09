package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 营业执照认证信息表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("BUSINESS_LICENSE_INFO")
public class BusinessLicenseInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 注册资本
     */
	@TableField("REG_MONEY")
	private String regMoney;
    /**
     * 成立日期
     */
	@TableField("ISSUE_TIME")
	private String issueTime;
    /**
     * 备用
     */
	@TableField("REG_MONEY_1")
	private String regMoney1;
    /**
     * 注册类型 如:有限责任公司
     */
	@TableField("REG_TYPE")
	private String regType;
    /**
     * 经营状态 存续1 在业2 迁出3 注销4 撤销5 吊销6  (存续 在业 迁出为正常状态)
     */
	@TableField("BUSINESS_STATUS")
	private String businessStatus;
    /**
     * 组织机构代码
     */
	@TableField("COMPANY_CODE")
	private String companyCode;
    /**
     * 工商注册号
     */
	@TableField("REG_NUMBER")
	private String regNumber;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 登记机关
     */
	@TableField("REG_ORGNAME")
	private String regOrgname;
    /**
     * 描述
     */
	@TableField("SCOPE")
	private String scope;
    /**
     * 经营期限 结束
     */
	@TableField("REGDATE")
	private String regdate;
    /**
     * 经营期限 起始
     */
	@TableField("ENDDATE")
	private String enddate;
    /**
     * 注册地址
     */
	@TableField("REGADDRESS")
	private String regaddress;
    /**
     * 法人姓名
     */
	@TableField("FAREN")
	private String faren;
    /**
     * 公司名称
     */
	@TableField("BUSI_NAME")
	private String busiName;
    /**
     * 营业执照号或统一信用代码
     */
	@TableField("CREDITNO")
	private String creditno;
    /**
     * 主键
     */
	@TableField("BUSI_ID")
	private String busiId;


	public String getRegMoney() {
		return regMoney;
	}

	public void setRegMoney(String regMoney) {
		this.regMoney = regMoney;
	}

	public String getIssueTime() {
		return issueTime;
	}

	public void setIssueTime(String issueTime) {
		this.issueTime = issueTime;
	}

	public String getRegMoney1() {
		return regMoney1;
	}

	public void setRegMoney1(String regMoney1) {
		this.regMoney1 = regMoney1;
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public String getBusinessStatus() {
		return businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRegOrgname() {
		return regOrgname;
	}

	public void setRegOrgname(String regOrgname) {
		this.regOrgname = regOrgname;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getRegaddress() {
		return regaddress;
	}

	public void setRegaddress(String regaddress) {
		this.regaddress = regaddress;
	}

	public String getFaren() {
		return faren;
	}

	public void setFaren(String faren) {
		this.faren = faren;
	}

	public String getBusiName() {
		return busiName;
	}

	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}

	public String getCreditno() {
		return creditno;
	}

	public void setCreditno(String creditno) {
		this.creditno = creditno;
	}

	public String getBusiId() {
		return busiId;
	}

	public void setBusiId(String busiId) {
		this.busiId = busiId;
	}

	@Override
	public String toString() {
		return "BusinessLicenseInfo{" +
			", regMoney=" + regMoney +
			", issueTime=" + issueTime +
			", regMoney1=" + regMoney1 +
			", regType=" + regType +
			", businessStatus=" + businessStatus +
			", companyCode=" + companyCode +
			", regNumber=" + regNumber +
			", createTime=" + createTime +
			", regOrgname=" + regOrgname +
			", scope=" + scope +
			", regdate=" + regdate +
			", enddate=" + enddate +
			", regaddress=" + regaddress +
			", faren=" + faren +
			", busiName=" + busiName +
			", creditno=" + creditno +
			", busiId=" + busiId +
			"}";
	}
}
