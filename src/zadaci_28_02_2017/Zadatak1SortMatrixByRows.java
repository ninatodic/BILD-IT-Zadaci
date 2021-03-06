package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1SortMatrixByRows {

	public static void main(String[] args) {
		// create scanner and initialize matrix
		Scanner input = new Scanner (System.in);
		
		double[][] m = new double [3][3];
		
		// prompt the user to fill the matrix with integer values and handle possible exceptions
		boolean ex = true;
		do {
			try {
				System.out.println("Enter 9 double values for 3x3 array: ");
				for (int i = 0; i < m.length; i++) {
					for (int j = 0; j < m.length; j++) {
						m[i][j] = input.nextDouble();
					}
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}

		} while (ex);
		
		// initialize second matrix and fill it by invoking sortRow method
		double[][] m2 = sortRows(m);
		
		// print out second matrix
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();

	}
	
	// method that sort rows in matrix without changing original matrix
	public static double[][] sortRows(double[][] m){
		double[][] m2 = new double[3][3]; // create new matrix
		
		for (int i = 0; i < m.length; i++) { // copy original matrix in new one
			for (int j = 0; j < m[i].length; j++) {
				m2[i][j] = m[i][j];
			}
		}
		
		// sort values in every row
		for (int row = 0; row < m2.length; row++) {
			for (int col = 0; col < m2.length - 1; col++) {
				double min = m2[row][col];
				int index = col;
				for (int j = col + 1; j < m2.length; j++) {
					if (min > m2[row][j]) {
						min = m2[row][j];
						index = j;
					}
				}
				if (index != col) {
					m2[row][index] = m2[row][col];
					m2[row][col] = min;
				}
			}
		}
		return m2;

	}
}
