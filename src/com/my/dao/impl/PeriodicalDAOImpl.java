package com.my.dao.impl;

import java.math.BigInteger;
import java.util.List;

import com.my.bean.InfoPeriodical;
import com.my.dao.IBaseDAO;
import com.my.dao.PeriodicalDAO;

public class PeriodicalDAOImpl implements PeriodicalDAO {
	private IBaseDAO<InfoPeriodical> basedao;

	public void setBasedao(IBaseDAO<InfoPeriodical> basedao) {
		this.basedao = basedao;
	}

	@Override
	public boolean addInfoPeriodical(InfoPeriodical periodical)
			throws Exception {
		return basedao.add(periodical);
	}

	@Override
	public boolean editInfoPeriodical(InfoPeriodical periodical)
			throws Exception {
		return basedao.edit(periodical);
	}

	@Override
	public InfoPeriodical getInfoPeriodicalById(Class<InfoPeriodical> c,
			Integer id) throws Exception {
		return basedao.getById(c, id);
	}

	@Override
	public boolean removeInfoPeriodical(Integer id) throws Exception {
		InfoPeriodical periodical = basedao.getById(InfoPeriodical.class, id);
		if (periodical != null) {
			basedao.remove(periodical);
		}
		return false;
	}

	@Override
	public BigInteger getTotalInfoPeriodicalRecords() throws Exception {
		String sql = "select count(periodical_id) from info_periodical";
		return basedao.getTotalRecords(sql);
	}

	@Override
	public List<InfoPeriodical> getAllInfoPeriodicalByPage(int pageindex,
			int pagesize) throws Exception {
		String hql = "from InfoPeriodical";
		return basedao.getAllEntityByPage(hql, pageindex, pagesize);
	}

	@Override
	public BigInteger searchTotalInfoPeriodicalRecords(InfoPeriodical periodical)
			throws Exception {
		String sql;
		if (periodical.getInfoUnit() == null
				|| periodical.getInfoUnit().getUnitId() == null) {
			sql = "select count(periodical_id) from info_periodical a left join info_unit b on a.unit_id=b.unit_id where b.name like ? and a.type like ?";
			String item1 = periodical.getInfoUnit().getName() + "%";
			String item2 = periodical.getType() + "%";
			return basedao.getTotalRecords(sql, item1, item2);
		} else {
			sql = "select count(periodical_id) from info_periodical where name like ? and unit_id=?";
			String item1 = periodical.getName() + "%";
			String item2 = periodical.getInfoUnit().getUnitId().toString();
			return basedao.getTotalRecords(sql, item1, item2);
		}
	}

	@Override
	public List<InfoPeriodical> searchInfoPeriodicalByPage(int pageindex,
			int pagesize, InfoPeriodical periodical) throws Exception {
		String hql;
		if (periodical.getInfoUnit() == null
				|| periodical.getInfoUnit().getUnitId() == null) {
			hql = "from InfoPeriodical as a where a.infoUnit.name like ? and a.type like ?";
			String item1 = periodical.getInfoUnit().getName() + "%";
			String item2 = periodical.getType() + "%";
			return basedao.getAllEntityByPage(hql, pageindex, pagesize, item1,
					item2);
		} else {
			hql = "from InfoPeriodical as a where a.name like ? and a.infoUnit.unitId=?";
			String item1 = periodical.getName() + "%";
			String item2 = periodical.getInfoUnit().getUnitId().toString();
			return basedao.getAllEntityByPage(hql, pageindex, pagesize, item1,
					item2);
		}

	}
}
