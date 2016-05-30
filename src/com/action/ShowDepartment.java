package com.action;

import java.util.Map;

import com.facade.DepartmentFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.response.DepartmentResponse;

public class ShowDepartment extends ActionSupport {
	private DepartmentFacade departmentFacade;

	public DepartmentFacade getDepartmentFacade() {
		return departmentFacade;
	}

	public void setDepartmentFacade(DepartmentFacade departmentFacade) {
		this.departmentFacade = departmentFacade;
	}

	private DepartmentResponse departmentResponse;
		
		public String execute(){
			departmentResponse = departmentFacade.listAll();
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("departmentResponse", departmentResponse);
			return "SUCCESS";
		}
	
}
