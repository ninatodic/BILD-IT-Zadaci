package zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5UniqueNumbers {

	public static void main(String[] args) {
		// create scanner, declare array and declare and initialize variables
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];

		boolean ex = true;
		
		// prompt the user for ten integers, store them in number array and handle possible exception
		do {
			try {
				System.out.println("Enter 10 integers:");
				int count = 0;
				while (count < 10) {
					numbers[count] = input.nextInt();
					count++;
				}ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			}
		} while (ex);
		
		// create array list that stores unique integers
		ArrayList <Integer> unique = new ArrayList<>();
		
		// loop throug array and copy unique values in array list
		for (int i = 0; i < numbers.length; i++) {
			if(unique.contains(numbers[i])){
				continue;
			}
			else {
				unique.add(numbers[i]);
			}
		}
		
		// print unique elements from array list
		for (int i = 0; i < unique.size(); i++) {
			System.out.print(unique.get(i) + " ");
		}
		
		input.close();
	}

}
