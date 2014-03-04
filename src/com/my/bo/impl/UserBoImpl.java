package com.my.bo.impl;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Hibernate;

import com.my.bean.InfoComment;
import com.my.bean.InfoPeriodical;
import com.my.bean.InfoThesis;
import com.my.bo.UserBo;

public class UserBoImpl extends BaseBo implements UserBo {

	@Override
	public boolean addInfoComment(InfoComment comment) throws Exception {
		// TODO Auto-generated method stub
		return commentdao.addInfoComment(comment);
	}

	@Override
	public boolean editInfoComment(InfoComment comment) throws Exception {
		// TODO Auto-generated method stub
		return commentdao.editInfoComment(comment);
	}

	@Override
	public InfoComment getInfoCommentById(Class<InfoComment> c, Integer id)
			throws Exception {
		// TODO Auto-generated method stub
		return commentdao.getInfoCommentById(c, id);
	}

	@Override
	public boolean removeInfoComment(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return commentdao.removeInfoComment(id);
	}

	@Override
	public BigInteger searchTotalInfoCommentRecords(InfoComment comment,
			boolean isThesis) throws Exception {
		// TODO Auto-generated method stub
		return commentdao.searchTotalInfoCommentRecords(comment, isThesis);
	}

	@Override
	public List<InfoComment> searchInfoCommentByPage(int pageindex,
			int pagesize, InfoComment comment, boolean isThesis)
			throws Exception {
		// TODO Auto-generated method stub
		List<InfoComment> searchInfoCommentByPage = commentdao
				.searchInfoCommentByPage(pageindex, pagesize, comment, isThesis);
		for (InfoComment c : searchInfoCommentByPage) {
			Hibernate.initialize(c.getInfoAdmin());
			Hibernate.initialize(c.getInfoUser());
		}
		return searchInfoCommentByPage;
	}

	@Override
	public BigInteger searchTotalInfoThesisRecordsKey(InfoThesis thesis)
			throws Exception {
		return thesisdao.searchTotalInfoThesisRecordsKey(thesis);
	}

	@Override
	public List<InfoThesis> searchInfoThesisByPageKey(int pageindex,
			int pagesize, InfoThesis thesis) throws Exception {
		List<InfoThesis> searchInfoThesisByPageKey = thesisdao
				.searchInfoThesisByPageKey(pageindex, pagesize, thesis);
		for (InfoThesis t : searchInfoThesisByPageKey) {
			Hibernate.initialize(t.getInfoAuthor());
		}
		return searchInfoThesisByPageKey;
	}

	@Override
	public BigInteger searchTotalInfoPeriodicalRecordsKey(InfoPeriodical per)
			throws Exception {
		return perdao.searchTotalInfoPeriodicalRecordsKey(per);
	}

	@Override
	public List<InfoPeriodical> searchInfoPeriodicalByPageKey(int pageindex,
			int pagesize, InfoPeriodical per) throws Exception {
		List<InfoPeriodical> searchInfoPeriodicalByPageKey = perdao
				.searchInfoPeriodicalByPageKey(pageindex, pagesize, per);
		for (InfoPeriodical p : searchInfoPeriodicalByPageKey) {
			Hibernate.initialize(p.getInfoUnit());
		}
		return searchInfoPeriodicalByPageKey;
	}

}
