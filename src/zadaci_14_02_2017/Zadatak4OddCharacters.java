package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak4OddCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		// invoking the method that prints characters in odd places in a string
		printOddCharacters(s);
		
		input.close();
	}

	// method that prints characters in odd places in a string
	public static void printOddCharacters(String s) {
		String oddChar = "";
		for (int i = 0; i < s.length(); i+=2) {
			oddChar += s.charAt(i);
		}
		
		System.out.println(oddChar);
	}

}
