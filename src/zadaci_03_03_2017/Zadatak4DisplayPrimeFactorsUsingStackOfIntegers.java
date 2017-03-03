package zadaci_03_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4DisplayPrimeFactorsUsingStackOfIntegers {

	public static void main(String[] args) {
		// create scanner and declare and initialize variable
		Scanner input = new Scanner(System.in);

		int number = 0;
		// Prompt the user to enter a positive integer and handle possible exceptions
		boolean ex = true;
		do{
			try{
				System.out.print("Enter a positive integer: ");
				number = input.nextInt();
				if(number<1){
					throw new Exception("Invalid input");
				}
				ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input, try again");
				input.nextLine();
			} catch (Exception e){
				System.out.println("The number has to be positive");
				input.nextLine();
			}
		} while(ex);

		// Displays all the number's smallest factors in decreasing order using StackOfIntegers
		System.out.print("The smallest factors of " + number + " are: ");
		StackOfIntegers stack = new StackOfIntegers(); 

		smallestFactors(number, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		input.close();
	}

	// Method that finds smallestFactors and push them to StackOfIntegers 
	public static void smallestFactors(int number, StackOfIntegers stack) {
		int i = 2; 
		while (number / i != 1){ 
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			}
			else
				i++;
		}
		stack.push(number);
	}

}
