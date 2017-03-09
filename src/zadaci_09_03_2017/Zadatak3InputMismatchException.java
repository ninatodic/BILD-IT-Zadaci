package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3InputMismatchException {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n = 0;
		int m = 0;
		boolean ex = true;
		do{
			try{
				System.out.println("Enter two integers: ");
				n = input.nextInt();
				m = input.nextInt();
				ex = false;
				} catch (InputMismatchException e){
					System.out.println("Invalid input, try again");
					input.nextLine();
				} 
		}while(ex);
		
		System.out.println(n + " + " + m + " = " + (n+m));
		input.close();
	}

}
