package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 子码商户表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("SUBCODE_MERC")
public class SubcodeMerc extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 责任经理
     */
	@TableField("DUTY_MANAGER")
	private String dutyManager;
    /**
     * 后台操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 来源方 0手机app 1后台运营
     */
	@TableField("SOURCE")
	private String source;
    /**
     * 子码商户名
     */
	@TableField("SUB_MERC_NAME")
	private String subMercName;
    /**
     * 主码商户名
     */
	@TableField("MASTER_MERC_NAME")
	private String masterMercName;
    /**
     * 子码商户号
     */
	@TableField("SUB_MERCNO")
	private String subMercno;
    /**
     * 主码商户号
     */
	@TableField("MASTER_MERCNO")
	private String masterMercno;
    /**
     * 主键ID
     */
    @TableId("ID")
	private String id;
    /**
     * 用户号
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * 最后一次更新营业地址时间
     */
	@TableField("LAST_UPDATE_UNIONADDR_TIME")
	private Date lastUpdateUnionaddrTime;
    /**
     * 营业地址
     */
	@TableField("UNIONPAY_ADDR")
	private String unionpayAddr;
    /**
     * 纬度
     */
	@TableField("LATITUDE")
	private String latitude;
    /**
     * 经度
     */
	@TableField("LONGITUDE")
	private String longitude;


	public String getDutyManager() {
		return dutyManager;
	}

	public void setDutyManager(String dutyManager) {
		this.dutyManager = dutyManager;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSubMercName() {
		return subMercName;
	}

	public void setSubMercName(String subMercName) {
		this.subMercName = subMercName;
	}

	public String getMasterMercName() {
		return masterMercName;
	}

	public void setMasterMercName(String masterMercName) {
		this.masterMercName = masterMercName;
	}

	public String getSubMercno() {
		return subMercno;
	}

	public void setSubMercno(String subMercno) {
		this.subMercno = subMercno;
	}

	public String getMasterMercno() {
		return masterMercno;
	}

	public void setMasterMercno(String masterMercno) {
		this.masterMercno = masterMercno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public Date getLastUpdateUnionaddrTime() {
		return lastUpdateUnionaddrTime;
	}

	public void setLastUpdateUnionaddrTime(Date lastUpdateUnionaddrTime) {
		this.lastUpdateUnionaddrTime = lastUpdateUnionaddrTime;
	}

	public String getUnionpayAddr() {
		return unionpayAddr;
	}

	public void setUnionpayAddr(String unionpayAddr) {
		this.unionpayAddr = unionpayAddr;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "SubcodeMerc{" +
			", dutyManager=" + dutyManager +
			", operator=" + operator +
			", createTime=" + createTime +
			", source=" + source +
			", subMercName=" + subMercName +
			", masterMercName=" + masterMercName +
			", subMercno=" + subMercno +
			", masterMercno=" + masterMercno +
			", id=" + id +
			", userCode=" + userCode +
			", lastUpdateUnionaddrTime=" + lastUpdateUnionaddrTime +
			", unionpayAddr=" + unionpayAddr +
			", latitude=" + latitude +
			", longitude=" + longitude +
			"}";
	}
}
