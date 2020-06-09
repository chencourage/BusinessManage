package com.yst.core.manager.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 银联地区代码表（新）
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("CMMT_AREA_INFO")
public class CmmtAreaInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 0-不可使用，空-可使用
     */
	@TableField("IS_ABLE")
	private String isAble;
    /**
     * 级别：1-省份代码；2-城市代码；3-县/区代码
     */
	@TableField("AREA_LEVEL")
	private Double areaLevel;
    /**
     * 行政地区码
     */
	@TableField("AREA_CODE")
	private String areaCode;
    /**
     * 地区拼音全称
     */
	@TableField("CITY_PY")
	private String cityPy;
    /**
     * 地区拼音简称
     */
	@TableField("CITY_PY_HEAD")
	private String cityPyHead;
    /**
     * 父级地区代码
     */
	@TableField("PARENT_CITY_CD")
	private String parentCityCd;
    /**
     * 地区名称
     */
	@TableField("CITY_NM")
	private String cityNm;
    /**
     * 地区代码
     */
    @TableId("CITY_CD")
	private String cityCd;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsAble() {
		return isAble;
	}

	public void setIsAble(String isAble) {
		this.isAble = isAble;
	}

	public Double getAreaLevel() {
		return areaLevel;
	}

	public void setAreaLevel(Double areaLevel) {
		this.areaLevel = areaLevel;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityPy() {
		return cityPy;
	}

	public void setCityPy(String cityPy) {
		this.cityPy = cityPy;
	}

	public String getCityPyHead() {
		return cityPyHead;
	}

	public void setCityPyHead(String cityPyHead) {
		this.cityPyHead = cityPyHead;
	}

	public String getParentCityCd() {
		return parentCityCd;
	}

	public void setParentCityCd(String parentCityCd) {
		this.parentCityCd = parentCityCd;
	}

	public String getCityNm() {
		return cityNm;
	}

	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}

	public String getCityCd() {
		return cityCd;
	}

	public void setCityCd(String cityCd) {
		this.cityCd = cityCd;
	}

	@Override
	public String toString() {
		return "CmmtAreaInfo{" +
			", remark=" + remark +
			", isAble=" + isAble +
			", areaLevel=" + areaLevel +
			", areaCode=" + areaCode +
			", cityPy=" + cityPy +
			", cityPyHead=" + cityPyHead +
			", parentCityCd=" + parentCityCd +
			", cityNm=" + cityNm +
			", cityCd=" + cityCd +
			"}";
	}
}
