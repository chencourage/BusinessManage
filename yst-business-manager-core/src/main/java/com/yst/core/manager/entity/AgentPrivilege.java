package com.yst.core.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yst.core.base.BaseEntity;

/**
 * <p>
 * 权限
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@TableName("AGENT_PRIVILEGE")
public class AgentPrivilege extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableField("CREATE_TIME")
	private Date createTime;
    /**
     * 菜单访问域名, 例如:http://xxx.eptok.com:8080
     */
	@TableField("MENU_DOMAIN")
	private String menuDomain;
    /**
     * 备注  Q代表本身是个请求权限或者该导航/该页面包含请求权限
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 菜单序号
     */
	@TableField("MENU_SORT")
	private Long menuSort;
    /**
     * 叶子菜单权限的URL链接
     */
	@TableField("URL")
	private String url;
    /**
     * 权限级别
     */
	@TableField("MENU_LEVEL")
	private Integer menuLevel;
    /**
     * N 导航权限 P 页面权限 R 请求权限
     */
	@TableField("LIMITTYPE")
	private String limittype;
    /**
     * 权限名称
     */
	@TableField("LIMITNAME")
	private String limitname;
    /**
     * 父权限编号:一级菜单的父权限编号为0
     */
	@TableField("PARENT_LIMITID")
	private String parentLimitid;
    /**
     * 权限编号
     */
    @TableId("LIMITID")
	private String limitid;
    /**
     * 权限名称英文名称
     */
	@TableField("LIMIT_ENG_NAME")
	private String limitEngName;


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMenuDomain() {
		return menuDomain;
	}

	public void setMenuDomain(String menuDomain) {
		this.menuDomain = menuDomain;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getMenuSort() {
		return menuSort;
	}

	public void setMenuSort(Long menuSort) {
		this.menuSort = menuSort;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(Integer menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getLimittype() {
		return limittype;
	}

	public void setLimittype(String limittype) {
		this.limittype = limittype;
	}

	public String getLimitname() {
		return limitname;
	}

	public void setLimitname(String limitname) {
		this.limitname = limitname;
	}

	public String getParentLimitid() {
		return parentLimitid;
	}

	public void setParentLimitid(String parentLimitid) {
		this.parentLimitid = parentLimitid;
	}

	public String getLimitid() {
		return limitid;
	}

	public void setLimitid(String limitid) {
		this.limitid = limitid;
	}

	public String getLimitEngName() {
		return limitEngName;
	}

	public void setLimitEngName(String limitEngName) {
		this.limitEngName = limitEngName;
	}

	@Override
	public String toString() {
		return "AgentPrivilege{" +
			", createTime=" + createTime +
			", menuDomain=" + menuDomain +
			", remark=" + remark +
			", menuSort=" + menuSort +
			", url=" + url +
			", menuLevel=" + menuLevel +
			", limittype=" + limittype +
			", limitname=" + limitname +
			", parentLimitid=" + parentLimitid +
			", limitid=" + limitid +
			", limitEngName=" + limitEngName +
			"}";
	}
}
