package com.deveops.java.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {

	@Id
	private int id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(String employeeName, int age, String designation) {
		super();
		this.employeeName = employeeName;
		this.age = age;
		this.designation = designation;
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
