package com.my.dao;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoAuthor;

public interface AuthorDAO {

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
}
