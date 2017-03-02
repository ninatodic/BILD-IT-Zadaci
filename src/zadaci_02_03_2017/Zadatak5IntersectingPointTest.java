package zadaci_02_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5IntersectingPointTest {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
		
		double x1= 0;
		double y1= 0;
		double x2= 0;
		double y2= 0;
		double x3= 0;
		double y3= 0;
		double x4= 0;
		double y4= 0;
		
		boolean ex = true;
		do{
			try{
				System.out.println("Enter x1, y1, x2, y2, x3, y3, x4 and y4: ");
				x1 = input.nextInt();
				y1 = input.nextInt();
				x2 = input.nextInt();
				y2 = input.nextInt();
				x3 = input.nextInt();
				y3 = input.nextInt();
				x4 = input.nextInt();
				y4 = input.nextInt();
				ex = false;
			} catch (InputMismatchException exc){
				System.out.println("Invalid input, try again");
				input.nextLine();
			}
		}while(ex);
		
		IntersectingPoint point1 = new IntersectingPoint(x1, y1, x2, y2, x3, y3, x4, y4);
		
		
		
		if (point1.areInersecting()){
			System.out.println("Lines are intersecting at coordinates " + point1.coordinateX() + " and " + point1.coordinateY());
		}
		else {
			System.out.println("The lines are parallel.");
		}
		
		input.close();
	}

}
