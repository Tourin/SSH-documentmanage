package com.my.control;

import java.util.List;

import com.my.bean.InfoAuthor;
import com.my.bean.InfoUnit;
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

	public String removeAuthor() throws Exception {
		adminbo.removeInfoAuthor(auth.getAuthorId());
		return this.listAuthorPrepare();
	}

	public String editAuthorPrepare() throws Exception {
		auth = adminbo.getInfoAuthorById(InfoAuthor.class, auth.getAuthorId());
		request.put("auth", auth);
		return "editauthor";
	}

	public String editAuthor() throws Exception {
		if (adminbo.editInfoAuthor(auth)) {
			request.put("message",
					"<script laguage='JavaScript'> alert('修改成功!') </script>");
			return this.listAuthorPrepare();
		} else {
			request.put("message", "修改失败!");
		}
		return this.listAuthorPrepare();
	}

	public String listUnitPrepare() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoUnit> list;
		list = adminbo.getAllInfoUnitByPage(pageNo, 15);
		totalRecords = adminbo.getTotalInfoUnitRecords().intValue();
		PageBean<InfoUnit> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("listUnitPrepare_adm");
		return "listunit";
	}

	public String searchUnit() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoUnit> list;
		list = adminbo.searchInfoUnitByPage(pageNo, 15, unit);
		totalRecords = adminbo.searchTotalInfoUnitRecords(unit).intValue();
		PageBean<InfoUnit> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("searchUnit_adm");
		return "listunit";
	}

	public String removeUnit() throws Exception {
		adminbo.removeInfoUnit(unit.getUnitId());
		return this.listUnitPrepare();
	}

	public String editUnitPrepare() throws Exception {
		unit = adminbo.getInfoUnitById(InfoUnit.class, unit.getUnitId());
		request.put("unit", unit);
		return "editunit";
	}

	public String editUnit() throws Exception {
		if (adminbo.editInfoUnit(unit)) {
			request.put("message",
					"<script laguage='JavaScript'> alert('修改成功!') </script>");
			return this.listUnitPrepare();
		} else {
			request.put("message", "修改失败!");
		}
		return this.listUnitPrepare();
	}
}
