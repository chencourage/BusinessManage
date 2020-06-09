package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 分润表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("REPORT_AGENT_DAY_TRADE")
public class ReportAgentDayTrade extends BaseEntity {

    private static final long serialVersionUID = 1L;

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
    /**
     * 是否统计下级代理
（1-是 0-否 2-pay卡总计分润  3：mpos总计分润     2/3总计分润=b0+c1   
0 我自己商户带来的分润   1：展示给上级，实际是我和我下级带给上级的分润   总计分润指：自己实际分润+下级带来的分润）
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
     * 交易日
     */
	@TableField("TRAN_DAY")
	private String tranDay;
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
     * 机构名
     */
	@TableField("ORG_NAME")
	private String orgName;
    /**
     * 机构号
     */
	@TableField("ORG_NO")
	private String orgNo;


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

	public String getTranDay() {
		return tranDay;
	}

	public void setTranDay(String tranDay) {
		this.tranDay = tranDay;
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

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	@Override
	public String toString() {
		return "ReportAgentDayTrade{" +
			", profitAmt3=" + profitAmt3 +
			", profitAmt2=" + profitAmt2 +
			", profitAmt1=" + profitAmt1 +
			", tjbz=" + tjbz +
			", tranAmt=" + tranAmt +
			", tranCnt=" + tranCnt +
			", tranDay=" + tranDay +
			", tranType=" + tranType +
			", agtMercNm=" + agtMercNm +
			", agtMercId=" + agtMercId +
			", id=" + id +
			", orgName=" + orgName +
			", orgNo=" + orgNo +
			"}";
	}
}
