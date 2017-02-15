package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak5PasswordCheckTest {

	public static void main(String[] args) {
		// create scanner and prompt the user for password
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the password: ");
		
		String password = input.nextLine();
		
		// Prints weather the password is valid or not depending on what isValid method from Password class will return
		if(Password.isValid(password)){
			System.out.println("Your password is valid");
		}
		else{
			System.out.println("Invalid password, your password has to be at least 8 character long, with two digits, containing only digits and letters");
		}
		
		input.close();
	}

}


