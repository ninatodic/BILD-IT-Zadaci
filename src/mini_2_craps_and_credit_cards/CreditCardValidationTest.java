package mini_2_craps_and_credit_cards;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditCardValidationTest {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables
		Scanner input = new Scanner(System.in);
		long cardNumber = 0;
		
		boolean ex = true;
		// prompt the user for credit card number and handle possible exception
		do{
			try {
				System.out.println("Enter card number for validation: ");
				cardNumber = input.nextLong();
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, you have to enter credit card number");
				input.next();
			}
		}while(ex);
		
		// create object
		CreditCardValidation card1 = new CreditCardValidation(cardNumber);
		
		// Print if the card is valid or not
		if (card1.isValidCard()){
			System.out.println("Credit card is valid");
		}
		else{
			System.out.println("Credit card is invalid");
		}
		
		input.close();

	}

}
