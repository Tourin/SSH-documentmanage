package com.my.bo;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoAuthor;
import com.my.bean.InfoPeriodical;
import com.my.bean.InfoThesis;
import com.my.bean.InfoUnit;

public interface AdminBo {

	/***************************************** author ***************************************************************************/
	boolean addInfoAuthor(InfoAuthor part) throws Exception;

	boolean editInfoAuthor(InfoAuthor part) throws Exception;

	InfoAuthor getInfoAuthorById(Class<InfoAuthor> c, Integer id)
			throws Exception;

	boolean removeInfoAuthor(Integer id) throws Exception;

	BigInteger getTotalInfoAuthorRecords() throws Exception;

	List<InfoAuthor> getAllInfoAuthorByPage(int pageindex, int pagesize)
			throws Exception;

	BigInteger searchTotalInfoAuthorRecords(InfoAuthor part) throws Exception;

	List<InfoAuthor> searchInfoAuthorByPage(int pageindex, int pagesize,
			InfoAuthor part) throws Exception;

	/***************************************** unit ***************************************************************************/
	boolean addInfoUnit(InfoUnit unit) throws Exception;

	boolean editInfoUnit(InfoUnit unit) throws Exception;

	InfoUnit getInfoUnitById(Class<InfoUnit> c, Integer id) throws Exception;

	boolean removeInfoUnit(Integer id) throws Exception;

	BigInteger getTotalInfoUnitRecords() throws Exception;

	List<InfoUnit> getAllInfoUnitByPage(int pageindex, int pagesize)
			throws Exception;

	BigInteger searchTotalInfoUnitRecords(InfoUnit unit) throws Exception;

	List<InfoUnit> searchInfoUnitByPage(int pageindex, int pagesize,
			InfoUnit unit) throws Exception;

	/***************************************** thesis ***************************************************************************/

	boolean addInfoThesis(InfoThesis thesis) throws Exception;

	boolean editInfoThesis(InfoThesis thesis) throws Exception;

	InfoThesis getInfoThesisById(Class<InfoThesis> c, Integer id)
			throws Exception;

	boolean removeInfoThesis(Integer id) throws Exception;

	BigInteger getTotalInfoThesisRecords() throws Exception;

	List<InfoThesis> getAllInfoThesisByPage(int pageindex, int pagesize)
			throws Exception;

	BigInteger searchTotalInfoThesisRecords(InfoThesis thesis) throws Exception;

	List<InfoThesis> searchInfoThesisByPage(int pageindex, int pagesize,
			InfoThesis thesis) throws Exception;

	/***************************************** thesis ***************************************************************************/

	boolean addInfoPeriodical(InfoPeriodical per) throws Exception;

	boolean editInfoPeriodical(InfoPeriodical per) throws Exception;

	InfoPeriodical getInfoPeriodicalById(Class<InfoPeriodical> c, Integer id)
			throws Exception;

	boolean removeInfoPeriodical(Integer id) throws Exception;

	BigInteger getTotalInfoPeriodicalRecords() throws Exception;

	List<InfoPeriodical> getAllInfoPeriodicalByPage(int pageindex, int pagesize)
			throws Exception;

	BigInteger searchTotalInfoPeriodicalRecords(InfoPeriodical per)
			throws Exception;

	List<InfoPeriodical> searchInfoPeriodicalByPage(int pageindex,
			int pagesize, InfoPeriodical per) throws Exception;
}
