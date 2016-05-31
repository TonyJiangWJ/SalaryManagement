package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.Department;
import com.dao.DepartmentDao;
import com.service.DepartmentService;

public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService{

	private DepartmentDao departmentDao;
	
	@Override
	public BaseDao<Department> getDao() {
		// TODO Auto-generated method stub
		return departmentDao;
	}

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

}
