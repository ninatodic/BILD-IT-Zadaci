package zadaci_11_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3SortedNumbers {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner (System.in);
		// prompt the user for the three numbers
		System.out.println("Enter three numbers for sorting: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		// display  sorted numbers using the method that uses sort method from Array class
		displaySortedNumbers(num1, num2, num3);
		System.out.println();
		
		// display sorted numbers using bubble sort algorithm 
		displaySortedNumbers2(num1, num2, num3);
		
		input.close();
	}
	
	//Method that display sorted numbers using the method that uses sort method from Array class
	public static void displaySortedNumbers(double num1, double num2, double num3){
		double[] numbers = {num1, num2, num3};
		
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	// Method that display sorted numbers using bubble sort algorithm 
	public static void displaySortedNumbers2 (double num1, double num2, double num3){
		double[] numbers = { num1, num2, num3 };

		double temp;
        for(int i=0; i < numbers.length-1; i++){
 
            for(int j=1; j < numbers.length-i; j++){
                if(numbers[j-1] > numbers[j]){
                    temp=numbers[j-1];
                     numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
		for(int i = 0; i < numbers.length; i++)
		System.out.print(numbers[i] + " ");
	}
	
}
