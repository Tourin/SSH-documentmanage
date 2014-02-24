package com.my.dao.impl;

import com.my.bean.InfoAdmin;
import com.my.dao.AdminDAO;
import com.my.dao.IBaseDAO;

public class AdminDAOImpl implements AdminDAO {
	private IBaseDAO<InfoAdmin> basedao;

	public void setBasedao(IBaseDAO<InfoAdmin> basedao) {
		this.basedao = basedao;
	}

	@Override
	public InfoAdmin checkLogin(InfoAdmin admin) {
		String hql = "from InfoAdmin as a where a.name=? and a.pass=?";
		String name = admin.getName();
		String pass = admin.getPass();
		return basedao.checkEntity(hql, name, pass);
	}

	@Override
	public boolean isExist(String name) {
		if (name.isEmpty()) {
			return false;
		}
		String hql = "from InfoAdmin as a where a.name=?";
		return basedao.isExist(hql, name);
	}

	@Override
	public boolean addInfoAdmin(InfoAdmin admin) throws Exception {
		if (this.checkInfoAdmin(admin)) {
			return basedao.add(admin);
		}
		return false;
	}

	@Override
	public boolean editInfoAdmin(InfoAdmin admin) throws Exception {
		if (this.checkInfoAdmin(admin)) {
			return basedao.edit(admin);
		}
		return false;
	}

	@Override
	public InfoAdmin getInfoAdminById(Class<InfoAdmin> c, Integer id)
			throws Exception {
		return basedao.getById(c, id);
	}

	@Override
	public boolean removeInfoAdmin(Integer id) throws Exception {
		InfoAdmin admin = basedao.getById(InfoAdmin.class, id);
		if (admin != null) {
			basedao.remove(admin);
		}
		return false;
	}

	boolean checkInfoAdmin(InfoAdmin admin) {
		if (admin == null || admin.getName().isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}
