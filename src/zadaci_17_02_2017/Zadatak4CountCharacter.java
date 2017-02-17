package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak4CountCharacter {

	public static void main(String[] args) {
		// create scanner and prompt the user for string and character to count
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println("Enter a char you want to count: ");
		char a = input.next().charAt(0);
		
		// print out repetition of character by invoking count method
		System.out.println("Character " + a + " was found " + count(str,a) + " times in the string");
		
		input.close();
	}
	
	// method that returns number of character in a string	
	public static int count(String str, char a){
			int count = 0;
			for (int i = 0; i<str.length(); i++){
				if(str.charAt(i)==a){
					count++;
				}
			}
			return count;
	}
}
