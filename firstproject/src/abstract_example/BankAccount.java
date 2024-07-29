package abstract_example;

public abstract class BankAccount {

	public abstract void deposit(String name, int acNo, int balance);

	public abstract void withdraw(int acNo, int amount);

}
