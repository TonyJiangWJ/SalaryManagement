package com.bean;
// default package



/**
 * Attendance entity. @author MyEclipse Persistence Tools
 */
public class Attendance implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer attYear;
	private Integer attMonth;
	private Integer empId;
	private Integer attCount;
	private Float attSalary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAttYear() {
		return attYear;
	}
	public void setAttYear(Integer attYear) {
		this.attYear = attYear;
	}
	public Integer getAttMonth() {
		return attMonth;
	}
	public void setAttMonth(Integer attMonth) {
		this.attMonth = attMonth;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Integer getAttCount() {
		return attCount;
	}
	public void setAttCount(Integer attCount) {
		this.attCount = attCount;
	}
	public Float getAttSalary() {
		return attSalary;
	}
	public void setAttSalary(Float attSalary) {
		this.attSalary = attSalary;
	}
	
	
   
}
