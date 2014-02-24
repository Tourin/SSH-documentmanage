package com.my.dao;

import com.my.bean.InfoUser;

public interface UserDAO {
	InfoUser checkLogin(InfoUser user);

	boolean isExist(String name);

	boolean addInfoUser(InfoUser user) throws Exception;

	boolean editInfoUser(InfoUser user) throws Exception;

	InfoUser getInfoUserById(Class<InfoUser> c, Integer id) throws Exception;

	boolean removeInfoUser(Integer id) throws Exception;
}
