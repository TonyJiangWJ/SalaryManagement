package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeDaoImpl extends BaseDaoImpl<Employee> implements EmployeeDao{
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return (List<Employee>) getHibernateTemplate().find("from Employee");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> find(Employee entity) {
		
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Employee.class);
		if(entity.getDeptId()!=null)
			detachedCriteria.add(Restrictions.eq("deptId", entity.getDeptId()));
		if(entity.getName()!=null)
			detachedCriteria.add(Restrictions.eq("name", entity.getName()));
		if(entity.getSex()!=null)
			detachedCriteria.add(Restrictions.eq("sex", entity.getSex()));
		
		return (List<Employee>) getHibernateTemplate().findByCriteria(detachedCriteria);
	}
}
