package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak5AverageNumber {

	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner (System.in);
		// prompt the user for undesignated number of integers
		System.out.println("Enter undesignated number of integers, 0 terminates entry: ");
		
		// declare and initialize variables and array needed for counting and computing the average
		boolean isNotZero = true;
		int[] array = new int[100];
		int count = 0;
		int sum = 0;
		
		// loop that stores user input to array
		while(isNotZero){
			int number = input.nextInt();
			if (number==0){
				isNotZero = false;
			}
			else{
				array[count] = number;
				sum += number;
				count++;
			}
		}
		
		// calculating the average
		int average = sum/count;
		
		// declaring and initializing variables for counting values above and bellow average
		int countAboveAverage = 0;
		int countBellowAverage = 0;
		
		// loops through the array counting values above and bellow average
		for (int i = 0; i < count; i++) {
			if (array[i]>=average){
				countAboveAverage++;
			}
			else {
				countBellowAverage++;
			}
		}
		
		// prints the average and the count
		
		System.out.println("Average of entered value is " + average);
		System.out.println("There was " + countAboveAverage + " numbers above or equal to average");
		System.out.println("There was " + countBellowAverage + " numbers bellow the average");
		
		input.close();
	}

}
