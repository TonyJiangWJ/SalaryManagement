package com.facade;

import com.request.SalaryRequest;
import com.response.SalaryResponse;

public interface SalaryFacade {
	public SalaryResponse getSalary(SalaryRequest request);
}
