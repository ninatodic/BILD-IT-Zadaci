package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3SumArrayListElements {

	public static void main(String[] args) {
		// create scanner and arrayList
		Scanner input  = new Scanner (System.in);
		ArrayList <Double> list = new ArrayList<>();
		
		// prompt the user to enter 5 integers in arrayList and handle possible exceptions
		boolean ex = true;
		do{
			try{
				System.out.println("Enter 5 values");
				for (int i = 0; i < 5; i++) {
					list.add(input.nextDouble());
				}
				ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input, please enter numbers only.");
				input.nextLine();
				list.clear();
			}
		}while(ex);
		
		// print sum of all elements in arrayList by invoking sum method
		System.out.println("The sum of all elements in the list is: " + sum(list));
		
		input.close();
		
	}
	
	// method that returns sum of all elements in arrayList
	public static double sum(ArrayList<Double> list){
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}

}
