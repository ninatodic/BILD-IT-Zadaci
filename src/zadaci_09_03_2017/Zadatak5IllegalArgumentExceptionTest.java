package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5IllegalArgumentExceptionTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean ex = true;
		double annualInterestRate = 0;
		int numberOfYears = 0;
		double loanAmount = 0;

		do { 
			try{
			System.out.print(
				"Enter annual interest rate, for example, 8.25: ");
			 annualInterestRate = input.nextDouble();
			 ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input");
				input.nextLine();
			} 
			
		}while(ex);
		
		ex = true;
		do{
			try{
			System.out.print("Enter number of years as an integer: ");
			numberOfYears = input.nextInt();
			ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input");
				input.nextLine();
			} 
			
		}while(ex);
		
		ex = true;

		do{
			try{
			System.out.print("Enter loan amount, for example, 120000.95: ");
			 loanAmount = input.nextDouble();
			 ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input");
				input.nextLine();
			} 
			
		}while(ex);
		
		ex = true;
		do{
			try {
				// Create a Loan object
				Loan loan =
					new Loan(annualInterestRate, numberOfYears, loanAmount);	
				ex = false;

				// Display loan date, monthly payment, and total payment
				System.out.printf("The loan was created on %s\n" + 
					"The monthly payment is %.2f\nTne total payment is %.2f\n",
					loan.getLoanDate().toString(), loan.getMonthlyPayment(),
					loan.getTotalPayment());
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				input.nextLine();
			}
		} while (ex);
		
		input.close();
	}
}
