package zadaci_17_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1Fibonaci {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		long index = 0;
		boolean ex = true;
		do {
			try {
				System.out.print("Enter an index for a Fibonacci number: ");

				index = input.nextLong();
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);
		// Find and display the Fibonacci number
		System.out.println("The Fibonacci number at index " + index + " is " + fib(index));

		input.close();
	}

	/** The method for finding the Fibonacci number */
	public static long fib(long n) {
		long f0 = 0; // For fib(0)
		long f1 = 1; // For fib(1)
		long currentFib = 0;
		for (int i = 1; i <= n; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		return currentFib;
	}

}
