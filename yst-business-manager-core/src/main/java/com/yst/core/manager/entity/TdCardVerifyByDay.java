package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * pay卡验证--日统计报表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-22
 */
@TableName("TD_CARD_VERIFY_BY_DAY")
public class TdCardVerifyByDay extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 统计日期
     */
	@TableField("COUNT_DATE")
	private String countDate;
    /**
     * 历史累计pay卡审核通过记录数
     */
	@TableField("PASS_NUM_BY_HISTORY")
	private String passNumByHistory;
    /**
     * 当月累计pay卡审核通过记录数
     */
	@TableField("PASS_NUM_BY_MONTH")
	private String passNumByMonth;
    /**
     * 当日累计pay卡审核通过记录数
     */
	@TableField("PASS_NUM_BY_DAY")
	private String passNumByDay;
    /**
     * 代理商名称
     */
	@TableField("AGENT_NAME")
	private String agentName;
    /**
     * 代理商编号
     */
	@TableField("AGENT_ID")
	private String agentId;
    /**
     * 主键
     */
    @TableId("SN")
	private String sn;
    /**
     * 查询类型  是否统计下级代理商0:否   1:是
     */
	@TableField("QUERY_TYPE")
	private String queryType;


	public String getCountDate() {
		return countDate;
	}

	public void setCountDate(String countDate) {
		this.countDate = countDate;
	}

	public String getPassNumByHistory() {
		return passNumByHistory;
	}

	public void setPassNumByHistory(String passNumByHistory) {
		this.passNumByHistory = passNumByHistory;
	}

	public String getPassNumByMonth() {
		return passNumByMonth;
	}

	public void setPassNumByMonth(String passNumByMonth) {
		this.passNumByMonth = passNumByMonth;
	}

	public String getPassNumByDay() {
		return passNumByDay;
	}

	public void setPassNumByDay(String passNumByDay) {
		this.passNumByDay = passNumByDay;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	@Override
	public String toString() {
		return "TdCardVerifyByDay{" +
			", countDate=" + countDate +
			", passNumByHistory=" + passNumByHistory +
			", passNumByMonth=" + passNumByMonth +
			", passNumByDay=" + passNumByDay +
			", agentName=" + agentName +
			", agentId=" + agentId +
			", sn=" + sn +
			", queryType=" + queryType +
			"}";
	}
}
