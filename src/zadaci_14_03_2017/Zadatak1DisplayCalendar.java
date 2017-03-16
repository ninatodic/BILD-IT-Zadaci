package zadaci_14_03_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak1DisplayCalendar {

	public static void main(String[] args) {
		
			// Check java command line usage 
			if (args.length != 2) {
				System.out.println("Usage: java Zadatak1DisplayCalendar month year");
				System.exit(1);
			}


			// Crate a Calendar object
			Calendar calendar = new GregorianCalendar(Integer.valueOf(args[1]), 
				Integer.valueOf(args[0]) - 1, 1);

			// Display calendar header
			printHeader(calendar); 
			

			// Pad space before the first day of the month
			for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) 
				System.out.print("    ");

			// Print days in month
			while (calendar.get(Calendar.DATE) <
				calendar.getActualMaximum(Calendar.DATE)) {

				if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
					System.out.printf("%4d\n", calendar.get(Calendar.DATE));
				else
					System.out.printf("%4d", calendar.get(Calendar.DATE));

				// Add a day
				calendar.add(Calendar.DATE, 1);
			}
			System.out.printf("%4d\n", calendar.get(Calendar.DATE));
		}

		// method that returns an String array of month names 
		public static String[] getMonths() {
			String[] months = {"January", "February", "March", "April", "May", "June", 
				"July", "August", "September", "October", "November", "December"};
			return months;
		}

		// method that display calendar header 
		public static void printHeader(Calendar calendar) {
			// Create an array of month names
			String[] months = getMonths();

			// Center month and year center format
			int length = 29 / 2 - (months[calendar.get(Calendar.MONTH)].length() / 2 + 3);
			System.out.println();
			for (int i = 0; i < length; i++)
				System.out.print(" ");
			System.out.println(months[calendar.get(Calendar.MONTH)] + ", " + 
				calendar.get(Calendar.YEAR));

			// Print week day names
			System.out.println("-----------------------------");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		}
}