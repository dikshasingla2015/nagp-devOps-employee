package com.deveops.java.employee.dto;

public class EmployeeDTO {

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeDTO [employeeName=");
		builder.append(employeeName);
		builder.append(", age=");
		builder.append(age);
		builder.append(", designation=");
		builder.append(designation);
		builder.append("]");
		return builder.toString();
	}

}
