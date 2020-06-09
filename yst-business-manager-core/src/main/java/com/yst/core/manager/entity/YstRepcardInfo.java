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
 * @since 2019-06-24
 */
@TableName("YST_REPCARD_INFO")
public class YstRepcardInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 终端号
     */
	@TableField("TRM_NO")
	private String trmNo;
    /**
     * 终端序列号（如果为pay卡时，此时为pay卡卡号）
     */
	@TableField("TRM_SN")
	private String trmSn;
    /**
     * 切终端状态 00成功 99失败 10待反切
     */
	@TableField("MPOS_STATE")
	private String mposState;
    /**
     * 批次号
     */
	@TableField("BATCH_ID")
	private String batchId;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 创建时间  
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 设备型号
     */
	@TableField("DEVICE_TYPE")
	private String deviceType;


	public String getTrmNo() {
		return trmNo;
	}

	public void setTrmNo(String trmNo) {
		this.trmNo = trmNo;
	}

	public String getTrmSn() {
		return trmSn;
	}

	public void setTrmSn(String trmSn) {
		this.trmSn = trmSn;
	}

	public String getMposState() {
		return mposState;
	}

	public void setMposState(String mposState) {
		this.mposState = mposState;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	@Override
	public String toString() {
		return "YstRepcardInfo{" +
			", trmNo=" + trmNo +
			", trmSn=" + trmSn +
			", mposState=" + mposState +
			", batchId=" + batchId +
			", id=" + id +
			", remark=" + remark +
			", createTime=" + createTime +
			", deviceType=" + deviceType +
			"}";
	}
}
