package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * pay卡交易---日统计报表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("TD_CARD_TRADE_BY_DAY")
public class TdCardTradeByDay extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 统计日期
     */
	@TableField("COUNT_DATE")
	private String countDate;
    /**
     * 查询类型  是否统计下级代理商0:否   1:是
     */
	@TableField("QUERY_TYPE")
	private String queryType;
    /**
     * 当日交易总金额
     */
	@TableField("TRADE_TOTLE_AMOUNT")
	private String tradeTotleAmount;
    /**
     * 当日交易笔数
     */
	@TableField("TRADE_TIMES")
	private String tradeTimes;
    /**
     * 交易类型  00001支付宝 00002 微信 00003银盛通
     */
	@TableField("TRADE_TYPE")
	private String tradeType;
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


	public String getCountDate() {
		return countDate;
	}

	public void setCountDate(String countDate) {
		this.countDate = countDate;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getTradeTotleAmount() {
		return tradeTotleAmount;
	}

	public void setTradeTotleAmount(String tradeTotleAmount) {
		this.tradeTotleAmount = tradeTotleAmount;
	}

	public String getTradeTimes() {
		return tradeTimes;
	}

	public void setTradeTimes(String tradeTimes) {
		this.tradeTimes = tradeTimes;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
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

	@Override
	public String toString() {
		return "TdCardTradeByDay{" +
			", countDate=" + countDate +
			", queryType=" + queryType +
			", tradeTotleAmount=" + tradeTotleAmount +
			", tradeTimes=" + tradeTimes +
			", tradeType=" + tradeType +
			", agentName=" + agentName +
			", agentId=" + agentId +
			", sn=" + sn +
			"}";
	}
}
