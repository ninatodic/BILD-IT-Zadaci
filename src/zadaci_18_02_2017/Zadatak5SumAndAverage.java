package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5SumAndAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// creating an arrayList to store user input
		ArrayList<Integer> list = new ArrayList<>();
		int userInput = -1;
		boolean ex = true;
		System.out.println("Enter a list of integers, 0 stops the entry: ");
		// stores user input in an array list until the input is 0 and handles input exceptions
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

		int countPositive = 0;
		int countNegative = 0;
		double sum = 0;

		// loops through the array list counting positive and negative numbers while summing them 
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 0) {
				countPositive++;
				sum += list.get(i);
			} else {
				countNegative++;
				sum += list.get(i);

			}
		}

		// prints number of  positive and negative integers, their sum and average
		System.out.println("Number of positive integers is " + countPositive + ", negative one " + countNegative
				+ ", sum of all numbers is " + sum + ", and the average is " + sum / (countPositive + countNegative));
		
		input.close();
	}

}
