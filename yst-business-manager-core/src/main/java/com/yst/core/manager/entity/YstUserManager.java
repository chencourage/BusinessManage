package com.yst.core.manager.entity;

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
@TableName("YST_USER_MANAGER")
public class YstUserManager extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备用字段
     */
	@TableField("ITEM4")
	private String item4;
    /**
     * 备用字段
     */
	@TableField("ITEM3")
	private String item3;
    /**
     * 备用字段
     */
	@TableField("ITEM2")
	private String item2;
    /**
     * 备用字段
     */
	@TableField("ITEM1")
	private String item1;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 授权ip，以'|'分隔，支持*通配符
     */
	@TableField("IPS")
	private String ips;
    /**
     * 授权商户号，以'|'分隔
     */
	@TableField("MERC_IDS")
	private String mercIds;
    /**
     * 是否生效  00 生效 99失效
     */
	@TableField("ENABLE")
	private String enable;
    /**
     * 密码
     */
	@TableField("PASSWORD")
	private String password;
    /**
     * 用户号
     */
    @TableId("USER_CODE")
	private String userCode;


	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIps() {
		return ips;
	}

	public void setIps(String ips) {
		this.ips = ips;
	}

	public String getMercIds() {
		return mercIds;
	}

	public void setMercIds(String mercIds) {
		this.mercIds = mercIds;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Override
	public String toString() {
		return "YstUserManager{" +
			", item4=" + item4 +
			", item3=" + item3 +
			", item2=" + item2 +
			", item1=" + item1 +
			", remark=" + remark +
			", ips=" + ips +
			", mercIds=" + mercIds +
			", enable=" + enable +
			", password=" + password +
			", userCode=" + userCode +
			"}";
	}
}
