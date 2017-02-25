package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5AddingMatrices {

	public static void main(String[] args) {
		// create scanner and declare two 3x3 matrices 
		Scanner input = new Scanner(System.in);

		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];

		boolean ex = true;
		// fill matrices with user input and handle exceptions
		do {
			try {
				System.out.println("Enter matrix1: ");
				for (int i = 0; i < matrix1.length; i++) {
					for (int j = 0; j < matrix1[i].length; j++) {
						matrix1[i][j] = input.nextDouble();
					}
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			}
		} while (ex);

		ex = true;
		do {
			try {
				System.out.println("Enter matrix2: ");
				for (int i = 0; i < matrix2.length; i++) {
					for (int j = 0; j < matrix2[i].length; j++) {
						matrix2[i][j] = input.nextDouble();
					}
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			}
		} while (ex);

		// create matrix that will hold values of summed matrix1 and matrix2
		double[][] addMatrix = addMatrix(matrix1, matrix2);

		// print the result of adding matrices
		for (int i = 0; i < addMatrix.length; i++) {

			// loop that prints first matrix
			for (int j = 0; j < addMatrix[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			// condition that prints + sign
			if(i==1){
			System.out.print(" + ");
			}
			else{
				System.out.print("   ");
			}
			// loop that prints second matrix
			for (int j = 0; j < addMatrix[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			// condition that prints = sign
			if(i==1){
				System.out.print(" = ");
				}
				else{
					System.out.print("   ");
				
				}
			// loop that prints result matrix
			for (int j = 0; j < addMatrix[i].length; j++) {
				System.out.print(addMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();

	}

	// method that adds matrices 
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] result = new double[a.length][a[0].length];

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;

	}
}
