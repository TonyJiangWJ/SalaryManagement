package com.facade.impl;

import java.util.List;

import com.bean.Employee;
import com.facade.EmployeeFacade;
import com.request.EmployeeRequest;
import com.response.EmployeeResponse;
import com.service.EmployeeService;

public class EmployeeFacadeImpl implements EmployeeFacade {

	private EmployeeService employeeService;
	
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public EmployeeResponse listAll() {
		// TODO Auto-generated method stub
		EmployeeResponse response = new EmployeeResponse();
		List<Employee> result = employeeService.findAll();
		response.setResult(result);
		return response;
	}

	public EmployeeResponse updateEmployee(EmployeeRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeResponse deleteEmployee(EmployeeRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeResponse addEmployee(EmployeeRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeResponse find(EmployeeRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		Employee record = new Employee();
		if(request.getDeptId()!=null)
			record.setDeptId(request.getDeptId());
		if(request.getJobId()!=null)
			record.setJobId(request.getJobId());
		List<Employee> resultEmployees = employeeService.find(record);
		response.setResult(resultEmployees);
		return response;
	}

}
