package zadaci_18_03_2017;

import java.util.Scanner;

public class Zadatak3OccurenceOfACharacter {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string and a character
		System.out.print("Enter a string : ");
		String str = input.nextLine();
		
		System.out.print("Enter a character: ");
		char a = input.next().charAt(0);
		
		// Display the number of occurrences for the character in the string
		System.out.println("The number of occurences of the character \'" + a + "\' in the string \"" + str
				+ "\" is " + count(str, a));
		input.close();
	}
	
	// recursive method that returns number of occurrences for the character in the string
	public static int count(String str, char a) {
		int count = 0;
		return count(str, a, count);
	}

	// overloaded recursive method with parameters
	public static int count(String str, char a, int count) {
		if (str.indexOf(a) == -1) {
			return count;
		} else {
			count++;
			return count(str.substring(str.indexOf(a) + 1), a, count);
		}

	}

}
