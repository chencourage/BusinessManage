package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 代理商系统登录用户(业务员)表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("AGENT_USER_INFO")
public class AgentUserInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户冻结时间
     */
	@TableField("PWD_FREEZE_TIME")
	private Date pwdFreezeTime;
    /**
     * 发送短信验证标识：01-不发送，02发送
     */
	@TableField("SEND_MSG_FLAG")
	private String sendMsgFlag;
    /**
     * 第一次密码输入错误的时间
     */
	@TableField("PWD_ERROR_TIME")
	private Date pwdErrorTime;
    /**
     * 密码错误次数，登录成功后置为0
     */
	@TableField("PWD_ERROR_NUM")
	private Double pwdErrorNum;
    /**
     * 最后一次修改密码的日期，日期为空时为第一次登录
     */
	@TableField("PWD_INVALID")
	private String pwdInvalid;
    /**
     * 发送邮件标识：01-发送成功，02发送失败
     */
	@TableField("SEND_EMAIL_FLAG")
	private String sendEmailFlag;
    /**
     * 创建人名称
     */
	@TableField("CREATOR_NAME")
	private String creatorName;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 创建人ID
     */
	@TableField("CREATOR_ID")
	private String creatorId;
    /**
     * 上次登录时间
     */
	@TableField("LAST_LOGINTIME")
	private Date lastLogintime;
    /**
     * 手机号码
     */
	@TableField("MOBILE")
	private String mobile;
    /**
     * 邮件地址
     */
	@TableField("EMAIL")
	private String email;
    /**
     * 用户状态 00正常 99冻结
     */
	@TableField("STATE")
	private String state;
    /**
     * USERCODE + LOGINPWD MD5加密
     */
	@TableField("LOGINPWD")
	private String loginpwd;
    /**
     * 所属代理编号
     */
	@TableField("AGT_NO")
	private String agtNo;
    /**
     * 用户名称
     */
	@TableField("USERNAME")
	private String username;
    /**
     * 登陆用户名
     */
    @TableId("USERCODE")
	private String usercode;


	public Date getPwdFreezeTime() {
		return pwdFreezeTime;
	}

	public void setPwdFreezeTime(Date pwdFreezeTime) {
		this.pwdFreezeTime = pwdFreezeTime;
	}

	public String getSendMsgFlag() {
		return sendMsgFlag;
	}

	public void setSendMsgFlag(String sendMsgFlag) {
		this.sendMsgFlag = sendMsgFlag;
	}

	public Date getPwdErrorTime() {
		return pwdErrorTime;
	}

	public void setPwdErrorTime(Date pwdErrorTime) {
		this.pwdErrorTime = pwdErrorTime;
	}

	public Double getPwdErrorNum() {
		return pwdErrorNum;
	}

	public void setPwdErrorNum(Double pwdErrorNum) {
		this.pwdErrorNum = pwdErrorNum;
	}

	public String getPwdInvalid() {
		return pwdInvalid;
	}

	public void setPwdInvalid(String pwdInvalid) {
		this.pwdInvalid = pwdInvalid;
	}

	public String getSendEmailFlag() {
		return sendEmailFlag;
	}

	public void setSendEmailFlag(String sendEmailFlag) {
		this.sendEmailFlag = sendEmailFlag;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Date getLastLogintime() {
		return lastLogintime;
	}

	public void setLastLogintime(Date lastLogintime) {
		this.lastLogintime = lastLogintime;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLoginpwd() {
		return loginpwd;
	}

	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}

	public String getAgtNo() {
		return agtNo;
	}

	public void setAgtNo(String agtNo) {
		this.agtNo = agtNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	@Override
	public String toString() {
		return "AgentUserInfo{" +
			", pwdFreezeTime=" + pwdFreezeTime +
			", sendMsgFlag=" + sendMsgFlag +
			", pwdErrorTime=" + pwdErrorTime +
			", pwdErrorNum=" + pwdErrorNum +
			", pwdInvalid=" + pwdInvalid +
			", sendEmailFlag=" + sendEmailFlag +
			", creatorName=" + creatorName +
			", createTime=" + createTime +
			", creatorId=" + creatorId +
			", lastLogintime=" + lastLogintime +
			", mobile=" + mobile +
			", email=" + email +
			", state=" + state +
			", loginpwd=" + loginpwd +
			", agtNo=" + agtNo +
			", username=" + username +
			", usercode=" + usercode +
			"}";
	}
}
