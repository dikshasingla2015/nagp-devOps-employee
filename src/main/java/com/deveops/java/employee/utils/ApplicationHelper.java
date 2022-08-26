package com.deveops.java.employee.utils;

import com.deveops.java.employee.dto.EmployeeBEObjectBaseResponse;;

public class ApplicationHelper {

	private ApplicationHelper() {

	}

	public static EmployeeBEObjectBaseResponse getSuccessResponse(final Object msg) {
		EmployeeBEObjectBaseResponse response = new EmployeeBEObjectBaseResponse();
		response.setError(Boolean.FALSE);
		response.setCode("200");
		response.setData(msg);
		return response;
	}

	public static EmployeeBEObjectBaseResponse getErrorResponse(String errorMessage) {
		EmployeeBEObjectBaseResponse response = new EmployeeBEObjectBaseResponse();
		response.setError(Boolean.TRUE);
		response.setCode("101");
		response.setErrorMessage(errorMessage);
		return response;
	}

}
