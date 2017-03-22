package zadaci_20_03_2017;

public class Zadatak5BinarySearch {

	public static void main(String[] args) {
		// create two arrays with different types
		String[] s = { "Boston", "Tokio", "Los Angeles" };

		// invoke method that finds key in list
		System.out.println(binarySearch(s, "Tokio"));
		
	}

	// Method performs a binary search to find the key in a list
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high / 2);
			if (key.compareTo(list[mid]) < 0)
				high = mid - 1;
			else if (key.compareTo(list[mid]) == 0)
				return mid;
			else
				low = mid + 1;
		}

		return -low - 1;
	}

}
