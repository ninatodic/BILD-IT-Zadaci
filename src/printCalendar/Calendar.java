package printCalendar;

import java.util.GregorianCalendar;


public class Calendar {

		 
	public static void printCalendarMonthYear(int month, int year) {
		// create a new GregorianCalendar object
		GregorianCalendar cal = new GregorianCalendar();

		// set its date to the first day of the month/year given by user
		cal.clear();
		cal.set(year, month - 1, 1);

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		// print calendar header
		System.out.println("\n    " + months[month - 1] + " " + cal.get(GregorianCalendar.YEAR));

		// obtain the weekday of the first day of month.
		int firstWeekdayOfMonth = cal.get(GregorianCalendar.DAY_OF_WEEK);

		// obtain the number of days in month.
		int numberOfMonthDays = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);

		// print anonymous calendar month based on the weekday of the first
		// day of the month and the number of days in month:
		printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
	}

	/*
	 * prints an anonymous calendar month based on the weekday of the first day
	 * of the month and the number of days in month:
	 */
	private static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {

		// reset index of weekday
		int weekdayIndex = 0;

		// print calendar weekday header
		System.out.println("Su  Mo  Tu   We  Th  Fr  Sa");

		// leave/skip weekdays before the first day of month
		for (int day = 1; day < firstWeekdayOfMonth; day++) {
			System.out.print("    ");
			weekdayIndex++;
		}

		// print the days of month in tabular format.
		for (int day = 1; day <= numberOfMonthDays; day++) {
			// print day
			System.out.printf("%2d", day);

			// next weekday
			weekdayIndex++;
			// if it is the last weekday
			if (weekdayIndex == 7) {
				// reset it
				weekdayIndex = 0;
				// and go to next line
				System.out.println();
			} else { // otherwise
				// print space
				System.out.print("  ");
			}
		}

		System.out.println();
	}
}
