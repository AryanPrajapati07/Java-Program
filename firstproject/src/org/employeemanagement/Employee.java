package org.employeemanagement;

public class Employee {
	private String ename;
	private Designation designation;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", designation=" + designation + "]";
	}

}
