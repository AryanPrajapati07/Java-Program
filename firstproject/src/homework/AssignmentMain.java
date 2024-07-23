package homework;

import com.aryan.assignment.employees.*;
import com.aryan.assignment.utilities.*;

public class AssignmentMain {

	public static void main(String[] args) {

		Manager man = new Manager("Aryan", "001", 85000, "Account");
		Developer dev = new Developer("Dhaval", "002", 82000, "Data Analyst");

		System.out.println("Manager : ");
		EmployeeUtilities.printEmployeeDetails(man);

		System.out.println("\nDeveloper : ");
		EmployeeUtilities.printEmployeeDetails(dev);
	}

}
