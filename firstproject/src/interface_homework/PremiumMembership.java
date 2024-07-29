package interface_homework;

public class PremiumMembership implements Membership{

	private final String mtype = "Premium Membership";
	private final String access = "access to all gym facilities, including cardio, \r\n"
			+ " \t          weightlifting, and group classes.";
	private final double fee = 600.0;

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
