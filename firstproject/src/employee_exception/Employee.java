package employee_exception;

public class Employee extends CustomEmployee_Exception {
	String name;
	double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salray) {

		try {
			if (salray > 10000 & salray < 25000) {

				this.salary = salray;
			}

			else {

				throw new CustomEmployee_Exception();

			}

		} catch (CustomEmployee_Exception ex) {

			System.out.println("Salary is not good......");
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salray=" + salary + "]";
	}

}
