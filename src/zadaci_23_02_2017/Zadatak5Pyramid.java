package zadaci_23_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5Pyramid {

	public static void main(String[] args) {
		// create scanner and initialize variables
		Scanner input = new Scanner (System.in);
		
		int n = 0;
		boolean ex= true;
		// prompt the user for input and handle possible exceptions
		do{
			try{
		System.out.println("Enter a number for a size of a pyramid");
		n = input.nextInt();
		if (n<0){
			throw new Exception("invalid input");
		}
		ex = false;
		
			}
			catch(InputMismatchException e){
				System.out.println("Invalid input, try again");
				input.next();
			}
			catch (Exception e) {
				System.out.println("You have to enter positive integer");
				input.next();
			}
		}while(ex);

	// print pyramid
		printPyramid(n);
	
	input.close();
	}

	// method that prints out pyramid
	public static void printPyramid(int n){
		int count = 0;
			for (int i = n; i > 0; i--) {
			count++;
			for(int j = i; j>0; j--){
				System.out.print("  ");
			}
			for (int j = count; j>0; j--){
				System.out.print(j + " ");
			}
			if(count>1){
			for (int j = 2; j<= count; j++){
				System.out.print(j+" ");
			}
			}
			System.out.println();
		}
	}
}
