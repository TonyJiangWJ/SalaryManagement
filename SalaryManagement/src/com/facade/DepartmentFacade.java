package com.facade;

import com.request.DepartmentRequest;
import com.response.DepartmentResponse;

public interface DepartmentFacade {

	public DepartmentResponse listAll();
	public DepartmentResponse addDepartment(DepartmentRequest request);
	public DepartmentResponse updateDepartment(DepartmentRequest request);
	
	
}
