package zadaci_25_02_2017;

public class Zadatak1CountSingleDigits {



	public static void main(String[] args) {
		int numberOfIntegers = 100;
		int[] integers = generateIntegers(numberOfIntegers); // array that holds generated integers
		int[] countIntegers = countIntegers(integers); // array that counts number of repetition

		// loop that prints generated integers, ten per line
		for (int i = 0; i < integers.length; i++) {
			if ((i+1) % 10 == 0) {
				System.out.println(integers[i]);
			} else {
				System.out.print(integers[i] + " ");
			}
		}
		System.out.println();

		// loop that prints number of repetitions of every integer
		for (int i = 0; i < countIntegers.length; i++) {

			if (countIntegers[i] == 1) {
				System.out.printf("%d occurs %d time\n", i, countIntegers[i]);
			} else if (countIntegers[i] >= 2) {
				System.out.printf("%d occurs %d times\n", i, countIntegers[i]);
			}
		}
	}
	
	// method that generates random integers
	public static int[] generateIntegers(int numberOfIntegers) {
		int[] integers = new int[numberOfIntegers];
		for (int i = 0; i < numberOfIntegers; i++) {
			integers[i] = (int) (Math.random() * 10);
		}
		return integers;
	}

	// method that counts number of repetitions of every integer
	public static int[] countIntegers(int[] integers) {
		int[] count = new int[10];
		for (int i = 0; i < integers.length; i++) {
			int temp = integers[i];
			count[temp]++;
		}
		return count;
	}
}
