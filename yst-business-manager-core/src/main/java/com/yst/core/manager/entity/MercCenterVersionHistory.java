package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;
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
@TableName("MERC_CENTER_VERSION_HISTORY")
public class MercCenterVersionHistory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 状态  00：启用  99：禁用
     */
	@TableField("STATE")
	private String state;
    /**
     * 类型  11：蓝机版本更新信息  22：黑机版本信息更新 33：蓝机弹框   44：黑机弹框
     */
	@TableField("TYPE")
	private String type;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;
    /**
     * 创建人
     */
	@TableField("CREATOR")
	private String creator;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 版本时间
     */
	@TableField("VERSION_DATE")
	private String versionDate;
    /**
     * 具体内容
     */
	@TableField("CONTENT")
	private String content;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 简短标题
     */
	@TableField("TITLE")
	private String title;
    /**
     * 版本
     */
	@TableField("VERSION")
	private String version;


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getVersionDate() {
		return versionDate;
	}

	public void setVersionDate(String versionDate) {
		this.versionDate = versionDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "MercCenterVersionHistory{" +
			", state=" + state +
			", type=" + type +
			", id=" + id +
			", creator=" + creator +
			", createTime=" + createTime +
			", versionDate=" + versionDate +
			", content=" + content +
			", updateTime=" + updateTime +
			", title=" + title +
			", version=" + version +
			"}";
	}
}
