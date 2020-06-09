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
@TableName("YST_MACHINES_VERIFY")
public class YstMachinesVerify extends BaseEntity {

    private static final long serialVersionUID = 1L;

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
     * 加密用户绑定手机号
     */
	@TableField("DES_MOBILE")
	private String desMobile;
    /**
     * 加密身份证号
     */
	@TableField("DES_IDCARD")
	private String desIdcard;
    /**
     * 提现记录表保存的tradeSn
     */
	@TableField("ORDER_TRADESN")
	private String orderTradesn;
    /**
     * 押金记录表Id
     */
	@TableField("CASH_PLEDGE_RECORD_ID")
	private String cashPledgeRecordId;
    /**
     * 责任经理
     */
	@TableField("DUTY_MANAGER")
	private String dutyManager;
    /**
     * 是否是 新版本   Y--是   N 或者  空的话 代表 不是
     */
	@TableField("IS_NEW_VERSION")
	private String isNewVersion;
    /**
     * 来源与版本号
     */
	@TableField("SOURCE_VERSION")
	private String sourceVersion;
    /**
     * D0 按固定金额计费   固定金额
     */
	@TableField("FIX_FEE_AMT")
	private Double fixFeeAmt;
    /**
     * D0 最小收费金额
     */
	@TableField("MIN_FEE_AMT")
	private Double minFeeAmt;
    /**
     * D0 按百分比计费   垫资手续费
     */
	@TableField("FEE_RAT")
	private Double feeRat;
	@TableField("RECOVERY_OPINION")
	private String recoveryOpinion;
	@TableField("FIRST_OPINION")
	private String firstOpinion;
	@TableField("CUSTOMER_MANAGER_USER_NAME")
	private String customerManagerUserName;
	@TableField("CUSTOMER_MANAGER_USER_CODE")
	private String customerManagerUserCode;
	@TableField("RECOVERY_TIME")
	private Date recoveryTime;
	@TableField("RECOVERY_MAN")
	private String recoveryMan;
	@TableField("AGAIN_VERIFY_TIME")
	private Date againVerifyTime;
	@TableField("AGAIN_VERIFER")
	private String againVerifer;
	@TableField("FIRST_VERIFY_TIME")
	private Date firstVerifyTime;
	@TableField("FIRST_VERIFER")
	private String firstVerifer;
    /**
     * 用户的其他信息
     */
	@TableField("USER_OTHER_INFO")
	private String userOtherInfo;
	@TableField("USER_LOCATION_INFO")
	private String userLocationInfo;
    /**
     * 前端使用OCR得到的信息
     */
	@TableField("OCR_USER_DATA")
	private String ocrUserData;
    /**
     * 职业
     */
	@TableField("PROFESSION")
	private String profession;
	@TableField("CREDIT_CARD_CAP_FEE")
	private Double creditCardCapFee;
	@TableField("DEBIT_CARD_CAP_FEE")
	private Double debitCardCapFee;
	@TableField("CREDIT_CARD_RATE")
	private Double creditCardRate;
	@TableField("DEBIT_CARD_RATE")
	private Double debitCardRate;
	@TableField("NEW_REMARK")
	private String newRemark;
    /**
     * 封顶金额
     */
	@TableField("CAP_FEE")
	private Double capFee;
    /**
     * 机构费率
     */
	@TableField("ORG_RATE")
	private Double orgRate;
    /**
     * 机构代码
     */
	@TableField("ORGNO")
	private String orgno;
	@TableField("FULL_SNCODE")
	private String fullSncode;
	@TableField("BANK_CODE")
	private String bankCode;
    /**
     * 银行类型
     */
	@TableField("BANK_TYPE")
	private String bankType;
    /**
     * 城市代码
     */
	@TableField("CITY_CODE")
	private String cityCode;
    /**
     * 省代码
     */
	@TableField("PROVINCE_CODE")
	private String provinceCode;
    /**
     * 省
     */
	@TableField("PROVINCE")
	private String province;
    /**
     * 城市
     */
	@TableField("CITY")
	private String city;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 设备与商户绑定状态：00绑定，88解绑
     */
	@TableField("DEVICE_STATE")
	private String deviceState;
    /**
     * 终端号
     */
	@TableField("TRMNO")
	private String trmno;
    /**
     * 解绑时间
     */
	@TableField("UNBUND_TIME")
	private Date unbundTime;
    /**
     * 审核意见
     */
	@TableField("OPINION")
	private String opinion;
	@TableField("FEE")
	private String fee;
	@TableField("KEY")
	private String key;
    /**
     * 银行预留手机号
     */
	@TableField("MERCHANTMOBILE")
	private String merchantmobile;
    /**
     * 银行名称
     */
	@TableField("BANK_NAME")
	private String bankName;
    /**
     * 前台验证四要素状态
     */
	@TableField("VERIFY_STATE")
	private String verifyState;
    /**
     * 身份证号
     */
	@TableField("ID_NUMBER")
	private String idNumber;
    /**
     * 支行名称
     */
	@TableField("BRANCH_NAME")
	private String branchName;
    /**
     * 邮箱
     */
	@TableField("EMAIL")
	private String email;
    /**
     * 用户号
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * 图片
     */
	@TableField("IMG_CODE")
	private String imgCode;
    /**
     * 流水号
     */
	@TableField("DEVICE_SN")
	private String deviceSn;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 更新时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 00已绑定 01待审核 99已拒绝 88解绑 02待复审 11待复效  55 开户失败  77 D0失败  78 风控初始额度未设置 79 设置提现费率失败 （01、99、02、11都已失效）
     */
	@TableField("STATE")
	private String state;
    /**
     * 激活时间 
     */
	@TableField("VERIFY_TIME")
	private Date verifyTime;
    /**
     * 银行卡号
     */
	@TableField("CARD_NO")
	private String cardNo;
    /**
     * 商户姓名
     */
	@TableField("MERCHANTNAME")
	private String merchantname;
    /**
     * 商户号
     */
	@TableField("MERCHANTNO")
	private String merchantno;
    /**
     * 用户绑定手机号
     */
	@TableField("MOBILE")
	private String mobile;
    /**
     * 申请人
     */
	@TableField("PROPOSER")
	private String proposer;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;
    /**
     * 结算白名单：Y白名单 N不是白名单
     */
	@TableField("SETTLE_WHITE")
	private String settleWhite;
    /**
     * 分润活动时间
     */
	@TableField("ACTIVE_END_DATE")
	private Date activeEndDate;
    /**
     * 个人 00或者空  商户 01
     */
	@TableField("USER_TYPE")
	private String userType;
    /**
     * 营业执照编号
     */
	@TableField("BUSINESS_LICENSE")
	private String businessLicense;
    /**
     * 店铺内照片流水号
     */
	@TableField("IN_SHOP_IMGSN")
	private String inShopImgsn;
    /**
     * 店铺门头照照片流水
     */
	@TableField("SHOP_IMGSN")
	private String shopImgsn;
    /**
     * 营业执照图片流水
     */
	@TableField("LINENCE_PHOTO_SN")
	private String linencePhotoSn;
    /**
     * 终端结算价
     */
	@TableField("SETTLE_PRICE_ID")
	private String settlePriceId;
    /**
     * 经度
     */
	@TableField("LATITUDE")
	private String latitude;
    /**
     * 开户失败次数
     */
	@TableField("ACCOUNTFAILTIMES")
	private Integer accountfailtimes;
    /**
     * 商户报备审核人
     */
	@TableField("REPORT_UNIONPAY_OPERATOR")
	private String reportUnionpayOperator;
    /**
     * 机型是否会员机 0:否 1:是
     */
	@TableField("IS_MEMBER")
	private String isMember;
    /**
     * 成为商户审核时间
     */
	@TableField("MERC_UPDATE_TIME")
	private Date mercUpdateTime;
    /**
     * 成为商户提交时间
     */
	@TableField("MERC_APPLY_TIME")
	private Date mercApplyTime;
    /**
     * 报备失败原因
     */
	@TableField("REPORT_UNIONPAY_REMARK")
	private String reportUnionpayRemark;
    /**
     * 大pos报备银联状态  0-初始化，2-商户认证资料审核中，3-商户认证资料审核拒绝，4-待报备，5-已提交报备，1-报备成功，9-报备失败

     */
	@TableField("REPORT_UNIONPAY_STATUS")
	private String reportUnionpayStatus;
    /**
     * 营业地址
     */
	@TableField("UNIONPAY_ADDR")
	private String unionpayAddr;
    /**
     * 机具类型 0：小POS 1：大POS
     */
	@TableField("DEVICE_TYPE")
	private String deviceType;
    /**
     * mcc码
     */
	@TableField("MCC_CODE")
	private String mccCode;
    /**
     * 注册地址
     */
	@TableField("REGISTER_ADDR")
	private String registerAddr;
    /**
     * 商户简称
     */
	@TableField("MERC_SHORT")
	private String mercShort;
    /**
     * 商户名称
     */
	@TableField("MERC_NAME")
	private String mercName;
    /**
     * 商户定位市代码
     */
	@TableField("MERC_CITY_CODE")
	private String mercCityCode;
    /**
     * 代理商编号
     */
	@TableField("AGENTNO")
	private String agentno;
    /**
     * 是否开启闪付（设置闪付费率），Y-开启，N-未开启
     */
	@TableField("OPEN_QUICK_PASS")
	private String openQuickPass;
    /**
     * 纬度
     */
	@TableField("LONGITUDE")
	private String longitude;
    /**
     * 用户客户id
     */
	@TableField("USER_CUST_ID")
	private String userCustId;


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

