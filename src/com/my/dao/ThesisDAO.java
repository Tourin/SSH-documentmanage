package com.my.dao;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoThesis;

public interface ThesisDAO {

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
}
