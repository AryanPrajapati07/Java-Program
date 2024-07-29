package classrelationexample.hasarelation;

public class Person {
	private String pname, pemail;
	private Address add;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pemail=" + pemail + ", add=" + add + "]";
	}

}
