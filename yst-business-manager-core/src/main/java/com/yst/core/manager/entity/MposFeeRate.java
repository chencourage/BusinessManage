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
@TableName("MPOS_FEE_RATE")
public class MposFeeRate extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 闪付费率
     */
	@TableField("QUICK_PASS_FEE")
	private Double quickPassFee;
    /**
     * 空-结算价，1-mPOS签约价，2-大POS签约价，3-mPOS特殊签约价（运营可选），4-mpos商户会员签约费率，5-mpos商户会员过期签约费率
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
     * 封顶金额(0或空代表不封頂,单位为分)
     */
	@TableField("FEE_TOP")
	private Double feeTop;
    /**
     * 保底
     */
	@TableField("FEE_BOTTOM")
	private Double feeBottom;
    /**
     * 提现结算价，签约价单位为元，结算价单位为分
     */
	@TableField("FEE")
	private Double fee;
    /**
     * 费率
     */
	@TableField("RATE")
	private Double rate;
    /**
     * 费率ID
     */
    @TableId("ID")
	private String id;


	public Double getQuickPassFee() {
		return quickPassFee;
	}

	public void setQuickPassFee(Double quickPassFee) {
		this.quickPassFee = quickPassFee;
	}

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

	public Double getFeeTop() {
		return feeTop;
	}

	public void setFeeTop(Double feeTop) {
		this.feeTop = feeTop;
	}

	public Double getFeeBottom() {
		return feeBottom;
	}

	public void setFeeBottom(Double feeBottom) {
		this.feeBottom = feeBottom;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "MposFeeRate{" +
			", quickPassFee=" + quickPassFee +
			", remark=" + remark +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", feeTop=" + feeTop +
			", feeBottom=" + feeBottom +
			", fee=" + fee +
			", rate=" + rate +
			", id=" + id +
			"}";
	}
}
