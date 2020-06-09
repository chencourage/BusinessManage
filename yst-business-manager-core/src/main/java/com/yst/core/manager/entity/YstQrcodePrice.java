package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenkai
 * @since 2019-06-22
 */
@TableName("YST_QRCODE_PRICE")
public class YstQrcodePrice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 修改时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 档位层级
     */
	@TableField("GRADE")
	private String grade;
    /**
     * 类型1通码费用 0邮费
     */
	@TableField("PRICE_TYPE")
	private String priceType;
    /**
     * 数量
     */
	@TableField("QRCODE_NUM")
	private Long qrcodeNum;
    /**
     * 折扣
     */
	@TableField("DISCOUNT")
	private Double discount;
    /**
     * 单价
     */
	@TableField("SINGLE_PRICE")
	private Double singlePrice;
    /**
     * 通码类型 1机构 0个人
     */
	@TableField("MERC_TYPE")
	private String mercType;
    /**
     * 通码类型 1实体 0电子码
     */
	@TableField("QRCODE_TYPE")
	private String qrcodeType;
    /**
     * 主键
     */
	@TableField("PRICE_ID")
	private String priceId;


	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public Long getQrcodeNum() {
		return qrcodeNum;
	}

	public void setQrcodeNum(Long qrcodeNum) {
		this.qrcodeNum = qrcodeNum;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(Double singlePrice) {
		this.singlePrice = singlePrice;
	}

	public String getMercType() {
		return mercType;
	}

	public void setMercType(String mercType) {
		this.mercType = mercType;
	}

	public String getQrcodeType() {
		return qrcodeType;
	}

	public void setQrcodeType(String qrcodeType) {
		this.qrcodeType = qrcodeType;
	}

	public String getPriceId() {
		return priceId;
	}

	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}

	@Override
	public String toString() {
		return "YstQrcodePrice{" +
			", operator=" + operator +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", grade=" + grade +
			", priceType=" + priceType +
			", qrcodeNum=" + qrcodeNum +
			", discount=" + discount +
			", singlePrice=" + singlePrice +
			", mercType=" + mercType +
			", qrcodeType=" + qrcodeType +
			", priceId=" + priceId +
			"}";
	}
}
