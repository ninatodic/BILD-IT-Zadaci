package zadaci_17_03_2017;

import java.util.Scanner;

public class Zadatak2GcdRecursion {

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

	 //returns gcd
	public static int getGcd(int num1, int num2) {
		if(num1%num2==0)
			return num2;
		else
			return getGcd(num2, num1%num2);
		
	}

	
}
