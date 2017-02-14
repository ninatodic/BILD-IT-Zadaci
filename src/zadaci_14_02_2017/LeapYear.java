package zadaci_14_02_2017;

public class LeapYear {
	int begginingYear;
	int endingYear;

	public LeapYear(int begginingYear, int endingYear) {
		this.begginingYear = begginingYear;
		this.endingYear = endingYear;
	}

	// method that prints years in range that user enters
	public void printYears() {
		final int YEARS_PER_ROW = 10;
		int countPerRow = 0;

		// Printing out leaping years 10 per row
		for (int i = begginingYear; i <= endingYear; i++) {
			if (isLeapYear(i)) { // invoking method that checks for every i, if it is a leap year
				countPerRow++;
				if (countPerRow % YEARS_PER_ROW == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}
	}

	// Static method that returns true if a year is leap year. It has been made static so it can be used for other programs as well
	public static boolean isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}
