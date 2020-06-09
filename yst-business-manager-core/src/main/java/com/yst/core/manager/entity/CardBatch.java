package com.yst.core.manager.entity;

import java.util.Date;
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
@TableName("CARD_BATCH")
public class CardBatch extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 代理商号
     */
	@TableField("AGENT_MERCID")
	private String agentMercid;
    /**
     * 操作时间
     */
	@TableField("OPERATE_TIME")
	private Date operateTime;
    /**
     * 操作员
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 商户数量
     */
	@TableField("MERC_NUM")
	private String mercNum;
    /**
     * 批次号
     */
    @TableId("BATCH_ID")
	private String batchId;
    /**
     * 审核操作员
     */
	@TableField("AUDIT_OPPERATOR")
	private String auditOpperator;
    /**
     * 审核时间
     */
	@TableField("AUDIT_TIME")
	private Date auditTime;
    /**
     * 二维码类型 01-银联聚合码   00-通用二维码
     */
	@TableField("QRCODE_TYPE")
	private String qrcodeType;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 状态00-成功，10待审核，99拒绝,20制卡中，50部分成功
     */
	@TableField("STATE")
	private String state;
    /**
     * 机构代码
     */
	@TableField("ORGNO")
	private String orgno;
    /**
     * 代理名称
     */
	@TableField("AGENTMERC_NAME")
	private String agentmercName;


	public String getAgentMercid() {
		return agentMercid;
	}

	public void setAgentMercid(String agentMercid) {
		this.agentMercid = agentMercid;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getMercNum() {
		return mercNum;
	}

	public void setMercNum(String mercNum) {
		this.mercNum = mercNum;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getAuditOpperator() {
		return auditOpperator;
	}

	public void setAuditOpperator(String auditOpperator) {
		this.auditOpperator = auditOpperator;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getQrcodeType() {
		return qrcodeType;
	}

	public void setQrcodeType(String qrcodeType) {
		this.qrcodeType = qrcodeType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOrgno() {
		return orgno;
	}

	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}

	public String getAgentmercName() {
		return agentmercName;
	}

	public void setAgentmercName(String agentmercName) {
		this.agentmercName = agentmercName;
	}

	@Override
	public String toString() {
		return "CardBatch{" +
			", agentMercid=" + agentMercid +
			", operateTime=" + operateTime +
			", operator=" + operator +
			", mercNum=" + mercNum +
			", batchId=" + batchId +
			", auditOpperator=" + auditOpperator +
			", auditTime=" + auditTime +
			", qrcodeType=" + qrcodeType +
			", remark=" + remark +
			", state=" + state +
			", orgno=" + orgno +
			", agentmercName=" + agentmercName +
			"}";
	}
}
