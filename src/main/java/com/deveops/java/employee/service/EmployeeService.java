package com.deveops.java.employee.service;

import static com.deveops.java.employee.utils.ApplicationHelper.getErrorResponse;
import static com.deveops.java.employee.utils.ApplicationHelper.getSuccessResponse;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.deveops.java.employee.dto.EmployeeBEObjectBaseResponse;
import com.deveops.java.employee.model.Employee;
import com.deveops.java.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeBEObjectBaseResponse addEmployee(Employee employee) {
		try {
			employeeRepository.save(employee);
			logger.info("Employee Data Saved For GMA-Booking successfully.");
			return getSuccessResponse("Employee Added Successfully");
		} catch (Exception e) {
			logger.error(
					"Exception Occured While Saving Employee Details. Exception Message {{}},Exception Details {{}}",
					e.getMessage(), e);
			return getErrorResponse("Error Occurred while saving details");
		}
	}

	public EmployeeBEObjectBaseResponse getAllEmployees() {
		List<Employee> employeeData = employeeRepository.findAll();
		if (CollectionUtils.isEmpty(employeeData)) {
			return getErrorResponse("No Employee Details found.");
		}
		return getSuccessResponse(employeeData);
	}

}
