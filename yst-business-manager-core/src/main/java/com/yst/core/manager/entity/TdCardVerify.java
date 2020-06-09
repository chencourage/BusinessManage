package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 用户号与银盛通码绑定关系
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("TD_CARD_VERIFY")
public class TdCardVerify extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 来源
     */
	@TableField("SOURCE_VERSION")
	private String sourceVersion;
    /**
     * 费率id
     */
	@TableField("FEE_ID")
	private String feeId;
    /**
     * 机构号
     */
	@TableField("ORGNO")
	private String orgno;
    /**
     * 责任经理
     */
	@TableField("DUTYMANAGER")
	private String dutymanager;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;
    /**
     * 身份证图片流水
     */
	@TableField("IMGSN")
	private String imgsn;
    /**
     * 审核意见
     */
	@TableField("OPINION")
	private String opinion;
    /**
     * 修改时间
     */
	@TableField("UPDATETIME")
	private Date updatetime;
    /**
     * 创建时间
     */
	@TableField("CREATETIME")
	private Date createtime;
    /**
     * 10（商户入网：待审核，用户：激活二维码失败）
99 （商户入网：已拒绝）11待通知
00商户入网收到成功通知（个人pay卡激活成功）50个人用户转商户待审核   01:注册完只有初始化进来  02：点击第一步保存完全部基本数据
03 保存完结算卡
05 冻结(废弃)
     */
	@TableField("STATE")
	private String state;
    /**
     * 费率描述
     */
	@TableField("FEEDESC")
	private String feedesc;
    /**
     * 费率
     */
	@TableField("FEE")
	private Double fee;
    /**
     * 职业信息
     */
	@TableField("PROFESSION")
	private String profession;
    /**
     * ocr
     */
	@TableField("OCR_DATA")
	private String ocrData;
    /**
     * 省代码
     */
	@TableField("PROVINCE_CODE")
	private String provinceCode;
    /**
     * 城市代码
     */
	@TableField("CITY_CODE")
	private String cityCode;
    /**
     * 省
     */
	@TableField("PROVINCE")
	private String province;
    /**
     * 市
     */
	@TableField("CITY")
	private String city;
    /**
     * 行别
     */
	@TableField("BANK_TYPE")
	private String bankType;
    /**
     * 行号
     */
	@TableField("BANK_CODE")
	private String bankCode;
    /**
     * 支行地址
     */
	@TableField("BRACH_BANK_ADDR")
	private String brachBankAddr;
    /**
     * 开户行名称
     */
	@TableField("OPEAN_BANK_NAME")
	private String opeanBankName;
    /**
     * 预留手机号
     */
	@TableField("PRE_PHONE_NUMBER")
	private String prePhoneNumber;
    /**
     * 银行卡号
     */
	@TableField("BANK_CARD_NO")
	private String bankCardNo;
    /**
     * 身份证
     */
	@TableField("ID_CARD")
	private String idCard;
    /**
     * 持卡人姓名
     */
	@TableField("BANK_ACCOUNT_NAME")
	private String bankAccountName;
    /**
     * 用户号
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * pay卡卡号
     */
	@TableField("TD_CARD_NO")
	private String tdCardNo;
    /**
     * 是否显示收款码00或空显示，01不显示
     */
	@TableField("IS_SHOWQR")
	private String isShowqr;
    /**
     * 终端号
     */
	@TableField("TERM_NO")
	private String termNo;
    /**
     * 最后一次修改营业地址时间
     */
	@TableField("LAST_UPDATE_UNIONADDR_TIME")
	private Date lastUpdateUnionaddrTime;
    /**
     * 商户key
     */
	@TableField("MER_KEY")
	private String merKey;
    /**
     * 手机号
     */
	@TableField("ACC_PHONE")
	private String accPhone;
    /**
     * 异步通知地址
     */
	@TableField("NOTIFY_URL")
	private String notifyUrl;
    /**
     * 店铺内照片流水号
     */
	@TableField("IN_SHOP_IMGSN")
	private String inShopImgsn;
	@TableField("MERC_ID826")
	private String mercId826;
    /**
     * 平台商户组ID
     */
	@TableField("GROUP_ID")
	private Double groupId;
    /**
     * 单笔限额(分)
     */
	@TableField("ONCE_AMOUNT")
	private Double onceAmount;
    /**
     * 日交易限额(分)
     */
	@TableField("DAILY_AMOUNT")
	private Double dailyAmount;
    /**
     * 交易结束时间 hh:mm
     */
	@TableField("END_TIME")
	private String endTime;
    /**
     * 交易起始时间 hh:mm
     */
	@TableField("START_TIME")
	private String startTime;
    /**
     * 第一次激活时间
     */
	@TableField("FIRST_VERIFY_TIME")
	private Date firstVerifyTime;
    /**
     * 是否是商户进件添加的  Y是  
     */
	@TableField("IS_MERC_ADD")
	private String isMercAdd;
    /**
     * yst_realname表需要的信息
     */
	@TableField("REMARK_6")
	private String remark6;
    /**
     * 商户所属市代码
     */
	@TableField("MERC_CITY_CODE")
	private String mercCityCode;
    /**
     * 商户所属市
     */
	@TableField("MERC_CITY")
	private String mercCity;
    /**
     * 商户省代码
     */
	@TableField("MERC_PRO_CODE")
	private String mercProCode;
    /**
     * 商户省
     */
	@TableField("MERC_PRO")
	private String mercPro;
    /**
     * 业务员
     */
	@TableField("REMARK_5")
	private String remark5;
    /**
     * 备用字段4
     */
	@TableField("REMARK_4")
	private String remark4;
    /**
     * 备用字段3--商户报备清算协会状态 0-失败 1-成功 2-待报备
     */
	@TableField("REMARK_3")
	private String remark3;
    /**
     * 备用字段2
     */
	@TableField("REMARK_2")
	private String remark2;
    /**
     * 备用字段1--用户转商户来源与版本
     */
	@TableField("REMARK_1")
	private String remark1;
    /**
     * 1代表已修改省市区，0或空代表未修改
     */
	@TableField("IS_UPDATE_FLAG")
	private String isUpdateFlag;
    /**
     * 开户银行许可证照片流水
     */
	@TableField("BANKCARD_IMGSN")
	private String bankcardImgsn;
    /**
     * 营业执照编号
     */
	@TableField("BUSINESS_LICENSE")
	private String businessLicense;
    /**
     * 店铺门头照照片流水
     */
	@TableField("SHOP_IMGSN")
	private String shopImgsn;
    /**
     * 提升银联二维码商户等级调度次数
     */
	@TableField("UPGRADE_MERC_JOB_TIMES")
	private Double upgradeMercJobTimes;
    /**
     * 银联二维码商户等级
     */
	@TableField("UNIONPAY_MERC_LEVEL")
	private String unionpayMercLevel;
	@TableField("TD_TYPE")
	private String tdType;
	@TableField("PHONE_NUMBER")
	private String phoneNumber;
    /**
     * 商户报备状态 0-失败 1-成功 2-待报备
     */
	@TableField("MERC_REPORT_STATE")
	private String mercReportState;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 银联二维码状态 00-成功 88待激活 80 待升级
     */
	@TableField("UNIONPAY_STATE")
	private String unionpayState;
    /**
     * 银联营业地址
     */
	@TableField("UNIONPAY_ADDR")
	private String unionpayAddr;
    /**
     * 银联商户类型
     */
	@TableField("UNIONPAY_MCHNTTYPE")
	private String unionpayMchnttype;
    /**
     * 纬度
     */
	@TableField("LONGITUDE")
	private String longitude;
    /**
     * 经度
     */
	@TableField("LATITUDE")
	private String latitude;
    /**
     * 银联拓展机构
     */
	@TableField("UNION_ORGNO")
	private String unionOrgno;
    /**
     * 商户审核创建时间
     */
	@TableField("MERC_APPLY_TIME")
	private Date mercApplyTime;
    /**
     * 调度添加清算白名单次数
     */
	@TableField("JOB_TIMES")
	private Double jobTimes;
    /**
     * 预留手机号归宿地
     */
	@TableField("PRE_PHONE_NUMBER_ADDR")
	private String prePhoneNumberAddr;
    /**
     * 商户审核时间
     */
	@TableField("MERC_VERIFY_TIME")
	private Date mercVerifyTime;
    /**
     * 注册IP地理位置
     */
	@TableField("REGIST_ADDR")
	private String registAddr;
    /**
     * 设备号
     */
	@TableField("DEVICE_ID")
	private String deviceId;
    /**
     * 注册Ip
     */
	@TableField("REGIST_IP")
	private String registIp;
    /**
     * 支行名称
     */
	@TableField("BANK_BRANCH_NAME")
	private String bankBranchName;
    /**
     * 1：已加入清算白名单 0 未加入 2 pay卡已加无卡没加 3老数据无需处理 N禁用白名单
     */
	@TableField("SETTLE_FITER_STATE")
	private String settleFiterState;
    /**
     * 商户审核操作人
     */
	@TableField("MERC_OPERATOR")
	private String mercOperator;
    /**
     * 审核拒绝原因
     */
	@TableField("REFUSE_REASON")
	private String refuseReason;
    /**
     * 无卡快捷业务开通状态（是否开通 1是 0否）
     */
	@TableField("NOCARD_FASTPAY_STATE")
	private String nocardFastpayState;
    /**
     * 商户地址
     */
	@TableField("MERC_ADDR")
	private String mercAddr;
    /**
     * 账户类型 11个人借记卡
     */
	@TableField("ACCOUNT_TYPE")
	private String accountType;
    /**
     * 用户 联系电话
     */
	@TableField("MOBILE")
	private String mobile;
    /**
     * 营业执照图片流水
     */
	@TableField("LINENCE_PHOTO_SN")
	private String linencePhotoSn;
    /**
     * 邮箱
     */
	@TableField("EMAIL")
	private String email;
    /**
     * 区
     */
	@TableField("DISTRICT")
	private String district;
    /**
     * mcc码
     */
	@TableField("MCC")
	private String mcc;
    /**
     * 商户类型
     */
	@TableField("MCH_TYPE")
	private String mchType;
    /**
     * 商户名称
     */
	@TableField("MERC_NM")
	private String mercNm;
    /**
     * pay卡个人商户00／实体商户01 
     */
	@TableField("USER_TYPE")
	private String userType;
    /**
     * 区代码
     */
	@TableField("DISTRICT_CODE")
	private String districtCode;
    /**
     * 代理商
     */
	@TableField("AGTNO")
	private String agtno;
    /**
     * 1 为线上激活  0 或者空为 线下激活
     */
	@TableField("IS_ONLINE_ACTIVATE")
	private String isOnlineActivate;
    /**
     * 二维码提现签名字符串
     */
	@TableField("SIGN")
	private String sign;
    /**
     * 加密银行卡号
     */
	@TableField("DES_BANKACCOUNTNO")
	private String desBankaccountno;
    /**
     * 加密银行预留手机号
     */
	@TableField("DES_BANKMOBILE")
	private String desBankmobile;
    /**
     * 加密身份证号
     */
	@TableField("DES_IDCARD")
	private String desIdcard;


	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSourceVersion() {
		return sourceVersion;
	}

	public void setSourceVersion(String sourceVersion) {
		this.sourceVersion = sourceVersion;
	}

	public String getFeeId() {
		return feeId;
	}

	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}

	public String getOrgno() {
		return orgno;
	}

	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}

	public String getDutymanager() {
		return dutymanager;
	}

	public void setDutymanager(String dutymanager) {
		this.dutymanager = dutymanager;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImgsn() {
		return imgsn;
	}

	public void setImgsn(String imgsn) {
		this.imgsn = imgsn;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFeedesc() {
		return feedesc;
	}

	public void setFeedesc(String feedesc) {
		this.feedesc = feedesc;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getOcrData() {
		return ocrData;
	}

	public void setOcrData(String ocrData) {
		this.ocrData = ocrData;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBrachBankAddr() {
		return brachBankAddr;
	}

	public void setBrachBankAddr(String brachBankAddr) {
		this.brachBankAddr = brachBankAddr;
	}

	public String getOpeanBankName() {
		return opeanBankName;
	}

	public void setOpeanBankName(String opeanBankName) {
		this.opeanBankName = opeanBankName;
	}

	public String getPrePhoneNumber() {
		return prePhoneNumber;
	}

	public void setPrePhoneNumber(String prePhoneNumber) {
		this.prePhoneNumber = prePhoneNumber;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getTdCardNo() {
		return tdCardNo;
	}

	public void setTdCardNo(String tdCardNo) {
		this.tdCardNo = tdCardNo;
	}

	public String getIsShowqr() {
		return isShowqr;
	}

	public void setIsShowqr(String isShowqr) {
		this.isShowqr = isShowqr;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public Date getLastUpdateUnionaddrTime() {
		return lastUpdateUnionaddrTime;
	}

	public void setLastUpdateUnionaddrTime(Date lastUpdateUnionaddrTime) {
		this.lastUpdateUnionaddrTime = lastUpdateUnionaddrTime;
	}

	public String getMerKey() {
		return merKey;
	}

	public void setMerKey(String merKey) {
		this.merKey = merKey;
	}

	public String getAccPhone() {
		return accPhone;
	}

	public void setAccPhone(String accPhone) {
		this.accPhone = accPhone;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getInShopImgsn() {
		return inShopImgsn;
	}

	public void setInShopImgsn(String inShopImgsn) {
		this.inShopImgsn = inShopImgsn;
	}

	public String getMercId826() {
		return mercId826;
	}

	public void setMercId826(String mercId826) {
		this.mercId826 = mercId826;
	}

	public Double getGroupId() {
		return groupId;
	}

	public void setGroupId(Double groupId) {
		this.groupId = groupId;
	}

	public Double getOnceAmount() {
		return onceAmount;
	}

	public void setOnceAmount(Double onceAmount) {
		this.onceAmount = onceAmount;
	}

	public Double getDailyAmount() {
		return dailyAmount;
	}

	public void setDailyAmount(Double dailyAmount) {
		this.dailyAmount = dailyAmount;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Date getFirstVerifyTime() {
		return firstVerifyTime;
	}

	public void setFirstVerifyTime(Date firstVerifyTime) {
		this.firstVerifyTime = firstVerifyTime;
	}

	public String getIsMercAdd() {
		return isMercAdd;
	}

	public void setIsMercAdd(String isMercAdd) {
		this.isMercAdd = isMercAdd;
	}

	public String getRemark6() {
		return remark6;
	}

	public void setRemark6(String remark6) {
		this.remark6 = remark6;
	}

	public String getMercCityCode() {
		return mercCityCode;
	}

	public void setMercCityCode(String mercCityCode) {
		this.mercCityCode = mercCityCode;
	}

	public String getMercCity() {
		return mercCity;
	}

	public void setMercCity(String mercCity) {
		this.mercCity = mercCity;
	}

	public String getMercProCode() {
		return mercProCode;
	}

	public void setMercProCode(String mercProCode) {
		this.mercProCode = mercProCode;
	}

	public String getMercPro() {
		return mercPro;
	}

	public void setMercPro(String mercPro) {
		this.mercPro = mercPro;
	}

	public String getRemark5() {
		return remark5;
	}

	public void setRemark5(String remark5) {
		this.remark5 = remark5;
	}

	public String getRemark4() {
		return remark4;
	}

	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
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

	public String getIsUpdateFlag() {
		return isUpdateFlag;
	}

	public void setIsUpdateFlag(String isUpdateFlag) {
		this.isUpdateFlag = isUpdateFlag;
	}

	public String getBankcardImgsn() {
		return bankcardImgsn;
	}

	public void setBankcardImgsn(String bankcardImgsn) {
		this.bankcardImgsn = bankcardImgsn;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getShopImgsn() {
		return shopImgsn;
	}

	public void setShopImgsn(String shopImgsn) {
		this.shopImgsn = shopImgsn;
	}

	public Double getUpgradeMercJobTimes() {
		return upgradeMercJobTimes;
	}

	public void setUpgradeMercJobTimes(Double upgradeMercJobTimes) {
		this.upgradeMercJobTimes = upgradeMercJobTimes;
	}

	public String getUnionpayMercLevel() {
		return unionpayMercLevel;
	}

	public void setUnionpayMercLevel(String unionpayMercLevel) {
		this.unionpayMercLevel = unionpayMercLevel;
	}

	public String getTdType() {
		return tdType;
	}

	public void setTdType(String tdType) {
		this.tdType = tdType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMercReportState() {
		return mercReportState;
	}

	public void setMercReportState(String mercReportState) {
		this.mercReportState = mercReportState;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUnionpayState() {
		return unionpayState;
	}

	public void setUnionpayState(String unionpayState) {
		this.unionpayState = unionpayState;
	}

	public String getUnionpayAddr() {
		return unionpayAddr;
	}

	public void setUnionpayAddr(String unionpayAddr) {
		this.unionpayAddr = unionpayAddr;
	}

	public String getUnionpayMchnttype() {
		return unionpayMchnttype;
	}

	public void setUnionpayMchnttype(String unionpayMchnttype) {
		this.unionpayMchnttype = unionpayMchnttype;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getUnionOrgno() {
		return unionOrgno;
	}

	public void setUnionOrgno(String unionOrgno) {
		this.unionOrgno = unionOrgno;
	}

	public Date getMercApplyTime() {
		return mercApplyTime;
	}

	public void setMercApplyTime(Date mercApplyTime) {
		this.mercApplyTime = mercApplyTime;
	}

	public Double getJobTimes() {
		return jobTimes;
	}

	public void setJobTimes(Double jobTimes) {
		this.jobTimes = jobTimes;
	}

	public String getPrePhoneNumberAddr() {
		return prePhoneNumberAddr;
	}

	public void setPrePhoneNumberAddr(String prePhoneNumberAddr) {
		this.prePhoneNumberAddr = prePhoneNumberAddr;
	}

	public Date getMercVerifyTime() {
		return mercVerifyTime;
	}

	public void setMercVerifyTime(Date mercVerifyTime) {
		this.mercVerifyTime = mercVerifyTime;
	}

	public String getRegistAddr() {
		return registAddr;
	}

	public void setRegistAddr(String registAddr) {
		this.registAddr = registAddr;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getRegistIp() {
		return registIp;
	}

	public void setRegistIp(String registIp) {
		this.registIp = registIp;
	}

	public String getBankBranchName() {
		return bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getSettleFiterState() {
		return settleFiterState;
	}

	public void setSettleFiterState(String settleFiterState) {
		this.settleFiterState = settleFiterState;
	}

	public String getMercOperator() {
		return mercOperator;
	}

	public void setMercOperator(String mercOperator) {
		this.mercOperator = mercOperator;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getNocardFastpayState() {
		return nocardFastpayState;
	}

	public void setNocardFastpayState(String nocardFastpayState) {
		this.nocardFastpayState = nocardFastpayState;
	}

	public String getMercAddr() {
		return mercAddr;
	}

	public void setMercAddr(String mercAddr) {
		this.mercAddr = mercAddr;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLinencePhotoSn() {
		return linencePhotoSn;
	}

	public void setLinencePhotoSn(String linencePhotoSn) {
		this.linencePhotoSn = linencePhotoSn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMchType() {
		return mchType;
	}

	public void setMchType(String mchType) {
		this.mchType = mchType;
	}

	public String getMercNm() {
		return mercNm;
	}

	public void setMercNm(String mercNm) {
		this.mercNm = mercNm;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getAgtno() {
		return agtno;
	}

	public void setAgtno(String agtno) {
		this.agtno = agtno;
	}

	public String getIsOnlineActivate() {
		return isOnlineActivate;
	}

	public void setIsOnlineActivate(String isOnlineActivate) {
		this.isOnlineActivate = isOnlineActivate;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getDesBankaccountno() {
		return desBankaccountno;
	}

	public void setDesBankaccountno(String desBankaccountno) {
		this.desBankaccountno = desBankaccountno;
	}

	public String getDesBankmobile() {
		return desBankmobile;
	}

	public void setDesBankmobile(String desBankmobile) {
		this.desBankmobile = desBankmobile;
	}

	public String getDesIdcard() {
		return desIdcard;
	}

	public void setDesIdcard(String desIdcard) {
		this.desIdcard = desIdcard;
	}

	@Override
	public String toString() {
		return "TdCardVerify{" +
			", operator=" + operator +
			", sourceVersion=" + sourceVersion +
			", feeId=" + feeId +
			", orgno=" + orgno +
			", dutymanager=" + dutymanager +
			", id=" + id +
			", imgsn=" + imgsn +
			", opinion=" + opinion +
			", updatetime=" + updatetime +
			", createtime=" + createtime +
			", state=" + state +
			", feedesc=" + feedesc +
			", fee=" + fee +
			", profession=" + profession +
			", ocrData=" + ocrData +
			", provinceCode=" + provinceCode +
			", cityCode=" + cityCode +
			", province=" + province +
			", city=" + city +
			", bankType=" + bankType +
			", bankCode=" + bankCode +
			", brachBankAddr=" + brachBankAddr +
			", opeanBankName=" + opeanBankName +
			", prePhoneNumber=" + prePhoneNumber +
			", bankCardNo=" + bankCardNo +
			", idCard=" + idCard +
			", bankAccountName=" + bankAccountName +
			", userCode=" + userCode +
			", tdCardNo=" + tdCardNo +
			", isShowqr=" + isShowqr +
			", termNo=" + termNo +
			", lastUpdateUnionaddrTime=" + lastUpdateUnionaddrTime +
			", merKey=" + merKey +
			", accPhone=" + accPhone +
			", notifyUrl=" + notifyUrl +
			", inShopImgsn=" + inShopImgsn +
			", mercId826=" + mercId826 +
			", groupId=" + groupId +
			", onceAmount=" + onceAmount +
			", dailyAmount=" + dailyAmount +
			", endTime=" + endTime +
			", startTime=" + startTime +
			", firstVerifyTime=" + firstVerifyTime +
			", isMercAdd=" + isMercAdd +
			", remark6=" + remark6 +
			", mercCityCode=" + mercCityCode +
			", mercCity=" + mercCity +
			", mercProCode=" + mercProCode +
			", mercPro=" + mercPro +
			", remark5=" + remark5 +
			", remark4=" + remark4 +
			", remark3=" + remark3 +
			", remark2=" + remark2 +
			", remark1=" + remark1 +
			", isUpdateFlag=" + isUpdateFlag +
			", bankcardImgsn=" + bankcardImgsn +
			", businessLicense=" + businessLicense +
			", shopImgsn=" + shopImgsn +
			", upgradeMercJobTimes=" + upgradeMercJobTimes +
			", unionpayMercLevel=" + unionpayMercLevel +
			", tdType=" + tdType +
			", phoneNumber=" + phoneNumber +
			", mercReportState=" + mercReportState +
			", remark=" + remark +
			", unionpayState=" + unionpayState +
			", unionpayAddr=" + unionpayAddr +
			", unionpayMchnttype=" + unionpayMchnttype +
			", longitude=" + longitude +
			", latitude=" + latitude +
			", unionOrgno=" + unionOrgno +
			", mercApplyTime=" + mercApplyTime +
			", jobTimes=" + jobTimes +
			", prePhoneNumberAddr=" + prePhoneNumberAddr +
			", mercVerifyTime=" + mercVerifyTime +
			", registAddr=" + registAddr +
			", deviceId=" + deviceId +
			", registIp=" + registIp +
			", bankBranchName=" + bankBranchName +
			", settleFiterState=" + settleFiterState +
			", mercOperator=" + mercOperator +
			", refuseReason=" + refuseReason +
			", nocardFastpayState=" + nocardFastpayState +
			", mercAddr=" + mercAddr +
			", accountType=" + accountType +
			", mobile=" + mobile +
			", linencePhotoSn=" + linencePhotoSn +
			", email=" + email +
			", district=" + district +
			", mcc=" + mcc +
			", mchType=" + mchType +
			", mercNm=" + mercNm +
			", userType=" + userType +
			", districtCode=" + districtCode +
			", agtno=" + agtno +
			", isOnlineActivate=" + isOnlineActivate +
			", sign=" + sign +
			", desBankaccountno=" + desBankaccountno +
			", desBankmobile=" + desBankmobile +
			", desIdcard=" + desIdcard +
			"}";
	}
}
