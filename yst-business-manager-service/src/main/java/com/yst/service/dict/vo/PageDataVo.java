package com.yst.service.dict.vo;

import java.util.List;

import com.yst.core.manager.entity.TDictionaryAction;
import com.yst.core.manager.entity.TDictionarySet;
import com.yst.core.manager.entity.TDictionaryType;
import com.yst.service.dict.constants.PageConstants;
import com.yst.support.util.StringUtil;

public class PageDataVo {
	
	private TDictionaryType dictionaryType;
	private List<TDictionarySet> dictionarySet;
	private List<TDictionaryAction> dictionaryAction;
	private List<TDictionarySet> dictionaryCondition;
	private List<TDictionarySet> primarySet;
	private List<TDictionarySet> editableSet;
	
	public TDictionaryType getDictionaryType() {
		return dictionaryType;
	}
	public void setDictionaryType(TDictionaryType dictionaryType) {
		this.dictionaryType = dictionaryType;
	}
	public List<TDictionarySet> getDictionarySet() {
		return dictionarySet;
	}
	public void setDictionarySet(List<TDictionarySet> dictionarySet) {
		this.dictionarySet = dictionarySet;
	}
	public List<TDictionaryAction> getDictionaryAction() {
		return dictionaryAction;
	}
	public void setDictionaryAction(List<TDictionaryAction> dictionaryAction) {
		this.dictionaryAction = dictionaryAction;
	}
	public List<TDictionarySet> getDictionaryCondition() {
		return dictionaryCondition;
	}
	public void setDictionaryCondition(List<TDictionarySet> dictionaryCondition) {
		this.dictionaryCondition = dictionaryCondition;
	}
	public List<TDictionarySet> getPrimarySet() {
		return primarySet;
	}
	public void setPrimarySet(List<TDictionarySet> primarySet) {
		this.primarySet = primarySet;
	}
	public List<TDictionarySet> getEditableSet() {
		return editableSet;
	}
	public void setEditableSet(List<TDictionarySet> editableSet) {
		this.editableSet = editableSet;
	}
	
	public String getQuerySql() {
		if(dictionaryType==null) {
			return null;
		}
		StringBuffer filedbuffer = new StringBuffer();
		StringBuffer tablebuffer = new StringBuffer();
		tablebuffer.append("select ");
		if(dictionarySet!=null&&dictionarySet.size()>0) {
			for(TDictionarySet ts:dictionarySet) {
				if(StringUtil.isNotEmpty(ts.getSqlFormat())) {//如果有sql格式
					if(ts.getSqlFormat().indexOf("{col}")>0) {//to_char('yyyy-mm-dd',{col})
						filedbuffer.append(StringUtil.replaceLast(ts.getSqlFormat(), "{col}", ts.getBfsCode())+" as "+ts.getFieldCode()+", ");
					}else {
						filedbuffer.append("to_char("+ts.getBfsCode()+",'"+ts.getSqlFormat()+"') as "+ts.getFieldCode()+", ");
					}
				}else {
					filedbuffer.append(ts.getBfsCode()+" as "+ts.getFieldCode()+", ");
				}
			}
		}
		tablebuffer.append(StringUtil.replaceLast(filedbuffer.toString(), ",", ""));
		tablebuffer.append(" from ").append(dictionaryType.getBfsTablename());
		if(StringUtil.isNotEmpty(dictionaryType.getCondition())) {
			tablebuffer.append(" where ").append(dictionaryType.getCondition());
		}
		return tablebuffer.toString();
	}
	
	public String getInsertSql () {
		if(dictionaryType==null) {
			return null;
		}
		StringBuffer columnbuffer = new StringBuffer();
		StringBuffer valuebuffer = new StringBuffer();
		StringBuffer tablebuffer = new StringBuffer();
		tablebuffer.append("insert into ").append(dictionaryType.getBfsTablename()).append(" ");
		if(dictionarySet!=null&&dictionarySet.size()>0) {
			for(TDictionarySet ts:dictionarySet) {
				columnbuffer.append(ts.getBfsCode()).append(",");
				if(PageConstants.DATE_STR.equals(ts.getDataType())||PageConstants.DATETIME_STR.equals(ts.getDataType())||PageConstants.TIMESTAMP_STR.equals(ts.getDataType())) {//如果有sql日期格式
					valuebuffer.append("to_date(:"+ts.getFieldCode()+",'"+ts.getSqlFormat()+"'),");
				}else {
					valuebuffer.append(":"+ts.getFieldCode()+",");
				}
			}
		}
		tablebuffer.append("(").append(StringUtil.replaceLast(columnbuffer.toString(), ",", "")).append(") values ");
		tablebuffer.append("(").append(StringUtil.replaceLast(valuebuffer.toString(), ",", "")).append(")");
		return tablebuffer.toString();
	}
	
	public String getUpdateSql () {
		if(dictionaryType==null) {
			return null;
		}
		StringBuffer filedbuffer = new StringBuffer();
		StringBuffer tablebuffer = new StringBuffer();
		if(editableSet!=null&&editableSet.size()>0) {
			tablebuffer.append("update ").append(dictionaryType.getBfsTablename()).append(" set ");
			for(TDictionarySet ts:editableSet) {
				if(PageConstants.DATE_STR.equals(ts.getDataType())||PageConstants.DATETIME_STR.equals(ts.getDataType())||PageConstants.TIMESTAMP_STR.equals(ts.getDataType())) {//如果有sql日期格式
					filedbuffer.append(ts.getBfsCode()+"="+"to_date(:"+ts.getFieldCode()+",'"+ts.getSqlFormat()+"'),");
				}else {
					filedbuffer.append(ts.getBfsCode()+"=:"+ts.getFieldCode() +", ");
				}
			}
			tablebuffer.append(StringUtil.replaceLast(filedbuffer.toString(), ",", ""));
			tablebuffer.append(" where 1=1 ");
		}
		if(primarySet!=null&&primarySet.size()>0) {
			for(TDictionarySet ts:primarySet) {
				tablebuffer.append(" and "+ts.getBfsCode()+"=:"+ts.getFieldCode());
			}
		}
		return tablebuffer.toString();
	}
	
	public String getOrderFlag() {
		if(StringUtil.isNotEmpty(dictionaryType.getOrderFlag())) {
			if(dictionaryType.getOrderFlag().startsWith("order by")||dictionaryType.getOrderFlag().startsWith("ORDER BY")) {
				return dictionaryType.getOrderFlag();
			}else {
				return " order by " + dictionaryType.getOrderFlag();
			}
		}else {
			return "";
		}
	}
	
	public TDictionaryAction getAction (String code) {
		TDictionaryAction action = null;
		if(dictionaryAction!=null&&dictionaryAction.size()>0) {
			for(TDictionaryAction ta:dictionaryAction) {
				if(ta.getCode().equals(code)) {
					action = ta;
					break;
				}
			}
		}
		return action;
	}
	
}
