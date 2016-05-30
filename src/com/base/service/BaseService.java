package com.base.service;

import java.util.List;

public interface BaseService<T> {
	public void insert(T t);
	
	public void delete(T t);
	
	public void update(T t);
	
	public T findById(Integer id);
	
	public List<T> findAll();
	
	public void deleteById(Integer id);
	
	public List<T> find(T t);
}
