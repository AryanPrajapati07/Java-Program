package constructor_inheritence;

public class Vehicle {
	private String comp;

	public Vehicle() {

		this.comp = "Citroen";
	}

	
	@Override
	public String toString() {
		return "Vehicle [comp=" + comp + "]";
	}

}
