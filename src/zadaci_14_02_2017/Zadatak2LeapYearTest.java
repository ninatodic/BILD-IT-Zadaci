package zadaci_14_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2LeapYearTest {

	public static void main(String[] args) {
		// creating a scanner and creating and initializing variables needed for computing
		Scanner input = new Scanner(System.in);

		int beginningYear = 0;
		int endingYear = 0;
		
		boolean ex = true;
		// prompting a user for beginning and ending year handling InputMismatchExceptions 
		do {
			try {
				System.out.println("Enter beggining year: ");
				beginningYear = input.nextInt();
				while (beginningYear < 0) { // it has to be positive entry
					System.out.println("The year has to be positive. Try again");
					beginningYear = input.nextInt();
				}
				System.out.println("Enter ending year: ");
				endingYear = input.nextInt();
				while (endingYear < 0) { // it has to be positive entry
					System.out.println("The year has to be positive. Try again");
					endingYear = input.nextInt();
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);
		
		LeapYear yearRange1 = new LeapYear(beginningYear, endingYear);
		
		yearRange1.printYears();
		
		input.close();

	}

}
