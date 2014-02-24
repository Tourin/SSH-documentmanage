package com.my.dao.impl;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoAuthor;
import com.my.dao.AuthorDAO;
import com.my.dao.IBaseDAO;

public class AuthorDAOImpl implements AuthorDAO {
	private IBaseDAO<InfoAuthor> basedao;

	public void setBasedao(IBaseDAO<InfoAuthor> basedao) {
		this.basedao = basedao;
	}

	@Override
	public boolean addInfoAuthor(InfoAuthor auth) throws Exception {
		return basedao.add(auth);
	}

	@Override
	public boolean editInfoAuthor(InfoAuthor auth) throws Exception {
		return basedao.edit(auth);
	}

	@Override
	public InfoAuthor getInfoAuthorById(Class<InfoAuthor> c, Integer id)
			throws Exception {
		return basedao.getById(c, id);
	}

	@Override
	public boolean removeInfoAuthor(Integer id) throws Exception {
		InfoAuthor auth = basedao.getById(InfoAuthor.class, id);
		if (auth != null) {
			basedao.remove(auth);
		}
		return false;
	}

	@Override
	public BigInteger getTotalInfoAuthorRecords() throws Exception {
		String sql = "select count(author_id) from info_author";
		return basedao.getTotalRecords(sql);
	}

	@Override
	public List<InfoAuthor> getAllInfoAuthorByPage(int pageindex, int pagesize)
			throws Exception {
		String hql = "from InfoAuthor";
		return basedao.getAllEntityByPage(hql, pageindex, pagesize);
	}

	@Override
	public BigInteger searchTotalInfoAuthorRecords(InfoAuthor auth)
			throws Exception {
		String sql = "select count(author_id) from info_auth where name like ?";
		String item1 = auth.getName() + "%";
		return basedao.getTotalRecords(sql, item1);
	}

	@Override
	public List<InfoAuthor> searchInfoAuthorByPage(int pageindex, int pagesize,
			InfoAuthor auth) throws Exception {
		String hql = "from InfoAuthor as a where a.name like ?";
		String item1 = auth.getName() + "%";
		return basedao.getAllEntityByPage(hql, pageindex, pagesize, item1);
	}
}
