package zadaci_20_03_2017;

public class Zadatak4MaxElement2DArray {

	public static void main(String[] args) {
		// create two arrays of different type
		String[][] s={{"Boston", "Tokio"},{"Los Angeles", "New York"}};
		
		Integer[][] i = {{4,5,7}, {3,6,9}, {34,5,23}};
		
		// invoke max method to find max element
		System.out.println(max(s));
		System.out.println(max(i));
	}
	
	// Method that returns the maximum element in a two-dimensional array 
	public static <E extends Comparable<E>> E max(E[][] list) {
		E max = list[0][0];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j].compareTo(max) > 0)
					max = list[i][j];
			}
		}
		return max;
	}

}
