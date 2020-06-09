package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 用户与角色关系
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("AGENT_USER_ROLE")
public class AgentUserRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 创建人名称
     */
	@TableField("CREATOR_NAME")
	private String creatorName;
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
     * 角色ID
     */
	@TableField("ROLEID")
	private String roleid;
    /**
     * 用户ID
     */
    @TableId("USERCODE")
	private String usercode;


	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

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

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	@Override
	public String toString() {
		return "AgentUserRole{" +
			", creatorName=" + creatorName +
			", createTime=" + createTime +
			", creatorId=" + creatorId +
			", roleid=" + roleid +
			", usercode=" + usercode +
			"}";
	}
}
