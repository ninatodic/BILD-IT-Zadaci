package zadaci_22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5MatrixNxN {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables	
		Scanner input = new Scanner (System.in);
		
		int n = 0;
		// prompt user for input and handle possible exceptions
		boolean ex = true;
		do{
			try{
				System.out.println("Enter dimension of matrix: ");
				n = input.nextInt();
				if(n<1||n>50){
					throw new Exception("Invalid input");
				}
				
				ex = false;
			}
			catch(InputMismatchException e){
				System.out.println("Invalid input, try again.");
				input.next();
			}catch(Exception e){
				System.out.println("Size of matrix has to be positive and smaller than 50");
			}
			
		}while(ex);
		
		// print the matrix by invoking printMatrix method
		printMatrix(n);
		
		input.close();
	}

	// Method that prints matrix
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int b = (int) (Math.random() * 2);
				matrix[i][j] = b;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
