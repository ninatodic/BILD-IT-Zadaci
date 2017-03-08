package mini_4_hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		// create scanner and declare two array lists 
		Scanner input = new Scanner(System.in);
		ArrayList<Character> emptyList = new ArrayList<>();
		ArrayList<Character> word = ListOfWords.getWord();
		// declare and initialize variables
		String s = "";
		int count = 0;
		// fill emptyList with same number of dashes as the word has letters
		for (int i = 0; i < word.size(); i++) {
			emptyList.add('_');
		}
		// explain the user rules
		System.out.println("Guess a word by guessing the letters, you can miss for 10 times before game ends.");
		// repeat prompting user for letter until user gets the word or misses for 10 times
		do {
			boolean ex = true;
			// handle possible input exceptions
			do {
				try {
					// print empty list and prompt user to enter the letter
					for (int i = 0; i < emptyList.size(); i++) {
						System.out.print(emptyList.get(i) + " ");
					}

					System.out.println("\nEnter a letter: ");
					s = input.next();
					if (s.length() != 1 || !Character.isLetter(s.charAt(0))) {
						throw new Exception("Invalid input");
					}
					ex = false;
				} catch (Exception e) {
					System.out.println("Invalid input, enter a letter");
				}
			} while (ex);
			
			// if word contains the letter user inputed replace dash in empty list with that letter
			for (int i = 0; i < word.size(); i++) {
				if (word.get(i)==(s.charAt(0))) {
					emptyList.set(i, s.charAt(0));
				} 
			}
			
			// if word does not contains the letter user inputed count miss
			if(!word.contains(s.charAt(0))){
				count++;
			}

		} while (emptyList.contains('_') && count < 10);
		
		// print the list one more time after loop ends
		for (int i = 0; i < emptyList.size(); i++) {
			System.out.print(emptyList.get(i) + " ");
		}
		System.out.println();
		
		// if user did not guessed the word,print the word and message that the user lost
		if (count == 10) {
			System.out.print("The word was ");
			for (int i = 0; i < word.size(); i++) {
				System.out.print(word.get(i));
			}
			System.out.println("\nYou lost, start over");
		} else { //  else congratulate the user for guessing the word  
			System.out.println("Congratulation, you have guessed the word");
		}
		input.close();
	}

}
