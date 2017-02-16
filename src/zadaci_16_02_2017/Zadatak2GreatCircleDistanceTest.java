package zadaci_16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2GreatCircleDistanceTest {

	public static void main(String[] args) {
		// create scanner and declare and initalize variables needed for computing
		Scanner input = new Scanner(System.in);
		
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		boolean ex = true;
		
		// prompt user for width and length of two points on Earth and deal with possible exceptions
		do{
			try{
				System.out.println("Enter goegraphical width and length of the first point on Earth in degrees: ");
				x1= input.nextDouble();
				y1 = input.nextDouble();
				System.out.println("Enter goegraphical width and length of the second point on Earth in degrees: ");
				x2= input.nextDouble();
				y2 = input.nextDouble();
				
				ex = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while(ex);
		
		// creates GreatCircleDistance object
		GreatCircleDistance distance1 = new GreatCircleDistance(x1, y1, x2, y2);
		
		// geting the distance by invoking getDistance method from GreatCircleDistance class
		double distance = distance1.getDistance();
		
		// prints the result to the user
		System.out.println("The distance between two points is " + distance);
		
		input.close();
	}

}
