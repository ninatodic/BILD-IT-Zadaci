package zadaci_21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1TipTest {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables needed for computing
		Scanner input = new Scanner(System.in);

		double billAmount = 0;
		double tipPercentage = 0;
		boolean ex = true;
		
		// prompt the user for bill amount and tip percentage and handle possible exceptions
		do {
			try {
				System.out.println("Enter bill amount: ");
				billAmount = input.nextDouble();

				System.out.println("Enter tip percentage: ");
				tipPercentage = input.nextDouble();
				if(billAmount<0 || tipPercentage<0){
					throw new Exception("Invalid input");
				}

				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			} catch (Exception e){
				System.out.println("Bill amount and tip percentage cannot be negative numbers");
				input.next();
			}

		} while (ex);

		// create new object
		Tip bill1 = new Tip(billAmount, tipPercentage);

		// print bill amount with tip added and tip by itself by invoking methods from Tip class
		System.out.println("The bill amount with tip is " + bill1.returnBillWithTip() + ", and the tip is "
				+ bill1.returnTipAmount(billAmount, tipPercentage));
		input.close();
	}

}
