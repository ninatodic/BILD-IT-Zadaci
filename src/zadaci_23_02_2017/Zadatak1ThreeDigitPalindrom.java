package zadaci_23_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1ThreeDigitPalindrom {

	public static void main(String[] args) {
		// create scanner and initialize variables 
		Scanner input = new Scanner(System.in);

		int number = 0;
		boolean ex = true;
		// prompt the user for input and handle possible exception
		do {
			try {
				System.out.println("Enter three digit number: ");
				number = input.nextInt();
				if (number < 100 || number > 999) {
					throw new Exception("Invalid input");
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			} catch (Exception e) {
				System.out.println("The number has to have three digits and be positive");
				input.next();
			}
		} while (ex);
		// prints out the message, depending on the result
		if (isPalindrome(number)) {
			System.out.println("The number you entered is palindrome");
		} else {
			System.out.println("The number you entered is not palindrome");
		}
		input.close();
	}
	
	// method that checks if the number is palindrome
	public static boolean isPalindrome(int number) {
		if (number == reversedNumber(number)) {
			return true;
		}
		return false;
	}
	
	// method that returns reversed input
	public static int reversedNumber(int number) {

		String stringNumber = number + "";
		String reverseString = new StringBuffer(stringNumber).reverse().toString();
		int reverse = Integer.parseInt(reverseString);
		return reverse;

	}

}
