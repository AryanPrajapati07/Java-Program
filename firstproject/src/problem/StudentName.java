package problem;

public class StudentName {

	private String name;

	public StudentName(String name) {
		this.name = name;
	}

	public StudentName() {
		this.name = "Unknown";
	}

	@Override
	public String toString() {
		return "StudentName [name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
