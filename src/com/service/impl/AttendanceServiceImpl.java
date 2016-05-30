package com.service.impl;


import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.Attendance;
import com.dao.AttendanceDao;
import com.service.AttendanceService;

public class AttendanceServiceImpl extends BaseServiceImpl<Attendance> implements AttendanceService{

	private AttendanceDao attendanceDao;
	@Override
	public BaseDao<Attendance> getDao() {
		// TODO Auto-generated method stub
		return attendanceDao;
	}
	public AttendanceDao getAttendanceDao() {
		return attendanceDao;
	}
	public void setAttendanceDao(AttendanceDao attendanceDao) {
		this.attendanceDao = attendanceDao;
	}




}
