package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 自定义返现规则生效表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_CASHBACK_ACTIVE")
public class YstCashbackActive extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备用字段4
     */
	@TableField("REVERSE4")
	private String reverse4;
    /**
     * 备用字段3
     */
	@TableField("REVERSE3")
	private String reverse3;
    /**
     * 备用字段2
     */
	@TableField("REVERSE2")
	private String reverse2;
    /**
     * 空或2为mpos，3为大pos
     */
	@TableField("REVERSE1")
	private String reverse1;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 操作人
     */
	@TableField("OPERAT_ID")
	private String operatId;
    /**
     * 状态00初始化，01押金已生效，02返现已生效
     */
	@TableField("STATUS")
	private String status;
    /**
     * 返现生效时间
     */
	@TableField("CASHBACK_ACT_TIME")
	private Date cashbackActTime;
    /**
     * 扣押金生效时间
     */
	@TableField("PLEDGE_ACT_TIME")
	private Date pledgeActTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 当前规则id
     */
	@TableField("CURRENT_CB_ID")
	private String currentCbId;
    /**
     * 前一次规则id
     */
	@TableField("PRE_CB_ID")
	private String preCbId;
    /**
     * 设置目标规则id
     */
	@TableField("TARGET_CB_ID")
	private String targetCbId;
    /**
     * 代理商ID
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 生效ID
     */
    @TableId("ACTIVE_ID")
	private String activeId;


	public String getReverse4() {
		return reverse4;
	}

	public void setReverse4(String reverse4) {
		this.reverse4 = reverse4;
	}

	public String getReverse3() {
		return reverse3;
	}

	public void setReverse3(String reverse3) {
		this.reverse3 = reverse3;
	}

	public String getReverse2() {
		return reverse2;
	}

	public void setReverse2(String reverse2) {
		this.reverse2 = reverse2;
	}

	public String getReverse1() {
		return reverse1;
	}

	public void setReverse1(String reverse1) {
		this.reverse1 = reverse1;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOperatId() {
		return operatId;
	}

	public void setOperatId(String operatId) {
		this.operatId = operatId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCashbackActTime() {
		return cashbackActTime;
	}

	public void setCashbackActTime(Date cashbackActTime) {
		this.cashbackActTime = cashbackActTime;
	}

	public Date getPledgeActTime() {
		return pledgeActTime;
	}

	public void setPledgeActTime(Date pledgeActTime) {
		this.pledgeActTime = pledgeActTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCurrentCbId() {
		return currentCbId;
	}

	public void setCurrentCbId(String currentCbId) {
		this.currentCbId = currentCbId;
	}

	public String getPreCbId() {
		return preCbId;
	}

	public void setPreCbId(String preCbId) {
		this.preCbId = preCbId;
	}

	public String getTargetCbId() {
		return targetCbId;
	}

	public void setTargetCbId(String targetCbId) {
		this.targetCbId = targetCbId;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getActiveId() {
		return activeId;
	}

	public void setActiveId(String activeId) {
		this.activeId = activeId;
	}

	@Override
	public String toString() {
		return "YstCashbackActive{" +
			", reverse4=" + reverse4 +
			", reverse3=" + reverse3 +
			", reverse2=" + reverse2 +
			", reverse1=" + reverse1 +
			", remark=" + remark +
			", operatId=" + operatId +
			", status=" + status +
			", cashbackActTime=" + cashbackActTime +
			", pledgeActTime=" + pledgeActTime +
			", createTime=" + createTime +
			", currentCbId=" + currentCbId +
			", preCbId=" + preCbId +
			", targetCbId=" + targetCbId +
			", agentMercId=" + agentMercId +
			", activeId=" + activeId +
			"}";
	}
}
