package zadaci_20_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5RepetitionOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// creating an arrayList to store user input
		ArrayList<Integer> list = new ArrayList<>();
		int userInput = -1;
		boolean ex = true;
		System.out.println("Enter a list of integers between 1 and 100, 0 stops the entry: ");
		// stores user input in an array list until the input is 0 and handles
		// input exceptions
		while (userInput != 0) {
			do {
				try {
					userInput = input.nextInt();

					if (userInput < 0 || userInput > 100) {
						throw new Exception("Invalid input");
					}
					ex = false;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, please enter integers only");
					input.nextLine();
				} catch (Exception e) {
					System.out.println("Number has to be between 1 and 100");
				}
			} while (ex);

			list.add(userInput);
		}
		// deletes 0 from the array list and trims the array list to size
		list.remove(list.size() - 1);
		list.trimToSize();

		// create array that counts number of repetition of the numbers
		int[] count = new int[100];
		for (int i = 0; i < list.size(); i++) { // for loop that counts
												// repetition
			count[list.get(i)]++;
		}

		// creating array list that stores unique numbers
		ArrayList<Integer> uniqueList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) { // loop that fills array list
												// that stores unique numbers
			if (!(uniqueList.contains(list.get(i)))) {
				uniqueList.add(list.get(i));
			}
		}

		if (list.size() == 0) {
			System.out.println("You haven't entered any numbers, restart the program and enter numbers");
		} else {
			// loop that prints out repetition of every number
			for (int i = 0; i < uniqueList.size(); i++) {
				System.out
						.println("Number " + uniqueList.get(i) + " is repeated " + count[uniqueList.get(i)] + " times");

			}
		}

		input.close();

	}

}
