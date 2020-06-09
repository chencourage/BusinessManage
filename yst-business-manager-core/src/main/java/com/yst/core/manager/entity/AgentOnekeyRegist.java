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
@TableName("AGENT_ONEKEY_REGIST")
public class AgentOnekeyRegist extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户冻结时间
     */
	@TableField("PWD_FREEZE_TIME")
	private Date pwdFreezeTime;
    /**
     * 密码错误次数，登录成功后置为0
     */
	@TableField("PWD_ERROR_NUM")
	private String pwdErrorNum;
    /**
     * 注册状态（00：预注册，10：已登录）
     */
	@TableField("STATE")
	private String state;
    /**
     * 注册时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 注册密码
     */
	@TableField("REGIST_PWD")
	private String registPwd;
    /**
     * 注册手机号
     */
	@TableField("REGIST_PHONE")
	private String registPhone;
    /**
     * 主键ID
     */
    @TableId("PRI_ID")
	private String priId;
    /**
     * 代理商编号
     */
	@TableField("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 备用字段4
     */
	@TableField("REMARK4")
	private String remark4;
    /**
     * 备用字段3
     */
	@TableField("REMARK3")
	private String remark3;
    /**
     * 推荐人
     */
	@TableField("REMARK2")
	private String remark2;
    /**
     * 登录状态（99：冻结）
     */
	@TableField("REMARK1")
	private String remark1;
    /**
     * 上次登录时间
     */
	@TableField("LAST_LOGINTIME")
	private Date lastLogintime;
    /**
     * 最后一次修改密码的日期，日期为空时为第一次登录
     */
	@TableField("PWD_INVALID")
	private Date pwdInvalid;
    /**
     * 第一次密码输入错误的时间
     */
	@TableField("PWD_ERROR_TIME")
	private Date pwdErrorTime;


	public Date getPwdFreezeTime() {
		return pwdFreezeTime;
	}

	public void setPwdFreezeTime(Date pwdFreezeTime) {
		this.pwdFreezeTime = pwdFreezeTime;
	}

	public String getPwdErrorNum() {
		return pwdErrorNum;
	}

	public void setPwdErrorNum(String pwdErrorNum) {
		this.pwdErrorNum = pwdErrorNum;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRegistPwd() {
		return registPwd;
	}

	public void setRegistPwd(String registPwd) {
		this.registPwd = registPwd;
	}

	public String getRegistPhone() {
		return registPhone;
	}

	public void setRegistPhone(String registPhone) {
		this.registPhone = registPhone;
	}

	public String getPriId() {
		return priId;
	}

	public void setPriId(String priId) {
		this.priId = priId;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public String getRemark4() {
		return remark4;
	}

	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
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

	public Date getLastLogintime() {
		return lastLogintime;
	}

	public void setLastLogintime(Date lastLogintime) {
		this.lastLogintime = lastLogintime;
	}

	public Date getPwdInvalid() {
		return pwdInvalid;
	}

	public void setPwdInvalid(Date pwdInvalid) {
		this.pwdInvalid = pwdInvalid;
	}

	public Date getPwdErrorTime() {
		return pwdErrorTime;
	}

	public void setPwdErrorTime(Date pwdErrorTime) {
		this.pwdErrorTime = pwdErrorTime;
	}

	@Override
	public String toString() {
		return "AgentOnekeyRegist{" +
			", pwdFreezeTime=" + pwdFreezeTime +
			", pwdErrorNum=" + pwdErrorNum +
			", state=" + state +
			", createTime=" + createTime +
			", registPwd=" + registPwd +
			", registPhone=" + registPhone +
			", priId=" + priId +
			", agentMercId=" + agentMercId +
			", remark4=" + remark4 +
			", remark3=" + remark3 +
			", remark2=" + remark2 +
			", remark1=" + remark1 +
			", lastLogintime=" + lastLogintime +
			", pwdInvalid=" + pwdInvalid +
			", pwdErrorTime=" + pwdErrorTime +
			"}";
	}
}
