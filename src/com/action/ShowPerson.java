package com.action;

import java.util.Map;

import com.facade.SalaryFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.SalaryRequest;
import com.response.SalaryResponse;

public class ShowPerson extends ActionSupport{
	private SalaryFacade salaryFacade;
	private SalaryResponse response;
	private Integer empId;
	private Integer month;
	private Integer year;
	public String execute(){
		if(empId!=null){
			
				
			System.out.println("id"+empId);
			SalaryRequest request = new SalaryRequest();
			request.setEmpId(empId);
			
			if(month!=null&&month!=0)
				request.setAttMonth(month);
			if(year!=null&&year!=0)
				request.setAttYear(year);
			
			response = salaryFacade.getSalary(request);
			Map<String, Object> request1 = (Map<String, Object>) ActionContext.getContext().get("request");
			
			
			if(year!=null&&year!=0){
				year=null;
				request1.put("salaryResponseYear", response);
				return "SUCCESS_TYPE1";
			}else{
				request1.put("salaryResponse", response);
			}
			
			return "SUCCESS";
		}
		return "FAILURE";
	}

	public SalaryFacade getSalaryFacade() {
		return salaryFacade;
	}

	public void setSalaryFacade(SalaryFacade salaryFacade) {
		this.salaryFacade = salaryFacade;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}


	
	
	

	
}
