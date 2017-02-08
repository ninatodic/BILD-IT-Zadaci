package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak3GreatestCommonDiviser {

	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for two integers
		System.out.println("Enter first integer:");
		int num1 = input.nextInt();
		System.out.println("Enter second integer:");
		int num2 = input.nextInt();
		
		// Displays gcd by invoking getGcd method
		System.out.println("The GCD of " + num1 + " and " + num2 + " is " + getGcd(num1, num2) + ".");
		
		input.close();
	}
	
	// returns gcd
	public static int getGcd(int num1, int num2) {
		int gcd = 1;

		//code for returning gcd if the first integer is bigger
		if (num1 > num2) {

			for (int i = num2; i >= 1; i--) {
				if (num1 % i == 0 && num2 % i == 0) {
					gcd = i;
					break;
				}
			}
			//code for returning gcd if the second integer is bigger
		} else {
			for (int j = num1; j >= 1; j--) {
				if (num1 % j == 0 && num2 % j == 0) {
					gcd = j;
					break;
				}
			}
		}
		return gcd;

	}
}
