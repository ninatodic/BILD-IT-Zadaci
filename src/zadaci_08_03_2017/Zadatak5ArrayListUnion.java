package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5ArrayListUnion {

	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in);
		ArrayList <Integer> list1 = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		
		boolean ex = true;
		do{
			try{
				System.out.println("Enter 5 integers for list1");
				for (int i = 0; i < 5; i++) {
					list1.add(input.nextInt());
				}
				ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input, please enter integers only.");
				input.nextLine();
				list1.clear();
			}
		}while(ex);
		
		 ex = true;
		do{
			try{
				System.out.println("Enter 5 integers for list 2");
				for (int i = 0; i < 5; i++) {
					list2.add(input.nextInt());
				}
				ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input, please enter integers only.");
				input.nextLine();
				list2.clear();
			}
		}while(ex);
		
		ArrayList <Integer> union = union(list1, list2);
		System.out.println(union);
		
		input.close();
		
	}
	
	public static ArrayList<Integer> union(
			ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> union = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			union.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			union.add(list2.get(i));
		}
		return union;
	}

}
