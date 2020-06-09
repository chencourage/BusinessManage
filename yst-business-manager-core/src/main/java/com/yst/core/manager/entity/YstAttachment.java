package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 附件表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_ATTACHMENT")
public class YstAttachment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 更新时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 用户类型：1-代理商，2-通码商户，3-POS商户，4-发票，5-库存订单（转账凭证）
     */
	@TableField("USER_TYPE")
	private String userType;
    /**
     * 用户号（代理商号、通码商户号、POS商户商户号、发票流水号、库存订单编号）
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * 附件路径
     */
	@TableField("ATTACH_PATH")
	private String attachPath;
    /**
     * 附件类型，拼音小写首字母（6位，不足补0）加2位数字（01-正面[默认]，02-反面，03-手持），例如：身份证正面照-szf00001
     */
	@TableField("ATTACH_TYPE")
	private String attachType;
    /**
     * 附件ID
     */
    @TableId("ATTACH_ID")
	private String attachId;


	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getAttachPath() {
		return attachPath;
	}

	public void setAttachPath(String attachPath) {
		this.attachPath = attachPath;
	}

	public String getAttachType() {
		return attachType;
	}

	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}

	public String getAttachId() {
		return attachId;
	}

	public void setAttachId(String attachId) {
		this.attachId = attachId;
	}

	@Override
	public String toString() {
		return "YstAttachment{" +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", userType=" + userType +
			", userCode=" + userCode +
			", attachPath=" + attachPath +
			", attachType=" + attachType +
			", attachId=" + attachId +
			"}";
	}
}
