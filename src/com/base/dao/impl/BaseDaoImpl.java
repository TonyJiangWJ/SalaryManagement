package com.base.dao.impl;

import java.lang.reflect.ParameterizedType; 
import java.lang.reflect.Type; 
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.base.dao.BaseDao;

public abstract class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{
	
	@SuppressWarnings("unchecked")
	private Class <T> entityClass = (Class <T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	@Override
	public void insert(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(entity);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(entity);
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(entity);
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(entityClass, id));
	}


	@Override
	public T getById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return (T)getHibernateTemplate().get(entityClass, id);
	}

	@Override
	abstract public List<T> findAll() ;

	@Override
	abstract public List<T> find(T entity) ;
	
	
	
}
