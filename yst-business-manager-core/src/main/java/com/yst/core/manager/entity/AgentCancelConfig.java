package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("AGENT_CANCEL_CONFIG")
public class AgentCancelConfig extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 手机号
     */
	@TableField("AGENT_TEL_NO")
	private String agentTelNo;
    /**
     * 姓名
     */
	@TableField("AGENT_NAME")
	private String agentName;
    /**
     * 代理商名称
     */
	@TableField("AGENT_MERC_NAME")
	private String agentMercName;
    /**
     * 代理商编号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAgentTelNo() {
		return agentTelNo;
	}

	public void setAgentTelNo(String agentTelNo) {
		this.agentTelNo = agentTelNo;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentMercName() {
		return agentMercName;
	}

	public void setAgentMercName(String agentMercName) {
		this.agentMercName = agentMercName;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	@Override
	public String toString() {
		return "AgentCancelConfig{" +
			", createTime=" + createTime +
			", agentTelNo=" + agentTelNo +
			", agentName=" + agentName +
			", agentMercName=" + agentMercName +
			", agentMercId=" + agentMercId +
			"}";
	}
}
