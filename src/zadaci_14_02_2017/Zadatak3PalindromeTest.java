package zadaci_14_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3PalindromeTest {

	public static void main(String[] args) {
		// creating a scanner and creating and initializing variables needed for computing
		Scanner input = new Scanner(System.in);

		int number = 0;
		
		boolean ex = true;
		// prompting a user for number that need sto be checked, handling InputMismatchExceptions
		do {
			try {
				System.out.println("Enter a number: ");
				number = input.nextInt();
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);
		
		// Printing the answer to the user
		if (Palindrome.isPalindrome(number)){
			System.out.println("The number you entered is a palindrome");
		}
		else{
			System.out.println("The number you entered is not a palindrome");
		}
		
		input.close();
	}

}
