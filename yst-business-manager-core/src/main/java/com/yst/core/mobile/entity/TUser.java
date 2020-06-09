package com.yst.core.mobile.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 用户级别表
 * </p>
 *
 * @author ${author}
 * @since 2018-07-17
 */
@TableName("T_USER")
public class TUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备注操作原因
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 操作人
     */
	@TableField("UPDATE_USER")
	private String updateUser;
    /**
     * 是否开户过（配置体验额度），1-表示开过户，0-表示未开过户
     */
	@TableField("IS_OPEN_ACCOUNT")
	private String isOpenAccount;
    /**
     * 用户等级（level1或者level2），默认是level1
     */
	@TableField("USERLEVEL")
	private String userlevel;
    /**
     * 是否受积分控制 1：受积分控制  0：不受积分控制。
     */
	@TableField("ISCONTROL")
	private String iscontrol;
    /**
     * 等级更新标志
     */
	@TableField("LEVELUPDATE")
	private String levelupdate;
    /**
     * 活跃等级（1-当天有登录，2-最近三天有登录，3-最近7天有登录，4-最近7天无登录）
     */
	@TableField("ACTIVELEVEL")
	private String activelevel;
    /**
     * 个性化配置标志
     */
	@TableField("CUSTOMFLAG")
	private String customflag;
    /**
     * 用户一天可冲正次数
     */
	@TableField("REVOKEDAY")
	private Long revokeday;
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 交罚月可查询次数
     */
	@TableField("JFMONTH")
	private Long jfmonth;
    /**
     * 交罚日可查询次数
     */
	@TableField("JFDAY")
	private Long jfday;
    /**
     * 允许登录的设备数
     */
	@TableField("ALLOWDEVICE")
	private Long allowdevice;
    /**
     * 用户总体状态（0-黑名单，1-正常，2-白名单）
     */
	@TableField("STATUS")
	private String status;
    /**
     * 级别
     */
	@TableField("GROUP_ID")
	private String groupId;
    /**
     * 用户号
     */
    @TableId("USERCODE")
	private String usercode;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getIsOpenAccount() {
		return isOpenAccount;
	}

	public void setIsOpenAccount(String isOpenAccount) {
		this.isOpenAccount = isOpenAccount;
	}

	public String getUserlevel() {
		return userlevel;
	}

	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}

	public String getIscontrol() {
		return iscontrol;
	}

	public void setIscontrol(String iscontrol) {
		this.iscontrol = iscontrol;
	}

	public String getLevelupdate() {
		return levelupdate;
	}

	public void setLevelupdate(String levelupdate) {
		this.levelupdate = levelupdate;
	}

	public String getActivelevel() {
		return activelevel;
	}

	public void setActivelevel(String activelevel) {
		this.activelevel = activelevel;
	}

	public String getCustomflag() {
		return customflag;
	}

	public void setCustomflag(String customflag) {
		this.customflag = customflag;
	}

	public Long getRevokeday() {
		return revokeday;
	}

	public void setRevokeday(Long revokeday) {
		this.revokeday = revokeday;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getJfmonth() {
		return jfmonth;
	}

	public void setJfmonth(Long jfmonth) {
		this.jfmonth = jfmonth;
	}

	public Long getJfday() {
		return jfday;
	}

	public void setJfday(Long jfday) {
		this.jfday = jfday;
	}

	public Long getAllowdevice() {
		return allowdevice;
	}

	public void setAllowdevice(Long allowdevice) {
		this.allowdevice = allowdevice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	@Override
	public String toString() {
		return "TUser{" +
			", remark=" + remark +
			", updateUser=" + updateUser +
			", isOpenAccount=" + isOpenAccount +
			", userlevel=" + userlevel +
			", iscontrol=" + iscontrol +
			", levelupdate=" + levelupdate +
			", activelevel=" + activelevel +
			", customflag=" + customflag +
			", revokeday=" + revokeday +
			", updateTime=" + updateTime +
			", jfmonth=" + jfmonth +
			", jfday=" + jfday +
			", allowdevice=" + allowdevice +
			", status=" + status +
			", groupId=" + groupId +
			", usercode=" + usercode +
			"}";
	}
}
