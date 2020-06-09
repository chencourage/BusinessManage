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
 * @since 2018-07-28
 */
@TableName("T_BASIC_DATA")
public class TBasicData extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备用
     */
	@TableField("RESERVE")
	private String reserve;
    /**
     * 操作人
     */
	@TableField("OP_CODE")
	private String opCode;
    /**
     * 修改时间
     */
	@TableField("MODIFY_TIME")
	private Date modifyTime;
    /**
     * 外部数据名称
     */
	@TableField("OUT_SYS_NAME")
	private String outSysName;
    /**
     * 外部数据编码
     */
	@TableField("OUT_SYS_VALUE")
	private String outSysValue;
    /**
     * 数据名称
     */
	@TableField("DATA_NAME")
	private String dataName;
    /**
     * 数据编码
     */
	@TableField("DATA_VALUE")
	private String dataValue;
    /**
     * 数据类型名称
     */
	@TableField("DATA_TYPE_MEAN")
	private String dataTypeMean;
    /**
     * 数据类型编码
     */
	@TableField("DATA_TYPE")
	private String dataType;
    /**
     * 主键
     */
    @TableId("BASIC_DATA_ID")
	private Double basicDataId;


	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getOpCode() {
		return opCode;
	}

	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOutSysName() {
		return outSysName;
	}

	public void setOutSysName(String outSysName) {
		this.outSysName = outSysName;
	}

	public String getOutSysValue() {
		return outSysValue;
	}

	public void setOutSysValue(String outSysValue) {
		this.outSysValue = outSysValue;
	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getDataValue() {
		return dataValue;
	}

	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

	public String getDataTypeMean() {
		return dataTypeMean;
	}

	public void setDataTypeMean(String dataTypeMean) {
		this.dataTypeMean = dataTypeMean;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Double getBasicDataId() {
		return basicDataId;
	}

	public void setBasicDataId(Double basicDataId) {
		this.basicDataId = basicDataId;
	}

	@Override
	public String toString() {
		return "TBasicData{" +
			", reserve=" + reserve +
			", opCode=" + opCode +
			", modifyTime=" + modifyTime +
			", outSysName=" + outSysName +
			", outSysValue=" + outSysValue +
			", dataName=" + dataName +
			", dataValue=" + dataValue +
			", dataTypeMean=" + dataTypeMean +
			", dataType=" + dataType +
			", basicDataId=" + basicDataId +
			"}";
	}
}
