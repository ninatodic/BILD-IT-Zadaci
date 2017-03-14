package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2SortArrayList {

	public static void main(String[] args) {
		// create scanner and arrayList
		Scanner input  = new Scanner (System.in);
		ArrayList <Integer> list = new ArrayList<>();
		
		// prompt the user to enter 5 integers in arrayList and handle possible exceptions
		boolean ex = true;
		do{
			try{
				System.out.println("Enter 5 integers");
				for (int i = 0; i < 5; i++) {
					list.add(input.nextInt());
				}
				ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input, please enter integers only.");
				input.nextLine();
				list.clear();
			}
		}while(ex);
		
		// method that sorts arrayList
		sort(list);
		// print sorted list
		System.out.println(list);
		
		input.close();
		
	}
	
	// method that sorts arrayList
	public static void sort(ArrayList<Integer> list){
		int[] numbList = new int[list.size()];
		for (int i = 0; i < numbList.length; i++) {
			numbList[i] = list.get(i);
		}
		Arrays.sort(numbList);
		for (int i = 0; i < numbList.length; i++) {
			list.set(i, numbList[i]); 
		}
	}

}
