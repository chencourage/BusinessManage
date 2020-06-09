package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 代理商与公告标记历史表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("AGENT_NOTICE_SIGN_HISTORY")
public class AgentNoticeSignHistory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 标记状态(1：已标记,0：未标记)
     */
	@TableField("STATE")
	private String state;
    /**
     * 日期
     */
	@TableField("BIND_TIME")
	private Date bindTime;
    /**
     * 公告ID
     */
	@TableField("NOTICE_ID")
	private String noticeId;
    /**
     * 代理商编号
     */
	@TableField("AGT_ID")
	private String agtId;
    /**
     * 主键
     */
    @TableId("ID")
	private Long id;


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getBindTime() {
		return bindTime;
	}

	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}

	public String getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}

	public String getAgtId() {
		return agtId;
	}

	public void setAgtId(String agtId) {
		this.agtId = agtId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AgentNoticeSignHistory{" +
			", state=" + state +
			", bindTime=" + bindTime +
			", noticeId=" + noticeId +
			", agtId=" + agtId +
			", id=" + id +
			"}";
	}
}
