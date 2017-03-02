package zadaci_02_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Zadatak3TestQuadraticEquations {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		boolean ex = true;
		do{
			try{
				System.out.println("Enter a, b and c for the solution of Quadratic Equation:");
				a = input.nextInt();
				b = input.nextInt();
				c = input.nextInt();
				ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		}while(ex);
		
		QuadraticEquations equation1 = new QuadraticEquations(a, b, c);
		
		if (equation1.getDiscriminant()>0){
			System.out.println("The two solutions for this equation are " + equation1.getRoot1() + " and " + equation1.getRoot2());
		}
		else if (equation1.getDiscriminant()==0){
			System.out.println("The equation has only one solution and it is " + equation1.getRoot1());
		}
		else{
			System.out.println("The equation has no roots");
		}
		
		input.close();
	}

}
