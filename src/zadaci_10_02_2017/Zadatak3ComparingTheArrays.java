package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak3ComparingTheArrays {

	public static void main(String[] args) {
		// Create the scanner
		Scanner input = new Scanner(System.in);
		
		// prompt the user to enter the size of the arrays
		System.out.println("Enter the size of the arrays: ");
		int arraySize = input.nextInt();
		
		// Declare the arrays
		int[] niz1 = new int[arraySize];
		int[] niz2 = new int[arraySize];

		// Fill the arrays with user input
		System.out.println("Enter the first " + arraySize + " numbers.");
		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = input.nextInt();
		}

		System.out.println("Enter the second " + arraySize + " numbers.");
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = input.nextInt();
		}
		
		// Print weather the arrays are equal or not
		if (equals(niz1, niz2)) {
			System.out.println("The arrays are equal");
		} else {
			System.out.println("The arrays are not equal");
		}
		
		// close the scanner
		input.close();
	}
	
	// Method that returns true if the arrays are equal
	public static boolean equals(int[] niz1, int[] niz2) {
		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) {  // If the arrays were holding objects we would use equals method
				return false;
			}

		}
		return true;
	}

}
