package polymorphism_example;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details in CSV format (stageEvent,customer,noOfSeats):");
		String[] input = sc.nextLine().split(",");
		String stageEvent = input[0];
		String customer = input[1];
		int noOfSeats = Integer.parseInt(input[2]);

		TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

		System.out.println("Choose payment method:");
		System.out.println("1. Cash");
		System.out.println("2. Online Wallet");
		System.out.println("3. Credit Card");

		int choice = sc.nextInt();
		sc.nextLine(); // Consume newline left-over

		switch (choice) {
		case 1:
			System.out.println("Enter the amount:");
			double cashAmount = sc.nextDouble();
			booking.makePayment(cashAmount);
			break;

		case 2:
			System.out.println("Enter the wallet name:");
			String walletName = sc.nextLine();
			System.out.println("Enter the amount:");
			double walletAmount = sc.nextDouble();
			booking.makePayment(walletName, walletAmount);
			break;

		case 3:
			System.out.println("Enter the card number:");
			long cardNumber = sc.nextLong();
			sc.nextLine(); // Consume newline left-over
			System.out.println("Enter the card type:");
			String cardType = sc.nextLine();
			System.out.println("Enter the amount:");
			double cardAmount = sc.nextDouble();
			booking.makePayment(cardNumber, cardType, cardAmount);
			break;

		default:
			System.out.println("Invalid choice");
		}

		sc.close();

	}

}
