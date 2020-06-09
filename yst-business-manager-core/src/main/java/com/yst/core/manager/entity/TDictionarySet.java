package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 表格列配置
 * </p>
 *
 * @author chenkai
 * @since 2018-07-28
 */
@TableName("T_DICTIONARY_SET")
public class TDictionarySet extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 数据类型date，string，number
     */
    @TableField("DATA_TYPE")
    private String dataType;
    
    /**
     * 查询类型like,in,
     */
    @TableField("QUERY_TYPE")
    private String queryType;
    
	/**
	 * sql格式,to_char
	 */
	@TableField("SQL_FORMAT")
	private String sqlFormat;
    /**
     * 更新设置
     */
	@TableField("UPDATED")
	private String updated;
    /**
     * 是否主键
     */
	@TableField("IS_PRIMARY")
	private String isPrimary;
    /**
     * bytter表英文字段
     */
	@TableField("BFS_CODE")
	private String bfsCode;
    /**
     * 查询条件标志[0,否，1是]
     */
	@TableField("IS_SEARCH")
	private String isSearch;
    /**
     * 是否可编辑 0,否 1,是
     */
	@TableField("IS_EDIT")
	private String isEdit;
    /**
     * 数据类型列表
     */
	@TableField("DATA_SOURCE")
	private String dataSource;
    /**
     * 排序标识
     */
	@TableField("SORT_SIGN")
	private Double sortSign;
    /**
     * 显示名称
     */
	@TableField("FIELD_NAME_SHOW")
	private String fieldNameShow;
    /**
     * 是否必录 0,否 1,是
     */
	@TableField("IS_NOT_NULL")
	private String isNotNull;
    /**
     * 是否显示 0,否 1,是
     */
	@TableField("IS_SHOW")
	private String isShow;
    /**
     * 是否列表显示 0,否 1,是
     */
	@TableField("IS_SHOW_LIST")
	private String isShowList;
    /**
     * 字段名称
     */
	@TableField("FIELD_NAME")
	private String fieldName;
    /**
     * 字段代码
     */
	@TableField("FIELD_CODE")
	private String fieldCode;
    /**
     * ERP查询编码（10：ERP查询接口编码）
     */
    @TableId("DATA_TYPE_CODE")
	private Long dataTypeCode;

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getSqlFormat() {
		return sqlFormat;
	}

	public void setSqlFormat(String sqlFormat) {
		this.sqlFormat = sqlFormat;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getBfsCode() {
		return bfsCode;
	}

	public void setBfsCode(String bfsCode) {
		this.bfsCode = bfsCode;
	}

	public String getIsSearch() {
		return isSearch;
	}

	public void setIsSearch(String isSearch) {
		this.isSearch = isSearch;
	}

	public String getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(String isEdit) {
		this.isEdit = isEdit;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Double getSortSign() {
		return sortSign;
	}

	public void setSortSign(Double sortSign) {
		this.sortSign = sortSign;
	}

	public String getFieldNameShow() {
		return fieldNameShow;
	}

	public void setFieldNameShow(String fieldNameShow) {
		this.fieldNameShow = fieldNameShow;
	}

	public String getIsNotNull() {
		return isNotNull;
	}

	public void setIsNotNull(String isNotNull) {
		this.isNotNull = isNotNull;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	public String getIsShowList() {
		return isShowList;
	}

	public void setIsShowList(String isShowList) {
		this.isShowList = isShowList;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldCode() {
		return fieldCode;
	}

	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public Long getDataTypeCode() {
		return dataTypeCode;
	}

	public void setDataTypeCode(Long dataTypeCode) {
		this.dataTypeCode = dataTypeCode;
	}

	@Override
	public String toString() {
		return "TDictionarySet [dataType=" + dataType + ", queryType=" + queryType + ", sqlFormat=" + sqlFormat
				+ ", updated=" + updated + ", isPrimary=" + isPrimary + ", bfsCode=" + bfsCode + ", isSearch="
				+ isSearch + ", isEdit=" + isEdit + ", dataSource=" + dataSource + ", sortSign=" + sortSign
				+ ", fieldNameShow=" + fieldNameShow + ", isNotNull=" + isNotNull + ", isShow=" + isShow
				+ ", isShowList=" + isShowList + ", fieldName=" + fieldName + ", fieldCode=" + fieldCode
				+ ", dataTypeCode=" + dataTypeCode + "]";
	}

}
