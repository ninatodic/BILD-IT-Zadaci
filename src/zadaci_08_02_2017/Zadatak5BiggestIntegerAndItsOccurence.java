package zadaci_08_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5BiggestIntegerAndItsOccurence {

	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		//Create list for storing user input
		ArrayList<Integer> a = new ArrayList<>();
		
		// Prompt the user to enter integers
		System.out.println("Enter series of integers, 0 stops the input: ");

		// Fill the list with input until input is 0
		boolean isNotZero = true;
		while (isNotZero) {
			int userInput = input.nextInt();
			if (userInput == 0) {
				isNotZero = false;
			} else {
				a.add(userInput);
			}
		}
		
		//Invoke the method that returns the largest element from the list
		int largestInt = findTheLargestElement(a);
		
		//Display the largest element and its occurrence
		System.out.println("Largest element in the list is " + largestInt + " and its occurence is: "
				+ countOccurence(largestInt, a));
		
		input.close();
	}

	
	// returns largest element in the list
	public static int findTheLargestElement(ArrayList<Integer> a) {
		int largestElement = a.get(0);
		for (int i = 0; i < a.size(); i++) {
			if (largestElement < a.get(i)) {
				largestElement = a.get(i);
			}
		}
		return largestElement;
	}

	// counts and returns the occurrence of the largest element
	private static int countOccurence(int largestInt, ArrayList<Integer> a) {
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).equals(largestInt)){
				count++;
			}
		}
		return count;
	}
}
