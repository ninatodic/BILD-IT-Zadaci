package printCalendar;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplikacija {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		while (true) {
			printMenu();
			boolean ex = true;
			int userInput = 0;
			do {
				try {
					userInput = input.nextInt();
					ex = false;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, try again");
					input.nextLine();
				}
			} while (ex);

			switch (userInput) {
			case 1: {
				int month;
				int year;

				// prompt user for month and year
				ex = true;
				do {

					try {
						System.out.print("Enter month by number(1 for january, 2 for february, etc): ");
						month = input.nextInt();

						System.out.println("Enter a year: ");
						year = input.nextInt();

						// check if it is a valid month
						if (month < 1 || month > 12)
							throw new Exception("Invalid index for month: " + month);

						// print the calendar for the given month/year.
						Calendar.printCalendarMonthYear(month, year);
						System.out.println();
						ex = false;

					} catch (InputMismatchException e) {
						System.out.println("Invalid input, try again");
						input.nextLine();
					} catch (Exception e) {
						// handles any other Exception
						System.out.println("Invalid entry, there is only 12 months, try again");
					}
				} while (ex);
				break;
			}
			case 2: {
				int month;
				int date;
				int year;

				ex = true;
				do {
					try {
						System.out.print(
								"Enter month in which you want to set the reminder by number(1 for january, 2 for february, etc): ");
						month = input.nextInt();
						System.out.println("Enter a date: ");
						date = input.nextInt();

						System.out.println("Enter a year: ");
						year = input.nextInt();
						input.nextLine();
						System.out.println("Enter the text of a reminder: ");
						String reminderText = input.nextLine();
						// check if it is a valid month
						if (month < 1 || month > 12)
							throw new Exception("Invalid index for month: " + month);

						Reminder.addTheReminder(month, date, year, reminderText);
						System.out.println("You have succesfully added a reminder ");
						System.out.println();
						ex = false;

					} catch (InputMismatchException e) {
						System.out.println("Invalid input, try again");
						input.nextLine();
					} catch (Exception e) {
						// handles any other Exception
						System.out.println("Invalid entry, there is only 12 months, try again");
					}
				} while (ex);
				break;
			}
			case 3: {
				int month;

				ex = true;
				do {
					try {
						System.out.print("Enter month for which you want reminders to be printed out: ");
						month = input.nextInt();

						// check if it is a valid month
						if (month < 1 || month > 12)
							throw new Exception("Invalid index for month: " + month);
						Reminder.printReminderForDesignatedMonth(month);
						System.out.println();
						ex = false;
					} catch (InputMismatchException e) {
						System.out.println("Invalid input, try again");
						input.nextLine();
					} catch (Exception e) {
						// handles any other Exception
						System.out.println("Invalid entry, there is only 12 months, try again");
					}
				} while (ex);
				break;
			}
			case 4: {
				Reminder.printAllReminders();
				System.out.println();
				break;
			}
			default: {
				System.out.println("You can choose only 1, 2, 3 or 4 for options");
			}
			}
			
		}
		
	}

	public static void printMenu() {
		System.out.println(
				"Enter nuber for option: \n1. Print calendar \n2. Add a reminder \n3. Print reminder for certain month \n4. Print all reminders");
	}

}
