package zadaci_15_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1Add3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sum of three integers: ");
			// randomly generate three integers from -1000 to 1000
			int num1 = (int)(-1000 + Math.random()*2000);
			int num2 = (int)(-1000 + Math.random()*2000);
			int num3 = (int)(-1000 + Math.random()*2000);
		boolean incorectAnswer = true;
		// prompt the user for answer and repeat it until he gets it right
		while (incorectAnswer){
			
			System.out.println("(" + num1 + ")" + " + " + "(" + num2 + ")"+ " + " + "(" + num3 + ")"  );
			
			int userAnswer = 0;
			boolean ex=true;
			do{
				try {
					userAnswer = input.nextInt();
					ex = false;
				}
				catch(InputMismatchException e){
					System.out.println("Incorect input, please enter integer.");
					input.nextLine();
				}
			} while (ex);
			
			if (userAnswer == (num1+num2+num3)){
				System.out.println("Correct answer, congradulation");
				incorectAnswer = false;
			}
			else{
				System.out.println("Incorect answer please try again");
			}
		}
		input.close();
	}
}
