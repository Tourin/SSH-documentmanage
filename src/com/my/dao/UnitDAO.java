package com.my.dao;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoUnit;

public interface UnitDAO {

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
}
