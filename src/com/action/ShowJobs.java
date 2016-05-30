package com.action;

import java.util.Map;

import com.facade.JobFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.response.JobResponse;

public class ShowJobs extends ActionSupport {
	private JobFacade jobFacade;

	public JobFacade getJobFacade() {
		return jobFacade;
	}

	public void setJobFacade(JobFacade jobFacade) {
		this.jobFacade = jobFacade;
	}

	private JobResponse jobResponse;

	public String execute() {
		jobResponse = jobFacade.listAll();
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("jobResponse", jobResponse);
		return "SUCCESS";
	}
}
