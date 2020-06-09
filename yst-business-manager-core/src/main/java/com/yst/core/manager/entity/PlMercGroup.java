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
 * @since 2019-06-22
 */
@TableName("PL_MERC_GROUP")
public class PlMercGroup extends BaseEntity {

    private static final long serialVersionUID = 1L;

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
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 状态
     */
	@TableField("STATUS")
	private String status;
    /**
     * 机构号
     */
	@TableField("ORG_NO")
	private String orgNo;
    /**
     * 组名
     */
	@TableField("GROUP_NAME")
	private String groupName;
    @TableId("ID")
	private Double id;
    /**
     * 代理商号
     */
	@TableField("AGENT_NO")
	private String agentNo;


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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}

	@Override
	public String toString() {
		return "PlMercGroup{" +
			", operator=" + operator +
			", updateTime=" + updateTime +
			", remark=" + remark +
			", createTime=" + createTime +
			", status=" + status +
			", orgNo=" + orgNo +
			", groupName=" + groupName +
			", id=" + id +
			", agentNo=" + agentNo +
			"}";
	}
}
