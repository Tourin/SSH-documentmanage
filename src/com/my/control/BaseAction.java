package com.my.control;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.my.bo.AccountBo;

public class BaseAction implements RequestAware, SessionAware {
	Map<String, Object> request;
	Map<String, Object> session;
	AccountBo accountbo;
	Integer pageNo;

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

}
