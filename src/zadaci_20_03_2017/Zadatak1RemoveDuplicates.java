package zadaci_20_03_2017;

import java.util.ArrayList;

public class Zadatak1RemoveDuplicates {

	public static void main(String[] args) {
		// create two arrayLists with different types
		ArrayList <String> s = new ArrayList<>();
		s.add("Tokio");
		s.add("Boston");
		s.add("Singapur");
		s.add("Tokio");
		
		ArrayList<Integer> i = new ArrayList<>();
		i.add(1);
		i.add(4);
		i.add(5);
		i.add(4);
		
		// invoke removeDuplicates for both lists
		removeDuplicates(s);
		removeDuplicates(i);
		
		// print lists
		System.out.println(s);
		System.out.println(i);
	}

	// method that returns ArrayList with unique items
	public static <E extends Comparable<E>> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) == 0)
					list.remove(j);
			}
		}
		return list;
	}
}
