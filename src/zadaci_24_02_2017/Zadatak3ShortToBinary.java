package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3ShortToBinary {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables needed for
		// computing
		Scanner input = new Scanner(System.in);

		short n = 0;
		boolean ex = true;
		// prompt the user for short integer and handle possible
		// exceptions
		do {
			try {
				System.out.println("Enter short integer value (ranging from -32,767 to 32,767): ");
				n = input.nextShort();
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			} 
		} while (ex);

		// invoking a method that prints byte representation of short value
		byteRepresentation(n);;
		input.close();
	}
	
	// method that prints byte representation of short value
	public static void byteRepresentation(short n){
		String byteShort = Integer.toBinaryString(n);
		String byteShortRepresentation = byteShort;
		for (int i = 0; i < (16-byteShort.length()); i++) {
			byteShortRepresentation = "0" + byteShortRepresentation;
		}
		System.out.println(byteShortRepresentation);
	}
}
