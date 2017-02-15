package zadaci_15_02_2017;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3NumberOfDays2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String monthString = "";
		int year = 0;

		// prompt user for  month
		System.out.print("Enter month by entering first three letters: ");
		monthString = input.next();

		// prompt user for  year and handle possible exception
		boolean ex = true;
		do {

			try {
				System.out.println("Enter a year: ");
				year = input.nextInt();

				ex = false;

			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);
		
		// get numerical representation of month by invoking returnMonth method
		int month = returnMonth(monthString);

		// if returnMonth method returns -1 user will be worned that he entered invalid three letters for month, else it will print 
		// number of days
		if (month > -1) {
			GregorianCalendar cal = new GregorianCalendar();

			// set its date to the first day of the month/year given by user
			cal.clear();
			cal.set(year, month, 1);

			int numberOfDaysInMonth = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);

			System.out.println("Number of days for given month is " + numberOfDaysInMonth);
		}
		else{
			System.out.println("Wrong input, restart the program and try again");
		}

		input.close();
	}

	// method that returns numerical representation of month
	private static int returnMonth(String monthString) {
		String[] months = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
		int index = 0;
		for (int j = 0; j < months.length; j++) {
			if (monthString.toLowerCase().equals(months[j])) {
				index = j;
				break;
			} else {
				index = -1;
			}
		}
		return index;

	}

}
