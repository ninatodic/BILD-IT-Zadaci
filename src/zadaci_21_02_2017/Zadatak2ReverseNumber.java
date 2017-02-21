package zadaci_21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2ReverseNumber {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables needed for computing
		Scanner input = new Scanner (System.in);
		
		int number = 0;
		boolean ex = true;
		// prompt the user for number to be reversed and handle possible exceptions
		do{
			try{
				System.out.println("Enter the number you want to reverse: ");
				number = input.nextInt();
				ex = false;
			}catch(InputMismatchException e){
				System.out.println("Invalid input, try again");
				input.next();
			}
		}while(ex);
		
		// invoke method that will print reversed number
		reverse(number);
		
		input.close();
	}
	
	// method that prints reversed number
	 public static void reverse(int number){
		 String s = number + "";
		 s = new StringBuffer(s).reverse().toString();
		 System.out.println(s);
	 }

}
