package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.Attendance;
import com.dao.AttendanceDao;

public class AttendanceDaoImpl extends BaseDaoImpl<Attendance> implements AttendanceDao {
	@SuppressWarnings("unchecked")
	@Override
	public List<Attendance> findAll() {
		// TODO Auto-generated method stub
		return (List<Attendance>) getHibernateTemplate().find("from Attendance");
	}

	@Override
	public List<Attendance> find(Attendance entity) {
		DetachedCriteria criteria= DetachedCriteria.forClass(Attendance.class);
		if(entity.getAttMonth()!=null)
			criteria.add(Restrictions.eq("att_mounth", entity.getAttMonth()));
		if(entity.getAttYear()!=null)
			criteria.add(Restrictions.eq("att_year", entity.getAttYear()));
		if(entity.getEmpId()!=null)
			criteria.add(Restrictions.eq("empId", entity.getEmpId()));
		return (List<Attendance>) getHibernateTemplate().findByCriteria(criteria);
	}
}
