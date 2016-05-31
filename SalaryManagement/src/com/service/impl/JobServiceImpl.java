package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.Job;
import com.dao.JobDao;
import com.service.JobService;

public class JobServiceImpl extends BaseServiceImpl<Job> implements JobService {
	private JobDao jobDao;

	@Override
	public BaseDao<Job> getDao() {
		// TODO Auto-generated method stub
		return jobDao;
	}

	public JobDao getJobDao() {
		return jobDao;
	}

	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}

	
}
