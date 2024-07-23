package org.testemployeemanagement;

import org.employeemanagement.*;

public class DemoEmployee {

	public static void main(String[] args) {
		Designation desg = new Designation();
		desg.setDesignation("Developer");
		desg.setDescription("Java");

		Employee em = new Employee();
		em.setEname("Aryan Prajapati");
		em.setDesignation(desg);

//		System.out.println(desg);
		System.out.println(em);

	}

}


