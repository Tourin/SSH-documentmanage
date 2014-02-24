/**
 * 
 */
package com.my.bo.impl;

import com.my.dao.AdminDAO;
import com.my.dao.AuthorDAO;
import com.my.dao.CommentDAO;
import com.my.dao.PeriodicalDAO;
import com.my.dao.ThesisDAO;
import com.my.dao.UnitDAO;
import com.my.dao.UserDAO;

public class BaseBo {

	UserDAO userdao;
	AdminDAO admindao;
	AuthorDAO authdao;
	UnitDAO unitdao;
	ThesisDAO thesisdao;
	PeriodicalDAO perdao;
	CommentDAO commentdao;

	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}

	public void setAdmindao(AdminDAO admindao) {
		this.admindao = admindao;
	}

	public void setAuthdao(AuthorDAO authdao) {
		this.authdao = authdao;
	}

	public void setUnitdao(UnitDAO unitdao) {
		this.unitdao = unitdao;
	}

	public void setThesisdao(ThesisDAO thesisdao) {
		this.thesisdao = thesisdao;
	}

	public void setPerdao(PeriodicalDAO perdao) {
		this.perdao = perdao;
	}

	public void setCommentdao(CommentDAO commentdao) {
		this.commentdao = commentdao;
	}

}
