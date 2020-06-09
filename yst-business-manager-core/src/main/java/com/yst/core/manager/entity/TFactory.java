package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 工厂表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("T_FACTORY")
public class TFactory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 工厂名称
     */
	@TableField("F_FACTORY_NAME")
	private String fFactoryName;
    /**
     * 工厂编号
     */
	@TableField("F_FACTORY_NO")
	private String fFactoryNo;
    /**
     * 机器型号
     */
    @TableId("F_DEVICE_MODEL")
	private String fDeviceModel;
    /**
     * pos机器类型 0：mpos 1：大pos
     */
	@TableField("F_POS_TYPE")
	private String fPosType;
    /**
     * 优先级
     */
	@TableField("F_PRIORITY")
	private String fPriority;
    /**
     * 型号状态 0正常 1关闭
     */
	@TableField("F_STATUS")
	private String fStatus;
    /**
     * 型号编号
     */
	@TableField("F_DEVICE_NO")
	private String fDeviceNo;


	public String getfFactoryName() {
		return fFactoryName;
	}

	public void setfFactoryName(String fFactoryName) {
		this.fFactoryName = fFactoryName;
	}

	public String getfFactoryNo() {
		return fFactoryNo;
	}

	public void setfFactoryNo(String fFactoryNo) {
		this.fFactoryNo = fFactoryNo;
	}

	public String getfDeviceModel() {
		return fDeviceModel;
	}

	public void setfDeviceModel(String fDeviceModel) {
		this.fDeviceModel = fDeviceModel;
	}

	public String getfPosType() {
		return fPosType;
	}

	public void setfPosType(String fPosType) {
		this.fPosType = fPosType;
	}

	public String getfPriority() {
		return fPriority;
	}

	public void setfPriority(String fPriority) {
		this.fPriority = fPriority;
	}

	public String getfStatus() {
		return fStatus;
	}

	public void setfStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public String getfDeviceNo() {
		return fDeviceNo;
	}

	public void setfDeviceNo(String fDeviceNo) {
		this.fDeviceNo = fDeviceNo;
	}

	@Override
	public String toString() {
		return "TFactory{" +
			", fFactoryName=" + fFactoryName +
			", fFactoryNo=" + fFactoryNo +
			", fDeviceModel=" + fDeviceModel +
			", fPosType=" + fPosType +
			", fPriority=" + fPriority +
			", fStatus=" + fStatus +
			", fDeviceNo=" + fDeviceNo +
			"}";
	}
}
