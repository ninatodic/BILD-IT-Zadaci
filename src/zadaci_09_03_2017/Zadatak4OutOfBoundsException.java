package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4OutOfBoundsException {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] array = new int[100];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*50);
		}
		
		System.out.println("Enter index of an array to display element");
		int i = 0;
		try{
		i = input.nextInt();
		} catch(InputMismatchException e){
			System.out.println("Enter integer");
		}
		
		try{
			System.out.println(array[i]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Out of Bound!");
		}
		input.close();
	}

}
