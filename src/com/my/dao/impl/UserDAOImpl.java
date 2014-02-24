package com.my.dao.impl;

import com.my.bean.InfoUser;
import com.my.dao.IBaseDAO;
import com.my.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
	private IBaseDAO<InfoUser> basedao;

	public void setBasedao(IBaseDAO<InfoUser> basedao) {
		this.basedao = basedao;
	}

	@Override
	public InfoUser checkLogin(InfoUser user) {
		String hql = "from InfoUser as u where u.name=? and u.pass=?";
		String name = user.getName();
		String pass = user.getPass();
		return basedao.checkEntity(hql, name, pass);
	}

	@Override
	public boolean isExist(String name) {
		if (name.isEmpty()) {
			return false;
		}
		String hql = "from InfoUser as u where u.name=?";
		return basedao.isExist(hql, name);
	}

	@Override
	public boolean addInfoUser(InfoUser user) throws Exception {
		if (this.checkInfoUser(user)) {
			return basedao.add(user);
		}
		return false;
	}

	@Override
	public boolean editInfoUser(InfoUser user) throws Exception {
		if (this.checkInfoUser(user)) {
			return basedao.edit(user);
		}
		return false;
	}

	@Override
	public InfoUser getInfoUserById(Class<InfoUser> c, Integer id)
			throws Exception {
		return basedao.getById(c, id);
	}

	@Override
	public boolean removeInfoUser(Integer id) throws Exception {
		InfoUser user = basedao.getById(InfoUser.class, id);
		if (user != null) {
			basedao.remove(user);
		}
		return false;
	}

	boolean checkInfoUser(InfoUser user) {
		if (user == null || user.getName().isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}
