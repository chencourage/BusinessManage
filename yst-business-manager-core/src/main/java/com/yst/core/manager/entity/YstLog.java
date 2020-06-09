package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 操作日志表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_LOG")
public class YstLog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 操作人名称
     */
	@TableField("OPERA_NAME")
	private String operaName;
    /**
     * 操作人ID
     */
	@TableField("OPERA_ID")
	private String operaId;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 操作后的值
     */
	@TableField("AFTER")
	private String after;
    /**
     * 操作前的值
     */
	@TableField("BEFORE")
	private String before;
    /**
     * 涉及数据表
     */
	@TableField("FUNC_TABLE")
	private String funcTable;
    /**
     * 功能操作类型
     */
	@TableField("FUNC_OP_TYPE")
	private String funcOpType;
    /**
     * 功能名称
     */
	@TableField("FUNC_NAME")
	private String funcName;
    /**
     * 功能编号
     */
	@TableField("FUNC_ID")
	private String funcId;
    /**
     * 主键
     */
    @TableId("LOG_ID")
	private String logId;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOperaName() {
		return operaName;
	}

	public void setOperaName(String operaName) {
		this.operaName = operaName;
	}

	public String getOperaId() {
		return operaId;
	}

	public void setOperaId(String operaId) {
		this.operaId = operaId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAfter() {
		return after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public String getBefore() {
		return before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public String getFuncTable() {
		return funcTable;
	}

	public void setFuncTable(String funcTable) {
		this.funcTable = funcTable;
	}

	public String getFuncOpType() {
		return funcOpType;
	}

	public void setFuncOpType(String funcOpType) {
		this.funcOpType = funcOpType;
	}

	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}

	public String getFuncId() {
		return funcId;
	}

	public void setFuncId(String funcId) {
		this.funcId = funcId;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	@Override
	public String toString() {
		return "YstLog{" +
			", remark=" + remark +
			", operaName=" + operaName +
			", operaId=" + operaId +
			", createTime=" + createTime +
			", after=" + after +
			", before=" + before +
			", funcTable=" + funcTable +
			", funcOpType=" + funcOpType +
			", funcName=" + funcName +
			", funcId=" + funcId +
			", logId=" + logId +
			"}";
	}
}
