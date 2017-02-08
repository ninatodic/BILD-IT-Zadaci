package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak2NumberOfVowels {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the string
		System.out.println("Enter a string: ");
		String s = input.nextLine();

		//Display the number of vowels and consonants 
		System.out.println("Number of vowels in the string is: " + getNumberOfVowels(s));
		System.out.println("Number of consonants in the string is: " + getNumberOfConsonants(s));
		
		// Close the scanner
		input.close();

	}

	// Returns the number of vowels
	public static int getNumberOfVowels(String s) {
		int numberOfVowels = 0;
		
		// iterating through the string counting the vowels
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a') || (s.charAt(i) == 'E') || (s.charAt(i) == 'e')
					|| (s.charAt(i) == 'I') || (s.charAt(i) == 'i') || (s.charAt(i) == 'O') || (s.charAt(i) == 'o')
					|| (s.charAt(i) == 'U') || (s.charAt(i) == 'u')) {
				numberOfVowels++;
			}
		}

		return numberOfVowels;
	}
	
	// Returns number of consonants by subtracting number of vowels from number of letters in the string
	public static int getNumberOfConsonants(String s) {
		return getNumberOfLetters(s) - getNumberOfVowels(s);
	}

	// Retruns number of letters in the string
	public static int getNumberOfLetters(String s) {
		int numberOfLetters=0;
		for (int i =0; i<s.length(); i++){
			if(Character.isLetter(s.charAt(i))){
				numberOfLetters++;
			}
		}
		return numberOfLetters;
	}
}
