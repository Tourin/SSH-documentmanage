package com.my.dao;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoComment;

public interface CommentDAO {

	boolean addInfoComment(InfoComment comment) throws Exception;

	boolean editInfoComment(InfoComment comment) throws Exception;

	InfoComment getInfoCommentById(Class<InfoComment> c, Integer id)
			throws Exception;

	boolean removeInfoComment(Integer id) throws Exception;

	BigInteger searchTotalInfoCommentRecords(InfoComment comment,
			boolean isThesis) throws Exception;

	List<InfoComment> searchInfoCommentByPage(int pageindex, int pagesize,
			InfoComment comment, boolean isThesis) throws Exception;
}
