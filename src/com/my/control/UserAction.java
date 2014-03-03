package com.my.control;

import java.util.Date;
import java.util.List;

import com.my.bean.InfoAdmin;
import com.my.bean.InfoComment;
import com.my.bean.InfoPeriodical;
import com.my.bean.InfoThesis;
import com.my.bean.InfoUser;
import com.my.util.PageBean;

public class UserAction extends BaseAction {

	public String listThesisPrepare() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoThesis> list;
		list = adminbo.getAllInfoThesisByPage(pageNo, 15);
		totalRecords = adminbo.getTotalInfoThesisRecords().intValue();
		PageBean<InfoThesis> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("listThesisPrepare_use");
		return "slistthesis";
	}

	public String searchThesis() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoThesis> list;
		list = adminbo.searchInfoThesisByPage(pageNo, 15, thesis);
		totalRecords = adminbo.searchTotalInfoThesisRecords(thesis).intValue();
		PageBean<InfoThesis> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("searchThesis_use");
		return "slistthesis";
	}

	public String listPeriodicalPrepare() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoPeriodical> list;
		list = adminbo.getAllInfoPeriodicalByPage(pageNo, 15);
		totalRecords = adminbo.getTotalInfoPeriodicalRecords().intValue();
		PageBean<InfoPeriodical> pagebean = this
				.setPageBean(list, totalRecords);
		pagebean.setPageAction("listPeriodicalPrepare_use");
		return "slistperiodical";
	}

	public String searchPeriodical() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoPeriodical> list;
		list = adminbo.searchInfoPeriodicalByPage(pageNo, 15, per);
		totalRecords = adminbo.searchTotalInfoPeriodicalRecords(per).intValue();
		PageBean<InfoPeriodical> pagebean = this
				.setPageBean(list, totalRecords);
		pagebean.setPageAction("searchPeriodical_use");
		return "slistperiodical";
	}

	public String getComments() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoComment> list;
		if (comment.getInfoThesis() == null) {
			list = userbo.searchInfoCommentByPage(pageNo, 15, comment, false);
			totalRecords = userbo.searchTotalInfoCommentRecords(comment, false)
					.intValue();
		} else {
			list = userbo.searchInfoCommentByPage(pageNo, 15, comment, true);
			totalRecords = userbo.searchTotalInfoCommentRecords(comment, true)
					.intValue();
		}
		PageBean<InfoComment> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("getComments_use");
		return "comment";
	}

	public String addComment() throws Exception {
		user = (InfoUser) session.get("user");
		admin = (InfoAdmin) session.get("admin");
		InfoUser u = new InfoUser();
		if (user != null) {
			u.setUserId(user.getUserId());
		}
		InfoAdmin a = new InfoAdmin();
		if (admin != null) {
			a.setAdminId(admin.getAdminId());
		}
		if (user != null) {
			comment.setInfoUser(u);
		} else {
			comment.setInfoAdmin(a);
		}
		if (comment.getInfoPeriodical().getPeriodicalId() == null) {
			comment.setInfoPeriodical(null);
		} else {
			comment.setInfoThesis(null);
		}
		comment.setDate(new Date());
		userbo.addInfoComment(comment);
		return this.getComments();
	}

	public String recommend() throws Exception {
		user = (InfoUser) session.get("user");
		InfoThesis t = new InfoThesis();
		t.setSpecialty(user.getPecialty());
		t.setEducational(user.getEducational());
		List<InfoThesis> searchInfoThesisByPage = adminbo
				.searchInfoThesisByPage(1, 15, t);

		return "";
	}
}
