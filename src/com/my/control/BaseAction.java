package com.my.control;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.my.bean.InfoAdmin;
import com.my.bean.InfoAuthor;
import com.my.bean.InfoComment;
import com.my.bean.InfoPeriodical;
import com.my.bean.InfoThesis;
import com.my.bean.InfoUnit;
import com.my.bean.InfoUser;
import com.my.bo.AccountBo;

public class BaseAction implements RequestAware, SessionAware {
	Map<String, Object> request;
	Map<String, Object> session;
	AccountBo accountbo;
	Integer pageNo;
	InfoAdmin admin;
	InfoUser user;
	InfoAuthor auth;
	InfoUnit unit;
	InfoThesis thesis;
	InfoPeriodical per;
	InfoComment comment;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setAccountbo(AccountBo accountbo) {
		this.accountbo = accountbo;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public InfoAdmin getAdmin() {
		return admin;
	}

	public void setAdmin(InfoAdmin admin) {
		this.admin = admin;
	}

	public InfoUser getUser() {
		return user;
	}

	public void setUser(InfoUser user) {
		this.user = user;
	}

	public InfoAuthor getAuth() {
		return auth;
	}

	public void setAuth(InfoAuthor auth) {
		this.auth = auth;
	}

	public InfoUnit getUnit() {
		return unit;
	}

	public void setUnit(InfoUnit unit) {
		this.unit = unit;
	}

	public InfoThesis getThesis() {
		return thesis;
	}

	public void setThesis(InfoThesis thesis) {
		this.thesis = thesis;
	}

	public InfoPeriodical getPer() {
		return per;
	}

	public void setPer(InfoPeriodical per) {
		this.per = per;
	}

	public InfoComment getComment() {
		return comment;
	}

	public void setComment(InfoComment comment) {
		this.comment = comment;
	}

}
