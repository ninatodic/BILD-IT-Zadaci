package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4RemoveDuplicats {

	public static void main(String[] args) {
		// create scanner and arrayList
		Scanner input  = new Scanner (System.in);
		ArrayList <Integer> list = new ArrayList<>();
		
		// prompt the user to enter 10 integers in arrayList and handle possible exceptions
		boolean ex = true;
		do{
			try{
				System.out.println("Enter 10 integers");
				for (int i = 0; i < 10; i++) {
					list.add(input.nextInt());
				}
				ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input, please enter integers only.");
				input.nextLine();
				list.clear();
			}
		}while(ex);
		
		//invoke method that removes duplicates from the list and print new list
		removeDuplicate(list);
		System.out.println(list);
		
		input.close();
		
	}
	
	// method that returns list without duplicate elements
	public static void removeDuplicate(ArrayList<Integer> list){
		ArrayList<Integer> list2 = new ArrayList<>(); // create another list
		for (int i = 0; i < list.size(); i++) { // fill it with unique values
			if(list2.contains(list.get(i))){
				continue;
			} else {
				list2.add(list.get(i));
			}
		}
		
		list.clear(); // clear first list
		for (int i = 0; i < list2.size(); i++) { // copy unique list in first list
			list.add(list2.get(i));
		}
	}
	
}
