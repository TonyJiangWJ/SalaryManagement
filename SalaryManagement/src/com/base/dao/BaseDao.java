package com.base.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=false)
public interface BaseDao<T> {
	public void insert(T entity);
	public void update(T entity);
	public void delete(T entity);
	
	public void deleteById(Integer id);
	public T getById(Integer id);
	public List<T> findAll();
	public List<T> find(T entity);
}
