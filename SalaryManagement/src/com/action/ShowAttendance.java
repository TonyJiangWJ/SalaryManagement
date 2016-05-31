package com.action;

import java.util.Map;

import com.facade.AttendanceFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.response.AttendanceResponse;

public class ShowAttendance extends ActionSupport {
	private AttendanceFacade attendanceFacade;

	private AttendanceResponse attendanceResponse;
	
	public String execute(){
		attendanceResponse = attendanceFacade.listAllAttendance();
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("attendanceResponse", attendanceResponse);
		return "SUCCESS";
	}
	
	public AttendanceFacade getAttendanceFacade() {
		return attendanceFacade;
	}

	public void setAttendanceFacade(AttendanceFacade attendanceFacade) {
		this.attendanceFacade = attendanceFacade;
	}
	
}
