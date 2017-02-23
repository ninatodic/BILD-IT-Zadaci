package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak3SSNValidation {

	public static void main(String[] args) {
		// create scanner and prompt the user for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Social Security Number in format DDD-DD-DDDD");
		
		String userInput = input.nextLine();
		
		// prints weather the input is valid ssn
		if(isValidSSN(userInput)){
			System.out.println("The number you entered is valid SSN");
		}
		else{
			System.out.println("The number you entered is not valid SSN");
		}
		
		input.close();
	}

	// method that returns true if format of input matches to format of ssn 
	public static boolean isValidSSN(String userInput) {
		if(userInput.matches("\\d{3}-\\d{2}-\\d{4}")){
			return true;
		}
		return false;
	}

}
