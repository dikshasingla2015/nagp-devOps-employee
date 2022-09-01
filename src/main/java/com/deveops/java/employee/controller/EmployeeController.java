package com.deveops.java.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deveops.java.employee.dto.EmployeeBEObjectBaseResponse;
import com.deveops.java.employee.dto.EmployeeDTO;
import com.deveops.java.employee.service.EmployeeService;

@CrossOrigin
@RestController
@RequestMapping(value = "/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("")
	private String getData() {
		return "Hello from master branch.";
	}

	@PostMapping("addEmployee")
	public EmployeeBEObjectBaseResponse addEmployee(@RequestBody EmployeeDTO employee) {
		return employeeService.addEmployee(employee);
	}

	@GetMapping("getAllEmployees")
	public EmployeeBEObjectBaseResponse getAllEmployees() {
		return employeeService.getAllEmployees();
	}

}
