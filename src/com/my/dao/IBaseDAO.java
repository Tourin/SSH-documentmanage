/**
 * 
 */
package com.my.dao;

import java.math.BigInteger;
import java.util.List;

/**
 * @author tanglin
 * 
 */
public interface IBaseDAO<T> {

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
	public boolean add(T entity) throws Exception;

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
	public Integer addAndGetId4Integer(T entity) throws Exception;

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
	public boolean edit(T entity) throws Exception;

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
	public boolean edit(String hql) throws Exception;

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
	public List<T> findByHql(String hql) throws Exception;

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
	public int executeBySql(String sql) throws Exception;

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
	public List<T> getList(String hql) throws Exception;

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
	public List<T> findBySql(String sql) throws Exception;

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
	public T getById(Class<T> c, Integer id) throws Exception;

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
	public boolean remove(T entity) throws Exception;

	/**
	 * <b>function:</b> 传入一个SQL语句，返回查询结果
	 */
	public BigInteger getTotalRecords(String sql, String... strs)
			throws Exception;

	/**
	 * <b>function:</b> 传入一个HQL语句，返回查询结果
	 */
	public List<T> getAllEntityByPage(String hql, int pageindex, int pagesize,
			String... strs);

	/**
	 * <b>function:</b> 传入一个HQL语句和查询条件，返回查询对象
	 */
	public T checkEntity(String hql, String... strs);

	/**
	 * <b>function:</b> 传入一个HQL语句和查询条件，返回对象是否存在
	 */
	public boolean isExist(String hql, String... strs);

}
