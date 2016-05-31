package com.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.bean.Attendance;
import com.bean.Department;
import com.bean.Employee;
import com.bean.Job;
import com.dao.AttendanceDao;
import com.dao.DepartmentDao;
import com.dao.EmployeeDao;
import com.dao.JobDao;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AttendanceService;

public class SimpleDemo extends ActionSupport{
	
	private AttendanceService attendanceService;
	
	
	public String execute() throws Exception{
		System.out.println(JSON.toJSONString(attendanceService.findAll()));
		return "SUCCESS";
	}


	public AttendanceService getAttendanceService() {
		return attendanceService;
	}


	public void setAttendanceService(AttendanceService attendanceService) {
		this.attendanceService = attendanceService;
	}
	
	
}
