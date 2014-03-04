package com.my.dao;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoPeriodical;

public interface PeriodicalDAO {

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

	BigInteger searchTotalInfoPeriodicalRecordsKey(InfoPeriodical per)
			throws Exception;

	List<InfoPeriodical> searchInfoPeriodicalByPageKey(int pageindex,
			int pagesize, InfoPeriodical per) throws Exception;
}
