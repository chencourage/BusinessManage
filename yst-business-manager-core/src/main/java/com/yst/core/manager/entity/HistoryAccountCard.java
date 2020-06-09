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
@TableName("HISTORY_ACCOUNT_CARD")
public class HistoryAccountCard extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 关联业务类型 以json数组存储
     */
	@TableField("RELATION_BUSI_TYPE")
	private String relationBusiType;
    /**
     * 设为默认结算卡 Y是 N否
     */
	@TableField("DEFAULT_FLAG")
	private String defaultFlag;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 终端号
     */
	@TableField("TRMNO")
	private String trmno;
    /**
     * 省代码
     */
	@TableField("PROVINCECODE")
	private String provincecode;
    /**
     * 省名称
     */
	@TableField("PROVINCE")
	private String province;
    /**
     * 城市代码
     */
	@TableField("CITYCODE")
	private String citycode;
    /**
     * 城市名称
     */
	@TableField("CITY")
	private String city;
    /**
     * 行别
     */
	@TableField("BANKTYPE")
	private String banktype;
    /**
     * 行号
     */
	@TableField("BANKCODE")
	private String bankcode;
    /**
     * 00--生效状态  99--不生效状态 10--未实名用户插入的数据
     */
	@TableField("STATE")
	private String state;
    /**
     * 身份证号码
     */
	@TableField("IDCARD")
	private String idcard;
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 支行地址
     */
	@TableField("BRANCH_ADDRESS")
	private String branchAddress;
    /**
     * 支行名称
     */
	@TableField("BRANCH_NAME")
	private String branchName;
    /**
     * 开户行  eg:工商银行
     */
	@TableField("OPEN_BANKNAME")
	private String openBankname;
    /**
     * 银行预留手机号
     */
	@TableField("MOBILE")
	private String mobile;
    /**
     * 银行卡号
     */
	@TableField("CARDNO")
	private String cardno;
    /**
     * 姓名
     */
	@TableField("NAME")
	private String name;
    /**
     * 用户号
     */
	@TableField("USERCODE")
	private String usercode;
    @TableId("ID")
	private String id;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 原户名
     */
	@TableField("OLD_ACCOUNT_NAME")
	private String oldAccountName;
    /**
     * 01或者空 对私账户  02 对公账户
     */
	@TableField("ACCOUNTTYPE")
	private String accounttype;
    /**
     * 01 收款码 02 添加结算卡 03绑mpos
     */
	@TableField("ENTERTYPE")
	private String entertype;
    /**
     * SN码
     */
	@TableField("SNCODE")
	private String sncode;
    /**
     * 结算卡图片流水
     */
	@TableField("IMGSN")
	private String imgsn;


	public String getRelationBusiType() {
		return relationBusiType;
	}

	public void setRelationBusiType(String relationBusiType) {
		this.relationBusiType = relationBusiType;
	}

	public String getDefaultFlag() {
		return defaultFlag;
	}

	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTrmno() {
		return trmno;
	}

	public void setTrmno(String trmno) {
		this.trmno = trmno;
	}

	public String getProvincecode() {
		return provincecode;
	}

	public void setProvincecode(String provincecode) {
		this.provincecode = provincecode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBanktype() {
		return banktype;
	}

	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getOpenBankname() {
		return openBankname;
	}

	public void setOpenBankname(String openBankname) {
		this.openBankname = openBankname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOldAccountName() {
		return oldAccountName;
	}

	public void setOldAccountName(String oldAccountName) {
		this.oldAccountName = oldAccountName;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getEntertype() {
		return entertype;
	}

	public void setEntertype(String entertype) {
		this.entertype = entertype;
	}

	public String getSncode() {
		return sncode;
	}

	public void setSncode(String sncode) {
		this.sncode = sncode;
	}

	public String getImgsn() {
		return imgsn;
	}

	public void setImgsn(String imgsn) {
		this.imgsn = imgsn;
	}

	@Override
	public String toString() {
		return "HistoryAccountCard{" +
			", relationBusiType=" + relationBusiType +
			", defaultFlag=" + defaultFlag +
			", remark=" + remark +
			", trmno=" + trmno +
			", provincecode=" + provincecode +
			", province=" + province +
			", citycode=" + citycode +
			", city=" + city +
			", banktype=" + banktype +
			", bankcode=" + bankcode +
			", state=" + state +
			", idcard=" + idcard +
			", createTime=" + createTime +
			", branchAddress=" + branchAddress +
			", branchName=" + branchName +
			", openBankname=" + openBankname +
			", mobile=" + mobile +
			", cardno=" + cardno +
			", name=" + name +
			", usercode=" + usercode +
			", id=" + id +
			", operator=" + operator +
			", oldAccountName=" + oldAccountName +
			", accounttype=" + accounttype +
			", entertype=" + entertype +
			", sncode=" + sncode +
			", imgsn=" + imgsn +
			"}";
	}
}
