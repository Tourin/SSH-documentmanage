package com.my.bo;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoComment;
import com.my.bean.InfoPeriodical;
import com.my.bean.InfoThesis;

public interface UserBo {

	/***************************************** comment ***************************************************************************/

	boolean addInfoComment(InfoComment comment) throws Exception;

	boolean editInfoComment(InfoComment comment) throws Exception;

	InfoComment getInfoCommentById(Class<InfoComment> c, Integer id)
			throws Exception;

	boolean removeInfoComment(Integer id) throws Exception;

	BigInteger searchTotalInfoCommentRecords(InfoComment comment,
			boolean isThesis) throws Exception;

	List<InfoComment> searchInfoCommentByPage(int pageindex, int pagesize,
			InfoComment comment, boolean isThesis) throws Exception;

	/***************************************** thesis ***************************************************************************/
	BigInteger searchTotalInfoThesisRecordsKey(InfoThesis thesis)
			throws Exception;

	List<InfoThesis> searchInfoThesisByPageKey(int pageindex, int pagesize,
			InfoThesis thesis) throws Exception;

	/***************************************** per ***************************************************************************/
	BigInteger searchTotalInfoPeriodicalRecordsKey(InfoPeriodical per)
			throws Exception;

	List<InfoPeriodical> searchInfoPeriodicalByPageKey(int pageindex,
			int pagesize, InfoPeriodical per) throws Exception;

}
