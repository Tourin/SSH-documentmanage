package com.my.dao;

import com.my.bean.InfoAdmin;

public interface AdminDAO {
	InfoAdmin checkLogin(InfoAdmin admin);

	boolean isExist(String name);

	boolean addInfoAdmin(InfoAdmin admin) throws Exception;

	boolean editInfoAdmin(InfoAdmin admin) throws Exception;

	InfoAdmin getInfoAdminById(Class<InfoAdmin> c, Integer id) throws Exception;

	boolean removeInfoAdmin(Integer id) throws Exception;
}
