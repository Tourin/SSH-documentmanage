package com.my.bo.impl;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoAuthor;
import com.my.bean.InfoPeriodical;
import com.my.bean.InfoThesis;
import com.my.bean.InfoUnit;
import com.my.bo.AdminBo;

public class AdminBoImpl extends BaseBo implements AdminBo {

	@Override
	public boolean addInfoAuthor(InfoAuthor part) throws Exception {
		return authdao.addInfoAuthor(part);
	}

	@Override
	public boolean editInfoAuthor(InfoAuthor part) throws Exception {
		return authdao.editInfoAuthor(part);
	}

	@Override
	public InfoAuthor getInfoAuthorById(Class<InfoAuthor> c, Integer id)
			throws Exception {
		return authdao.getInfoAuthorById(c, id);
	}

	@Override
	public boolean removeInfoAuthor(Integer id) throws Exception {
		return authdao.removeInfoAuthor(id);
	}

	@Override
	public BigInteger getTotalInfoAuthorRecords() throws Exception {
		return authdao.getTotalInfoAuthorRecords();
	}

	@Override
	public List<InfoAuthor> getAllInfoAuthorByPage(int pageindex, int pagesize)
			throws Exception {
		return authdao.getAllInfoAuthorByPage(pageindex, pagesize);
	}

	@Override
	public BigInteger searchTotalInfoAuthorRecords(InfoAuthor part)
			throws Exception {
		return authdao.searchTotalInfoAuthorRecords(part);
	}

	@Override
	public List<InfoAuthor> searchInfoAuthorByPage(int pageindex, int pagesize,
			InfoAuthor part) throws Exception {
		return authdao.searchInfoAuthorByPage(pageindex, pagesize, part);
	}

	@Override
	public boolean addInfoUnit(InfoUnit unit) throws Exception {
		return unitdao.addInfoUnit(unit);
	}

	@Override
	public boolean editInfoUnit(InfoUnit unit) throws Exception {
		// TODO Auto-generated method stub
		return unitdao.editInfoUnit(unit);
	}

	@Override
	public InfoUnit getInfoUnitById(Class<InfoUnit> c, Integer id)
			throws Exception {
		// TODO Auto-generated method stub
		return unitdao.getInfoUnitById(c, id);
	}

	@Override
	public boolean removeInfoUnit(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return unitdao.removeInfoUnit(id);
	}

	@Override
	public BigInteger getTotalInfoUnitRecords() throws Exception {
		// TODO Auto-generated method stub
		return unitdao.getTotalInfoUnitRecords();
	}

	@Override
	public List<InfoUnit> getAllInfoUnitByPage(int pageindex, int pagesize)
			throws Exception {
		// TODO Auto-generated method stub
		return unitdao.getAllInfoUnitByPage(pageindex, pagesize);
	}

	@Override
	public BigInteger searchTotalInfoUnitRecords(InfoUnit unit)
			throws Exception {
		// TODO Auto-generated method stub
		return unitdao.searchTotalInfoUnitRecords(unit);
	}

	@Override
	public List<InfoUnit> searchInfoUnitByPage(int pageindex, int pagesize,
			InfoUnit unit) throws Exception {
		// TODO Auto-generated method stub
		return unitdao.searchInfoUnitByPage(pageindex, pagesize, unit);
	}

	@Override
	public boolean addInfoThesis(InfoThesis thesis) throws Exception {
		// TODO Auto-generated method stub
		return thesisdao.addInfoThesis(thesis);
	}

	@Override
	public boolean editInfoThesis(InfoThesis thesis) throws Exception {
		// TODO Auto-generated method stub
		return thesisdao.editInfoThesis(thesis);
	}

	@Override
	public InfoThesis getInfoThesisById(Class<InfoThesis> c, Integer id)
			throws Exception {
		// TODO Auto-generated method stub
		return thesisdao.getInfoThesisById(c, id);
	}

	@Override
	public boolean removeInfoThesis(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return thesisdao.removeInfoThesis(id);
	}

	@Override
	public BigInteger getTotalInfoThesisRecords() throws Exception {
		// TODO Auto-generated method stub
		return thesisdao.getTotalInfoThesisRecords();
	}

	@Override
	public List<InfoThesis> getAllInfoThesisByPage(int pageindex, int pagesize)
			throws Exception {
		// TODO Auto-generated method stub
		return thesisdao.getAllInfoThesisByPage(pageindex, pagesize);
	}

	@Override
	public BigInteger searchTotalInfoThesisRecords(InfoThesis thesis)
			throws Exception {
		// TODO Auto-generated method stub
		return thesisdao.searchTotalInfoThesisRecords(thesis);
	}

	@Override
	public List<InfoThesis> searchInfoThesisByPage(int pageindex, int pagesize,
			InfoThesis thesis) throws Exception {
		// TODO Auto-generated method stub
		return thesisdao.searchInfoThesisByPage(pageindex, pagesize, thesis);
	}

	@Override
	public boolean addInfoPeriodical(InfoPeriodical per) throws Exception {
		// TODO Auto-generated method stub
		return perdao.addInfoPeriodical(per);
	}

	@Override
	public boolean editInfoPeriodical(InfoPeriodical per) throws Exception {
		// TODO Auto-generated method stub
		return perdao.editInfoPeriodical(per);
	}

	@Override
	public InfoPeriodical getInfoPeriodicalById(Class<InfoPeriodical> c,
			Integer id) throws Exception {
		// TODO Auto-generated method stub
		return perdao.getInfoPeriodicalById(c, id);
	}

	@Override
	public boolean removeInfoPeriodical(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return perdao.removeInfoPeriodical(id);
	}

	@Override
	public BigInteger getTotalInfoPeriodicalRecords() throws Exception {
		// TODO Auto-generated method stub
		return perdao.getTotalInfoPeriodicalRecords();
	}

	@Override
	public List<InfoPeriodical> getAllInfoPeriodicalByPage(int pageindex,
			int pagesize) throws Exception {
		// TODO Auto-generated method stub
		return perdao.getAllInfoPeriodicalByPage(pageindex, pagesize);
	}

	@Override
	public BigInteger searchTotalInfoPeriodicalRecords(InfoPeriodical per)
			throws Exception {
		// TODO Auto-generated method stub
		return perdao.searchTotalInfoPeriodicalRecords(per);
	}

	@Override
	public List<InfoPeriodical> searchInfoPeriodicalByPage(int pageindex,
			int pagesize, InfoPeriodical per) throws Exception {
		// TODO Auto-generated method stub
		return perdao.searchInfoPeriodicalByPage(pageindex, pagesize, per);
	}

}
