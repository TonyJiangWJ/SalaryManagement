package com.action;

import java.util.Map;

import com.facade.EmployeeFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.response.EmployeeResponse;

public class ShowEmployee extends ActionSupport{
	private EmployeeFacade employeeFacade;
	private EmployeeResponse employeeResponse;
	public EmployeeFacade getEmployeeFacade() {
		return employeeFacade;
	}

	public void setEmployeeFacade(EmployeeFacade employeeFacade) {
		this.employeeFacade = employeeFacade;
	}
	
	public EmployeeResponse getEmployeeResponse() {
		return employeeResponse;
	}

	public void setEmployeeResponse(EmployeeResponse employeeResponse) {
		this.employeeResponse = employeeResponse;
	}

	public String execute(){
		employeeResponse = employeeFacade.listAll();
		Map<String, Object> session = ActionContext.getContext().getSession();	
		session.put("employeeResponse", employeeResponse);
		return "SUCCESS";
	}
	
}
