package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak4LargestElementIn2DArray {

	public static void main(String[] args) {
		// Create the scanner
		Scanner input = new Scanner (System.in);
		// Prompt the user for the number of rows and columns
		System.out.println("Enter the number of rows and columns for 2D array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		// declare the array
		double[][] a = new double [rows][columns];
		
		// fill the array with user input
		System.out.println("Enter the 2D array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		
		// declare the array that holds the location of the biggest element, and initialize it by invoking locateLargest method
		int[] location = locateLargest(a);
		
		// Print the location array
		System.out.println("Location of the largest element is: ");
		for (int i = 0; i < location.length; i++) {
			System.out.print(location[i] + " ");
		}
		
		// close the scanner
		input.close();
	}
	
	// Method that returns an array with elements that represent location of the biggest element in two dimensional array
	public static int[] locateLargest(double[][] a){
		int[] location = new int[2];
		double max = a[0][0];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]){
					max = a[i][j];
					location[0]=i;
					location[1]=j;
				}
			}
		}
		
		return location;
	}

}
