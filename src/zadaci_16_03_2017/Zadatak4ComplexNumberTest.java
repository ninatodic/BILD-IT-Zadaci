package zadaci_16_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4ComplexNumberTest {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two complex numbers
		System.out.print("Enter the first complex number: ");
		Complex complexNumber1 = getComplex(input);
		System.out.print("Enter the second complex number: ");
		Complex complexNumber2 = getComplex(input);

		System.out.println(complexNumber1 + " + " + complexNumber2 + " = " + complexNumber1.add(complexNumber2));
		System.out.println(complexNumber1 + " - " + complexNumber2 + " = " + complexNumber1.subtract(complexNumber2));
		System.out.println(complexNumber1 + " * " + complexNumber2 + " = " + complexNumber1.multiply(complexNumber2));
		System.out.println(complexNumber1 + " / " + complexNumber2 + " = " + complexNumber1.divide(complexNumber2));
		System.out.println("|" + complexNumber1 + "| = " + complexNumber1.abs());
		input.close();
	}

	public static Complex getComplex(Scanner input) {
		double[] c = new double[2];
		boolean ex = true;
		do {
			try {
				for (int i = 0; i < c.length; i++) {
					c[i] = input.nextDouble();
				}
				ex = false;

			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);

		return new Complex(c[0], c[1]);
	}
}
