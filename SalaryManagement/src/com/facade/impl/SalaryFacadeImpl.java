package com.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.bean.Attendance;
import com.bean.Employee;
import com.bean.Job;
import com.bean.Salary;
import com.facade.SalaryFacade;
import com.request.SalaryRequest;
import com.response.SalaryResponse;
import com.service.AttendanceService;
import com.service.EmployeeService;
import com.service.JobService;


public class SalaryFacadeImpl implements SalaryFacade {

	private AttendanceService attendanceService;
	private EmployeeService employeeService;
	private JobService jobService;

	@Override
	public SalaryResponse getSalary(SalaryRequest request) {
		SalaryResponse response = new SalaryResponse();
		if(StringUtils.isEmpty(request.getEmpId())){
			response.setResultCode("参数错误 00");
		}
		Integer empId = request.getEmpId();
		Employee record = employeeService.findById(empId);
		Integer jobId = record.getJobId();
		Job job = jobService.findById(jobId);
		Float salary = job.getSalary();
		System.out.println("request"+JSON.toJSONString(request));
		Attendance t = new Attendance();
		t.setEmpId(empId);
		if(!StringUtils.isEmpty(request.getAttMonth())){
			t.setAttMonth(request.getAttMonth());
		}
		if(!StringUtils.isEmpty(request.getAttYear())){
			t.setAttYear(request.getAttYear());
		}
		List<Attendance> attendances = attendanceService.find(t);
		
		if(attendances.size()==1){
			Float attSalary = attendances.get(0).getAttSalary();
			Float total = salary+attSalary;
			List<Salary> result = new ArrayList<Salary>();
			Salary salary2 = new Salary();
			salary2.setEmpId(empId);
			salary2.setTotal(total);
			salary2.setAttMonth(attendances.get(0).getAttMonth());
			salary2.setAttYear(attendances.get(0).getAttYear());
			result.add(salary2);
			response.setResult(result);
			response.setResultCode("成功 01");
			System.out.println("response:"+JSON.toJSONString(response));
			return response;
		}else{
			if(attendances.size()==0){
				response.setResultCode("请求数据不存在 02");
				return response;
			}
			List<Salary> salaries = new ArrayList<Salary>();
			Float total;
			Salary temp ;
			for(int i=0;i<attendances.size();i++){
				total = salary+attendances.get(i).getAttSalary();
				temp = new Salary();
				temp.setTotal(total);
				temp.setEmpId(empId);
				temp.setAttMonth(attendances.get(i).getAttMonth());
				temp.setAttYear(attendances.get(i).getAttYear());
				salaries.add(temp);
			}
			response.setResult(salaries);
			response.setResultCode("成功 01");
		}
		System.out.println("response:"+JSON.toJSONString(response));
		return response;
	}

	public AttendanceService getAttendanceService() {
		return attendanceService;
	}

	public void setAttendanceService(AttendanceService attendanceService) {
		this.attendanceService = attendanceService;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public JobService getJobService() {
		return jobService;
	}

	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

}
