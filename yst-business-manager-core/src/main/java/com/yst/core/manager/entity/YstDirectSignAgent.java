package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 直签代理入网采购配置表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_DIRECT_SIGN_AGENT")
public class YstDirectSignAgent extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 归属代理商号（编辑规则的代理商）
     */
	@TableField("BELONG_AGT_ID")
	private String belongAgtId;
    /**
     * 大POS采购数量
     */
	@TableField("POS_QUANTITY")
	private Double posQuantity;
    /**
     * 封顶金额
     */
	@TableField("POS_T1_CAPS")
	private Double posT1Caps;
    /**
     * 大pos费率
     */
	@TableField("POS_T1_FEE")
	private Double posT1Fee;
    /**
     * 手机号码
     */
	@TableField("PHONE_NO")
	private String phoneNo;
    /**
     * 代理商入网时间
     */
	@TableField("ENTRY_TIME")
	private Date entryTime;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 代理商状态  0-注册成功 ,1-待入网,2-预注册
     */
	@TableField("AGENT_STATE")
	private String agentState;
    /**
     * mPOS提现结算价 (分)
     */
	@TableField("FEE")
	private Double fee;
    /**
     * mPOS结算费率
     */
	@TableField("RATE")
	private Double rate;
    /**
     * mPOS采购数量
     */
	@TableField("QUANTITY")
	private Double quantity;
    /**
     * 加密身份证
     */
	@TableField("DES_IDCARD")
	private String desIdcard;
    /**
     * 代理商名称
     */
	@TableField("AGENT_MERC_NAME")
	private String agentMercName;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 状态：01-初始化（待审核），00-审核通过，99-审核拒绝
     */
	@TableField("STATE")
	private String state;
    /**
     * mPOS会员过期提现结算价 (分)
     */
	@TableField("MEM_OVER_FEE")
	private Long memOverFee;
    /**
     * mPOS会员过期结算费率
     */
	@TableField("MEM_OVER_RATE")
	private Double memOverRate;
    /**
     * mPOS会员提现结算价 (分)
     */
	@TableField("MEM_FEE")
	private Long memFee;
    /**
     * mPOS会员结算费率
     */
	@TableField("MEM_RATE")
	private Double memRate;
    /**
     * 招商经理
     */
	@TableField("CLERK")
	private String clerk;


	public String getBelongAgtId() {
		return belongAgtId;
	}

	public void setBelongAgtId(String belongAgtId) {
		this.belongAgtId = belongAgtId;
	}

	public Double getPosQuantity() {
		return posQuantity;
	}

	public void setPosQuantity(Double posQuantity) {
		this.posQuantity = posQuantity;
	}

	public Double getPosT1Caps() {
		return posT1Caps;
	}

	public void setPosT1Caps(Double posT1Caps) {
		this.posT1Caps = posT1Caps;
	}

	public Double getPosT1Fee() {
		return posT1Fee;
	}

	public void setPosT1Fee(Double posT1Fee) {
		this.posT1Fee = posT1Fee;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getAgentState() {
		return agentState;
	}

	public void setAgentState(String agentState) {
		this.agentState = agentState;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getDesIdcard() {
		return desIdcard;
	}

	public void setDesIdcard(String desIdcard) {
		this.desIdcard = desIdcard;
	}

	public String getAgentMercName() {
		return agentMercName;
	}

	public void setAgentMercName(String agentMercName) {
		this.agentMercName = agentMercName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Long getMemOverFee() {
		return memOverFee;
	}

	public void setMemOverFee(Long memOverFee) {
		this.memOverFee = memOverFee;
	}

	public Double getMemOverRate() {
		return memOverRate;
	}

	public void setMemOverRate(Double memOverRate) {
		this.memOverRate = memOverRate;
	}

	public Long getMemFee() {
		return memFee;
	}

	public void setMemFee(Long memFee) {
		this.memFee = memFee;
	}

	public Double getMemRate() {
		return memRate;
	}

	public void setMemRate(Double memRate) {
		this.memRate = memRate;
	}

	public String getClerk() {
		return clerk;
	}

	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	@Override
	public String toString() {
		return "YstDirectSignAgent{" +
			", belongAgtId=" + belongAgtId +
			", posQuantity=" + posQuantity +
			", posT1Caps=" + posT1Caps +
			", posT1Fee=" + posT1Fee +
			", phoneNo=" + phoneNo +
			", entryTime=" + entryTime +
			", updateTime=" + updateTime +
			", operator=" + operator +
			", agentState=" + agentState +
			", fee=" + fee +
			", rate=" + rate +
			", quantity=" + quantity +
			", desIdcard=" + desIdcard +
			", agentMercName=" + agentMercName +
			", createTime=" + createTime +
			", id=" + id +
			", remark=" + remark +
			", state=" + state +
			", memOverFee=" + memOverFee +
			", memOverRate=" + memOverRate +
			", memFee=" + memFee +
			", memRate=" + memRate +
			", clerk=" + clerk +
			"}";
	}
}
