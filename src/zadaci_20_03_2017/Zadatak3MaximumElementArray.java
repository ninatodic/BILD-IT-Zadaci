package zadaci_20_03_2017;

public class Zadatak3MaximumElementArray {

	public static void main(String[] args) {
		// create two arrays with different types
		String[] s = { "Boston", "Tokio", "Los Angeles" };

		Integer[] i = { 1, 3, 4, 6 };

		// invoke max method that finds max element
		System.out.println(max(s));
		System.out.println(max(i));
	}

	// Method that returns the maximum element in an array */
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i].compareTo(max) > 0)
				max = list[i];
		}
		return max;
	}

}
