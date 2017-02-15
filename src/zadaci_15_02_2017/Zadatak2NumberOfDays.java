package zadaci_15_02_2017;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2NumberOfDays {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int month = 0;
		int year = 0;

		// prompt user for month and year and handle possible exception
		boolean ex = true;
		do {

			try {
				System.out.print("Enter month by number(1 for january, 2 for february, etc): ");
				month = input.nextInt();

				System.out.println("Enter a year: ");
				year = input.nextInt();

				// check if it is a valid month
				if (month < 1 || month > 12)
					throw new Exception("Invalid index for month: " + month);

				ex = false;

			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			} catch (Exception e) {
				// handles any other Exception
				System.out.println("Invalid entry, there is only 12 months, try again");
			}
		} while (ex);
		
		GregorianCalendar cal = new GregorianCalendar();

		// set its date to the first day of the month/year given by user
		cal.clear();
		cal.set(year, month - 1, 1);
		
		int numberOfDaysInMonth = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
		
		System.out.println("Number of days for given month is " + numberOfDaysInMonth);
		
		input.close();
	}

}
