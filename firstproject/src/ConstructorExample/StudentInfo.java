package ConstructorExample;

public class StudentInfo {

	private String name;
	private int rollno;

	public StudentInfo(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public StudentInfo() {
		super();
		this.name = "Aryan";
		this.rollno = 41;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", rollno=" + rollno + "]";
	}

}
