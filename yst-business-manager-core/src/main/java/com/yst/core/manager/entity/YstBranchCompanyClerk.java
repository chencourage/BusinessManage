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
@TableName("YST_BRANCH_COMPANY_CLERK")
public class YstBranchCompanyClerk extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 业务员联系方式
     */
	@TableField("CLERK_PHONE")
	private String clerkPhone;
    /**
     * 归属城市
     */
	@TableField("BELONG_CITY")
	private String belongCity;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 分公司所属机构号或代理商编号
     */
	@TableField("ORG_NO")
	private String orgNo;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 更新时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 业务员状态 0离职 1在职
     */
	@TableField("CLERK_STATE")
	private String clerkState;
    /**
     * 业务员用户号
     */
	@TableField("CLERK_USERCODE")
	private String clerkUsercode;
    /**
     * 业务员负责区域
     */
	@TableField("CLERK_CHARGE_AREA")
	private String clerkChargeArea;
    /**
     * 负责人或代理商名
     */
	@TableField("DUTY_PERSON")
	private String dutyPerson;
    /**
     * 业务员姓名
     */
	@TableField("CLERK_NAME")
	private String clerkName;
    /**
     * 分公司或代理商名
     */
	@TableField("BRANCH_COMPANY")
	private String branchCompany;
    /**
     * 角色ID
     */
	@TableField("ROLEID")
	private String roleid;


	public String getClerkPhone() {
		return clerkPhone;
	}

	public void setClerkPhone(String clerkPhone) {
		this.clerkPhone = clerkPhone;
	}

	public String getBelongCity() {
		return belongCity;
	}

	public void setBelongCity(String belongCity) {
		this.belongCity = belongCity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
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

	public String getClerkState() {
		return clerkState;
	}

	public void setClerkState(String clerkState) {
		this.clerkState = clerkState;
	}

	public String getClerkUsercode() {
		return clerkUsercode;
	}

	public void setClerkUsercode(String clerkUsercode) {
		this.clerkUsercode = clerkUsercode;
	}

	public String getClerkChargeArea() {
		return clerkChargeArea;
	}

	public void setClerkChargeArea(String clerkChargeArea) {
		this.clerkChargeArea = clerkChargeArea;
	}

	public String getDutyPerson() {
		return dutyPerson;
	}

	public void setDutyPerson(String dutyPerson) {
		this.dutyPerson = dutyPerson;
	}

	public String getClerkName() {
		return clerkName;
	}

	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public String getBranchCompany() {
		return branchCompany;
	}

	public void setBranchCompany(String branchCompany) {
		this.branchCompany = branchCompany;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "YstBranchCompanyClerk{" +
			", clerkPhone=" + clerkPhone +
			", belongCity=" + belongCity +
			", id=" + id +
			", createTime=" + createTime +
			", orgNo=" + orgNo +
			", operator=" + operator +
			", updateTime=" + updateTime +
			", clerkState=" + clerkState +
			", clerkUsercode=" + clerkUsercode +
			", clerkChargeArea=" + clerkChargeArea +
			", dutyPerson=" + dutyPerson +
			", clerkName=" + clerkName +
			", branchCompany=" + branchCompany +
			", roleid=" + roleid +
			"}";
	}
}
