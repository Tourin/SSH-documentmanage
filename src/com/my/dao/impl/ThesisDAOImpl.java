package com.my.dao.impl;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoThesis;
import com.my.dao.IBaseDAO;
import com.my.dao.ThesisDAO;

public class ThesisDAOImpl implements ThesisDAO {
	private IBaseDAO<InfoThesis> basedao;

	public void setBasedao(IBaseDAO<InfoThesis> basedao) {
		this.basedao = basedao;
	}

	@Override
	public boolean addInfoThesis(InfoThesis thesis) throws Exception {
		return basedao.add(thesis);
	}

	@Override
	public boolean editInfoThesis(InfoThesis thesis) throws Exception {
		return basedao.edit(thesis);
	}

	@Override
	public InfoThesis getInfoThesisById(Class<InfoThesis> c, Integer id)
			throws Exception {
		return basedao.getById(c, id);
	}

	@Override
	public boolean removeInfoThesis(Integer id) throws Exception {
		InfoThesis thesis = basedao.getById(InfoThesis.class, id);
		if (thesis != null) {
			basedao.remove(thesis);
		}
		return false;
	}

	@Override
	public BigInteger getTotalInfoThesisRecords() throws Exception {
		String sql = "select count(thesis_id) from info_thesisor";
		return basedao.getTotalRecords(sql);
	}

	@Override
	public List<InfoThesis> getAllInfoThesisByPage(int pageindex, int pagesize)
			throws Exception {
		String hql = "from InfoThesis";
		return basedao.getAllEntityByPage(hql, pageindex, pagesize);
	}

	@Override
	public BigInteger searchTotalInfoThesisRecords(InfoThesis thesis)
			throws Exception {
		String sql = "select count(thesis_id) from info_thesis where title like ?";
		String item1 = thesis.getTitle() + "%";
		return basedao.getTotalRecords(sql, item1);
	}

	@Override
	public List<InfoThesis> searchInfoThesisByPage(int pageindex, int pagesize,
			InfoThesis thesis) throws Exception {
		String hql = "from InfoThesis as t where t.title like ?";
		String item1 = thesis.getTitle() + "%";
		return basedao.getAllEntityByPage(hql, pageindex, pagesize, item1);
	}
}
