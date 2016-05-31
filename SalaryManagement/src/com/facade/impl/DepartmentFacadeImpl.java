package com.facade.impl;

import java.util.List;

import com.bean.Department;
import com.facade.DepartmentFacade;
import com.request.DepartmentRequest;
import com.response.DepartmentResponse;
import com.service.DepartmentService;

public class DepartmentFacadeImpl implements DepartmentFacade {

	private DepartmentService departmentService;
	
	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public DepartmentResponse listAll() {
		DepartmentResponse response = new DepartmentResponse();
		List<Department> result = departmentService.findAll();
		response.setResult(result);
		return response;
	}

	public DepartmentResponse addDepartment(DepartmentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public DepartmentResponse updateDepartment(DepartmentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
