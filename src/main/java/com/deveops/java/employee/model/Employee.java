package com.deveops.java.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.deveops.java.employee.dto.EmployeeDTO;

@Document(collection = "employee")
public class Employee {

	@Id
	private String id;
	private String employeeName;
	private int age;
	private String designation;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Employee(EmployeeDTO employeeDTO) {
		super();
		this.employeeName = employeeDTO.getEmployeeName();
		this.age = employeeDTO.getAge();
		this.designation = employeeDTO.getDesignation();
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", age=");
		builder.append(age);
		builder.append(", designation=");
		builder.append(designation);
		builder.append("]");
		return builder.toString();
	}

}
