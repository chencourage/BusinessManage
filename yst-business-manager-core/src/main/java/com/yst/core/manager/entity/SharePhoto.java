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
@TableName("SHARE_PHOTO")
public class SharePhoto extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 加密身份证号
     */
	@TableField("DES_IDCARD")
	private String desIdcard;
    /**
     * 身份证号码
     */
	@TableField("ID_CARD")
	private String idCard;
    /**
     * 图片是否变更001代表正面变更|002代表反面变更|005代表手持身份证变更
     */
	@TableField("CHANGE_STATE")
	private String changeState;
    /**
     * 姓名
     */
	@TableField("NAME")
	private String name;
    /**
     * 同步状态   00--同步成功  10--等待同步  99--同步失败
     */
	@TableField("SYNC_STATE")
	private String syncState;
    /**
     * 手持身份证 链接地址
     */
	@TableField("IDCARD_HAND")
	private String idcardHand;
    /**
     * 身份证反面 链接地址
     */
	@TableField("IDCARD_BACK")
	private String idcardBack;
    /**
     * 身份证正面 链接地址
     */
	@TableField("IDCARD_FRONT")
	private String idcardFront;
    /**
     * 用户号
     */
    @TableId("USERCODE")
	private String usercode;


	public String getDesIdcard() {
		return desIdcard;
	}

	public void setDesIdcard(String desIdcard) {
		this.desIdcard = desIdcard;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getChangeState() {
		return changeState;
	}

	public void setChangeState(String changeState) {
		this.changeState = changeState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSyncState() {
		return syncState;
	}

	public void setSyncState(String syncState) {
		this.syncState = syncState;
	}

	public String getIdcardHand() {
		return idcardHand;
	}

	public void setIdcardHand(String idcardHand) {
		this.idcardHand = idcardHand;
	}

	public String getIdcardBack() {
		return idcardBack;
	}

	public void setIdcardBack(String idcardBack) {
		this.idcardBack = idcardBack;
	}

	public String getIdcardFront() {
		return idcardFront;
	}

	public void setIdcardFront(String idcardFront) {
		this.idcardFront = idcardFront;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	@Override
	public String toString() {
		return "SharePhoto{" +
			", desIdcard=" + desIdcard +
			", idCard=" + idCard +
			", changeState=" + changeState +
			", name=" + name +
			", syncState=" + syncState +
			", idcardHand=" + idcardHand +
			", idcardBack=" + idcardBack +
			", idcardFront=" + idcardFront +
			", usercode=" + usercode +
			"}";
	}
}
