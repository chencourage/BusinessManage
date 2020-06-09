package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 激活返现时间表置表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("INDEPENDENT_MARKETING_TIME")
public class IndependentMarketingTime extends BaseEntity {

    private static final long serialVersionUID = 1L;

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
     * 创建人
     */
	@TableField("CREATER")
	private String creater;
    /**
     * 返现结束时间
     */
	@TableField("END_TIME")
	private Date endTime;
    /**
     * 返现开始时间
     */
	@TableField("START_TIME")
	private Date startTime;
    /**
     * 激活返现规则ID
     */
	@TableField("MARKETING_ID")
	private String marketingId;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;


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

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getMarketingId() {
		return marketingId;
	}

	public void setMarketingId(String marketingId) {
		this.marketingId = marketingId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "IndependentMarketingTime{" +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", creater=" + creater +
			", endTime=" + endTime +
			", startTime=" + startTime +
			", marketingId=" + marketingId +
			", id=" + id +
			"}";
	}
}
