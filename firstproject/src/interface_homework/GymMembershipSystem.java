package interface_homework;

public class GymMembershipSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicMembership bm = new BasicMembership();
		StandardMembership sm = new StandardMembership();
		PremiumMembership pm = new PremiumMembership();
		
		System.out.println();
		bm.displayMembershipDetails();
		System.out.println("Membership Fees : " + bm.calculateMembershipFee() + "/month");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println();
		sm.displayMembershipDetails();
		System.out.println("Membership Fees : " + sm.calculateMembershipFee() + "/month");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println();
		pm.displayMembershipDetails();
		System.out.println("Membership Fees : " + pm.calculateMembershipFee() + "/month");
		System.out.println("-----------------------------------------------------------");
		
	}

}
