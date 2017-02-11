package zadaci_11_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1SmallestFactors {

	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner (System.in);
		// prompt the user for the integer
		System.out.println("Enter some integer: ");
		int userInput = input.nextInt();
		
		// declare the arrayList and initialize it with invoking smallestFactors method
		ArrayList<Integer> smallestFactors = smallestFactors(userInput);
		
		// print the array list that holds smallest factors 
		for (int i = 0; i < smallestFactors.size(); i++) {
			System.out.print(smallestFactors.get(i) + " ");
		}

		input.close();
	}
	
	// Method that returns an array list that holds smallest factors of the integer
	public static ArrayList<Integer> smallestFactors(int number) {
		ArrayList<Integer> smallestFactors = new ArrayList<>();
		int i = 2; 
		while (number / i !=0) {
			if (number % i == 0) {
				number /= i;
				smallestFactors.add(i);
			} else
				i++;
		}
		return smallestFactors;
	}

}
