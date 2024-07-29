package classrelationexample.hasarelation;

public class Address {
	private String flatno, socname, area;
	private int pincode;

	public String getFlatno() {
		return flatno;
	}

	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}

	public String getSocname() {
		return socname;
	}

	public void setSocname(String socname) {
		this.socname = socname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getpincode() {
		return pincode;
	}

	public void setpincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", socname=" + socname + ", area=" + area + ", pincode=" + pincode + "]";
	}

}