	public String getDesMobile() {
		return desMobile;
	}

	public void setDesMobile(String desMobile) {
		this.desMobile = desMobile;
	}

	public String getDesIdcard() {
		return desIdcard;
	}

	public void setDesIdcard(String desIdcard) {
		this.desIdcard = desIdcard;
	}

	public String getOrderTradesn() {
		return orderTradesn;
	}

	public void setOrderTradesn(String orderTradesn) {
		this.orderTradesn = orderTradesn;
	}

	public String getCashPledgeRecordId() {
		return cashPledgeRecordId;
	}

	public void setCashPledgeRecordId(String cashPledgeRecordId) {
		this.cashPledgeRecordId = cashPledgeRecordId;
	}

	public String getDutyManager() {
		return dutyManager;
	}

	public void setDutyManager(String dutyManager) {
		this.dutyManager = dutyManager;
	}

	public String getIsNewVersion() {
		return isNewVersion;
	}

	public void setIsNewVersion(String isNewVersion) {
		this.isNewVersion = isNewVersion;
	}

	public String getSourceVersion() {
		return sourceVersion;
	}

	public void setSourceVersion(String sourceVersion) {
		this.sourceVersion = sourceVersion;
	}

	public Double getFixFeeAmt() {
		return fixFeeAmt;
	}

