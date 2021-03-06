package com.base.service.impl;

import java.util.List;

import com.base.dao.BaseDao;
import com.base.service.BaseService;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
	

	abstract public BaseDao<T> getDao();
	
	@Override
	public void insert(T t) {
		getDao().insert(t);
		
	}

	@Override
	public void delete(T t) {
		getDao().delete(t);
	}

	@Override
	public void update(T t) {
		getDao().update(t);
	}

	@Override
	public T findById(Integer id) {
		return getDao().getById(id);
	}

	@Override
	public List<T> findAll() {
		return getDao().findAll();
	}

	@Override
	public void deleteById(Integer id) {
		getDao().deleteById(id);
	}

	@Override
	public List<T> find(T t) {
		// TODO Auto-generated method stub
		return getDao().find(t);
	}
	
	
	
}
