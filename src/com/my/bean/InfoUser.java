package com.my.bean;

// Generated 2014-2-17 20:09:48 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * InfoUser generated by hbm2java
 */
public class InfoUser implements java.io.Serializable {

	private Integer userId;
	private String name;
	private String pass;
	private String rname;
	private Integer age;
	private String idcard;
	private String school;
	private String pecialty;
	private String educational;
	private String per;
	private String introduction;
	private Set infoComments = new HashSet(0);

	public InfoUser() {
	}

	public InfoUser(String name, String pass, String rname, Integer age,
			String idcard, String school, String pecialty, String educational,
			String per, String introduction, Set infoComments) {
		this.name = name;
		this.pass = pass;
		this.rname = rname;
		this.age = age;
		this.idcard = idcard;
		this.school = school;
		this.pecialty = pecialty;
		this.educational = educational;
		this.per = per;
		this.introduction = introduction;
		this.infoComments = infoComments;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getPecialty() {
		return this.pecialty;
	}

	public void setPecialty(String pecialty) {
		this.pecialty = pecialty;
	}

	public String getEducational() {
		return this.educational;
	}

	public void setEducational(String educational) {
		this.educational = educational;
	}

	public String getPer() {
		return per;
	}

	public void setPer(String per) {
		this.per = per;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Set getInfoComments() {
		return this.infoComments;
	}

	public void setInfoComments(Set infoComments) {
		this.infoComments = infoComments;
	}

}
