package com.facade.impl;

import java.util.ArrayList;
import java.util.List;

import com.bean.Department;
import com.bean.Employee;
import com.bean.Job;
import com.facade.EmployeeFacade;
import com.request.EmployeeRequest;
import com.response.EmployeeResponse;
import com.response.model.EmployeeModel;
import com.service.DepartmentService;
import com.service.EmployeeService;
import com.service.JobService;

public class EmployeeFacadeImpl implements EmployeeFacade {

	private EmployeeService employeeService;
	private DepartmentService departmentService;
	private JobService jobService;
	
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
		List<EmployeeModel> resultModel = new ArrayList<EmployeeModel>();
		Integer deptId;
		Integer jobId;
		Department dpt;
		Job job;
		EmployeeModel temp;
		for(int i=0;i<result.size();i++){
			deptId = result.get(i).getDeptId();
			jobId = result.get(i).getJobId();
			dpt = departmentService.findById(deptId);
			job = jobService.findById(jobId);
			temp = new EmployeeModel();
			temp.setDepartment(dpt.getDeptName());
			temp.setJob(job.getJobName());
			
			Employee t = result.get(i);
			temp.setAddress(t.getAddress());
			temp.setAge(t.getAge());
			temp.setEmpTel(t.getEmpTel());
			temp.setId(t.getId());
			temp.setName(t.getName());
			temp.setSex(t.getSex());
			resultModel.add(temp);
		}
		response.setResult(resultModel);
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
		List<Employee> result = employeeService.find(record);
		List<EmployeeModel> resultModel = new ArrayList<EmployeeModel>();
		Integer deptId;
		Integer jobId;
		Department dpt;
		Job job;
		EmployeeModel temp;
		for(int i=0;i<result.size();i++){
			deptId = result.get(i).getDeptId();
			jobId = result.get(i).getJobId();
			dpt = departmentService.findById(deptId);
			job = jobService.findById(jobId);
			temp = new EmployeeModel();
			temp.setDepartment(dpt.getDeptName());
			temp.setJob(job.getJobName());
			
			Employee t = result.get(i);
			temp.setAddress(t.getAddress());
			temp.setAge(t.getAge());
			temp.setEmpTel(t.getEmpTel());
			temp.setId(t.getId());
			temp.setName(t.getName());
			temp.setSex(t.getSex());
			resultModel.add(temp);
		}
		response.setResult(resultModel);
		return response;
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public JobService getJobService() {
		return jobService;
	}

	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

	
}
