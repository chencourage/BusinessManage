package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 商户组关联
 * </p>
 *
 * @author chenkai
 * @since 2019-06-22
 */
@TableName("MERC_GROUP")
public class MercGroup extends BaseEntity {

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
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 状态:00启用,99关闭
     */
	@TableField("STATUS")
	private String status;
    /**
     * 优先级
     */
	@TableField("PRIORITY")
	private Double priority;
    /**
     * 平台商户组ID
     */
	@TableField("PL_GROUP_ID")
	private Double plGroupId;
    /**
     * 渠道商户组ID
     */
	@TableField("CH_GROUP_ID")
	private Double chGroupId;
    @TableId("ID")
	private Double id;


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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getPriority() {
		return priority;
	}

	public void setPriority(Double priority) {
		this.priority = priority;
	}

	public Double getPlGroupId() {
		return plGroupId;
	}

	public void setPlGroupId(Double plGroupId) {
		this.plGroupId = plGroupId;
	}

	public Double getChGroupId() {
		return chGroupId;
	}

	public void setChGroupId(Double chGroupId) {
		this.chGroupId = chGroupId;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "MercGroup{" +
			", operator=" + operator +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", status=" + status +
			", priority=" + priority +
			", plGroupId=" + plGroupId +
			", chGroupId=" + chGroupId +
			", id=" + id +
			"}";
	}
}
