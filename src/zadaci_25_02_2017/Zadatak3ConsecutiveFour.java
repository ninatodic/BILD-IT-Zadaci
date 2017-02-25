package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3ConsecutiveFour {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables
		Scanner input = new Scanner (System.in);
		int numberOfValues = 0;
		boolean ex = true;
		
		// prompt the user for number of values
		do{
			try{
				System.out.println("Enter the number of values: ");
				numberOfValues = input.nextInt();
				if(numberOfValues<4){
					throw new Exception("Invalid input");
				}
				ex = false;
			} catch(InputMismatchException e){
				System.out.println("Invalid input, try again");
				input.next();
			} catch (Exception e){
				System.out.println("The number of values has to be positive number and be bigger or equal to 4");
				input.next();
			}
		}while(ex);
		
		// create array with the size user entered
		int[] values = new int[numberOfValues];
		
		ex = true;
		// fill the array with user input, handling exceptions
		do{
			try{
				System.out.println("Enter the values: ");
				for (int i = 0; i < values.length; i++) {
					values[i] = input.nextInt();
				}
				ex = false;
			} catch(InputMismatchException e){
				System.out.println("Invalid input, try again");
				input.next();
			} 
		}while(ex);
		
		// print weather array has four consecutive numbers
		if(isConsecutiveFour(values)){
			System.out.println("The list has consecutive fours");
		}
		else{
			System.out.println("The list has no consecutive fours");
		}
		
		input.close();
	}

	// method that returns true if array has four consecutive numbers
	public static boolean isConsecutiveFour(int[] values){
		int count=0;
		for (int i = 0; i < values.length-1; i++) {
			if(values[i]==values[i+1]){
				count++;
			}else{
				if(count>=3){
					continue;
				}
				else{
					count = 0;
				}
			}
		}
		if(count>=3){
			return true;
		}
		else{
			return false;
		}
	}
}
