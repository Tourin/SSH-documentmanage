/**
 * 
 */
package com.my.dao.impl;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.my.dao.IBaseDAO;

/**
 * @author tanglin
 * @param <T>
 * 
 */
@SuppressWarnings("unchecked")
public class BaseDAOImpl<T> extends HibernateDaoSupport implements IBaseDAO<T> {

	/**
	 * <b>function:</b> 增加一个entity对象，返回是否添加成功
	 * 
	 * @createDate 2010-8-2 下午05:28:38
	 * @author tanglin
	 * @param <T>
	 *            对象类型
	 * @param entity
	 *            对象
	 * @return boolean true/false
	 * @throws Exception
	 */
	@Override
	public boolean add(T entity) throws Exception {
		boolean bo = false;
		try {
			Serializable io = this.getHibernateTemplate().save(entity);
			if (io != null) {
				bo = true;
			}
		} catch (Exception e) {
			bo = false;
			throw new RuntimeException(e);
		}
		return bo;
	}

	/**
	 * <b>function:</b> 添加一个entity对象，返回添加对象的Integer类型的主键
	 * 
	 * @createDate 2010-8-2 下午05:29:39
	 * @author tanglin
	 * @param <T>
	 *            对象类型
	 * @param entity
	 *            将要添加的对象
	 * @return Integer 返回主键
	 * @throws Exception
	 */
	@Override
	public Integer addAndGetId4Integer(T entity) throws Exception {
		Integer id = null;
		try {
			id = (Integer) this.getHibernateTemplate().save(entity);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return id;
	}

	/**
	 * <b>function:</b> 修改entity对象，返回是否修改成功
	 * 
	 * @createDate 2010-8-2 下午05:35:47
	 * @author tanglin
	 * @param <T>
	 *            对象类型
	 * @param entity
	 *            将要修改的对象
	 * @return boolean true/false 是否修改成功
	 * @throws Exception
	 */
	public boolean edit(T entity) throws Exception {
		boolean bo = false;
		try {
			this.getHibernateTemplate().saveOrUpdate(entity);
			bo = true;
		} catch (Exception e) {
			bo = false;
			throw new RuntimeException(e);
		}
		return bo;
	}

	/**
	 * <b>function:</b> 传入hql语句执行修改，返回是否修改成功
	 * 
	 * @createDate 2010-8-2 下午05:36:31
	 * @author tanglin
	 * @param hql
	 *            查询的hql语句
	 * @return boolean true/false 返回是否修改成功
	 * @throws Exception
	 */
	public boolean edit(String hql) throws Exception {
		boolean bo = false;
		try {
			int count = this.getHibernateTemplate().bulkUpdate(hql);
			bo = count > 0 ? true : false;
		} catch (Exception e) {
			bo = false;
			throw new RuntimeException(e);
		}
		return bo;
	}

	/**
	 * <b>function:</b> 传入hql语句执行查询，返回list集合
	 * 
	 * @createDate 2010-8-3 上午10:00:34
	 * @author tanglin
	 * @param hql
	 *            查询的hql语句
	 * @return List集合
	 * @throws Exception
	 */
	public List<T> findByHql(String hql) throws Exception {
		List<T> list = null;
		try {
			list = (List<T>) this.getHibernateTemplate().find(hql);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/**
	 * <b>function:</b> 执行原生态的sql语句，添加、删除、修改语句
	 * 
	 * @createDate 2010-8-2 下午05:33:42
	 * @author tanglin
	 * @param sql
	 *            将要执行的sql语句
	 * @return int
	 * @throws Exception
	 */
	public int executeBySql(String sql) throws Exception {
		try {
			return this.getSession().createSQLQuery(sql).executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * <b>function:</b> 通过hql语句查询List集合
	 * 
	 * @createDate 2010-8-2 下午05:51:05
	 * @author tanglin
	 * @param hql
	 *            查询hql语句
	 * @return List<?>
	 * @throws Exception
	 */
	public List<T> getList(String hql) throws Exception {
		List<T> list = null;
		try {
			list = (List<T>) this.getHibernateTemplate().find(hql);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/**
	 * <b>function:</b> 传入sql语句执行查询，返回list集合
	 * 
	 * @createDate 2010-8-3 上午10:00:34
	 * @author tanglin
	 * @param sql
	 *            查询的sql语句
	 * @return List集合
	 * @throws Exception
	 */
	public List<T> findBySql(String sql) throws Exception {
		List<T> list = null;
		try {
			list = (List<T>) this.getSession().createSQLQuery(sql).list();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/**
	 * <b>function:</b> 传入一个entity对象Class和Integer类型主键，返回该对象
	 * 
	 * @createDate 2010-8-2 下午05:47:20
	 * @author tanglin
	 * @param <T>
	 *            返回、传入对象类型
	 * @param c
	 *            对象Class
	 * @param id
	 *            主键
	 * @return T 返回该类型的对象
	 * @throws Exception
	 */
	public T getById(Class<T> c, Integer id) throws Exception {
		T ety = null;
		try {
			ety = (T) this.getHibernateTemplate().get(c, id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return ety;
	}

	/**
	 * <b>function:</b> 传入一个将要删除的entity对象，返回删除是否成功
	 * 
	 * @createDate 2010-8-2 下午05:42:02
	 * @author tanglin
	 * @param <T>
	 *            传入对象类型
	 * @param entity
	 *            将要传入的对象
	 * @return boolean true/false
	 * @throws Exception
	 */
	public boolean remove(T entity) throws Exception {
		boolean bo = false;
		try {
			this.getHibernateTemplate().delete(entity);
			bo = true;
		} catch (Exception e) {
			bo = false;
			throw new RuntimeException(e);
		}
		return bo;
	}

	/**
	 * <b>function:</b> 传入一个SQL语句，返回查询结果 sql例:select count(*) from info_user
	 */
	@Override
	public BigInteger getTotalRecords(String sql, String... strs)
			throws Exception {
		Session session = this.getSession();
		Query query = session.createSQLQuery(sql);
		int i = 0;
		for (String element : strs) {
			query.setString(i++, element);
		}
		return (BigInteger) query.uniqueResult();
	}

	/**
	 * <b>function:</b> 传入一个HQL语句和条件，返回查询结果 hql例"from User"
	 */
	@Override
	public List<T> getAllEntityByPage(String hql, int pageindex, int pagesize,
			String... strs) {
		Session session = this.getSession();
		Query query = session.createQuery(hql);
		int i = 0;
		for (String element : strs) {
			query.setString(i++, element);
		}
		query.setFirstResult((pageindex - 1) * pagesize);
		query.setMaxResults(pagesize);
		return query.list();
	}

	/**
	 * <b>function:</b> 传入一个HQL语句和用户名密码，返回查询对象
	 */
	@Override
	public T checkEntity(String hql, String... strs) {
		Session session = this.getSession();
		Query query = session.createQuery(hql);
		int i = 0;
		for (String element : strs) {
			query.setString(i++, element);
		}
		List<T> list = query.list();
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * <b>function:</b> 传入一个HQL语句和对象名称，返回对象是否存在
	 */
	@Override
	public boolean isExist(String hql, String... strs) {
		boolean result = false;
		Session session = this.getSession();
		Query query = session.createQuery(hql);
		int i = 0;
		for (String element : strs) {
			query.setString(i++, element);
		}
		List<T> list = query.list();
		if (list != null && list.size() > 0) {
			result = true;
		}
		return result;
	}

}
