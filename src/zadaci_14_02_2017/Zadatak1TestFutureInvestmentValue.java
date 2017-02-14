package zadaci_14_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1TestFutureInvestmentValue {

	public static void main(String[] args) {
		// create scanner and create and intialize variables needed for computing
		Scanner input = new Scanner(System.in);

		double investment = 0;
		double yearInterest = 0;
		int numberOfYears = 0;
		boolean ex = true;
		
		//Prompt the user for data needed, handling the InputMismatchException
		do {
			try {
				System.out.println("Enter value of investment: ");
				investment = input.nextDouble();
				while (investment < 0) { // it has to be positive entry
					System.out.println("The investment has to be positive. Try again");
					investment = input.nextDouble();
				}
				System.out.println("Enter year interest: ");
				yearInterest = input.nextDouble();
				while (yearInterest < 0) { // it has to be positive entry
					System.out.println("The year interest has to be positive. Try again");
					yearInterest = input.nextDouble();
				}
				System.out.println("Enter number of years: ");
				numberOfYears = input.nextInt();
				while (numberOfYears < 0) { // it has to be positive entry
					System.out.println("The number of months has to be positive. Try again");
					numberOfYears = input.nextInt();
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);
		
		// create new object
		FutureInvestmentValue invest1 = new FutureInvestmentValue(investment, yearInterest, numberOfYears);

		// printing future investment by invoking getFutureInvestmentValue method
		System.out.printf("Future investment value with entered parameters is: %.2f",
				invest1.getFutureInvestmentValue());

		input.close();
	}
}
