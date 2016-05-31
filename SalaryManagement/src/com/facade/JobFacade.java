package com.facade;

import com.request.JobRequest;
import com.response.JobResponse;

public interface JobFacade {
	public JobResponse listAll();
	public JobResponse addJob(JobRequest request);
	public JobResponse updateJob(JobRequest request);
}
