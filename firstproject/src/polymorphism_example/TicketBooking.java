package polymorphism_example;

import java.util.*;

public class TicketBooking {
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	private double amount;
	private String paymentMethod;
	private String paymentDetails;

	public String getStageEvent() {
		return stageEvent;
	}

	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public TicketBooking() {

	}

	public TicketBooking(String stageEvent, String customer, int noOfSeats) {

		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}

	
	public void makePayment(double amount) {
		this.amount = amount;
		this.paymentMethod = "Cash";
		this.paymentDetails = "Paid in cash";
		printReceipt();
	}

	
	public void makePayment(String walletName, double amount) {
		this.amount = amount;
		this.paymentMethod = "Online Wallet";
		this.paymentDetails = "Paid using " + walletName + " wallet";
		printReceipt();
	}

	
	public void makePayment(long cardNumber, String cardType, double amount) {
		this.amount = amount;
		this.paymentMethod = "Credit Card";
		this.paymentDetails = "Paid using " + cardType + " card, Card Number: " + cardNumber;
		printReceipt();
	}

	
	private void printReceipt() {
		System.out.println("Receipt");
		System.out.println("Stage Event: " + stageEvent);
		System.out.println("Customer: " + customer);
		System.out.println("Number of Seats: " + noOfSeats);
		System.out.printf("Amount: %.1f\n", amount);
		System.out.println("Payment Method: " + paymentMethod);
		System.out.println("Payment Details: " + paymentDetails);
		System.out.println("----------------------------");
	}

}
