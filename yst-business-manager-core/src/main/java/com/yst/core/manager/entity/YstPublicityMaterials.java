package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 宣传物料表

 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("YST_PUBLICITY_MATERIALS")
public class YstPublicityMaterials extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 类型  11：海报，22：图文，33：压缩包
     */
	@TableField("TYPE")
	private String type;
    /**
     * 备注2
     */
	@TableField("REMARK_2")
	private String remark2;
    /**
     * 备注1
     */
	@TableField("REMARK_1")
	private String remark1;
    /**
     * 上传图片名称
     */
	@TableField("IMG_NAME")
	private String imgName;
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
     * 文案详情
     */
	@TableField("MATERIALS_DETAIL")
	private String materialsDetail;
    /**
     * 序号
     */
	@TableField("SERIAL_NUM")
	private Double serialNum;
    /**
     * 标题
     */
	@TableField("TITLE")
	private String title;
    /**
     * 主键ID
     */
    @TableId("ID")
	private String id;


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

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

	public String getMaterialsDetail() {
		return materialsDetail;
	}

	public void setMaterialsDetail(String materialsDetail) {
		this.materialsDetail = materialsDetail;
	}

	public Double getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(Double serialNum) {
		this.serialNum = serialNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "YstPublicityMaterials{" +
			", type=" + type +
			", remark2=" + remark2 +
			", remark1=" + remark1 +
			", imgName=" + imgName +
			", operator=" + operator +
			", updateTime=" + updateTime +
			", materialsDetail=" + materialsDetail +
			", serialNum=" + serialNum +
			", title=" + title +
			", id=" + id +
			"}";
	}
}
