package zadaci_11_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2ISBNumber {

	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner(System.in);
		// prompt the user for the first 9 digits of ISBN-10 number
		String isbn = "";
		boolean ex = true;
		do {
			try {

				System.out.println("Enter first 9 digits of ISBN-10 number: ");
				isbn = input.next();
				while(isbn.length()!=9){
					System.out.println("Your input is longer or shorter, please enter only 9 digits of ISBN-10 number: ");
					isbn = input.next();
				}
				int isbnInt = Integer.parseInt(isbn);
				ex = false;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);

		// invoke the method that prints whole ISBN-10 number
		printISBN(isbn);

		// close scanner
		input.close();

	}

	// Method that prints whole ISBN-10 number
	public static void printISBN(String isbn) {
		// array that holds first 9 numbers as digits
		int[] digitsISBN = new int[9];

		// get nine digits from user input
		for (int i = 0; i < 9; i++) {
			int digit = Character.getNumericValue(isbn.charAt(i));
			digitsISBN[i] = digit;
		}

		// get the result from the formula for calculating 10th digit for the
		// number
		int result = 0;
		for (int i = 0; i < digitsISBN.length; i++) {
			result += digitsISBN[i] * (i + 1);
		}

		int checkSum = result % 11;

		// print one of two possible solutions
		if (checkSum == 10) {
			System.out.println("The ISBN number is " + isbn + "X");
		} else {
			System.out.println("The ISBN number is " + isbn + checkSum);
		}
	}

}
