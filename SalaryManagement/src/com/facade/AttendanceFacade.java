package com.facade;

import com.request.AttendanceRequest;
import com.response.AttendanceResponse;

public interface AttendanceFacade {
	public AttendanceResponse getAttendanceSelective(AttendanceRequest request);

	public AttendanceResponse addAttendance(AttendanceRequest request);
	public AttendanceResponse deleteAttendance(AttendanceRequest request);
	public AttendanceResponse updateAttendance(AttendanceRequest request);
	AttendanceResponse listAllAttendance();
}
