package com.action;

import java.util.Map;

import com.facade.EmployeeFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.EmployeeRequest;
import com.response.EmployeeResponse;

public class ShowPerson extends ActionSupport{
	private EmployeeFacade employeeFacade;
	private EmployeeResponse response;
	
	public String execute(){
		Integer id  = (Integer) ActionContext.getContext().getSession().get("id");
		EmployeeRequest request = new EmployeeRequest();
		request.setId(id);
		response = employeeFacade.find(request);
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("employeeResponse", response);
		return "SUCCESS";
	}
	
	
	
	public EmployeeFacade getEmployeeFacade() {
		return employeeFacade;
	}

	public void setEmployeeFacade(EmployeeFacade employeeFacade) {
		this.employeeFacade = employeeFacade;
	}
	
}
