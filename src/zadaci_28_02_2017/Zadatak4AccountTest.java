package zadaci_28_02_2017;

public class Zadatak4AccountTest {

	public static void main(String[] args) {
		// create Account object, set annual interest rate and perform withdraw and deposit
		Account account1 = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		
		// print needed information for the account1 object
		System.out.println("The ballance of account1 is " + account1.getBalance() 
		+ ", the monthly interest is " + account1.getMonthlyInterest() + ", and account was created on " + 
				account1.getDate());
	}

}