	public void setFixFeeAmt(Double fixFeeAmt) {
		this.fixFeeAmt = fixFeeAmt;
	}

	public Double getMinFeeAmt() {
		return minFeeAmt;
	}

	public void setMinFeeAmt(Double minFeeAmt) {
		this.minFeeAmt = minFeeAmt;
	}

	public Double getFeeRat() {
		return feeRat;
	}

	public void setFeeRat(Double feeRat) {
		this.feeRat = feeRat;
	}

	public String getRecoveryOpinion() {
		return recoveryOpinion;
	}

	public void setRecoveryOpinion(String recoveryOpinion) {
		this.recoveryOpinion = recoveryOpinion;
	}

	public String getFirstOpinion() {
		return firstOpinion;
	}

	public void setFirstOpinion(String firstOpinion) {
		this.firstOpinion = firstOpinion;
	}

	public String getCustomerManagerUserName() {
		return customerManagerUserName;
	}

	public void setCustomerManagerUserName(String customerManagerUserName) {
		this.customerManagerUserName = customerManagerUserName;
	}

	public String getCustomerManagerUserCode() {
		return customerManagerUserCode;
	}

	public void setCustomerManagerUserCode(String customerManagerUserCode) {
		this.customerManagerUserCode = customerManagerUserCode;
	}

