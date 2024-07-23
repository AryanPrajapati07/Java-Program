package com.aryan.assignment.employees;

public class Manager extends Employee {

	private String department;

	public Manager(String name, String employeeId, double salary, String department) {
		super(name, employeeId, salary);
		this.department = department;
		// TODO Auto-generated constructor stub
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + "]";
	}
}
