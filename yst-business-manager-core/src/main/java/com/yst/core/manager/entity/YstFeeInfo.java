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
@TableName("YST_FEE_INFO")
public class YstFeeInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 对应数据来源ID
     */
	@TableField("SRC_ID")
	private String srcId;
    /**
     * 操作人
     */
	@TableField("OPERATOR")
	private String operator;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 业务类型  01表示T+1； 02表示D+0； 03表示Pay卡（通用二维码）
     */
	@TableField("BUSI_TYPE")
	private String busiType;
    /**
     * 状态 00生效 99失效
     */
	@TableField("ENABLE")
	private String enable;
    /**
     * json字符串 存放费率详细信息
     */
	@TableField("FEE_DETAIL")
	private String feeDetail;
    /**
     * 代理商名称
     */
	@TableField("AGENT_NAME")
	private String agentName;
    /**
     * 代理商号
     */
	@TableField("AGENT_NO")
	private String agentNo;
    /**
     * 主键id
     */
    @TableId("FEE_ID")
	private String feeId;


	public String getSrcId() {
		return srcId;
	}

	public void setSrcId(String srcId) {
		this.srcId = srcId;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getFeeDetail() {
		return feeDetail;
	}

	public void setFeeDetail(String feeDetail) {
		this.feeDetail = feeDetail;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}

	public String getFeeId() {
		return feeId;
	}

	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}

	@Override
	public String toString() {
		return "YstFeeInfo{" +
			", srcId=" + srcId +
			", operator=" + operator +
			", createTime=" + createTime +
			", busiType=" + busiType +
			", enable=" + enable +
			", feeDetail=" + feeDetail +
			", agentName=" + agentName +
			", agentNo=" + agentNo +
			", feeId=" + feeId +
			"}";
	}
}
