package com.my.bo.impl;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Hibernate;

import com.my.bean.InfoComment;
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

}
