package zadaci_08_02_2017;

import java.util.ArrayList;

public class Zadatak1ArrayListBiggestInteger {

	public static void main(String[] args) {
		// Declare and create ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		
		// Add elements for testing
		list.add(1);
		list.add(7);
		list.add(2);
		
		// Display the biggest element
		System.out.println(max(list));
	}
	
	
	// Method that finds and returns biggest integer, or returns null if list is empty
	public static Integer max(ArrayList<Integer> list) {

		if (list.size() == 0) {
			return null;
		} else {
			int highestValue = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > highestValue) {
					highestValue = list.get(i);
				}
			}
			return highestValue;
		}
	}

}
