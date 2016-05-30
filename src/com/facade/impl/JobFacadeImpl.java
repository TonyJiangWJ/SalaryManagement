package com.facade.impl;

import java.util.List;

import com.bean.Job;
import com.facade.JobFacade;
import com.request.JobRequest;
import com.response.JobResponse;
import com.service.JobService;

public class JobFacadeImpl implements JobFacade{

	private JobService jobService;
	
	public JobService getJobService() {
		return jobService;
	}

	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

	public JobResponse listAll() {
		JobResponse response = new JobResponse();
		List<Job> resultJobs = jobService.findAll();
		response.setResult(resultJobs);
		return response;
	}

	public JobResponse addJob(JobRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public JobResponse updateJob(JobRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
