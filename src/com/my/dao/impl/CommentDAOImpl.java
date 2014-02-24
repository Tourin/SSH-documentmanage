package com.my.dao.impl;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoComment;
import com.my.dao.CommentDAO;
import com.my.dao.IBaseDAO;

public class CommentDAOImpl implements CommentDAO {
	private IBaseDAO<InfoComment> basedao;

	public void setBasedao(IBaseDAO<InfoComment> basedao) {
		this.basedao = basedao;
	}

	@Override
	public boolean addInfoComment(InfoComment comment) throws Exception {
		return basedao.add(comment);
	}

	@Override
	public boolean editInfoComment(InfoComment comment) throws Exception {
		return basedao.edit(comment);
	}

	@Override
	public InfoComment getInfoCommentById(Class<InfoComment> c, Integer id)
			throws Exception {
		return basedao.getById(c, id);
	}

	@Override
	public boolean removeInfoComment(Integer id) throws Exception {
		InfoComment comment = basedao.getById(InfoComment.class, id);
		if (comment != null) {
			basedao.remove(comment);
		}
		return false;
	}

	@Override
	public BigInteger searchTotalInfoCommentRecords(InfoComment comment,
			boolean isThesis) throws Exception {
		String sql;
		String item1;
		if (isThesis) {
			sql = "select count(comment_id) from info_comment where thesis_id = ?";
			item1 = comment.getInfoThesis().getThesisId().toString();
		} else {
			sql = "select count(comment_id) from info_comment where periodical_id=?";
			item1 = comment.getInfoPeriodical().getPeriodicalId().toString();
		}
		return basedao.getTotalRecords(sql, item1);
	}

	@Override
	public List<InfoComment> searchInfoCommentByPage(int pageindex,
			int pagesize, InfoComment comment, boolean isThesis)
			throws Exception {
		String hql;
		String item1;
		if (isThesis) {
			hql = "from InfoComment as c where c.infoThesis.thesisId = ?";
			item1 = comment.getInfoThesis().getThesisId().toString();
		} else {
			hql = "from InfoComment as c where c.infoPeriodical.periodicalId = ?";
			item1 = comment.getInfoPeriodical().getPeriodicalId().toString();
		}
		return basedao.getAllEntityByPage(hql, pageindex, pagesize, item1);
	}
}
