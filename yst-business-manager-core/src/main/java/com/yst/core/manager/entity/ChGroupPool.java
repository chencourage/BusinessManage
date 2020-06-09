package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 渠道商户组关联表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-22
 */
@TableName("CH_GROUP_POOL")
public class ChGroupPool extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("POOL_ID")
	private Double poolId;
	@TableField("GROUP_ID")
	private Double groupId;
    @TableId("ID")
	private Double id;


	public Double getPoolId() {
		return poolId;
	}

	public void setPoolId(Double poolId) {
		this.poolId = poolId;
	}

	public Double getGroupId() {
		return groupId;
	}

	public void setGroupId(Double groupId) {
		this.groupId = groupId;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ChGroupPool{" +
			", poolId=" + poolId +
			", groupId=" + groupId +
			", id=" + id +
			"}";
	}
}
