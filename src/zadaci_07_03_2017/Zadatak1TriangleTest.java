package zadaci_07_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1TriangleTest {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables
		Scanner input = new Scanner(System.in);

		double side1 = 0;
		double side2 = 0;
		double side3 = 0;
		
		// Prompt the user to enter three sides of the triangle and handle possible exceptions
		boolean ex = true;
		do {
			try {
				System.out.print("Enter three side of the triangle: ");
				side1 = input.nextDouble();
				side2 = input.nextDouble();
				side3 = input.nextDouble();
				if (side1 < 0 || side2 < 0 || side3 < 0) {
					throw new Exception("Invalid input.");
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			} catch (Exception e) {
				System.out.println("The entered sides must be positive numbers");
				input.nextLine();
			}
		} while (ex);
		
		// Prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		// Prompt the user to enter whether the triangle is filled and handle possible exceptions
		ex = true;
		boolean filled = true;
		do {
			try {
				System.out.print("Is the triangle filled (true / false)? ");
				filled = input.nextBoolean();
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		} while (ex);

		// Create triangle object with user input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		// print out description
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is " + (triangle.isFilled() ? "" : " not ") + "filled");
		
		input.close();
		
	}

}
