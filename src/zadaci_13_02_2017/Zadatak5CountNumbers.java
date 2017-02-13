package zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak5CountNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		// prints the number of letters in a string by invoking the countLetters method
		System.out.println("Number of letters in a string is: " + countLetters(s));
		
		input.close();
	}
	
	// method that returns number of letters in a string
	public static int countLetters(String s){
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			if(Character.isLetter(s.charAt(i))){
				count++;
			}
		}
		return count;
	}

}
