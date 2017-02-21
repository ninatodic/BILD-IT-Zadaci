package zadaci_21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5PriceOfProduct {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables needed for computing
		Scanner input = new Scanner(System.in);

		double product1Weight = 0;
		double product1Price = 0;
		double product2Weight = 0;
		double product2Price = 0;
		boolean ex = true;
		
		System.out.println("This program will determine better price of two identical product in different packages");
		// prompt the user for the weight and price of first product
		do {
			try {
				System.out.println("Enter weight of first product: ");
				product1Weight = input.nextDouble();

				System.out.println("Enter price of first precentage: ");
				product1Price = input.nextDouble();

				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			}

		} while (ex);
		
		// prompt the user for the weight and price of second product
		ex = true;
		do {
			try {
				System.out.println("Enter weight of second product: ");
				product2Weight = input.nextDouble();

				System.out.println("Enter price of second precentage: ");
				product2Price = input.nextDouble();

				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			}

		} while (ex);
		
		// compare products and prints which product has better price
		if((product1Weight/product1Price)>(product2Weight/product2Price)){
			System.out.println("First package has better price");
		}
		else{
			System.out.println("Second package has better price");
		}
		
		input.close();

	}

}
