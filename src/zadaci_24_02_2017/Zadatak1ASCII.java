package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1ASCII {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables needed for
		// computing
		Scanner input = new Scanner(System.in);

		int ascii = 0;
		boolean ex = true;
		// prompt the user for ascii code and handle possible
		// exceptions
		do {
			try {
				System.out.println("Enter ascii code (integer between 0 and 127: ");
				ascii = input.nextInt();
				if(ascii<0 ||ascii>127){
					throw new Exception("Invalid input.");
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			} catch (Exception e) {
				System.out.println("Out of range input, try again");
				input.next();
			}
			
		} while (ex);
		
		// print the value of ascii code
		System.out.println("Value of ASCII code " + ascii + " is " + (char)ascii);
		input.close();
	}

}
