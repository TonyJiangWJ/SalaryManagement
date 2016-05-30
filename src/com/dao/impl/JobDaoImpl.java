package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.Job;
import com.dao.JobDao;

public class JobDaoImpl extends BaseDaoImpl<Job> implements JobDao{
	@SuppressWarnings("unchecked")
	@Override
	public List<Job> findAll() {
		// TODO Auto-generated method stub
		return (List<Job>) getHibernateTemplate().find("from Job");
	}

	@Override
	public List<Job> find(Job entity) {
		DetachedCriteria dcCriteria = DetachedCriteria.forClass(Job.class);
		if(entity.getJobName()!=null)
			dcCriteria.add(Restrictions.eq("job_name", entity.getJobName()));
		return (List<Job>) getHibernateTemplate().findByCriteria(dcCriteria);
	}
}
