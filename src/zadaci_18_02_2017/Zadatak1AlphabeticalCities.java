package zadaci_18_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1AlphabeticalCities {

	public static void main(String[] args) {
		// create a scanner and prompt the user for three cities
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three cities, pressing Enter after each: ");
		String city1 = input.nextLine();
		String city2 = input.nextLine();
		String city3 = input.nextLine();
		
		// create array from cities user entered
		String[] cities = {city1, city2, city3};
		
		// sorting an array and printing it
		Arrays.sort(cities);
		
		for (int i = 0; i < cities.length; i++) {
			System.out.print(cities[i] + " ");
		}
		input.close();

	}

}
