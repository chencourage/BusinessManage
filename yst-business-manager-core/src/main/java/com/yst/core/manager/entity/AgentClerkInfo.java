package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 代理商下业务员信息
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("AGENT_CLERK_INFO")
public class AgentClerkInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("BACK_FILED_3")
	private String backFiled3;
	@TableField("BACK_FILED_2")
	private String backFiled2;
    /**
     * 业务员手机号
     */
	@TableField("CLERK_PHONE")
	private String clerkPhone;
    /**
     * 操作人
     */
	@TableField("OPERATOR_UPDATE")
	private String operatorUpdate;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 业务员状态 00在职 01离职
     */
	@TableField("CLERK_STATE")
	private String clerkState;
    /**
     * 业务员姓名
     */
	@TableField("CLERK_NAME")
	private String clerkName;
    /**
     * 代理商编号
     */
	@TableField("AGENT_NO")
	private String agentNo;
    /**
     * 主键
     */
    @TableId("CLERK_ID")
	private String clerkId;


	public String getBackFiled3() {
		return backFiled3;
	}

	public void setBackFiled3(String backFiled3) {
		this.backFiled3 = backFiled3;
	}

	public String getBackFiled2() {
		return backFiled2;
	}

	public void setBackFiled2(String backFiled2) {
		this.backFiled2 = backFiled2;
	}

	public String getClerkPhone() {
		return clerkPhone;
	}

	public void setClerkPhone(String clerkPhone) {
		this.clerkPhone = clerkPhone;
	}

	public String getOperatorUpdate() {
		return operatorUpdate;
	}

	public void setOperatorUpdate(String operatorUpdate) {
		this.operatorUpdate = operatorUpdate;
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

	public String getClerkState() {
		return clerkState;
	}

	public void setClerkState(String clerkState) {
		this.clerkState = clerkState;
	}

	public String getClerkName() {
		return clerkName;
	}

	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}

	public String getClerkId() {
		return clerkId;
	}

	public void setClerkId(String clerkId) {
		this.clerkId = clerkId;
	}

	@Override
	public String toString() {
		return "AgentClerkInfo{" +
			", backFiled3=" + backFiled3 +
			", backFiled2=" + backFiled2 +
			", clerkPhone=" + clerkPhone +
			", operatorUpdate=" + operatorUpdate +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", clerkState=" + clerkState +
			", clerkName=" + clerkName +
			", agentNo=" + agentNo +
			", clerkId=" + clerkId +
			"}";
	}
}
