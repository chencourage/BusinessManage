package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 角色权限
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("AGENT_ROLE_PRIVILEGE")
public class AgentRolePrivilege extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 创建人ID
     */
	@TableField("CREATOR_ID")
	private String creatorId;
    /**
     * 权限ID
     */
	@TableField("LIMITID")
	private String limitid;
    /**
     * 角色ID
     */
    @TableId("ROLEID")
	private String roleid;


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getLimitid() {
		return limitid;
	}

	public void setLimitid(String limitid) {
		this.limitid = limitid;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "AgentRolePrivilege{" +
			", createTime=" + createTime +
			", creatorId=" + creatorId +
			", limitid=" + limitid +
			", roleid=" + roleid +
			"}";
	}
}
