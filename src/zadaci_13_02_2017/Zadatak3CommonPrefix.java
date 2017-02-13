package zadaci_13_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3CommonPrefix {

	public static void main(String[] args) {
		// create scanner and prompt user for two strings
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter some string:");
		String firstString = input.nextLine();
		
		System.out.println("Enter another string: ");
		String secondString = input.nextLine();
		
		
		//save character list for equal characters in strings
		ArrayList<Character> prefix = new ArrayList<>();
		
		// to avoid out of bounds exception shorter string length needs to be in control of for loop
		if(firstString.length()<secondString.length()){
		for (int i = 0; i<firstString.length(); i++){
			if (firstString.charAt(i)==secondString.charAt(i)){
				prefix.add(firstString.charAt(i));
			}
			else{
				break;
			}
		}
		}
		
		else {
			for (int i = 0; i<secondString.length(); i++){
				if (firstString.charAt(i)==secondString.charAt(i)){
					prefix.add(firstString.charAt(i));
				}
				else{
					break;
				}
			}
			}
		
		// create string from prefix list
		StringBuilder builder = new StringBuilder(prefix.size());
	    for(Character ch: prefix)
	    {
	        builder.append(ch);
	    }
	    
	    // print the string
	    System.out.println(builder.toString());
		
	    input.close();
	}

}
