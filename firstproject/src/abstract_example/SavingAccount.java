package abstract_example;

public class SavingAccount extends BankAccount {

	String name;
	int acNo, balance;

	@Override
	public void deposit(String name, int acNo, int balance) {
		// TODO Auto-generated method stub
		this.name = name;
		this.acNo = acNo;
		this.balance += balance;
	}

	@Override
	public void withdraw(int acNo, int amount) {
		// TODO Auto-generated method stub

		this.acNo = acNo;

		if (this.balance < amount) {
			System.out.println();

		}

	}

}
