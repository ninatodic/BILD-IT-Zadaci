package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4SumOfElementsInAColumn {

	public static void main(String[] args) {
		// create scanner and declare 3x4 matrix
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][4];
		boolean ex = true;
		// fill the matrix with user input and handle exceptions
		do {
			try {
				System.out.println("Enter a 3-by-4 matrix row by row: ");

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 4; j++) {
						matrix[i][j] = input.nextDouble();
					}
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			}
			
		} while (ex);

		// print the sum of every column by invoking sumColumn method
		for (int j = 0; j < 4; j++) {
			System.out.println("Sum of the elements at column " + j + " is " + sumColumn(matrix, j));
		}
		
		input.close();
	}

	// method that sum designated column in a matrix
	public static double sumColumn(double[][] m, int columnIndex) {
		double sumColumn = 0;
		for (int i = 0; i < m.length; i++) {
			sumColumn += m[i][columnIndex];
		}
		return sumColumn;
	}
}
