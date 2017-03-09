package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1AreaOfConvexPolygon {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int points = 0;
		boolean ex = true;
		do{
			try{
				System.out.println("Enter the number of points of convex polygon: ");
				points = input.nextInt();
				if(points<3){
					throw new Exception("Invalid input.");
				}
				ex = false;
				} catch (InputMismatchException e){
					System.out.println("Invalid input, try again");
					input.nextLine();
				} catch (Exception e){
					System.out.println("You have to enter number higher than 3");
					input.nextLine();
				}
		}while(ex);
		
		double[] xs = new double [points];
		double[] ys = new double [points];
		
		ex = true;
		do{
			try{
				System.out.println("Enter the koordinants of the points: ");
				for (int i = 0; i < ys.length; i++) {
					xs[i]= input.nextDouble();
					ys[i]= input.nextDouble();
				}
				ex = false;
				} catch (InputMismatchException e){
					System.out.println("Invalid input, try again");
					input.nextLine();
				}
		}while(ex);
		
		for (int i = 0; i < ys.length; i++) {
			System.out.print(xs[i] + " " + ys[i]);
			System.out.println();
		}
		System.out.println("The area of convex polygon is: " + getArea(xs, ys,points));
		
		input.close();
		
	}
	
	public static double getArea(double[] xs, double[]ys, int points){
		double area=0;
		double a=0;
		double b = 0;
		for (int i = 0; i < xs.length-1; i++) {
			a += (xs[i] * ys[i+1]);
		}
		a= a+ (xs[points-1]*ys[0]);
		for (int i = 0; i < xs.length-1; i++) {
			b += (ys[i] * xs[i+1]);
		}
		b= b+ (ys[points-1]*xs[0]);
		System.out.println(a-b);
		area = 0.5*(a-b);
		return area;
	}

}
