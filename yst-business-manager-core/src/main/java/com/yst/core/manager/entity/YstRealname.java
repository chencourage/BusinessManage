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
 * @since 2019-06-22
 */
@TableName("YST_REALNAME")
public class YstRealname extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 来源与版本号
     */
	@TableField("SOURCE_VERSION")
	private String sourceVersion;
    /**
     * 身份证的签发机关
     */
	@TableField("IDISSUED")
	private String idissued;
    /**
     * 先绑卡后实名的绑卡身份证
     */
	@TableField("IDCARD_OLD")
	private String idcardOld;
    /**
     * 先绑卡后实名的绑卡姓名
     */
	@TableField("NAME_OLD")
	private String nameOld;
    /**
     * 是否生成了绑卡流水 1---是 0---否
     */
	@TableField("ISSYNC")
	private String issync;
    /**
     * 是否绑过卡 1--是  0--不是
     */
	@TableField("ISBINDCARD")
	private String isbindcard;
    /**
     * 图片同步标志 00 表示同步成功  10 待同步  99 同步失败
     */
	@TableField("FLAG")
	private String flag;
    /**
     * 01代表 来源绑设备  02代表 来源绑定银行卡  03代表 来源账户信息页面   04--代表激活pay卡  05--来源开通金服理财服务  99代表其他入口
     */
	@TableField("ENTERTYPE")
	private String entertype;
    /**
     * 手机号码
     */
	@TableField("MOBILE")
	private String mobile;
    /**
     * 地区
     */
	@TableField("AREA")
	private String area;
    /**
     * 身份证到期日期
     */
	@TableField("ENDDATE")
	private String enddate;
    /**
     * 身份证开始有效日期
     */
	@TableField("STARTDATE")
	private String startdate;
    /**
     * 审核日期
     */
	@TableField("CHECK_DATE")
	private Date checkDate;
    /**
     * 关联通道实名验证流水表中唯一流水
     */
	@TableField("CHANNEL_VERIFY_SN")
	private String channelVerifySn;
    /**
     * 用户号
     */
	@TableField("USERCODE")
	private String usercode;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 操作用户号
     */
	@TableField("OPEATOR")
	private String opeator;
    /**
     * 审核状态　10（待审核）　00（审核通过）99（审核拒绝） 88(已关闭）
     */
	@TableField("STATE")
	private String state;
    /**
     * 申请日期
     */
	@TableField("APPLY_DATE")
	private Date applyDate;
    /**
     * 其他扩展属性
     */
	@TableField("EXT_DATA")
	private String extData;
    /**
     * 图片上传流水
     */
	@TableField("IMGES_SN")
	private String imgesSn;
    /**
     * 职业
     */
	@TableField("PROFESSION")
	private String profession;
    /**
     * 地址
     */
	@TableField("ADDRESS")
	private String address;
    /**
     * 性别
     */
	@TableField("SEX")
	private String sex;
    /**
     * 身份证号
     */
	@TableField("ID_CARD")
	private String idCard;
    /**
     * 姓名
     */
	@TableField("NAME")
	private String name;
    /**
     * 唯一流水
     */
    @TableId("SN")
	private String sn;
    /**
     * 先绑卡后实名的加密绑卡身份证
     */
	@TableField("DES_IDCARD_OLD")
	private String desIdcardOld;
    /**
     * 加密手机号
     */
	@TableField("DES_MOBILE")
	private String desMobile;


	public String getSourceVersion() {
		return sourceVersion;
	}

	public void setSourceVersion(String sourceVersion) {
		this.sourceVersion = sourceVersion;
	}

	public String getIdissued() {
		return idissued;
	}

	public void setIdissued(String idissued) {
		this.idissued = idissued;
	}

	public String getIdcardOld() {
		return idcardOld;
	}

	public void setIdcardOld(String idcardOld) {
		this.idcardOld = idcardOld;
	}

	public String getNameOld() {
		return nameOld;
	}

	public void setNameOld(String nameOld) {
		this.nameOld = nameOld;
	}

	public String getIssync() {
		return issync;
	}

	public void setIssync(String issync) {
		this.issync = issync;
	}

	public String getIsbindcard() {
		return isbindcard;
	}

	public void setIsbindcard(String isbindcard) {
		this.isbindcard = isbindcard;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getEntertype() {
		return entertype;
	}

	public void setEntertype(String entertype) {
		this.entertype = entertype;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getChannelVerifySn() {
		return channelVerifySn;
	}

	public void setChannelVerifySn(String channelVerifySn) {
		this.channelVerifySn = channelVerifySn;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOpeator() {
		return opeator;
	}

	public void setOpeator(String opeator) {
		this.opeator = opeator;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getExtData() {
		return extData;
	}

	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getImgesSn() {
		return imgesSn;
	}

	public void setImgesSn(String imgesSn) {
		this.imgesSn = imgesSn;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getDesIdcardOld() {
		return desIdcardOld;
	}

	public void setDesIdcardOld(String desIdcardOld) {
		this.desIdcardOld = desIdcardOld;
	}

	public String getDesMobile() {
		return desMobile;
	}

	public void setDesMobile(String desMobile) {
		this.desMobile = desMobile;
	}

	@Override
	public String toString() {
		return "YstRealname{" +
			", sourceVersion=" + sourceVersion +
			", idissued=" + idissued +
			", idcardOld=" + idcardOld +
			", nameOld=" + nameOld +
			", issync=" + issync +
			", isbindcard=" + isbindcard +
			", flag=" + flag +
			", entertype=" + entertype +
			", mobile=" + mobile +
			", area=" + area +
			", enddate=" + enddate +
			", startdate=" + startdate +
			", checkDate=" + checkDate +
			", channelVerifySn=" + channelVerifySn +
			", usercode=" + usercode +
			", remark=" + remark +
			", opeator=" + opeator +
			", state=" + state +
			", applyDate=" + applyDate +
			", extData=" + extData +
			", imgesSn=" + imgesSn +
			", profession=" + profession +
			", address=" + address +
			", sex=" + sex +
			", idCard=" + idCard +
			", name=" + name +
			", sn=" + sn +
			", desIdcardOld=" + desIdcardOld +
			", desMobile=" + desMobile +
			"}";
	}
}
