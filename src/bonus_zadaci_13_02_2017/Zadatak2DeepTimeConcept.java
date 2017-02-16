package bonus_zadaci_13_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2DeepTimeConcept {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		long years = 0;
		boolean ex = true;
		do {
			try {
				System.out.println("Enter the number of years you want to go back in past");
				years = input.nextLong();
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);
		
		displayInHours(years);
		input.close();
	}

	private static void displayInHours(long years) {
		long seconds = years;
		int remainingSeconds = (int) (seconds % 60);
		long minutes = seconds / 60;
		int remainingMinutes = (int) (minutes % 60);
		long hours = minutes / 24;

		System.out.println("To go back in time for " + years + " years, with super fast plane, it would take you "
				+ hours + ":" + remainingMinutes + ":" + remainingSeconds);
	}

}
