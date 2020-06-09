package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * 非必要勿改
 * <p>
 * ERP查询菜单--ERP查询类型表
 * </p>
 *
 * @author chenkai
 * @since 2018-07-28
 */
@TableName("T_DICTIONARY_TYPE")
public class TDictionaryType extends BaseEntity {

    private static final long serialVersionUID = 1L;
    
    /**
     * 数据模板
     */
    @TableField("DB_TEMPLATE")
    private String dbTemplate;
    /**
     * 排序标识
     */
    @TableField("ORDER_FLAG")
    private String orderFlag;
    /**
     * 1有效；0无效
     */
	@TableField("STATUS")
	private String status;
    /**
     * 其他标志【1：是；0否】==补录
     */
	@TableField("OTHER_FLAG")
	private String otherFlag;
    /**
     * 附加条件
     */
	@TableField("CONDITION")
	private String condition;
    /**
     * 数据来源表名
     */
	@TableField("BFS_TABLENAME")
	private String bfsTablename;
    /**
     * 备注
     */
	@TableField("RMK")
	private String rmk;
    /**
     * 删除标志【1：是；0否】==删除
     */
	@TableField("DELETE_FLAG")
	private String deleteFlag;
    /**
     * 详细信息标志【1：是；0否】==查看
     */
	@TableField("SHOW_FLAG")
	private String showFlag;
    /**
     * 编辑标志【1：是；0否】==编辑
     */
	@TableField("EDIT_FLAG")
	private String editFlag;
    /**
     * ERP查询类型名称
     */
	@TableField("DATA_TYPE_NAME")
	private String dataTypeName;
    /**
     * ERP查询编码：如10:付款接口跟踪;
     */
    @TableId("DATA_TYPE_CODE")
	private Long dataTypeCode;


	public String getDbTemplate() {
		return dbTemplate;
	}

	public void setDbTemplate(String dbTemplate) {
		this.dbTemplate = dbTemplate;
	}

	public String getOrderFlag() {
		return orderFlag;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOtherFlag() {
		return otherFlag;
	}

	public void setOtherFlag(String otherFlag) {
		this.otherFlag = otherFlag;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getBfsTablename() {
		return bfsTablename;
	}

	public void setBfsTablename(String bfsTablename) {
		this.bfsTablename = bfsTablename;
	}

	public String getRmk() {
		return rmk;
	}

	public void setRmk(String rmk) {
		this.rmk = rmk;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getShowFlag() {
		return showFlag;
	}

	public void setShowFlag(String showFlag) {
		this.showFlag = showFlag;
	}

	public String getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(String editFlag) {
		this.editFlag = editFlag;
	}

	public String getDataTypeName() {
		return dataTypeName;
	}

	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}

	public Long getDataTypeCode() {
		return dataTypeCode;
	}

	public void setDataTypeCode(Long dataTypeCode) {
		this.dataTypeCode = dataTypeCode;
	}

	@Override
	public String toString() {
		return "TDictionaryType{" +
			", status=" + status +
			", otherFlag=" + otherFlag +
			", condition=" + condition +
			", bfsTablename=" + bfsTablename +
			", rmk=" + rmk +
			", deleteFlag=" + deleteFlag +
			", showFlag=" + showFlag +
			", editFlag=" + editFlag +
			", dataTypeName=" + dataTypeName +
			", dataTypeCode=" + dataTypeCode +
			"}";
	}
}
