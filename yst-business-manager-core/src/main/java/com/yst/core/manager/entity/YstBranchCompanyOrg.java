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
 * @since 2019-06-22
 */
@TableName("YST_BRANCH_COMPANY_ORG")
public class YstBranchCompanyOrg extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("BRANCH_COMPANY_NAME")
	private String branchCompanyName;
	@TableField("EXPAND_CODE")
	private String expandCode;
    @TableId("BRANCH_COMPANY_ORG")
	private String branchCompanyOrg;


	public String getBranchCompanyName() {
		return branchCompanyName;
	}

	public void setBranchCompanyName(String branchCompanyName) {
		this.branchCompanyName = branchCompanyName;
	}

	public String getExpandCode() {
		return expandCode;
	}

	public void setExpandCode(String expandCode) {
		this.expandCode = expandCode;
	}

	public String getBranchCompanyOrg() {
		return branchCompanyOrg;
	}

	public void setBranchCompanyOrg(String branchCompanyOrg) {
		this.branchCompanyOrg = branchCompanyOrg;
	}

	@Override
	public String toString() {
		return "YstBranchCompanyOrg{" +
			", branchCompanyName=" + branchCompanyName +
			", expandCode=" + expandCode +
			", branchCompanyOrg=" + branchCompanyOrg +
			"}";
	}
}
