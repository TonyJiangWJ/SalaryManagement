package com.bean;
// default package


/**
 * Job entity. @author MyEclipse Persistence Tools
 */
public class Job implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Integer id;
    private String jobName;
    private Float salary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
    
}
