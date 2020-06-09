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
@TableName("YST_ADD_AGENT")
public class YstAddAgent extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * mPOS是否返现N不返，Y返现
     */
	@TableField("IS_RTN_CASH")
	private String isRtnCash;
    /**
     * 最后一次操作时间
     */
	@TableField("LAST_OPR_TIME")
	private Date lastOprTime;
    /**
     * 是否授权提现N关闭，Y开启
     */
	@TableField("IS_WITHDRAW")
	private String isWithdraw;
    /**
     * 是否签协议N否，Y是
     */
	@TableField("IS_SIGN_AGREE")
	private String isSignAgree;
    /**
     * 直签代理商所属分公司代理商ID
     */
	@TableField("BELONG_TO_ORG")
	private String belongToOrg;
    /**
     * 代理类型：S直签代理，C直营代理
     */
	@TableField("AGT_TYPE")
	private String agtType;
    /**
     * 是否分公司代理(Y:表示是分公司代理；Z：标识地区代理；空表示不是分公司代理）
     */
	@TableField("IS_ORG_AGT")
	private String isOrgAgt;
    /**
     * 支行行号
     */
	@TableField("BANK_CODE")
	private String bankCode;
    /**
     * 银行市代码
     */
	@TableField("BANK_CITY_CODE")
	private String bankCityCode;
    /**
     * 银行市
     */
	@TableField("BANK_CITY")
	private String bankCity;
    /**
     * 注销开关：0或null可注销 1不可注销
     */
	@TableField("STATE_CONFIG")
	private String stateConfig;
    /**
     * 代理商状态：0或null正常，1已注销，2注销审核，3已驳回，4已冻结
     */
	@TableField("AGENT_STATE")
	private String agentState;
    /**
     * 注销时间
     */
	@TableField("CANCEL_TIME")
	private Date cancelTime;
    /**
     * 申请注销时间
     */
	@TableField("APPLY_CANCEL_TIME")
	private Date applyCancelTime;
    /**
     * 备注
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 创建人
     */
	@TableField("CREATOR")
	private String creator;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 线性关系
     */
	@TableField("LINEAR")
	private String linear;
    /**
     * 法人联系方式
     */
	@TableField("LEGAL_TEL_NO")
	private String legalTelNo;
    /**
     * 代理商级别
     */
	@TableField("AGENT_MERC_LEVEL")
	private String agentMercLevel;
    /**
     * 上级代理商名称
     */
	@TableField("PARENT_AGENT_NAME")
	private String parentAgentName;
    /**
     * 代理商名称
     */
	@TableField("AGENT_MERC_NAME")
	private String agentMercName;
    /**
     * 上级代理商编号
     */
	@TableField("PARENT_AGENT_ID")
	private String parentAgentId;
    /**
     * 代理商编号
     */
    @TableId("AGENT_MERC_ID")
	private String agentMercId;
    /**
     * 更新时间
     */
	@TableField("UPDATE_TIME")
	private Date updateTime;
    /**
     * 合同号
     */
	@TableField("CONTRACT_NUMBER")
	private String contractNumber;
    /**
     * 11 表示是机构 ，21 表示是个人
     */
	@TableField("ORG_FLAG")
	private String orgFlag;
	@TableField("REMARK4")
	private String remark4;
	@TableField("REMARK3")
	private String remark3;
	@TableField("REMARK2")
	private String remark2;
	@TableField("REMARK1")
	private String remark1;
    /**
     * 结算账户名称
     */
	@TableField("BANK_ACCOUNT_NAME")
	private String bankAccountName;
    /**
     * 支行名称
     */
	@TableField("BRANCH_NAME")
	private String branchName;
    /**
     *  支行地址
     */
	@TableField("BRANCH_ADDRESS")
	private String branchAddress;
    /**
     *  开户银行名称
     */
	@TableField("BANK_NAME")
	private String bankName;
    /**
     * 结算银行卡号
     */
	@TableField("BANK_ACCOUNT_NO")
	private String bankAccountNo;
    /**
     * 00开启，01关闭
     */
	@TableField("INSTALL_PLAN")
	private String installPlan;
    /**
     * 自定义大POS激活返现规则
     */
	@TableField("SELF_POS_MARKETING_ID")
	private String selfPosMarketingId;
    /**
     * 是否显示00:显示,01:不显示
     */
	@TableField("IS_SHOW")
	private String isShow;
    /**
     * 大POS是否返现N不返，Y返现
     */
	@TableField("IS_POS_RTN_CASH")
	private String isPosRtnCash;
    /**
     * 机构mpos激活返现规则
     */
	@TableField("ORG_MARKETING_ID")
	private String orgMarketingId;
    /**
     * 用户号
     */
	@TableField("USER_CODE")
	private String userCode;
    /**
     * 分公司发展标识00：分公司发展
     */
	@TableField("BRANCH_OFF")
	private String branchOff;
    /**
     * 00大POS机构
     */
	@TableField("POS_ORG_FLAG")
	private String posOrgFlag;
    /**
     * 00不允许修改费率
     */
	@TableField("NOT_ALLOW_CHANGE_FEE")
	private String notAllowChangeFee;
    /**
     * 机构大POS激活返现规则
     */
	@TableField("POS_MARKETING_ID")
	private String posMarketingId;
    /**
     * 费率套餐ID
     */
	@TableField("FEE_PACKAGE_ID")
	private String feePackageId;
    /**
     * 资料提交到哪一步，0或者空表示已完成，1表示第一步已提交，2表示第二步已提交，以此类推
     */
	@TableField("SUBMIT_STEP")
	private Integer submitStep;
    /**
     * 大pos返现规则
     */
	@TableField("COMP_CB_POS_ID")
	private String compCbPosId;
    /**
     * 通码指定银行名称
     */
	@TableField("NOMINATED_BANK_NAME")
	private String nominatedBankName;
    /**
     * 资料提交唯一标识
     */
	@TableField("SUBMIT_ID")
	private String submitId;
    /**
     * 大pos借记卡费率ID
     */
	@TableField("POS_DEBIT_FEE_ID")
	private String posDebitFeeId;
    /**
     * 大pos贷记卡费率ID
     */
	@TableField("POS_CREDIT_FEE_ID")
	private String posCreditFeeId;
    /**
     * 公司返现规则绑定时间
     */
	@TableField("COMP_CB_BIND_TIME")
	private Date compCbBindTime;
    /**
     * 公司返现规则权限开关：Y-开，N-关
     */
	@TableField("COMP_CB_SWITCH")
	private String compCbSwitch;
    /**
     * 公司返现规则，default-直签代理商默认返现规则，branch_default-分公司默认返现规则
     */
	@TableField("COMP_CB_ID")
	private String compCbId;
    /**
     * 自定义返现活动规则权限开关：Y-开，N-关
     */
	@TableField("ACT_CASHBACK_SWITCH")
	private String actCashbackSwitch;
    /**
     * 自定义mpos激活返现规则
     */
	@TableField("MARKETING_ID")
	private String marketingId;
    /**
     * 00：团长允许下拨直签
     */
	@TableField("IS_CAPTAIN")
	private String isCaptain;
    /**
     * 集团大商户00
     */
	@TableField("IS_GROUP_AGENT")
	private String isGroupAgent;
    /**
     * 不双重返现标志，Y-不返现，N或空-返现
     */
	@TableField("NO_REWARD")
	private String noReward;
	@TableField("NO_RTN_CASH")
	private String noRtnCash;
    /**
     * 通码强制报备开关（0：关，1：开）
     */
	@TableField("COMPULSORYPREPARATION_SWITCH")
	private String compulsorypreparationSwitch;
    /**
     * 通码指定银行
     */
	@TableField("NOMINATED_BANK")
	private String nominatedBank;
    /**
     * 注销原因
     */
	@TableField("CANCLE_REASON")
	private String cancleReason;
    /**
     * 分公司子账号标识01：拓展账户，02：员工账户，03：直营直签账户
     */
	@TableField("BRANCH_TYPE")
	private String branchType;
    /**
     * 代开票机构（00）
     */
	@TableField("STOCK")
	private String stock;
    /**
     * N:不开票 Y或空为代理商自己开票
     */
	@TableField("NOT_ISSUE_INVOICE")
	private String notIssueInvoice;
    /**
     * 代开票代理
     */
	@TableField("ISSUE_MERC_ID")
	private String issueMercId;
    /**
     * 税点
     */
	@TableField("TAX_POINT")
	private Double taxPoint;
    /**
     * 是否允许自选商户00允许
     */
	@TableField("IS_ROUTE_MERC")
	private String isRouteMerc;
    /**
     * 加密手机号
     */
	@TableField("DES_MOBILE")
	private String desMobile;
	@TableField("CLERK")
	private String clerk;
    /**
     * 图片流水
     */
	@TableField("IMGSN")
	private String imgsn;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 非标状态开启限制时间  jsonarray如：["1","2","3","4","5","6","7"]
     */
	@TableField("UNSTANDARD_LIMITED_DAY")
	private String unstandardLimitedDay;
    /**
     * 代理商非标状态开关 00-开 99-关 空-未设置
     */
	@TableField("UNSTANDARD_STATE")
	private String unstandardState;
    /**
     * mpos借记卡费率ID
     */
	@TableField("DEBIT_FEE_ID")
	private String debitFeeId;
    /**
     * mpos贷记卡费率ID
     */
	@TableField("CREDIT_FEE_ID")
	private String creditFeeId;
    /**
     * 机构名称
     */
	@TableField("ORGNAME")
	private String orgname;
    /**
     * 机构号
     */
	@TableField("ORGNO")
	private String orgno;
    /**
     * pay卡结算费率ID
     */
	@TableField("PAY_FEE_ID")
	private String payFeeId;
    /**
     * 会员POS是否返现N不返，Y返现
     */
	@TableField("IS_MEM_RTN_CASH")
	private String isMemRtnCash;
    /**
     * 会员POS公司返现规则，默认default_mem
     */
	@TableField("MEM_COMP_CB_ID")
	private String memCompCbId;
    /**
     * 是否允许分享二维码00允许，01不允许
     */
	@TableField("IS_SHARE")
	private String isShare;
    /**
     * mpos商户会员签约费率（mpos_fee_rate）
     */
	@TableField("MEM_FEE_ID")
	private String memFeeId;
    /**
     * 支付密码（密文）
     */
	@TableField("PAY_PASSWORD")
	private String payPassword;
    /**
     * 会员POS机构激活返现规则
     */
	@TableField("ORG_MEM_COMP_CB_ID")
	private String orgMemCompCbId;


	public String getIsRtnCash() {
		return isRtnCash;
	}

	public void setIsRtnCash(String isRtnCash) {
		this.isRtnCash = isRtnCash;
	}

	public Date getLastOprTime() {
		return lastOprTime;
	}

	public void setLastOprTime(Date lastOprTime) {
		this.lastOprTime = lastOprTime;
	}

	public String getIsWithdraw() {
		return isWithdraw;
	}

	public void setIsWithdraw(String isWithdraw) {
		this.isWithdraw = isWithdraw;
	}

	public String getIsSignAgree() {
		return isSignAgree;
	}

	public void setIsSignAgree(String isSignAgree) {
		this.isSignAgree = isSignAgree;
	}

	public String getBelongToOrg() {
		return belongToOrg;
	}

	public void setBelongToOrg(String belongToOrg) {
		this.belongToOrg = belongToOrg;
	}

	public String getAgtType() {
		return agtType;
	}

	public void setAgtType(String agtType) {
		this.agtType = agtType;
	}

	public String getIsOrgAgt() {
		return isOrgAgt;
	}

	public void setIsOrgAgt(String isOrgAgt) {
		this.isOrgAgt = isOrgAgt;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankCityCode() {
		return bankCityCode;
	}

	public void setBankCityCode(String bankCityCode) {
		this.bankCityCode = bankCityCode;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getStateConfig() {
		return stateConfig;
	}

	public void setStateConfig(String stateConfig) {
		this.stateConfig = stateConfig;
	}

	public String getAgentState() {
		return agentState;
	}

	public void setAgentState(String agentState) {
		this.agentState = agentState;
	}

	public Date getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public Date getApplyCancelTime() {
		return applyCancelTime;
	}

	public void setApplyCancelTime(Date applyCancelTime) {
		this.applyCancelTime = applyCancelTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLinear() {
		return linear;
	}

	public void setLinear(String linear) {
		this.linear = linear;
	}

	public String getLegalTelNo() {
		return legalTelNo;
	}

	public void setLegalTelNo(String legalTelNo) {
		this.legalTelNo = legalTelNo;
	}

	public String getAgentMercLevel() {
		return agentMercLevel;
	}

	public void setAgentMercLevel(String agentMercLevel) {
		this.agentMercLevel = agentMercLevel;
	}

	public String getParentAgentName() {
		return parentAgentName;
	}

	public void setParentAgentName(String parentAgentName) {
		this.parentAgentName = parentAgentName;
	}

	public String getAgentMercName() {
		return agentMercName;
	}

	public void setAgentMercName(String agentMercName) {
		this.agentMercName = agentMercName;
	}

	public String getParentAgentId() {
		return parentAgentId;
	}

	public void setParentAgentId(String parentAgentId) {
		this.parentAgentId = parentAgentId;
	}

	public String getAgentMercId() {
		return agentMercId;
	}

	public void setAgentMercId(String agentMercId) {
		this.agentMercId = agentMercId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getOrgFlag() {
		return orgFlag;
	}

	public void setOrgFlag(String orgFlag) {
		this.orgFlag = orgFlag;
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

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getInstallPlan() {
		return installPlan;
	}

	public void setInstallPlan(String installPlan) {
		this.installPlan = installPlan;
	}

	public String getSelfPosMarketingId() {
		return selfPosMarketingId;
	}

	public void setSelfPosMarketingId(String selfPosMarketingId) {
		this.selfPosMarketingId = selfPosMarketingId;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	public String getIsPosRtnCash() {
		return isPosRtnCash;
	}

	public void setIsPosRtnCash(String isPosRtnCash) {
		this.isPosRtnCash = isPosRtnCash;
	}

	public String getOrgMarketingId() {
		return orgMarketingId;
	}

	public void setOrgMarketingId(String orgMarketingId) {
		this.orgMarketingId = orgMarketingId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getBranchOff() {
		return branchOff;
	}

	public void setBranchOff(String branchOff) {
		this.branchOff = branchOff;
	}

	public String getPosOrgFlag() {
		return posOrgFlag;
	}

	public void setPosOrgFlag(String posOrgFlag) {
		this.posOrgFlag = posOrgFlag;
	}

	public String getNotAllowChangeFee() {
		return notAllowChangeFee;
	}

	public void setNotAllowChangeFee(String notAllowChangeFee) {
		this.notAllowChangeFee = notAllowChangeFee;
	}

	public String getPosMarketingId() {
		return posMarketingId;
	}

	public void setPosMarketingId(String posMarketingId) {
		this.posMarketingId = posMarketingId;
	}

	public String getFeePackageId() {
		return feePackageId;
	}

	public void setFeePackageId(String feePackageId) {
		this.feePackageId = feePackageId;
	}

	public Integer getSubmitStep() {
		return submitStep;
	}

	public void setSubmitStep(Integer submitStep) {
		this.submitStep = submitStep;
	}

	public String getCompCbPosId() {
		return compCbPosId;
	}

	public void setCompCbPosId(String compCbPosId) {
		this.compCbPosId = compCbPosId;
	}

	public String getNominatedBankName() {
		return nominatedBankName;
	}

	public void setNominatedBankName(String nominatedBankName) {
		this.nominatedBankName = nominatedBankName;
	}

	public String getSubmitId() {
		return submitId;
	}

	public void setSubmitId(String submitId) {
		this.submitId = submitId;
	}

	public String getPosDebitFeeId() {
		return posDebitFeeId;
	}

	public void setPosDebitFeeId(String posDebitFeeId) {
		this.posDebitFeeId = posDebitFeeId;
	}

	public String getPosCreditFeeId() {
		return posCreditFeeId;
	}

	public void setPosCreditFeeId(String posCreditFeeId) {
		this.posCreditFeeId = posCreditFeeId;
	}

	public Date getCompCbBindTime() {
		return compCbBindTime;
	}

	public void setCompCbBindTime(Date compCbBindTime) {
		this.compCbBindTime = compCbBindTime;
	}

	public String getCompCbSwitch() {
		return compCbSwitch;
	}

	public void setCompCbSwitch(String compCbSwitch) {
		this.compCbSwitch = compCbSwitch;
	}

	public String getCompCbId() {
		return compCbId;
	}

	public void setCompCbId(String compCbId) {
		this.compCbId = compCbId;
	}

	public String getActCashbackSwitch() {
		return actCashbackSwitch;
	}

	public void setActCashbackSwitch(String actCashbackSwitch) {
		this.actCashbackSwitch = actCashbackSwitch;
	}

	public String getMarketingId() {
		return marketingId;
	}

	public void setMarketingId(String marketingId) {
		this.marketingId = marketingId;
	}

	public String getIsCaptain() {
		return isCaptain;
	}

	public void setIsCaptain(String isCaptain) {
		this.isCaptain = isCaptain;
	}

	public String getIsGroupAgent() {
		return isGroupAgent;
	}

	public void setIsGroupAgent(String isGroupAgent) {
		this.isGroupAgent = isGroupAgent;
	}

	public String getNoReward() {
		return noReward;
	}

	public void setNoReward(String noReward) {
		this.noReward = noReward;
	}

	public String getNoRtnCash() {
		return noRtnCash;
	}

	public void setNoRtnCash(String noRtnCash) {
		this.noRtnCash = noRtnCash;
	}

	public String getCompulsorypreparationSwitch() {
		return compulsorypreparationSwitch;
	}

	public void setCompulsorypreparationSwitch(String compulsorypreparationSwitch) {
		this.compulsorypreparationSwitch = compulsorypreparationSwitch;
	}

	public String getNominatedBank() {
		return nominatedBank;
	}

	public void setNominatedBank(String nominatedBank) {
		this.nominatedBank = nominatedBank;
	}

	public String getCancleReason() {
		return cancleReason;
	}

	public void setCancleReason(String cancleReason) {
		this.cancleReason = cancleReason;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getNotIssueInvoice() {
		return notIssueInvoice;
	}

	public void setNotIssueInvoice(String notIssueInvoice) {
		this.notIssueInvoice = notIssueInvoice;
	}

	public String getIssueMercId() {
		return issueMercId;
	}

	public void setIssueMercId(String issueMercId) {
		this.issueMercId = issueMercId;
	}

	public Double getTaxPoint() {
		return taxPoint;
	}

	public void setTaxPoint(Double taxPoint) {
		this.taxPoint = taxPoint;
	}

	public String getIsRouteMerc() {
		return isRouteMerc;
	}

	public void setIsRouteMerc(String isRouteMerc) {
		this.isRouteMerc = isRouteMerc;
	}

	public String getDesMobile() {
		return desMobile;
	}

	public void setDesMobile(String desMobile) {
		this.desMobile = desMobile;
	}

	public String getClerk() {
		return clerk;
	}

	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	public String getImgsn() {
		return imgsn;
	}

	public void setImgsn(String imgsn) {
		this.imgsn = imgsn;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getUnstandardLimitedDay() {
		return unstandardLimitedDay;
	}

	public void setUnstandardLimitedDay(String unstandardLimitedDay) {
		this.unstandardLimitedDay = unstandardLimitedDay;
	}

	public String getUnstandardState() {
		return unstandardState;
	}

	public void setUnstandardState(String unstandardState) {
		this.unstandardState = unstandardState;
	}

	public String getDebitFeeId() {
		return debitFeeId;
	}

	public void setDebitFeeId(String debitFeeId) {
		this.debitFeeId = debitFeeId;
	}

	public String getCreditFeeId() {
		return creditFeeId;
	}

	public void setCreditFeeId(String creditFeeId) {
		this.creditFeeId = creditFeeId;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getOrgno() {
		return orgno;
	}

	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}

	public String getPayFeeId() {
		return payFeeId;
	}

	public void setPayFeeId(String payFeeId) {
		this.payFeeId = payFeeId;
	}

	public String getIsMemRtnCash() {
		return isMemRtnCash;
	}

	public void setIsMemRtnCash(String isMemRtnCash) {
		this.isMemRtnCash = isMemRtnCash;
	}

	public String getMemCompCbId() {
		return memCompCbId;
	}

	public void setMemCompCbId(String memCompCbId) {
		this.memCompCbId = memCompCbId;
	}

	public String getIsShare() {
		return isShare;
	}

	public void setIsShare(String isShare) {
		this.isShare = isShare;
	}

	public String getMemFeeId() {
		return memFeeId;
	}

	public void setMemFeeId(String memFeeId) {
		this.memFeeId = memFeeId;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public String getOrgMemCompCbId() {
		return orgMemCompCbId;
	}

	public void setOrgMemCompCbId(String orgMemCompCbId) {
		this.orgMemCompCbId = orgMemCompCbId;
	}

	@Override
	public String toString() {
		return "YstAddAgent{" +
			", isRtnCash=" + isRtnCash +
			", lastOprTime=" + lastOprTime +
			", isWithdraw=" + isWithdraw +
			", isSignAgree=" + isSignAgree +
			", belongToOrg=" + belongToOrg +
			", agtType=" + agtType +
			", isOrgAgt=" + isOrgAgt +
			", bankCode=" + bankCode +
			", bankCityCode=" + bankCityCode +
			", bankCity=" + bankCity +
			", stateConfig=" + stateConfig +
			", agentState=" + agentState +
			", cancelTime=" + cancelTime +
			", applyCancelTime=" + applyCancelTime +
			", remark=" + remark +
			", creator=" + creator +
			", createTime=" + createTime +
			", linear=" + linear +
			", legalTelNo=" + legalTelNo +
			", agentMercLevel=" + agentMercLevel +
			", parentAgentName=" + parentAgentName +
			", agentMercName=" + agentMercName +
			", parentAgentId=" + parentAgentId +
			", agentMercId=" + agentMercId +
			", updateTime=" + updateTime +
			", contractNumber=" + contractNumber +
			", orgFlag=" + orgFlag +
			", remark4=" + remark4 +
			", remark3=" + remark3 +
			", remark2=" + remark2 +
			", remark1=" + remark1 +
			", bankAccountName=" + bankAccountName +
			", branchName=" + branchName +
			", branchAddress=" + branchAddress +
			", bankName=" + bankName +
			", bankAccountNo=" + bankAccountNo +
			", installPlan=" + installPlan +
			", selfPosMarketingId=" + selfPosMarketingId +
			", isShow=" + isShow +
			", isPosRtnCash=" + isPosRtnCash +
			", orgMarketingId=" + orgMarketingId +
			", userCode=" + userCode +
			", branchOff=" + branchOff +
			", posOrgFlag=" + posOrgFlag +
			", notAllowChangeFee=" + notAllowChangeFee +
			", posMarketingId=" + posMarketingId +
			", feePackageId=" + feePackageId +
			", submitStep=" + submitStep +
			", compCbPosId=" + compCbPosId +
			", nominatedBankName=" + nominatedBankName +
			", submitId=" + submitId +
			", posDebitFeeId=" + posDebitFeeId +
			", posCreditFeeId=" + posCreditFeeId +
			", compCbBindTime=" + compCbBindTime +
			", compCbSwitch=" + compCbSwitch +
			", compCbId=" + compCbId +
			", actCashbackSwitch=" + actCashbackSwitch +
			", marketingId=" + marketingId +
			", isCaptain=" + isCaptain +
			", isGroupAgent=" + isGroupAgent +
			", noReward=" + noReward +
			", noRtnCash=" + noRtnCash +
			", compulsorypreparationSwitch=" + compulsorypreparationSwitch +
			", nominatedBank=" + nominatedBank +
			", cancleReason=" + cancleReason +
			", branchType=" + branchType +
			", stock=" + stock +
			", notIssueInvoice=" + notIssueInvoice +
			", issueMercId=" + issueMercId +
			", taxPoint=" + taxPoint +
			", isRouteMerc=" + isRouteMerc +
			", desMobile=" + desMobile +
			", clerk=" + clerk +
			", imgsn=" + imgsn +
			", operator=" + operator +
			", unstandardLimitedDay=" + unstandardLimitedDay +
			", unstandardState=" + unstandardState +
			", debitFeeId=" + debitFeeId +
			", creditFeeId=" + creditFeeId +
			", orgname=" + orgname +
			", orgno=" + orgno +
			", payFeeId=" + payFeeId +
			", isMemRtnCash=" + isMemRtnCash +
			", memCompCbId=" + memCompCbId +
			", isShare=" + isShare +
			", memFeeId=" + memFeeId +
			", payPassword=" + payPassword +
			", orgMemCompCbId=" + orgMemCompCbId +
			"}";
	}
}
