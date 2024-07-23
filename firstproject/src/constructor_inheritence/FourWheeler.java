package constructor_inheritence;

public class FourWheeler extends Vehicle {
	
	private String fuel;

	public FourWheeler() {
		super();
		this.fuel = "Petrol";
	}

	@Override
	public String toString() {
		return "FourWheeler [fuel=" + fuel + super.toString() + "]";
	}
	
	
	

}
