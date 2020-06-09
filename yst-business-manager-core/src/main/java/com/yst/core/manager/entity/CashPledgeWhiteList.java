package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * mPos押金白名单表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("CASH_PLEDGE_WHITE_LIST")
public class CashPledgeWhiteList extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 机构名称
     */
	@TableField("ORG_NAME")
	private String orgName;
    /**
     * 机构号
     */
	@TableField("ORG_NO")
	private String orgNo;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 生效状态 00 生效，99失效
     */
	@TableField("ENABLE")
	private String enable;
    /**
     * 更新时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 01 代理商，02 终端号
     */
	@TableField("TYPE")
	private String type;
    /**
     * 代理商编号或者终端号
     */
    @TableId("MERC_OR_TRM")
	private String mercOrTrm;


	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
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

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMercOrTrm() {
		return mercOrTrm;
	}

	public void setMercOrTrm(String mercOrTrm) {
		this.mercOrTrm = mercOrTrm;
	}

	@Override
	public String toString() {
		return "CashPledgeWhiteList{" +
			", orgName=" + orgName +
			", orgNo=" + orgNo +
			", operator=" + operator +
			", enable=" + enable +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", type=" + type +
			", mercOrTrm=" + mercOrTrm +
			"}";
	}
}