	public Date getRecoveryTime() {
		return recoveryTime;
	}

	public void setRecoveryTime(Date recoveryTime) {
		this.recoveryTime = recoveryTime;
	}

	public String getRecoveryMan() {
		return recoveryMan;
	}

	public void setRecoveryMan(String recoveryMan) {
		this.recoveryMan = recoveryMan;
	}

	public Date getAgainVerifyTime() {
		return againVerifyTime;
	}

	public void setAgainVerifyTime(Date againVerifyTime) {
		this.againVerifyTime = againVerifyTime;
	}

	public String getAgainVerifer() {
		return againVerifer;
	}

	public void setAgainVerifer(String againVerifer) {
		this.againVerifer = againVerifer;
	}

	public Date getFirstVerifyTime() {
		return firstVerifyTime;
	}

	public void setFirstVerifyTime(Date firstVerifyTime) {
		this.firstVerifyTime = firstVerifyTime;
	}

	public String getFirstVerifer() {
		return firstVerifer;
	}

	public void setFirstVerifer(String firstVerifer) {
		this.firstVerifer = firstVerifer;
	}

	public String getUserOtherInfo() {
		return userOtherInfo;
	}

	public void setUserOtherInfo(String userOtherInfo) {
		this.userOtherInfo = userOtherInfo;
	}

	public String getUserLocationInfo() {
		return userLocationInfo;
	}

	public void setUserLocationInfo(String userLocationInfo) {
		this.userLocationInfo = userLocationInfo;
	}

	public String getOcrUserData() {
		return ocrUserData;
	}

	public void setOcrUserData(String ocrUserData) {
		this.ocrUserData = ocrUserData;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Double getCreditCardCapFee() {
		return creditCardCapFee;
	}

	public void setCreditCardCapFee(Double creditCardCapFee) {
		this.creditCardCapFee = creditCardCapFee;
	}

	public Double getDebitCardCapFee() {
		return debitCardCapFee;
	}

	public void setDebitCardCapFee(Double debitCardCapFee) {
		this.debitCardCapFee = debitCardCapFee;
	}

	public Double getCreditCardRate() {
		return creditCardRate;
	}

	public void setCreditCardRate(Double creditCardRate) {
		this.creditCardRate = creditCardRate;
	}

	public Double getDebitCardRate() {
		return debitCardRate;
	}

	public void setDebitCardRate(Double debitCardRate) {
		this.debitCardRate = debitCardRate;
	}

	public String getNewRemark() {
		return newRemark;
	}

	public void setNewRemark(String newRemark) {
		this.newRemark = newRemark;
	}

	public Double getCapFee() {
		return capFee;
	}

	public void setCapFee(Double capFee) {
		this.capFee = capFee;
	}

	public Double getOrgRate() {
		return orgRate;
	}

	public void setOrgRate(Double orgRate) {
		this.orgRate = orgRate;
	}

	public String getOrgno() {
		return orgno;
	}

	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}

	public String getFullSncode() {
		return fullSncode;
	}

