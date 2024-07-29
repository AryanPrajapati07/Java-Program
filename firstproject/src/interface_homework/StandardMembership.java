package interface_homework;

public class StandardMembership implements Membership{

	private final String mtype = "Standard Membership";
	private final String access = "access to cardio and weightlifting equipment.";
	private final double fee = 400.0;

	@Override
	public void displayMembershipDetails() {
		System.out.println("Membership Type : "+mtype);
		System.out.println("Facilities      : "+access);
	}

	@Override
	public double calculateMembershipFee() {
		return fee;
	}
	
}
