package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3MaximumElement {

	public static void main(String[] args) {
		// Create scanner and an ArrayList
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter a sequence of numbers ending with 0
		System.out.print("Enter a sequence of numbers ending wih 0: ");
		Integer number = input.nextInt();
		while (number.intValue() != 0) {
			list.add(number);
			number = input.nextInt();
		}

		// Display the largest number in the input 
		System.out.println("The largest number in the input is " + max(list));
		input.close();
	}

	//Method that returns the maximum value in an ArrayList 
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0)
			return null;

		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}

}
