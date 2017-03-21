package zadaci_18_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4SumTheDigits {

	public static void main(String[] args) {
		// create scanner and get user input
		Scanner input = new Scanner(System.in);

		int n = userInput(input);

		// invoke recursive method which prints reverse display of a number
		System.out.println("The sum of digits of entered number is " + sumDigits(n));
		input.close();
	}

	public static int sumDigits(long n) {
		int sum = 0;
		return sumDigits(n, sum);
	}

	public static int sumDigits(long n, int sum) {
		if (n / 10 == 0) {
			return (int) (sum + n);
		} else {
			sum += n % 10;
			return sumDigits(n / 10, sum);
		}
	}
	
	// method that gets user input and handles exceptions
		private static int userInput(Scanner input) {
			boolean ex = true;
			int n = 0;
			do{
				try{
					System.out.println("Enter positive integer to sum its digits: ");
					n = input.nextInt();
					if(n<0){
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
			return n;
		}
}
