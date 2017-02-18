package zadaci_18_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4MinutesInDaysAndYears {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables 
		Scanner input = new Scanner (System.in);
		long minutes = 0;
		boolean ex = true;
		// prompt the user for the number of minutes and handle possible exception
		do{
			try{
				System.out.println("Enter the number of minutes to be turned into years and days: ");
				minutes= input.nextLong();
				if(minutes<0){
					throw new Exception("invalid input");
				}
				ex = false;
			}catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}catch (Exception e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
			
		}while(ex);
		
		// print the result by invoking printYearsAndDays method
		printYearsAndDays(minutes);
		
		input.close();
	}

	// method that prints out how much days and years is contained in inputed minutes
	private static void printYearsAndDays(long minutes) {
		long days = minutes/60/24;
		int daysRemaining = (int)days%365;
		long years = days/365;
		
		System.out.println(minutes + " minutes is equal to " + years + " years and " + daysRemaining + " days.");
	}

}
