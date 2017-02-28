package zadaci_28_02_2017;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	static private double annualInterestRate = 0;
	Date dateCreated = new Date();

	public Account() {
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public static  void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDate() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double withdraw) {
		balance -= withdraw;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}
}
