package com.w3cjava.common.base.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.w3cjava.common.base.dao.CrudDao;
import com.w3cjava.common.base.pojo.DataEntity;
/**
 * 
 * @projectNam：		W3cJava
 * @title：			CrudService
 * @author:			HeartMa E-mail：netheartma@gmail.com
 * @url:			http://www.heartma.net
 * @time：			2018-4-22 下午11:47:25
 * @description:	Service基类
 * @param <D>
 * @param <T>
 */
@Transactional(readOnly = true)
public abstract class CrudService<D extends CrudDao<T>, T extends DataEntity<T>>
		extends BaseService {

	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;

	/**
	 * 获取单条数据
	 * 
	 * @param id
	 * @return
	 */
	public T get(String id) {
		return dao.get(id);
	}

	/**
	 * 获取单条数据
	 * 
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return dao.get(entity);
	}

	/**
	 * 查询列表数据
	 * 
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity) {
		return dao.findList(entity);
	}


	/**
	 * 保存数据（插入或更新）
	 * 
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void save(T entity) {
		if (entity.getIsNewRecord()) {
			//entity.preInsert();
			dao.insert(entity);
		} else {
			//entity.preUpdate();
			dao.update(entity);
		}
	}

	/**
	 * 删除数据
	 * 
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void delete(T entity) {
		dao.delete(entity);
	}

	/**
	 * 删除全部数据
	 * 
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void deleteAll(Collection<T> entitys) {
		for (T entity : entitys) {
			dao.delete(entity);
		}
	}

}
