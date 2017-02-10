package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak5SortingRows {

	public static void main(String[] args) {
		//create the scanner
		Scanner input = new Scanner (System.in);
		
		// prompt the user for the number of rows and columns
		System.out.println("Enter the number of rows and columns for 2D array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		//declare an array
		double[][] array = new double [rows][columns];
		
		// fill the array with user input
		System.out.println("Enter the 2D array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		// declare the array with sorted rows and initialize it with sortRows method
		double[][] sorted = sortRows(array);
		
		// prints the array with sorted rows
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted[i].length; j++) {
				System.out.print(sorted[i][j] + " ");
			}
			System.out.println();
		}
		
		//close the scanner
		input.close();
		
	}
	
	// Method that returns 2D array with sorted rows
	public static double[ ][ ] sortRows(double[ ][ ] array){
		double[][] sorted = new double [array.length][array[0].length];
		
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
		}
		
		sorted = array;
		return sorted;
	}

}
