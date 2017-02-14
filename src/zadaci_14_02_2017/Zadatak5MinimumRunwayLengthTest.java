package zadaci_14_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5MinimumRunwayLengthTest {

	public static void main(String[] args) {
		// creating a scanner and creating and initializing variables needed for computing
		Scanner input = new Scanner(System.in);

		double a = 0;
		double v = 0;
		
		boolean ex = true;
		// prompting a user for speed and acceleration of the plane handling InputMismatchExceptions
		do {
			try {
				System.out.println("Enter a speed of a plane in m/s: ");
				v = input.nextDouble();
				while (v < 0) { // it has to be positive entry
					System.out.println("The speed has to be positive. Try again");
					v = input.nextDouble();
				}
				System.out.println("Enter plane acceleration in m/s^2: ");
				a = input.nextDouble();
				while (a < 0) { // it has to be positive entry
					System.out.println("The acceleration has to be positive. Try again");
					a = input.nextInt();
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);
		
		// creating a object plane1
		MinimumRunwayLength plane1 = new MinimumRunwayLength(a, v);
		
		// printing minimum runway length by invoking getMinimumRunwayLength method
		System.out.printf("Minimum Runway length is %.3f", plane1.getMinimumRunwayLength());
		
		input.close();
	}

}
