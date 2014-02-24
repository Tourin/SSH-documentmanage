package com.my.bo.impl;

import com.my.bean.InfoAdmin;
import com.my.bean.InfoUser;
import com.my.bo.AccountBo;

public class AccountBoImpl extends BaseBo implements AccountBo {

	@Override
	public boolean isExistInfoUser(String name) {
		return userdao.isExist(name);
	}

	@Override
	public InfoUser checkLoginInfoUser(InfoUser user) throws Exception {
		return userdao.checkLogin(user);
	}

	@Override
	public boolean addInfoUser(InfoUser user) throws Exception {
		return userdao.addInfoUser(user);
	}

	@Override
	public boolean editInfoUser(InfoUser user) throws Exception {
		return userdao.editInfoUser(user);
	}

	@Override
	public InfoUser getInfoUserById(Class<InfoUser> c, Integer id)
			throws Exception {
		return userdao.getInfoUserById(c, id);
	}

	@Override
	public boolean removeInfoUser(Integer id) throws Exception {
		return userdao.removeInfoUser(id);
	}

	/********************************************* admin ********************************************************/

	@Override
	public boolean isExistInfoAdmin(String name) {
		return admindao.isExist(name);
	}

	@Override
	public InfoAdmin checkLoginInfoAdmin(InfoAdmin admin) throws Exception {
		return admindao.checkLogin(admin);
	}

	@Override
	public boolean addInfoAdmin(InfoAdmin admin) throws Exception {
		return admindao.addInfoAdmin(admin);
	}

	@Override
	public boolean editInfoAdmin(InfoAdmin admin) throws Exception {
		return admindao.editInfoAdmin(admin);
	}

	@Override
	public InfoAdmin getInfoAdminById(Class<InfoAdmin> c, Integer id)
			throws Exception {
		return admindao.getInfoAdminById(c, id);
	}

	@Override
	public boolean removeInfoAdmin(Integer id) throws Exception {
		return admindao.removeInfoAdmin(id);
	}

}
