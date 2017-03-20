package zadaci_16_03_2017;

import java.math.BigInteger;
import java.util.Scanner;

public class Zadatak5DecimalToFraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a decimal number
		System.out.print("Enter a decimal number: ");
		String[] decimal = input.nextLine().split("[.]");

		// Create a Rational object of the integer part of the decimal number
		RationalBI r1 = new RationalBI(new BigInteger(decimal[0]), BigInteger.ONE);

		// Create a Rational object of the fractional part of the decimal number
		RationalBI r2 = new RationalBI(new BigInteger(decimal[1]), new BigInteger(
			String.valueOf((int)Math.pow(10, decimal[1].length()))));

		// Display fraction number
		System.out.println("The fraction number is " + 
			(decimal[0].charAt(0) == '-' ? (r1).subtract(r2) : (r1).add(r2)));
		
		input.close();
	}

}
