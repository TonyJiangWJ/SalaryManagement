package com.facade.impl;

import com.facade.SalaryFacade;
import com.request.SalaryRequest;
import com.response.SalaryResponse;
import com.service.AttendanceService;

public class SalaryFacadeImpl implements SalaryFacade {

	private AttendanceService attendanceService;
	
	@Override
	public SalaryResponse getSalary(SalaryRequest request) {
		return null;
	}

}
