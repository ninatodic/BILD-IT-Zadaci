package zadaci_27_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2MultipleTwoMatrices {

	public static void main(String[] args) {
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

		// create matrix that will hold values of multiplied matrix1 and matrix2
		double[][] multipleMatrix = multiplyMatrix(matrix1, matrix2);

		// print the result of mulitipling matrices
		for (int i = 0; i < multipleMatrix.length; i++) {

			// loop that prints first matrix
			for (int j = 0; j < multipleMatrix[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			// condition that prints * sign
			if(i==1){
			System.out.print(" * ");
			}
			else{
				System.out.print("   ");
			}
			// loop that prints second matrix
			for (int j = 0; j < multipleMatrix[i].length; j++) {
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
			for (int j = 0; j < multipleMatrix[i].length; j++) {
				System.out.printf("%.1f%1s", multipleMatrix[i][j], " ");
			}
			System.out.println();
		}
		
		input.close();

	}

	// method that multiplies matrices 
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] result = new double [a[0].length][b.length];
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				for (int h = 0; h < result.length; h++) {
					result[i][j] += a[i][h] * b[h][j];
				}
			}
		}
		return result;
	}
}
