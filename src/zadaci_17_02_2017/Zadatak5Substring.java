package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak5Substring {

	public static void main(String[] args) {
		// create scanner and prompt the user for two strings
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter first string: ");
		String str1 = input.nextLine();
		
		System.out.println("Enter second string: ");
		String str2 = input.nextLine();
		
		// condition that prints out one of two possible situations, weather the second string is substring of the first string
		if(str1.toLowerCase().contains(str2.toLowerCase())){
			System.out.println("Second string is contained in first string");
		}
		else{
			System.out.println("Second string is not part of the first string");
		}
		
		input.close();
	}

}
