package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak4NMatrix {

	public static void main(String[] args) {
		// Creating a scanner
		Scanner input = new Scanner (System.in);
		
		//Promting the user for n
		System.out.println("Enter n for the nxn matrix: ");
		int n = input.nextInt();
		
		//Invoking the method for printing the matrix
		printMatrix(n);
		
		// Closing the scanner
		input.close();
	}
	
	//Method that prints the matrix
	public static void printMatrix(int n){
		// Declaring two dimensional array
		int[][] matrix = new int[n][n];
		
		// Filling the array with random 0's and 1's
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*2);
			}
		}
		
		// Printing the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
