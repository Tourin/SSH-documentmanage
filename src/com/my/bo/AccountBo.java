package com.my.bo;

import com.my.bean.InfoAdmin;
import com.my.bean.InfoUser;

public interface AccountBo {

	/***************************************** user ***************************************************************************/

	boolean isExistInfoUser(String name);

	InfoUser checkLoginInfoUser(InfoUser user) throws Exception;

	boolean addInfoUser(InfoUser user) throws Exception;

	boolean editInfoUser(InfoUser user) throws Exception;

	InfoUser getInfoUserById(Class<InfoUser> c, Integer id) throws Exception;

	boolean removeInfoUser(Integer id) throws Exception;

	/***************************************** admin ***************************************************************************/

	boolean isExistInfoAdmin(String name);

	InfoAdmin checkLoginInfoAdmin(InfoAdmin admin) throws Exception;

	boolean addInfoAdmin(InfoAdmin admin) throws Exception;

	boolean editInfoAdmin(InfoAdmin admin) throws Exception;

	InfoAdmin getInfoAdminById(Class<InfoAdmin> c, Integer id) throws Exception;

	boolean removeInfoAdmin(Integer id) throws Exception;

}
