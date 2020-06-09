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
 * @since 2018-07-28
 */
@TableName("T_DATA_TYPE")
public class TDataType extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 条件
     */
	@TableField("CONDITION")
	private String condition;
    /**
     * 名称字段
     */
	@TableField("NAME_FIELD")
	private String nameField;
    /**
     * KEY字段
     */
	@TableField("ID_FIELD")
	private String idField;
    /**
     * 表名
     */
	@TableField("TABLE_NAME")
	private String tableName;
    /**
     * 数据类型名称
     */
	@TableField("DATA_TYPE_NAME")
	private String dataTypeName;
    /**
     * 数据类型编码
     */
	@TableField("DATA_TYPE_CODE")
	private String dataTypeCode;
    /**
     * 主键
     */
    @TableId("DATA_TYPE_ID")
	private Double dataTypeId;


	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getNameField() {
		return nameField;
	}

	public void setNameField(String nameField) {
		this.nameField = nameField;
	}

	public String getIdField() {
		return idField;
	}

	public void setIdField(String idField) {
		this.idField = idField;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDataTypeName() {
		return dataTypeName;
	}

	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}

	public String getDataTypeCode() {
		return dataTypeCode;
	}

	public void setDataTypeCode(String dataTypeCode) {
		this.dataTypeCode = dataTypeCode;
	}

	public Double getDataTypeId() {
		return dataTypeId;
	}

	public void setDataTypeId(Double dataTypeId) {
		this.dataTypeId = dataTypeId;
	}

	@Override
	public String toString() {
		return "TDataType{" +
			", condition=" + condition +
			", nameField=" + nameField +
			", idField=" + idField +
			", tableName=" + tableName +
			", dataTypeName=" + dataTypeName +
			", dataTypeCode=" + dataTypeCode +
			", dataTypeId=" + dataTypeId +
			"}";
	}
}
