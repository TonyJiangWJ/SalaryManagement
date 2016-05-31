package com.test;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import com.alibaba.fastjson.JSON;
import com.bean.Attendance;
import com.bean.Department;
import com.bean.Employee;
import com.bean.Job;
import com.dao.impl.AttendanceDaoImpl;
import com.dao.impl.DepartmentDaoImpl;
import com.dao.impl.EmployeeDaoImpl;
import com.dao.impl.JobDaoImpl;
@ComponentScan
public class TestMain {
	public static void main(String []args){
		AttendanceDaoImpl adi = new AttendanceDaoImpl();
		DepartmentDaoImpl ddi = new DepartmentDaoImpl();
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		JobDaoImpl jdi = new JobDaoImpl();
		
		List<Attendance> attendances = adi.findAll();
		List<Department> departments = ddi.findAll();
		List<Employee> employees = edi.findAll();
		List<Job> jobs = jdi.findAll();
		
		System.out.println(JSON.toJSONString(attendances));
		System.out.println(JSON.toJSONString(departments));
		System.out.println(JSON.toJSONString(employees));
		System.out.println(JSON.toJSONString(jobs));
	}
}
