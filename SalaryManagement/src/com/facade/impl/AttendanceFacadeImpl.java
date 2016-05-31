package com.facade.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.bean.Attendance;
import com.facade.AttendanceFacade;
import com.request.AttendanceRequest;
import com.response.AttendanceResponse;
import com.service.AttendanceService;

public class AttendanceFacadeImpl implements AttendanceFacade {

	private AttendanceService attendanceService;
	
	public AttendanceService getAttendanceService() {
		return attendanceService;
	}

	public void setAttendanceService(AttendanceService attendanceService) {
		this.attendanceService = attendanceService;
	}

	@Override
	public AttendanceResponse getAttendanceSelective(AttendanceRequest request) {
		AttendanceResponse response = new AttendanceResponse();
		Attendance record = new Attendance();
		
		if(!StringUtils.isEmpty(request.getAttMonth()))
			record.setAttMonth(request.getAttMonth());
		if(!StringUtils.isEmpty(request.getAttYear()))
			record.setAttYear(request.getAttYear());
		if(!StringUtils.isEmpty(request.getEmpId()))
			record.setEmpId(request.getEmpId());
		List<Attendance> result = attendanceService.find(record);
		response.setResult(result);
		return response;
	}

	@Override
	public AttendanceResponse listAllAttendance() {
		// TODO Auto-generated method stub
		List<Attendance> result = attendanceService.findAll();
		AttendanceResponse response = new AttendanceResponse();
		response.setResult(result);
		return response;
	}

	@Override
	public AttendanceResponse addAttendance(AttendanceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendanceResponse deleteAttendance(AttendanceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendanceResponse updateAttendance(AttendanceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
