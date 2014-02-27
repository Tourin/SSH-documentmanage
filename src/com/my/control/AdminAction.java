package com.my.control;

import java.util.List;

import com.my.bean.InfoAuthor;
import com.my.util.PageBean;

public class AdminAction extends BaseAction {

	public String addAuth() throws Exception {
		adminbo.addInfoAuthor(auth);
		request.put("message",
				"<script laguage='JavaScript'> alert('添加成功!') </script>");
		return "addauthor";
	}

	public String addUnit() throws Exception {
		adminbo.addInfoUnit(unit);
		request.put("message",
				"<script laguage='JavaScript'> alert('添加成功!') </script>");
		return "addunit";
	}

	public String listAuthorPrepare() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoAuthor> list;
		list = adminbo.getAllInfoAuthorByPage(pageNo, 15);
		totalRecords = adminbo.getTotalInfoAuthorRecords().intValue();
		PageBean<InfoAuthor> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("listAuthorPrepare_adm");
		return "listauthor";
	}

	public String searchAuthor() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoAuthor> list;
		list = adminbo.searchInfoAuthorByPage(pageNo, 15, auth);
		totalRecords = adminbo.searchTotalInfoAuthorRecords(auth).intValue();
		PageBean<InfoAuthor> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("searchAuthor_adm");
		return "listauthor";
	}
}
