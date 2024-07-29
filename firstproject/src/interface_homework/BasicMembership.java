package interface_homework;

public class BasicMembership implements Membership {
	private final String mtype = "Basic Membership";
	private final String access = "access to cardio equipment only";
	private final double fee = 230.0;

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
