package com.yst.core.manager.entity;

import java.util.Date;
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
@TableName("ADD_AGENT_WHITE_LIST")
public class AddAgentWhiteList extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 操作人
     */
	@TableField("OPERATER")
	private String operater;
    /**
     * 状态（00：生效，99：失效）
     */
	@TableField("STATE")
	private String state;
    /**
     * 营业执照
     */
	@TableField("BUSINESS_LICENSE")
	private String businessLicense;
    /**
     * 身份证号
     */
	@TableField("ID_CARD")
	private String idCard;
    /**
     * 手机号
     */
	@TableField("PHONE_NUM")
	private String phoneNum;
    /**
     * 姓名
     */
	@TableField("NAME")
	private String name;
	@TableField("ID")
	private String id;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

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

	public String getOperater() {
		return operater;
	}

	public void setOperater(String operater) {
		this.operater = operater;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AddAgentWhiteList{" +
			", remark=" + remark +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", operater=" + operater +
			", state=" + state +
			", businessLicense=" + businessLicense +
			", idCard=" + idCard +
			", phoneNum=" + phoneNum +
			", name=" + name +
			", id=" + id +
			"}";
	}
}
