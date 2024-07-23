package com.aryan.assignment.utilities;

import com.aryan.assignment.employees.*;

public class EmployeeUtilities {
	
	public static void printEmployeeDetails(Employee em) {
		System.out.println("Name : "+ em.getName());
		System.out.println("Id : "+ em.getEmployeeId());
		System.out.println("Salary : "+ em.getSalary());
		
		
		
		if(em instanceof Manager) {
			System.out.println("Department : "+((Manager) em).getDepartment());
		}
		else if(em instanceof Developer){
			System.out.println("Programming Language : "+ ((Developer)em).getProgrammingLanguage());
		}

	}

}
