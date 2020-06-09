package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 按钮配置
 * </p>
 *
 * @author chenkai
 * @since 2018-07-28
 */
@TableName("T_DICTIONARY_ACTION")
public class TDictionaryAction extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("SUFFIX")
	private String suffix;
	@TableField("REGX")
	private String regx;
	@TableField("ISBATCH")
	private String isbatch;
	@TableField("EXECUTED")
	private String executed;
	@TableField("TYPE")
	private String type;
    /**
     * url; /dddd.do?xxx=ERP_DICTIONARY_TYPE( primary key)
     */
	@TableField("ACTION")
	private String action;
    /**
     * 日志，查看详细，补录凭证，等等
     */
	@TableField("TEXTNAME")
	private String textname;
    /**
     * code：100 ；关联ERP_DICTIONARY_TYPE（other_flag）,如【other_flag：100,101,102】
     */
	@TableField("CODE")
	private String code;
	@TableField("ID")
	private String id;


	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getRegx() {
		return regx;
	}

	public void setRegx(String regx) {
		this.regx = regx;
	}

	public String getIsbatch() {
		return isbatch;
	}

	public void setIsbatch(String isbatch) {
		this.isbatch = isbatch;
	}

	public String getExecuted() {
		return executed;
	}

	public void setExecuted(String executed) {
		this.executed = executed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getTextname() {
		return textname;
	}

	public void setTextname(String textname) {
		this.textname = textname;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TDictionaryAction{" +
			", suffix=" + suffix +
			", regx=" + regx +
			", isbatch=" + isbatch +
			", executed=" + executed +
			", type=" + type +
			", action=" + action +
			", textname=" + textname +
			", code=" + code +
			", id=" + id +
			"}";
	}
}
