package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 代理商基本信息表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_AGENT_INFO")
public class YstAgentInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 代理商状态0：正常1：销户2：取消/删除3：待销户4：停用
     */
	@TableField("AGT_MERC_STS")
	private String agtMercSts;
    /**
     * 代理商性质（必填）:1 国营2 股份制3 集体 4 中外合资、合作5 外商独资6 私营合伙7 私营独资8 个体9 其他
     */
	@TableField("AGT_MERC_ATTR")
	private String agtMercAttr;
    /**
     * 税务登记号
     */
	@TableField("TAX_REG_NO")
	private String taxRegNo;
    /**
     * 法人证件号码
     */
	@TableField("CRP_ID_NO")
	private String crpIdNo;
    /**
     * 法人名称
     */
	@TableField("CRP_NM")
	private String crpNm;
    /**
     * 工商注册号
     */
	@TableField("REG_ID")
	private String regId;
    /**
     * 代理商email
     */
	@TableField("EMAIL")
	private String email;
    /**
     * 代理商联系电话
     */
	@TableField("MERC_HOT_LIN")
	private String mercHotLin;
    /**
     * 协议到期日
     */
	@TableField("EXP_DT")
	private String expDt;
    /**
     * 协议签订日
     */
	@TableField("EFF_DT")
	private String effDt;
    /**
     * 法人证件类型
     */
	@TableField("CRP_ID_TYP")
	private String crpIdTyp;
    /**
     * 市
     */
	@TableField("AGT_MERC_CITY")
	private String agtMercCity;
    /**
     * 代理商所在省
     */
	@TableField("AGT_MERC_PROV")
	private String agtMercProv;
    /**
     * 客户系统custid
     */
	@TableField("YSPAY_CUST_ID")
	private String yspayCustId;
    /**
     * 注册地址
     */
	@TableField("REG_ADDR")
	private String regAddr;
    /**
     * 代理商编号
     */
    @TableId("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 更新时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 资料提交唯一标识
     */
	@TableField("SUBMIT_ID")
	private String submitId;


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAgtMercSts() {
		return agtMercSts;
	}

	public void setAgtMercSts(String agtMercSts) {
		this.agtMercSts = agtMercSts;
	}

	public String getAgtMercAttr() {
		return agtMercAttr;
	}

	public void setAgtMercAttr(String agtMercAttr) {
		this.agtMercAttr = agtMercAttr;
	}

	public String getTaxRegNo() {
		return taxRegNo;
	}

	public void setTaxRegNo(String taxRegNo) {
		this.taxRegNo = taxRegNo;
	}

	public String getCrpIdNo() {
		return crpIdNo;
	}

	public void setCrpIdNo(String crpIdNo) {
		this.crpIdNo = crpIdNo;
	}

	public String getCrpNm() {
		return crpNm;
	}

	public void setCrpNm(String crpNm) {
		this.crpNm = crpNm;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMercHotLin() {
		return mercHotLin;
	}

	public void setMercHotLin(String mercHotLin) {
		this.mercHotLin = mercHotLin;
	}

	public String getExpDt() {
		return expDt;
	}

	public void setExpDt(String expDt) {
		this.expDt = expDt;
	}

	public String getEffDt() {
		return effDt;
	}

	public void setEffDt(String effDt) {
		this.effDt = effDt;
	}

	public String getCrpIdTyp() {
		return crpIdTyp;
	}

	public void setCrpIdTyp(String crpIdTyp) {
		this.crpIdTyp = crpIdTyp;
	}

	public String getAgtMercCity() {
		return agtMercCity;
	}

	public void setAgtMercCity(String agtMercCity) {
		this.agtMercCity = agtMercCity;
	}

	public String getAgtMercProv() {
		return agtMercProv;
	}

	public void setAgtMercProv(String agtMercProv) {
		this.agtMercProv = agtMercProv;
	}

	public String getYspayCustId() {
		return yspayCustId;
	}

	public void setYspayCustId(String yspayCustId) {
		this.yspayCustId = yspayCustId;
	}

	public String getRegAddr() {
		return regAddr;
	}

	public void setRegAddr(String regAddr) {
		this.regAddr = regAddr;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getSubmitId() {
		return submitId;
	}

	public void setSubmitId(String submitId) {
		this.submitId = submitId;
	}

	@Override
	public String toString() {
		return "YstAgentInfo{" +
			", createTime=" + createTime +
			", remark=" + remark +
			", agtMercSts=" + agtMercSts +
			", agtMercAttr=" + agtMercAttr +
			", taxRegNo=" + taxRegNo +
			", crpIdNo=" + crpIdNo +
			", crpNm=" + crpNm +
			", regId=" + regId +
			", email=" + email +
			", mercHotLin=" + mercHotLin +
			", expDt=" + expDt +
			", effDt=" + effDt +
			", crpIdTyp=" + crpIdTyp +
			", agtMercCity=" + agtMercCity +
			", agtMercProv=" + agtMercProv +
			", yspayCustId=" + yspayCustId +
			", regAddr=" + regAddr +
			", agentMercId=" + agentMercId +
			", updateTime=" + updateTime +
			", submitId=" + submitId +
			"}";
	}
}
