package zadaci_13_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak410Integers {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int[] list = new int[10];
		boolean ex = true;
		// fills the array with user input
		do{
		try{
		System.out.println("Enter ten integers: ");
		for (int i = 0; i<10; i++){
		list[i] = input.nextInt();
		}
		ex=false;
		} catch (InputMismatchException e) {
			System.out.println("Invalid input, try again");
			input.nextLine();
		}
		}while(ex);
		
		// print reversed array
		for (int i = list.length-1; i>=0; i--){
			System.out.print(list[i] + " ");
		}
		
		
		input.close();
		
	}

}
