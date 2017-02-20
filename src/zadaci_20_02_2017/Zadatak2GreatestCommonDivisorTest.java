package zadaci_20_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2GreatestCommonDivisorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		// prompt user for two numbers and handle possible exception
		boolean ex = true;
		do {

			try {
				System.out.print("Enter first number ");
				num1 = input.nextInt();

				System.out.println("Enter second number: ");
				num2 = input.nextInt();

				ex = false;

			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);

		// Displays gcd by invoking getGcd method from GreatestCommonDiviser
		// class
		System.out.println(
				"The GCD of " + num1 + " and " + num2 + " is " + GreatestCommonDivisor.getGcd(num1, num2) + ".");
		System.out.println("Lowest common divisor for two numbers is always 1.");
		input.close();
	}

}
