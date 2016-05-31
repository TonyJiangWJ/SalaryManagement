package com.response.model;

import com.bean.Employee;

public class EmployeeModel extends Employee{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String department;
	private String job;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
