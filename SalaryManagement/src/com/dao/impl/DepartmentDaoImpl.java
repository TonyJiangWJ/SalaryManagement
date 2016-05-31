package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.Department;
import com.dao.DepartmentDao;

public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{
	@SuppressWarnings("unchecked")
	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return (List<Department>) getHibernateTemplate().find("from Department");
	}

	@Override
	public List<Department> find(Department entity) {
		DetachedCriteria dc = DetachedCriteria.forClass(Department.class);
		if(entity.getManager()!=null)
		dc.add(Restrictions.eq("manager", entity.getManager()));
		return (List<Department>) getHibernateTemplate().findByCriteria(dc);
	}
}
