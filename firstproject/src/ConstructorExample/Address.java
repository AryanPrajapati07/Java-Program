package ConstructorExample;

public class Address {

	private String name, address;
	private int pincode;

	// constructor
	public Address() {
		this.name = "Aryan";
		this.address = "Ahmedabad";
		this.pincode = 382210;
	}

	public Address(String name, String address, int pincode) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
	}

	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	// tostring
	
	@Override
	public String toString() {
		return "Address [name=" + name + ", address=" + address + ", pincode=" + pincode + "]";
	}

}
