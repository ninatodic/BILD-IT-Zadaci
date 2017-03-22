package zadaci_20_03_2017;


public class Zadatak2LinearSearch {

	public static void main(String[] args) {
		// create two arrays with different types
		String[] s = {"Boston", "Tokio", "Los Angeles"};

		Integer[] i = {1, 3, 4, 6};
		
		System.out.println(linearSearch(s, "Tokio"));
		System.out.println(linearSearch(i, 4));
	}

	// Method that finds the key in a list
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++) {
			if (key.compareTo(list[i]) == 0)
				return i;
		}
		return -1;
	}

}
