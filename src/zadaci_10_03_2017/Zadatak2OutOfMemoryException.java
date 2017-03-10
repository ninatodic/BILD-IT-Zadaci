package zadaci_10_03_2017;

public class Zadatak2OutOfMemoryException {

	public static void main(String[] args) {
		int n = 900000000;
		// try to create array with length that is to large for heap space
		try {
			int[] array = new int[n];
		}
		catch (OutOfMemoryError ex) { // catch exception
			System.out.println("JVM run out of space");
		}
		// Continue program
		System.out.println("Error handled program continues... ");
	}

}
