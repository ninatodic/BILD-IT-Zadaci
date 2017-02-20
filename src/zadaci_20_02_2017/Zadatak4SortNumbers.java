package zadaci_20_02_2017;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4SortNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		// prompt user for three numbers and handle possible exception
		boolean ex = true;
		do {

			try {
				System.out.print("Enter first number ");
				num1 = input.nextInt();

				System.out.println("Enter second number: ");
				num2 = input.nextInt();
				
				System.out.println("Enter third number: ");
				num3 = input.nextInt();

				ex = false;

			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			} 
		} while (ex);
		
		// invoking the method that prints three numbers sorted
		printSortedNumbers(num1, num2, num3);
		
		input.close();
	}

	// method that prints three numbers sorted
	public static void printSortedNumbers(int num1, int num2, int num3) {
		int[] array = {num1,num2, num3};
		Arrays.sort(array); // method that sorts numbers in an array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
