package zadaci_18_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1ReversedInteger {

	public static void main(String[] args) {
		// create scanner and get user input
		Scanner input = new Scanner (System.in);
		
		int value= userInput(input);
		
		// invoke recursive method which prints reverse display of a number
		reverseDisplay(value);
		input.close();
	}
	
	// method that gets user input and handles exceptions
	private static int userInput(Scanner input) {
		boolean ex = true;
		int value = 0;
		do{
			try{
				System.out.println("Enter positive integer you want to reverse: ");
				value = input.nextInt();
				if(value<0){
					throw new Exception("Invalid input;");
				}
				ex = false;
			}
			catch(InputMismatchException e){
				System.out.println("Invalid input, try again");
				input.nextLine();
			}catch(Exception e){
				System.out.println("You have to enter positive number.");
				input.nextLine();
			}
		}while(ex);
		return value;
	}

	// method that prints reversed display of a number
	public static void reverseDisplay(int value){
		if(value==0){ // base case
			System.out.println();
		}else{
			System.out.print(value%10);
			reverseDisplay(value/10); // Recursive call
		}
	}

}
