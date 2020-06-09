package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 下载任务列表
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_DOWNLOAD_TASK")
public class YstDownloadTask extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备注（可用于填写失败原因）
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 更新时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 任务结束时间
     */
	@TableField("TASK_END_TIME")
	private Date taskEndTime;
    /**
     * 任务开始时间
     */
	@TableField("TASK_START_TIME")
	private Date taskStartTime;
    /**
     * 文件路径
     */
	@TableField("FILE_PATH")
	private String filePath;
    /**
     * 文件大小（字节）
     */
	@TableField("FILE_SIZE")
	private Double fileSize;
    /**
     * 文件名称
     */
	@TableField("FILE_NAME")
	private String fileName;
    /**
     * 数据状态：0-正常；1-删除
     */
	@TableField("STATUS")
	private String status;
    /**
     * 下载次数
     */
	@TableField("DOWNLOAD_TIMES")
	private Double downloadTimes;
    /**
     * 任务状态：0-进行中；1-完成；2-失败；3-排队等待
     */
	@TableField("TASK_STATUS")
	private String taskStatus;
    /**
     * 任务类型:0001-账户明细,0002-代理商返现
     */
	@TableField("TASK_TYPE")
	private String taskType;
    /**
     * 用户号
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getTaskEndTime() {
		return taskEndTime;
	}

	public void setTaskEndTime(Date taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	public Date getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Double getFileSize() {
		return fileSize;
	}

	public void setFileSize(Double fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getDownloadTimes() {
		return downloadTimes;
	}

	public void setDownloadTimes(Double downloadTimes) {
		this.downloadTimes = downloadTimes;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "YstDownloadTask{" +
			", remark=" + remark +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", taskEndTime=" + taskEndTime +
			", taskStartTime=" + taskStartTime +
			", filePath=" + filePath +
			", fileSize=" + fileSize +
			", fileName=" + fileName +
			", status=" + status +
			", downloadTimes=" + downloadTimes +
			", taskStatus=" + taskStatus +
			", taskType=" + taskType +
			", userCode=" + userCode +
			", id=" + id +
			"}";
	}
}
