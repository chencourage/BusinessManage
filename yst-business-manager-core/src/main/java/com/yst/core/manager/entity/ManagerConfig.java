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
 * @since 2019-06-24
 */
@TableName("MANAGER_CONFIG")
public class ManagerConfig extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("VERSION")
	private String version;
	@TableField("VALUE")
	private String value;
	@TableField("KEY")
	private String key;
    @TableId("ID")
	private Double id;
	@TableField("DESCRIBE")
	private String describe;


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Override
	public String toString() {
		return "ManagerConfig{" +
			", version=" + version +
			", value=" + value +
			", key=" + key +
			", id=" + id +
			", describe=" + describe +
			"}";
	}
}
