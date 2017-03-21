package zadaci_18_03_2017;

import java.util.Scanner;

public class Zadatak2ReversedString {

	public static void main(String[] args) {
		// create scanner and prompt the user for the string
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a string you want to reverse");
		String value = input.nextLine();
		
		// invoke recursive method that prints reversed string
		reverseDisplay(value);
		input.close();
	}

	// method that prints reversed string 
	public static void reverseDisplay(String value) {
		if (value.length() == 0) {
			System.out.println(); // base case
		} else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1)); // recursive call
		}
	}

}
