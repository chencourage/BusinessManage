package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("AGENT_ROLE")
public class AgentRole extends BaseEntity {

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
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 角色名称
     */
	@TableField("ROLENAME")
	private String rolename;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "AgentRole{" +
			", createTime=" + createTime +
			", creatorId=" + creatorId +
			", remark=" + remark +
			", rolename=" + rolename +
			", roleid=" + roleid +
			"}";
	}
}
