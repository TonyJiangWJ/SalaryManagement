package com.service;

import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import com.bean.Attendance;
@Service("attendanceService")
public interface AttendanceService extends BaseService<Attendance>{
	
}
