package com.facade;

import com.request.EmployeeRequest;
import com.response.EmployeeResponse;

public interface EmployeeFacade {
	public EmployeeResponse listAll();
	public EmployeeResponse updateEmployee(EmployeeRequest request);
	public EmployeeResponse deleteEmployee(EmployeeRequest request);
	public EmployeeResponse addEmployee(EmployeeRequest request);
	public EmployeeResponse find(EmployeeRequest request);
}
