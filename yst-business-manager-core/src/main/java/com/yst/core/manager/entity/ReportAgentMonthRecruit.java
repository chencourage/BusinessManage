package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 代理商月扩展报表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("REPORT_AGENT_MONTH_RECRUIT")
public class ReportAgentMonthRecruit extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 是否统计下级代理（1-是 0-否）
     */
	@TableField("TJBZ")
	private String tjbz;
    /**
     * 当月有效商户数（当月交易额大于10000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL11")
	private String recruitMonthCntLevel11;
    /**
     * 当月有效商户数（当月交易额9000-10000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL10")
	private String recruitMonthCntLevel10;
    /**
     * 当月有效商户数（当月交易额8000-9000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL9")
	private String recruitMonthCntLevel9;
    /**
     * 当月有效商户数（当月交易额7000-8000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL8")
	private String recruitMonthCntLevel8;
    /**
     * 当月有效商户数（当月交易额6000-7000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL7")
	private String recruitMonthCntLevel7;
    /**
     * 当月有效商户数（当月交易额5000-6000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL6")
	private String recruitMonthCntLevel6;
    /**
     * 当月有效商户数（当月交易额4000-5000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL5")
	private String recruitMonthCntLevel5;
    /**
     * 当月有效商户数（当月交易额3000-4000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL4")
	private String recruitMonthCntLevel4;
    /**
     * 当月有效商户数（当月交易额2000-3000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL3")
	private String recruitMonthCntLevel3;
    /**
     * 当月有效商户数（当月交易额1000-2000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL2")
	private String recruitMonthCntLevel2;
    /**
     * 当月有效商户数（当月交易额0-1000）
     */
	@TableField("RECRUIT_MONTH_CNT_LEVEL1")
	private String recruitMonthCntLevel1;
    /**
     * 累计开通商户数
     */
	@TableField("RECRUIT_YEAR_CNT")
	private String recruitYearCnt;
    /**
     * 当月开通商户数
     */
	@TableField("RECRUIT_MONTH_CNT")
	private String recruitMonthCnt;
    /**
     * 扩展月
     */
	@TableField("RECRUIT_MONTH")
	private String recruitMonth;
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
	private Double id;
    /**
     * 累计开通vip商户数
     */
	@TableField("RECRUIT_YEAR_CNT_VIP")
	private String recruitYearCntVip;
    /**
     * 当月开通vip商户数
     */
	@TableField("RECRUIT_MONTH_CNT_VIP")
	private String recruitMonthCntVip;
    /**
     * 累计开通大pos商户数
     */
	@TableField("RECRUIT_YEAR_CNT_BIGPOS")
	private String recruitYearCntBigpos;
    /**
     * 累计开通mpos商户数
     */
	@TableField("RECRUIT_YEAR_CNT_MPOS")
	private String recruitYearCntMpos;
    /**
     * 当月开通大pos商户数
     */
	@TableField("RECRUIT_MONTH_CNT_BIGPOS")
	private String recruitMonthCntBigpos;
    /**
     * 当月开通mpos商户数
     */
	@TableField("RECRUIT_MONTH_CNT_MPOS")
	private String recruitMonthCntMpos;


	public String getTjbz() {
		return tjbz;
	}

	public void setTjbz(String tjbz) {
		this.tjbz = tjbz;
	}

	public String getRecruitMonthCntLevel11() {
		return recruitMonthCntLevel11;
	}

	public void setRecruitMonthCntLevel11(String recruitMonthCntLevel11) {
		this.recruitMonthCntLevel11 = recruitMonthCntLevel11;
	}

	public String getRecruitMonthCntLevel10() {
		return recruitMonthCntLevel10;
	}

	public void setRecruitMonthCntLevel10(String recruitMonthCntLevel10) {
		this.recruitMonthCntLevel10 = recruitMonthCntLevel10;
	}

	public String getRecruitMonthCntLevel9() {
		return recruitMonthCntLevel9;
	}

	public void setRecruitMonthCntLevel9(String recruitMonthCntLevel9) {
		this.recruitMonthCntLevel9 = recruitMonthCntLevel9;
	}

	public String getRecruitMonthCntLevel8() {
		return recruitMonthCntLevel8;
	}

	public void setRecruitMonthCntLevel8(String recruitMonthCntLevel8) {
		this.recruitMonthCntLevel8 = recruitMonthCntLevel8;
	}

	public String getRecruitMonthCntLevel7() {
		return recruitMonthCntLevel7;
	}

	public void setRecruitMonthCntLevel7(String recruitMonthCntLevel7) {
		this.recruitMonthCntLevel7 = recruitMonthCntLevel7;
	}

	public String getRecruitMonthCntLevel6() {
		return recruitMonthCntLevel6;
	}

	public void setRecruitMonthCntLevel6(String recruitMonthCntLevel6) {
		this.recruitMonthCntLevel6 = recruitMonthCntLevel6;
	}

	public String getRecruitMonthCntLevel5() {
		return recruitMonthCntLevel5;
	}

	public void setRecruitMonthCntLevel5(String recruitMonthCntLevel5) {
		this.recruitMonthCntLevel5 = recruitMonthCntLevel5;
	}

	public String getRecruitMonthCntLevel4() {
		return recruitMonthCntLevel4;
	}

	public void setRecruitMonthCntLevel4(String recruitMonthCntLevel4) {
		this.recruitMonthCntLevel4 = recruitMonthCntLevel4;
	}

	public String getRecruitMonthCntLevel3() {
		return recruitMonthCntLevel3;
	}

	public void setRecruitMonthCntLevel3(String recruitMonthCntLevel3) {
		this.recruitMonthCntLevel3 = recruitMonthCntLevel3;
	}

	public String getRecruitMonthCntLevel2() {
		return recruitMonthCntLevel2;
	}

	public void setRecruitMonthCntLevel2(String recruitMonthCntLevel2) {
		this.recruitMonthCntLevel2 = recruitMonthCntLevel2;
	}

	public String getRecruitMonthCntLevel1() {
		return recruitMonthCntLevel1;
	}

	public void setRecruitMonthCntLevel1(String recruitMonthCntLevel1) {
		this.recruitMonthCntLevel1 = recruitMonthCntLevel1;
	}

	public String getRecruitYearCnt() {
		return recruitYearCnt;
	}

	public void setRecruitYearCnt(String recruitYearCnt) {
		this.recruitYearCnt = recruitYearCnt;
	}

	public String getRecruitMonthCnt() {
		return recruitMonthCnt;
	}

	public void setRecruitMonthCnt(String recruitMonthCnt) {
		this.recruitMonthCnt = recruitMonthCnt;
	}

	public String getRecruitMonth() {
		return recruitMonth;
	}

	public void setRecruitMonth(String recruitMonth) {
		this.recruitMonth = recruitMonth;
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

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getRecruitYearCntVip() {
		return recruitYearCntVip;
	}

	public void setRecruitYearCntVip(String recruitYearCntVip) {
		this.recruitYearCntVip = recruitYearCntVip;
	}

	public String getRecruitMonthCntVip() {
		return recruitMonthCntVip;
	}

	public void setRecruitMonthCntVip(String recruitMonthCntVip) {
		this.recruitMonthCntVip = recruitMonthCntVip;
	}

	public String getRecruitYearCntBigpos() {
		return recruitYearCntBigpos;
	}

	public void setRecruitYearCntBigpos(String recruitYearCntBigpos) {
		this.recruitYearCntBigpos = recruitYearCntBigpos;
	}

	public String getRecruitYearCntMpos() {
		return recruitYearCntMpos;
	}

	public void setRecruitYearCntMpos(String recruitYearCntMpos) {
		this.recruitYearCntMpos = recruitYearCntMpos;
	}

	public String getRecruitMonthCntBigpos() {
		return recruitMonthCntBigpos;
	}

	public void setRecruitMonthCntBigpos(String recruitMonthCntBigpos) {
		this.recruitMonthCntBigpos = recruitMonthCntBigpos;
	}

	public String getRecruitMonthCntMpos() {
		return recruitMonthCntMpos;
	}

	public void setRecruitMonthCntMpos(String recruitMonthCntMpos) {
		this.recruitMonthCntMpos = recruitMonthCntMpos;
	}

	@Override
	public String toString() {
		return "ReportAgentMonthRecruit{" +
			", tjbz=" + tjbz +
			", recruitMonthCntLevel11=" + recruitMonthCntLevel11 +
			", recruitMonthCntLevel10=" + recruitMonthCntLevel10 +
			", recruitMonthCntLevel9=" + recruitMonthCntLevel9 +
			", recruitMonthCntLevel8=" + recruitMonthCntLevel8 +
			", recruitMonthCntLevel7=" + recruitMonthCntLevel7 +
			", recruitMonthCntLevel6=" + recruitMonthCntLevel6 +
			", recruitMonthCntLevel5=" + recruitMonthCntLevel5 +
			", recruitMonthCntLevel4=" + recruitMonthCntLevel4 +
			", recruitMonthCntLevel3=" + recruitMonthCntLevel3 +
			", recruitMonthCntLevel2=" + recruitMonthCntLevel2 +
			", recruitMonthCntLevel1=" + recruitMonthCntLevel1 +
			", recruitYearCnt=" + recruitYearCnt +
			", recruitMonthCnt=" + recruitMonthCnt +
			", recruitMonth=" + recruitMonth +
			", agtMercNm=" + agtMercNm +
			", agtMercId=" + agtMercId +
			", id=" + id +
			", recruitYearCntVip=" + recruitYearCntVip +
			", recruitMonthCntVip=" + recruitMonthCntVip +
			", recruitYearCntBigpos=" + recruitYearCntBigpos +
			", recruitYearCntMpos=" + recruitYearCntMpos +
			", recruitMonthCntBigpos=" + recruitMonthCntBigpos +
			", recruitMonthCntMpos=" + recruitMonthCntMpos +
			"}";
	}
}
