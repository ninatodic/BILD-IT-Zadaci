package zadaci_28_02_2017;

import java.util.Date;

public class Account {
	// data fields
	private int id = 0;
	private double balance = 0;
	static private double annualInterestRate = 0;
	Date dateCreated = new Date();

	// default constructor and constructor with parameters
	public Account() {
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// getter and setter methods
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

	// method that returns monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}

	// method that returns monthly interest
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	// method that allows withdraw of funds
	public void withdraw(double withdraw) {
		balance -= withdraw;
	}

	// method that allows deposit of funds
	public void deposit(double deposit) {
		balance += deposit;
	}
}
