package zadaci_22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4SumOfDigits {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables	
		Scanner input = new Scanner (System.in);
		
		long n = 0;
		boolean ex = true;
		// prompt user for input and handle possible exceptions
		do{
			try{
				System.out.println("Enter number to calculate sum of its digits: ");
				n = input.nextLong();
				ex = false;
			}
			catch(InputMismatchException w){
				System.out.println("Invalid input. Try again.");
				input.next();
			}
			
		}while(ex);
		
		// print sum of digits by invoking sumDigits method
		System.out.println("Sum of digits is " + sumDigits(n));
		input.close();
		
	}
	
	// method that returns sum of digits
	public static int sumDigits(long n){
		String s = n + ""; // turn number into string
		int sum = 0;
		if(n<0){ // calculate sum for numbers smaller than 0
			for (int i = 1; i < s.length(); i++) { // extrude digits and sum them
				String digit = s.charAt(i)+"";
				sum += Integer.parseInt(digit);
			}
		}
		else{ // calculate sum for numbers larger than 0
			for (int i = 0; i < s.length(); i++) {
				String digit = s.charAt(i)+"";
				sum += Integer.parseInt(digit);
			}
		}
		return sum;
	}

}
