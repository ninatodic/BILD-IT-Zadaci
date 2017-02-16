package bonus_zadaci_13_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1KonzolniKaluklator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int operation = 0;
		boolean ex = true;
		do {
			try {
				System.out.println(
						"Enter an option: \n1.Add\n2.Subrtract\n3.Mulitiple\n4.Divide\n5.Root\n6.Square\n7.Modulo");
				operation = input.nextInt();
				
				if (operation < 1 || operation > 7) {
					throw new Exception("Invalid input");
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid input, try again");
			}
		} while (ex);

		double num1 = 0;
		double num2 = 0;
		ex = true;

		if (operation == 5 || operation == 6) {
			do {
				try {
					System.out.println("Enter the number: ");
					num1 = input.nextDouble();
					ex = false;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, try again");
					input.nextLine();
				}
			} while (ex);
		} else {
			do {
				try {
					System.out.println("Enter first number: ");
					num1 = input.nextDouble();
					System.out.println("Enter second number");
					num2 = input.nextDouble();
					ex = false;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, try again");
					input.nextLine();
				}
			} while (ex);
		}
		switch (operation) {
		case 1: {
			addNumbers(num1, num2);
			break;
		}
		case 2: {
			subtractNumbers(num1, num2);
			break;
		}
		case 3: {
			multipleNumbers(num1, num2);
			break;
		}
		case 4: {
			divideNumbers(num1, num2);
			break;
		}
		case 5: {
			rootNumber(num1);
			break;
		}
		case 6: {
			squareNumber(num1);
			break;
		}
		case 7: {
			moduloNumbers(num1, num2);
			break;
		}
		}
		input.close();

	}

	private static void moduloNumbers(double num1, double num2) {
		System.out.println("The result is " + (num1 % num2));
	}

	private static void squareNumber(double num1) {
		System.out.println("The result is " + Math.pow(num1, 2));
	}

	private static void rootNumber(double num1) {
		System.out.println("The result is " + Math.sqrt(num1));
	}

	private static void divideNumbers(double num1, double num2) {
		System.out.println("The result is " + (num1 / num2));
	}

	private static void multipleNumbers(double num1, double num2) {
		System.out.println("The result is " + (num1 * num2));
	}

	private static void subtractNumbers(double num1, double num2) {
		System.out.println("The result is " + (num1 - num2));
	}

	private static void addNumbers(double num1, double num2) {
		System.out.println("The result is " + (num1 + num2));

	}

}
