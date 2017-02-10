package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak2SmallestNumbInArray {

	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner (System.in);
		// Declare an array
		double[] array = new double[10];
		// Prompt the user for entering the array content
		System.out.println("Enter ten floating point numbers: ");
		
		// Fill the array
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		// Declare variable that holds the smallest element and initialize it with invoking the min method
		double min = min(array);
		
		// Print the smallest element in the array
		System.out.println("The smallest number in array is " + min);
		
		//Close the scanner
		input.close();
	}
	
	// Method that returns the smallest element in the array
	public static double min(double[ ] array){
		double min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (min>array[i]){
				min = array[i];
			}
		}
		
		return min;
	}

}
