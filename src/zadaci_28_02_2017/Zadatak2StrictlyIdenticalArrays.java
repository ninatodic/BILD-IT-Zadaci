package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2StrictlyIdenticalArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];

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

		if (equals(m1, m2)) {
			System.out.println("Two arrays are strictly indetical");
		} else {
			System.out.println("Two arrays are not strictly indetical");
		}

		input.close();

	}

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
