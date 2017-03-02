package zadaci_02_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4TestLinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double a= 0;
		double b= 0;
		double c= 0;
		double d= 0;
		double e= 0;
		double f= 0;
		
		boolean ex = true;
		do{
			try{
				System.out.println("Enter a, b, c, d, e and  f for solution of linear equation: ");
				a = input.nextInt();
				b = input.nextInt();
				c = input.nextInt();
				d = input.nextInt();
				e = input.nextInt();
				f = input.nextInt();
				ex = false;
			} catch (InputMismatchException exc){
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		}while(ex);
		
		LinearEquation equation1 = new LinearEquation(a, b, c, d, e, f);
		
		if (equation1.isSolvable()){
			System.out.println("The x is " + equation1.getX() + " and the y is " + equation1.getY());
		}
		else {
			System.out.println("The equation has no solution.");
		}
		
		input.close();
	}

}
