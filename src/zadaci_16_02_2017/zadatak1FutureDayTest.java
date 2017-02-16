package zadaci_16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak1FutureDayTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int today = 0;
		int futureDay = 0;
		// prompt user for today's and future day and handle possible exception
		boolean ex = true;
		do {

			try {
				System.out.println("Enter a number for today's day (0 for Monday, 1 for Tuesday, ect): ");
				today = input.nextInt();
				System.out.println("Enter number of days from today: ");
				futureDay = input.nextInt();

				// check if today is entered properly
				if (today < 0 || today > 6) {
					throw new Exception("Invalid index for month: " + today);
				}
				ex = false;
			}

			catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			} catch (Exception e) {// handles any other Exception
				System.out.println("Invalid entry, there is only 7 days, try again");
			}
		} while (ex);

		// prints out today's day and future one by invoking getTodayDay and
		// getFutureDay methods from FutureDay class
		System.out.println("Today's day is " + FutureDay.getTodayDay(today) + " and the day for " + futureDay
				+ " days will be " + FutureDay.getFutureDay(today, futureDay));

		input.close();
	}

}
