package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 总行信息
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
public class Bank extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 银行别名
     */
	@TableField("BANK_ALIAS")
	private String bankAlias;
    /**
     * 银行名称
     */
	@TableField("BANK_NAME")
	private String bankName;
    /**
     * 银行编码
     */
    @TableId("ID")
	private String id;


	public String getBankAlias() {
		return bankAlias;
	}

	public void setBankAlias(String bankAlias) {
		this.bankAlias = bankAlias;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Bank{" +
			", bankAlias=" + bankAlias +
			", bankName=" + bankName +
			", id=" + id +
			"}";
	}
}
