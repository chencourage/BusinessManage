package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 商户投诉
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_MERC_COMPLAIN")
public class YstMercComplain extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 商户名
     */
	@TableField("MERC_NM")
	private String mercNm;
    /**
     * 错误描述
     */
	@TableField("ERROR_DESC")
	private String errorDesc;
    /**
     * 导入状态 00-成功 01-失败
     */
	@TableField("IMPORT_STATE")
	private String importState;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 备注2
     */
	@TableField("REMARK2")
	private String remark2;
    /**
     * 备注1
     */
	@TableField("REMARK1")
	private String remark1;
    /**
     * 追加问题
     */
	@TableField("ADD_PROBLEM")
	private String addProblem;
    /**
     * 处理结果
     */
	@TableField("PRO_RESULT")
	private String proResult;
    /**
     * 问题描述
     */
	@TableField("PROBLEM_DESC")
	private String problemDesc;
    /**
     * 处理状态 00-待处理 01-已处理
     */
	@TableField("STATE")
	private String state;
    /**
     * 结束时间
     */
	@TableField("END_TIME")
	private Date endTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 代理商编号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 投诉标题
     */
	@TableField("TITLE")
	private String title;
    /**
     * 紧急程度 00-一般 01-紧急 02-特急
     */
	@TableField("EMERGENCY_LEVEL")
	private String emergencyLevel;
    /**
     * 联系电话
     */
	@TableField("LINKMAN_PHONE")
	private String linkmanPhone;
    /**
     * 联系人
     */
	@TableField("LINKMAN")
	private String linkman;
    /**
     * 商户编号
     */
	@TableField("MERC_ID")
	private String mercId;
    /**
     * 投诉单号
     */
	@TableField("ORDER_NO")
	private String orderNo;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;


	public String getMercNm() {
		return mercNm;
	}

	public void setMercNm(String mercNm) {
		this.mercNm = mercNm;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getImportState() {
		return importState;
	}

	public void setImportState(String importState) {
		this.importState = importState;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getAddProblem() {
		return addProblem;
	}

	public void setAddProblem(String addProblem) {
		this.addProblem = addProblem;
	}

	public String getProResult() {
		return proResult;
	}

	public void setProResult(String proResult) {
		this.proResult = proResult;
	}

	public String getProblemDesc() {
		return problemDesc;
	}

	public void setProblemDesc(String problemDesc) {
		this.problemDesc = problemDesc;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmergencyLevel() {
		return emergencyLevel;
	}

	public void setEmergencyLevel(String emergencyLevel) {
		this.emergencyLevel = emergencyLevel;
	}

	public String getLinkmanPhone() {
		return linkmanPhone;
	}

	public void setLinkmanPhone(String linkmanPhone) {
		this.linkmanPhone = linkmanPhone;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getMercId() {
		return mercId;
	}

	public void setMercId(String mercId) {
		this.mercId = mercId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "YstMercComplain{" +
			", mercNm=" + mercNm +
			", errorDesc=" + errorDesc +
			", importState=" + importState +
			", operator=" + operator +
			", remark2=" + remark2 +
			", remark1=" + remark1 +
			", addProblem=" + addProblem +
			", proResult=" + proResult +
			", problemDesc=" + problemDesc +
			", state=" + state +
			", endTime=" + endTime +
			", createTime=" + createTime +
			", agentMercId=" + agentMercId +
			", title=" + title +
			", emergencyLevel=" + emergencyLevel +
			", linkmanPhone=" + linkmanPhone +
			", linkman=" + linkman +
			", mercId=" + mercId +
			", orderNo=" + orderNo +
			", id=" + id +
			"}";
	}
}
