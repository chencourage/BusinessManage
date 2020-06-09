package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 库存调拨说明
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("STOCK_CONTROL_TIPS")
public class StockControlTips extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备用字段
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 创建时间
     */
	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 答案
     */
	@TableField("ANSWER")
	private String answer;
    /**
     * 问题
     */
	@TableField("QUESTION")
	private String question;
    /**
     * 主键
     */
    @TableId("ID")
	private String id;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "StockControlTips{" +
			", remark=" + remark +
			", createTime=" + createTime +
			", answer=" + answer +
			", question=" + question +
			", id=" + id +
			"}";
	}
}
