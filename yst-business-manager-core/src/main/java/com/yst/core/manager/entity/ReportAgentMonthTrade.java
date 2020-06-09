package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("REPORT_AGENT_MONTH_TRADE")
public class ReportAgentMonthTrade extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 是否统计下级代理（1-是 0-否）
     */
	@TableField("TJBZ")
	private String tjbz;
    /**
     * 交易金额
     */
	@TableField("TRAN_AMT")
	private String tranAmt;
    /**
     * 交易笔数
     */
	@TableField("TRAN_CNT")
	private String tranCnt;
    /**
     * 交易月份
     */
	@TableField("TRAN_MONTH")
	private String tranMonth;
    /**
     * 交易类型 mpos消费:2090028 /2010020   pay卡消费：2018110    mpos提现：2017410  mpos通码消费:2018918  大pos刷卡消费：2018121 大pos扫码消费:2018211,mposVIP刷卡消费:2019415,mposVIP提现分润：2019416,mposVIP过期刷卡消费:2019417,mposVIP过期提现分润:2019418
     */
	@TableField("TRAN_TYPE")
	private String tranType;
    /**
     * 代理商名称
     */
	@TableField("AGT_MERC_NM")
	private String agtMercNm;
    /**
     * 代理商编号
     */
	@TableField("AGT_MERC_ID")
	private String agtMercId;
    @TableId("ID")
	private Long id;
    /**
     * 实际分润金额
     */
	@TableField("PROFIT_AMT3")
	private String profitAmt3;
    /**
     * 下级分润金额
     */
	@TableField("PROFIT_AMT2")
	private String profitAmt2;
    /**
     * 分润金额
     */
	@TableField("PROFIT_AMT1")
	private String profitAmt1;


	public String getTjbz() {
		return tjbz;
	}

	public void setTjbz(String tjbz) {
		this.tjbz = tjbz;
	}

	public String getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(String tranAmt) {
		this.tranAmt = tranAmt;
	}

	public String getTranCnt() {
		return tranCnt;
	}

	public void setTranCnt(String tranCnt) {
		this.tranCnt = tranCnt;
	}

	public String getTranMonth() {
		return tranMonth;
	}

	public void setTranMonth(String tranMonth) {
		this.tranMonth = tranMonth;
	}

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public String getAgtMercNm() {
		return agtMercNm;
	}

	public void setAgtMercNm(String agtMercNm) {
		this.agtMercNm = agtMercNm;
	}

	public String getAgtMercId() {
		return agtMercId;
	}

	public void setAgtMercId(String agtMercId) {
		this.agtMercId = agtMercId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfitAmt3() {
		return profitAmt3;
	}

	public void setProfitAmt3(String profitAmt3) {
		this.profitAmt3 = profitAmt3;
	}

	public String getProfitAmt2() {
		return profitAmt2;
	}

	public void setProfitAmt2(String profitAmt2) {
		this.profitAmt2 = profitAmt2;
	}

	public String getProfitAmt1() {
		return profitAmt1;
	}

	public void setProfitAmt1(String profitAmt1) {
		this.profitAmt1 = profitAmt1;
	}

	@Override
	public String toString() {
		return "ReportAgentMonthTrade{" +
			", tjbz=" + tjbz +
			", tranAmt=" + tranAmt +
			", tranCnt=" + tranCnt +
			", tranMonth=" + tranMonth +
			", tranType=" + tranType +
			", agtMercNm=" + agtMercNm +
			", agtMercId=" + agtMercId +
			", id=" + id +
			", profitAmt3=" + profitAmt3 +
			", profitAmt2=" + profitAmt2 +
			", profitAmt1=" + profitAmt1 +
			"}";
	}
}
