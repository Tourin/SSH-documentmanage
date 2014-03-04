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

	public String listThesisPrepareKey() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoThesis> list;
		list = adminbo.getAllInfoThesisByPage(pageNo, 15);
		totalRecords = adminbo.getTotalInfoThesisRecords().intValue();
		PageBean<InfoThesis> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("listThesisPrepareKey_use");
		return "sklistthesis";
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

	public String searchThesisKey() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoThesis> list;
		list = userbo.searchInfoThesisByPageKey(pageNo, 15, thesis);
		totalRecords = userbo.searchTotalInfoThesisRecordsKey(thesis)
				.intValue();
		PageBean<InfoThesis> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("searchThesisKey_use");
		return "sklistthesis";
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

	public String listPeriodicalPrepareKey() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoPeriodical> list;
		list = adminbo.getAllInfoPeriodicalByPage(pageNo, 15);
		totalRecords = adminbo.getTotalInfoPeriodicalRecords().intValue();
		PageBean<InfoPeriodical> pagebean = this
				.setPageBean(list, totalRecords);
		pagebean.setPageAction("listPeriodicalPrepareKey_use");
		return "sklistperiodical";
	}

	public String searchPeriodicalKey() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoPeriodical> list;
		list = userbo.searchInfoPeriodicalByPageKey(pageNo, 15, per);
		totalRecords = userbo.searchTotalInfoPeriodicalRecordsKey(per)
				.intValue();
		PageBean<InfoPeriodical> pagebean = this
				.setPageBean(list, totalRecords);
		pagebean.setPageAction("searchPeriodicalKey_use");
		return "sklistperiodical";
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
		request.put("thesisId", comment.getInfoThesis() == null ? null
				: comment.getInfoThesis().getThesisId());
		request.put("periodicalId", comment.getInfoPeriodical() == null ? null
				: comment.getInfoPeriodical().getPeriodicalId());
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
		List<InfoThesis> thesisList = adminbo.searchInfoThesisByPage(1, 15, t);
		InfoPeriodical per = new InfoPeriodical();
		per.setType(user.getPer());
		List<InfoPeriodical> perList = adminbo.searchInfoPeriodicalByPage(1,
				15, per);
		request.put("thesisList", thesisList);
		request.put("perList", perList);
		return "recommend";
	}
}
