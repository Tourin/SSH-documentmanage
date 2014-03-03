package com.my.control;

import java.util.List;

import com.my.bean.InfoComment;
import com.my.bean.InfoPeriodical;
import com.my.bean.InfoThesis;
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
}
