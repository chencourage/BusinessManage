package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 分期套餐设置表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_INSTAL_PACKAGE")
public class YstInstalPackage extends BaseEntity {

    private static final long serialVersionUID = 1L;

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
     * 分期数
     */
	@TableField("INSTAL_NUM")
	private Double instalNum;
    /**
     * 首付百分比，0到100整数
     */
	@TableField("DOWN_PAYMENT")
	private Double downPayment;
    /**
     * 主键
     */
    @TableId("PACKAGE_ID")
	private String packageId;


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

	public Double getInstalNum() {
		return instalNum;
	}

	public void setInstalNum(Double instalNum) {
		this.instalNum = instalNum;
	}

	public Double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(Double downPayment) {
		this.downPayment = downPayment;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	@Override
	public String toString() {
		return "YstInstalPackage{" +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", instalNum=" + instalNum +
			", downPayment=" + downPayment +
			", packageId=" + packageId +
			"}";
	}
}
