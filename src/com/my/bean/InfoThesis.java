package com.my.bean;

// Generated 2014-2-17 20:09:48 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * InfoThesis generated by hbm2java
 */
public class InfoThesis implements java.io.Serializable {

	private Integer thesisId;
	private InfoAuthor infoAuthor;
	private String title;
	private String path;
	private Set infoComments = new HashSet(0);

	public InfoThesis() {
	}

	public InfoThesis(InfoAuthor infoAuthor, String title, String path,
			Set infoComments) {
		this.infoAuthor = infoAuthor;
		this.title = title;
		this.path = path;
		this.infoComments = infoComments;
	}

	public Integer getThesisId() {
		return this.thesisId;
	}

	public void setThesisId(Integer thesisId) {
		this.thesisId = thesisId;
	}

	public InfoAuthor getInfoAuthor() {
		return this.infoAuthor;
	}

	public void setInfoAuthor(InfoAuthor infoAuthor) {
		this.infoAuthor = infoAuthor;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set getInfoComments() {
		return this.infoComments;
	}

	public void setInfoComments(Set infoComments) {
		this.infoComments = infoComments;
	}

}