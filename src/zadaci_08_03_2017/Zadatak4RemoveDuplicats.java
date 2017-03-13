package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4RemoveDuplicats {

	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in);
		ArrayList <Integer> list = new ArrayList<>();
		
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
		
		removeDuplicate(list);
		System.out.println(list);
		
		input.close();
		
	}
	
	public static void removeDuplicate(ArrayList<Integer> list){
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if(list2.contains(list.get(i))){
				continue;
			} else {
				list2.add(list.get(i));
			}
		}
		
		list.clear();
		for (int i = 0; i < list2.size(); i++) {
			list.add(list2.get(i));
		}
	}
	
}
