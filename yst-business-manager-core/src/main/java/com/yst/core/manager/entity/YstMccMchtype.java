package com.yst.core.manager.entity;

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
@TableName("YST_MCC_MCHTYPE")
public class YstMccMchtype extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("POS_MCC")
	private String posMcc;
	@TableField("MCH_TYPE_DESC")
	private String mchTypeDesc;
    /**
     * 商户类型
     */
	@TableField("MCH_TYPE")
	private String mchType;
    /**
     * mcc码
     */
	@TableField("MCC")
	private String mcc;
	@TableField("ID")
	private String id;


	public String getPosMcc() {
		return posMcc;
	}

	public void setPosMcc(String posMcc) {
		this.posMcc = posMcc;
	}

	public String getMchTypeDesc() {
		return mchTypeDesc;
	}

	public void setMchTypeDesc(String mchTypeDesc) {
		this.mchTypeDesc = mchTypeDesc;
	}

	public String getMchType() {
		return mchType;
	}

	public void setMchType(String mchType) {
		this.mchType = mchType;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "YstMccMchtype{" +
			", posMcc=" + posMcc +
			", mchTypeDesc=" + mchTypeDesc +
			", mchType=" + mchType +
			", mcc=" + mcc +
			", id=" + id +
			"}";
	}
}
