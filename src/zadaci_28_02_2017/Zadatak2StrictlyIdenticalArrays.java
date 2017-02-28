package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2StrictlyIdenticalArrays {

	public static void main(String[] args) {
		// create scanner and declare two matrices
		Scanner input = new Scanner(System.in);

		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];

		// prompt user to fill first matrix and handle possible exceptions
		boolean ex = true;
		do {
			try {
				System.out.println("Enter 9 integers for 3x3 array: ");
				for (int i = 0; i < m1.length; i++) {
					for (int j = 0; j < m1.length; j++) {
						m1[i][j] = input.nextInt();
					}
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}

		} while (ex);

		ex = true;
		// prompt user to fill second matrix and handle possible exceptions
		do {
			try {
				System.out.println("Enter 9 integers for second 3x3 array: ");
				for (int i = 0; i < m2.length; i++) {
					for (int j = 0; j < m2.length; j++) {
						m2[i][j] = input.nextInt();
					}
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}

		} while (ex);

		// print weahter the matrices are strictly identical
		if (equals(m1, m2)) {
			System.out.println("Two arrays are strictly indetical");
		} else {
			System.out.println("Two arrays are not strictly indetical");
		}

		input.close();

	}

	// method that returns true if matrices are strictly identical
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (!(m1[i][j] == m2[i][j])) {
					return false;
				}
			}
		}
		return true;
	}

}
