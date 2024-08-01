package interface_homework;

public interface Membership {
	void displayMembershipDetails();

	double calculateMembershipFee();
}

/*
 * -Define an interface named Membership with the following methods: 

 * -void displayMembershipDetails() - This method should display the details of the
 	membership, such as the type and privileges. -double calculateMembershipFee()

 * -This method should calculate the membership fee based on the type of membership. 
 
 * -Implement the following classes representing different types of memberships: 

 * -BasicMembership: Implements the Membership interface. Basic
	membership includes access to cardio equipment only. 

 * -StandardMembership: Implements the Membership interface. Standard membership includes access to
	cardio and weightlifting equipment. 

 * -Premium Membership: Implements the Membership interface. Premium membership includes access
	to all gym facilities, including cardio, weightlifting, and group classes.

 * -Each membership type should have its own specific fee structure and details.
 
 * -In the main method of a GymMembershipSystem class, create instances of each type of membership
	and demonstrate the functionality by displaying membership details and calculating membership
	fees for each type
 */
