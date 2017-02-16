package zadaci_16_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4BiggestNumberAndItsRepetition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// creating an arrayList to store user input
		ArrayList<Integer> list = new ArrayList<>();
		int userInput = -1;
		boolean ex = true;
		System.out.println("Enter a list of integers, 0 stops the entry: ");
		// stores user input in an array list handling input exceptions
		while (userInput != 0) {
			do {
				try {

					userInput = input.nextInt();
					ex = false;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, please enter integers only");
					input.nextLine();
				}
			} while (ex);

			list.add(userInput);
		}
		list.remove(list.size() - 1);
		
		//prints the list, biggest number and its repetition by invoking returnMax and getNumberOfRepetition methods
		System.out.println("List you entered: " + list);
		System.out.println("The biggest number in the list is " + returnMax(list) + " and that number is repeated "
				+ getNumberOfRepetition(list, returnMax(list)) + " times");
		
		input.close();
	}

	// returns number of repetition of the biggest number
	private static int getNumberOfRepetition(ArrayList<Integer> list, int returnMax) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (returnMax == list.get(i)) {
				count++;
			}
		}
		return count;
	}
	
	// returns the biggest number from user input
	public static int returnMax(ArrayList<Integer> list) {
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}

}
