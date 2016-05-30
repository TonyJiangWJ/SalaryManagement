package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.Employee;
import com.dao.EmployeeDao;
import com.service.EmployeeService;

public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements EmployeeService{
	private EmployeeDao employeeDao;

	@Override
	public BaseDao<Employee> getDao() {
		// TODO Auto-generated method stub
		return employeeDao;
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
}
