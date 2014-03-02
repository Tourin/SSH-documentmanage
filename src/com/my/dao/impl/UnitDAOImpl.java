package com.my.dao.impl;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoUnit;
import com.my.dao.IBaseDAO;
import com.my.dao.UnitDAO;

public class UnitDAOImpl implements UnitDAO {
	private IBaseDAO<InfoUnit> basedao;

	public void setBasedao(IBaseDAO<InfoUnit> basedao) {
		this.basedao = basedao;
	}

	@Override
	public boolean addInfoUnit(InfoUnit unit) throws Exception {
		return basedao.add(unit);
	}

	@Override
	public boolean editInfoUnit(InfoUnit unit) throws Exception {
		return basedao.edit(unit);
	}

	@Override
	public InfoUnit getInfoUnitById(Class<InfoUnit> c, Integer id)
			throws Exception {
		return basedao.getById(c, id);
	}

	@Override
	public boolean removeInfoUnit(Integer id) throws Exception {
		InfoUnit unit = basedao.getById(InfoUnit.class, id);
		if (unit != null) {
			basedao.remove(unit);
		}
		return false;
	}

	@Override
	public BigInteger getTotalInfoUnitRecords() throws Exception {
		String sql = "select count(unit_id) from info_unit";
		return basedao.getTotalRecords(sql);
	}

	@Override
	public List<InfoUnit> getAllInfoUnitByPage(int pageindex, int pagesize)
			throws Exception {
		String hql = "from InfoUnit";
		return basedao.getAllEntityByPage(hql, pageindex, pagesize);
	}

	@Override
	public BigInteger searchTotalInfoUnitRecords(InfoUnit unit)
			throws Exception {
		String sql = "select count(unit_id) from info_unit where name like ?";
		String item1 = unit.getName() + "%";
		return basedao.getTotalRecords(sql, item1);
	}

	@Override
	public List<InfoUnit> searchInfoUnitByPage(int pageindex, int pagesize,
			InfoUnit unit) throws Exception {
		String hql = "from InfoUnit as u where u.name like ?";
		String item1 = unit.getName() + "%";
		return basedao.getAllEntityByPage(hql, pageindex, pagesize, item1);
	}
}
