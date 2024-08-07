package employee_exception;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String ename = sc.nextLine();

		System.out.println("Enter the Salary : ");
		int esalary = sc.nextInt();

		emp.setName(ename);
		emp.setSalary(esalary);

		System.out.println(emp);
	}

}
