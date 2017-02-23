package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak2StringLength {

	public static void main(String[] args) {
		// create scanner and prompt the user for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String s = input.nextLine();
		char firstLetter = firstLetter(s);
		
		// checks if the string has any letters in it and prints the length and first letter of a string
		if(Character.isLetter(firstLetter)){
		System.out.println("The lenght of the string you entered is " + s.length() + " and its first letter is " + firstLetter);
		}
		else{
			System.out.println("The lenght of the string you entered is " + s.length() + " and there is no letters in it ");
		}
		input.close();
	}
	
	// method that returns first letter in a string
	public static char firstLetter(String s){
		char firstLetter = 0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))){
			firstLetter = s.charAt(i);
			return firstLetter;
			}
		}return firstLetter;
	}

}
