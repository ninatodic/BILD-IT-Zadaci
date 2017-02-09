package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak5TossingTheCoin {

	public static void main(String[] args) {
		// Creating a scanner
		Scanner input = new Scanner(System.in);
		
		//Prompting the user for the tossing number
		System.out.println("Enter the number of times you want the coin to be tossed: ");
		int numberOfTossing = input.nextInt();

		// Invoking the method that counts heads and tails
		resultOfTossing(numberOfTossing);
		
		// Closing the scanner
		input.close();
	}

	// Method that generates random tossing and prints the result
	public static void resultOfTossing(int numberOfTossing) {
		int heads = 0;
		int tails = 0;
		// generating the tossing and counting the heads and tails
		for (int i = 0; i < numberOfTossing; i++) {
			int toss = (int) (Math.random() * 2);

			if (toss == 0) {
				heads++;
			} else {
				tails++;
			}
		}
		
		// printing the result
		System.out.println(
				"After " + numberOfTossing + " tosses, heads count is " + heads + " and tail count is " + tails);
	}

}
