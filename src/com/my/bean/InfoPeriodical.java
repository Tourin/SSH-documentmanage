package com.my.bean;

// Generated 2014-2-17 20:09:48 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * InfoPeriodical generated by hbm2java
 */
public class InfoPeriodical implements java.io.Serializable {

	private Integer periodicalId;
	private InfoUnit infoUnit;
	private String name;
	private Integer number;
	private String type;
	private String path;
	private Set infoComments = new HashSet(0);

	public InfoPeriodical() {
	}

	public InfoPeriodical(InfoUnit infoUnit, String name, Integer number,
			String type, String path, Set infoComments) {
		this.infoUnit = infoUnit;
		this.name = name;
		this.number = number;
		this.type = type;
		this.path = path;
		this.infoComments = infoComments;
	}

	public Integer getPeriodicalId() {
		return this.periodicalId;
	}

	public void setPeriodicalId(Integer periodicalId) {
		this.periodicalId = periodicalId;
	}

	public InfoUnit getInfoUnit() {
		return this.infoUnit;
	}

	public void setInfoUnit(InfoUnit infoUnit) {
		this.infoUnit = infoUnit;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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
