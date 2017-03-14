package zadaci_13_03_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak2LetterOccurrences {

	public static void main(String[] args) throws FileNotFoundException {
		// Create a File object from user input
		File file = new File(getFileName());

		// Check if file exists
		if (!file.exists()) {
			System.out.println("File " + file.getName() + " does not exist");
			System.exit(0);
		}

		int[] count = new int[26]; // Counts each letter
		try (
				// Create input file
				Scanner input = new Scanner(file);) {
			// Read file
			while (input.hasNext()) {
				String line = (input.nextLine()).toUpperCase();
				countLetters(count, line);
			}
		}

		// Display results
		for (int i = 0; i < count.length; i++) {
			System.out.println("Number of " + (char) ('A' + i) + "\'s: " + count[i]);
		}
	}

	// method that count occurrences of each letter in a string 
	public static void countLetters(int[] count, String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				count[(int) (str.charAt(i) - 'A')]++;
		}
	}

	// method that prompts user for file name
	public static String getFileName() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a filename: ");
		String fileName = input.next();
		input.close();
		return fileName;

	}
}
