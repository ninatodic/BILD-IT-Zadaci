package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5LocationTest {

	public static void main(String[] args) {
		// create scanner and initialize variables
		Scanner input = new Scanner(System.in);

		int a = 0;
		int b = 0;
		boolean ex = true;
		// prompt the user for size of matrix handling possible exceptions, not allowing him to enter negative and too large value
		do {
			try {
				System.out.println("Enter the number of rows and columns in the array: ");
				a = input.nextInt();
				b = input.nextInt();
				if (a < 0 || b < 0 || a > 1000 || b > 1000) {
					throw new Exception("Negative number or too large matrix");
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			} catch (Exception e) {
				System.out.println("You entered either negative value or value larger than 1000 which is not allowed");
				input.nextLine();
			}
		} while (ex);

		// declare array
		double[][] niz1 = new double[a][b];

		ex = true;
		// fill the array with user input handling possible exceptions
		do {
			try {
				System.out.println("Enter the array:");

				for (int i = 0; i < niz1.length; i++) {
					for (int j = 0; j < niz1[i].length; j++) {
						niz1[i][j] = input.nextDouble();
					}
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);

		// create Location object from locateLargest method
		Location location = locateLargest(niz1);

		// print the result
		System.out.println("The location of hte largest element is " + location.getMaxValue() + " at ("
				+ location.getRow() + ", " + location.getColumn() + ")");
		
		input.close();

	}

	// method that returns object with setted max walue and its location
	public static Location locateLargest(double[][] a) {

		Location location1 = new Location();

		double maxValue = a[0][0];
		int row = 0;
		int column = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (maxValue < a[i][j]) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}

		location1.setMaxValue(maxValue);
		location1.setColumn(column);
		location1.setRow(row);

		return location1;
	}

}