	public void setFullSncode(String fullSncode) {
		this.fullSncode = fullSncode;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeviceState() {
		return deviceState;
	}

	public void setDeviceState(String deviceState) {
		this.deviceState = deviceState;
	}

	public String getTrmno() {
		return trmno;
	}

	public void setTrmno(String trmno) {
		this.trmno = trmno;
	}

	public Date getUnbundTime() {
		return unbundTime;
	}

	public void setUnbundTime(Date unbundTime) {
		this.unbundTime = unbundTime;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMerchantmobile() {
		return merchantmobile;
	}

	public void setMerchantmobile(String merchantmobile) {
		this.merchantmobile = merchantmobile;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getVerifyState() {
		return verifyState;
	}

	public void setVerifyState(String verifyState) {
		this.verifyState = verifyState;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getImgCode() {
		return imgCode;
	}

	public void setImgCode(String imgCode) {
		this.imgCode = imgCode;
	}

	public String getDeviceSn() {
		return deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getVerifyTime() {
		return verifyTime;
	}

	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getMerchantname() {
		return merchantname;
	}

	public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	}

	public String getMerchantno() {
		return merchantno;
	}

	public void setMerchantno(String merchantno) {
		this.merchantno = merchantno;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getProposer() {
		return proposer;
	}

	public void setProposer(String proposer) {
		this.proposer = proposer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSettleWhite() {
		return settleWhite;
	}

	public void setSettleWhite(String settleWhite) {
		this.settleWhite = settleWhite;
	}

	public Date getActiveEndDate() {
		return activeEndDate;
	}

	public void setActiveEndDate(Date activeEndDate) {
		this.activeEndDate = activeEndDate;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getInShopImgsn() {
		return inShopImgsn;
	}

	public void setInShopImgsn(String inShopImgsn) {
		this.inShopImgsn = inShopImgsn;
	}

	public String getShopImgsn() {
		return shopImgsn;
	}

	public void setShopImgsn(String shopImgsn) {
		this.shopImgsn = shopImgsn;
	}

	public String getLinencePhotoSn() {
		return linencePhotoSn;
	}

	public void setLinencePhotoSn(String linencePhotoSn) {
		this.linencePhotoSn = linencePhotoSn;
	}

	public String getSettlePriceId() {
		return settlePriceId;
	}

	public void setSettlePriceId(String settlePriceId) {
		this.settlePriceId = settlePriceId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Integer getAccountfailtimes() {
		return accountfailtimes;
	}

	public void setAccountfailtimes(Integer accountfailtimes) {
		this.accountfailtimes = accountfailtimes;
	}

	public String getReportUnionpayOperator() {
		return reportUnionpayOperator;
	}

	public void setReportUnionpayOperator(String reportUnionpayOperator) {
		this.reportUnionpayOperator = reportUnionpayOperator;
	}

	public String getIsMember() {
		return isMember;
	}

	public void setIsMember(String isMember) {
		this.isMember = isMember;
	}

	public Date getMercUpdateTime() {
		return mercUpdateTime;
	}

	public void setMercUpdateTime(Date mercUpdateTime) {
		this.mercUpdateTime = mercUpdateTime;
	}

	public Date getMercApplyTime() {
		return mercApplyTime;
	}

	public void setMercApplyTime(Date mercApplyTime) {
		this.mercApplyTime = mercApplyTime;
	}

	public String getReportUnionpayRemark() {
		return reportUnionpayRemark;
	}

	public void setReportUnionpayRemark(String reportUnionpayRemark) {
		this.reportUnionpayRemark = reportUnionpayRemark;
	}

	public String getReportUnionpayStatus() {
		return reportUnionpayStatus;
	}

	public void setReportUnionpayStatus(String reportUnionpayStatus) {
		this.reportUnionpayStatus = reportUnionpayStatus;
	}

	public String getUnionpayAddr() {
		return unionpayAddr;
	}

	public void setUnionpayAddr(String unionpayAddr) {
		this.unionpayAddr = unionpayAddr;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getMccCode() {
		return mccCode;
	}

	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getRegisterAddr() {
		return registerAddr;
	}

	public void setRegisterAddr(String registerAddr) {
		this.registerAddr = registerAddr;
	}

	public String getMercShort() {
		return mercShort;
	}

	public void setMercShort(String mercShort) {
		this.mercShort = mercShort;
	}

	public String getMercName() {
		return mercName;
	}

	public void setMercName(String mercName) {
		this.mercName = mercName;
	}

	public String getMercCityCode() {
		return mercCityCode;
	}

	public void setMercCityCode(String mercCityCode) {
		this.mercCityCode = mercCityCode;
	}

	public String getAgentno() {
		return agentno;
	}

	public void setAgentno(String agentno) {
		this.agentno = agentno;
	}

	public String getOpenQuickPass() {
		return openQuickPass;
	}

	public void setOpenQuickPass(String openQuickPass) {
		this.openQuickPass = openQuickPass;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getUserCustId() {
		return userCustId;
	}

	public void setUserCustId(String userCustId) {
		this.userCustId = userCustId;
	}

	@Override
	public String toString() {
		return "YstMachinesVerify{" +
			", desBankaccountno=" + desBankaccountno +
			", desBankmobile=" + desBankmobile +
			", desMobile=" + desMobile +
			", desIdcard=" + desIdcard +
			", orderTradesn=" + orderTradesn +
			", cashPledgeRecordId=" + cashPledgeRecordId +
			", dutyManager=" + dutyManager +
			", isNewVersion=" + isNewVersion +
			", sourceVersion=" + sourceVersion +
			", fixFeeAmt=" + fixFeeAmt +
			", minFeeAmt=" + minFeeAmt +
			", feeRat=" + feeRat +
			", recoveryOpinion=" + recoveryOpinion +
			", firstOpinion=" + firstOpinion +
			", customerManagerUserName=" + customerManagerUserName +
			", customerManagerUserCode=" + customerManagerUserCode +
			", recoveryTime=" + recoveryTime +
			", recoveryMan=" + recoveryMan +
			", againVerifyTime=" + againVerifyTime +
			", againVerifer=" + againVerifer +
			", firstVerifyTime=" + firstVerifyTime +
			", firstVerifer=" + firstVerifer +
			", userOtherInfo=" + userOtherInfo +
			", userLocationInfo=" + userLocationInfo +
			", ocrUserData=" + ocrUserData +
			", profession=" + profession +
			", creditCardCapFee=" + creditCardCapFee +
			", debitCardCapFee=" + debitCardCapFee +
			", creditCardRate=" + creditCardRate +
			", debitCardRate=" + debitCardRate +
			", newRemark=" + newRemark +
			", capFee=" + capFee +
			", orgRate=" + orgRate +
			", orgno=" + orgno +
			", fullSncode=" + fullSncode +
			", bankCode=" + bankCode +
			", bankType=" + bankType +
			", cityCode=" + cityCode +
			", provinceCode=" + provinceCode +
			", province=" + province +
			", city=" + city +
			", createTime=" + createTime +
			", deviceState=" + deviceState +
			", trmno=" + trmno +
			", unbundTime=" + unbundTime +
			", opinion=" + opinion +
			", fee=" + fee +
			", key=" + key +
			", merchantmobile=" + merchantmobile +
			", bankName=" + bankName +
			", verifyState=" + verifyState +
			", idNumber=" + idNumber +
			", branchName=" + branchName +
			", email=" + email +
			", userCode=" + userCode +
			", imgCode=" + imgCode +
			", deviceSn=" + deviceSn +
			", remark=" + remark +
			", updateTime=" + updateTime +
			", state=" + state +
			", verifyTime=" + verifyTime +
			", cardNo=" + cardNo +
			", merchantname=" + merchantname +
			", merchantno=" + merchantno +
			", mobile=" + mobile +
			", proposer=" + proposer +
			", id=" + id +
			", settleWhite=" + settleWhite +
			", activeEndDate=" + activeEndDate +
			", userType=" + userType +
			", businessLicense=" + businessLicense +
			", inShopImgsn=" + inShopImgsn +
			", shopImgsn=" + shopImgsn +
			", linencePhotoSn=" + linencePhotoSn +
			", settlePriceId=" + settlePriceId +
			", latitude=" + latitude +
			", accountfailtimes=" + accountfailtimes +
			", reportUnionpayOperator=" + reportUnionpayOperator +
			", isMember=" + isMember +
			", mercUpdateTime=" + mercUpdateTime +
			", mercApplyTime=" + mercApplyTime +
			", reportUnionpayRemark=" + reportUnionpayRemark +
			", reportUnionpayStatus=" + reportUnionpayStatus +
			", unionpayAddr=" + unionpayAddr +
			", deviceType=" + deviceType +
			", mccCode=" + mccCode +
			", registerAddr=" + registerAddr +
			", mercShort=" + mercShort +
			", mercName=" + mercName +
			", mercCityCode=" + mercCityCode +
			", agentno=" + agentno +
			", openQuickPass=" + openQuickPass +
			", longitude=" + longitude +
			", userCustId=" + userCustId +
			"}";
	}
}
