package zadaci_18_02_2017;

public class Zadatak3CurrentDateAndTime {

	public static void main(String[] args) {
		// invoke method that returns number of milliseconds 
		long millis = System.currentTimeMillis();
		long seconds = millis / 1000;
		int secondsRemaining = (int) (seconds % 60); // extract seconds
		long minutes = seconds / 60;
		int minutesRemaining = (int) (minutes % 60); // extract minutes
		long hours = minutes / 60;
		int remainingHours = (int) hours % 24 +1; // extract hours
		long days = hours / 24; // extract days

		int year = getYear(days); // get days by invoking method that returns current year
		int remainingDays = Math.abs(getRemainingDays(days));
		int month = getMonth(remainingDays, year); // get month by invoking a method that returns current month
		int remainingDays2 = Math.abs(getRemainingDays2(remainingDays, year)); // get date by invoking method that returns current day 
		
		String[] months = {"januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar"};
		
		// prints out current date and time
		System.out.println("Trenutn datum i vrijeme su: " + remainingDays2 + ". " + months[month] + ", " + year + ". " + remainingHours + ":" + minutesRemaining + ":" + secondsRemaining);
	}

	// method that returns current day in a month
	private static int getRemainingDays2(int remainingDays, int year) {
		int[] normalYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] leapYear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int remainingDays2=remainingDays;
		int i = 11;
		if (isLeapYear(year)) {
			while (remainingDays2 > 0) {
				remainingDays2 -= leapYear[i];
				i--;
			}
		} else {
			while (remainingDays2 > 0) {
				remainingDays2 -= normalYear[i];
				i--;
			}
		}
		return remainingDays2 -1;
	}
	 // method that returns current monht
	private static int getMonth(int remainingDays, int year) {
		int[] normalYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] leapYear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = 0;
		int i = 11;
		if (isLeapYear(year)) {
			while (remainingDays > 0) {
				remainingDays -= leapYear[i];
				month = i;
				i--;
			}
		} else {
			while (remainingDays > 0) {
				remainingDays -= normalYear[i];
				month = i;
				i--;
			}
		}
		return month;

	}
	
	// method that returns number of remaining days after we calculate current year
	// we use remaining days number to get current month and day
	private static int getRemainingDays(long days) {
		int year = 1970;
		while (days > 0) {
			year++;
			if (isLeapYear(year)) {
				days -= 366;
			} else {
				days -= 365;
			}
		}
		return (int) days;
	}

	// method that returns current year
	private static int getYear(long days) {
		int year = 1970;
		while (days > 0) {
			year++;
			if (isLeapYear(year)) {
				days -= 366;
			} else {
				days -= 365;
			}
		}
		year--;
		return year;
	}

	// method that returns true if the year is leap year
	private static boolean isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}
