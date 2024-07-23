package com.aryan.assignment.employees;

public class Developer extends Employee {

	private String programmingLanguage;

	public Developer(String name, String employeeId, double salary, String programmingLanguage) {
		super(name, employeeId, salary);
		this.programmingLanguage = programmingLanguage;
		// TODO Auto-generated constructor stub
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	@Override
	public String toString() {
		return "Developer [programmingLanguage=" + programmingLanguage + "]";
	}
}
