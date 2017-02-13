package zadaci_13_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1Savings {

	public static void main(String[] args) {
		// create scanner and create and initialize varables needed for the
		// program
		Scanner input = new Scanner(System.in);
		double monthlyRate = 0.00417;
		double sum = 0;
		double monthlySaving = 0;
		boolean ex = true;
		int numberOfMonths = 0;
		// repeat prompt to the user for the integer until he enters it
		// correctly
		do {
			try {

				System.out.println("Enter the amount you want to save on monthly basis ");
				monthlySaving = input.nextDouble();
				while (monthlySaving < 0) { // it has to be positive entry
					System.out.println("The amount you enetered has to be positive. Try again");
					monthlySaving = input.nextDouble();
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);

		ex = true;
		do {
			try {
				System.out.println("Enter the number of months");
				numberOfMonths = input.nextInt();
				while (numberOfMonths < 0) { // it has to be positive entry
					System.out.println("The number of months has to be positive. Try again");
					numberOfMonths = input.nextInt();
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);

		// calculates saved amount for number of months entered
		for (int i = 0; i < numberOfMonths; i++) {
			monthlySaving *= (1 + monthlyRate);
			sum += +monthlySaving;

		}
		
		// prints out the result
		System.out.println("For " + numberOfMonths + " months on you account you will have ");
		System.out.printf("%.2f", sum);

		input.close();
	}

}
