package zadaci_17_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1NumberOfDaysInAYear {

	public static void main(String[] args) {
		// creating a scanner and creating and initializing variables needed for computing
				Scanner input = new Scanner(System.in);

				int beginningYear = 0;
				int endingYear = 0;
				
				boolean ex = true;
				// prompting a user for beginning and ending year handling InputMismatchExceptions 
				do {
					try {
						System.out.println("Enter beginning year: ");
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
						
						if (beginningYear>endingYear){
							throw new Exception("Invalid input.");
						}
						ex = false;
					} catch (InputMismatchException e) {
						System.out.println("Invalid input, try again");
						input.nextLine();
					} catch (Exception e) {
						System.out.println("Invalid input, beggining year has to be smaller than ending year");
						input.nextLine();
					}
				} while (ex);

				// loop that prints out that year has 366 days if it is a leap year and 365 days if it is a regular year
				for(int i = beginningYear; i<=endingYear; i++){
					if(isLeapYear(i)){
						System.out.println(i + " - 366 days" );
					}
					else{
						System.out.println(i + " - 365 days");
					}
				}
				input.close();

	}
	
	// method that returns true it the year is a leap year
	public static boolean isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
