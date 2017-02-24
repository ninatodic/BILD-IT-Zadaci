package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak2UnicodeCharacter {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables needed for
		// computing
		Scanner input = new Scanner(System.in);

		char unicode = 0;
		// prompt the user for character and handle possible exceptions
		System.out.println(
				"Enter character (if you enter more than one character, unicode value will be shown for the first character only): ");
		unicode = input.next().charAt(0);

		// print the value of character in unicode
		System.out.println("Value of character " + unicode + " in unicode is " + (int) unicode);
		input.close();
	}

}
