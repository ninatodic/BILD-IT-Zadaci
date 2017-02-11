package zadaci_11_02_2017;

public class Zadatak4100Letters100Numbers {

	public static void main(String[] args) {
		// declare array of chars that gets initialized by invoking method that
		// returns 100 random upper case letters
		char[] uppercaseLetters = returnLetters();
		// declare array of numbers that gets initialized by invoking method
		// that returns 100 random numbers
		int[] numbers = returnNumbers();

		// invoke a method that prints letters and numbers 10 per line
		printNumbersAndLetters(uppercaseLetters, numbers);
	}

	// method that prints letters and numbers 10 per line by looping through
	// arrays
	public static void printNumbersAndLetters(char[] uppercaseLetters, int[] numbers) {
		int perLine = 10;
		int count = 0;
		for (int i = 0; i < uppercaseLetters.length; i++) {
			count++;
			if (count % perLine == 0) {
				System.out.println(uppercaseLetters[i]);
			} else {
				System.out.print(uppercaseLetters[i] + " ");
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			count++;
			if (count % perLine == 0) {
				System.out.println(numbers[i]);
			} else {
				System.out.print(numbers[i] + " ");
			}
		}
	}

	// method that returns 100 random upper case letters
	public static char[] returnLetters() {
		char[] uppercaseLetters = new char[100];

		for (int j = 0; j < uppercaseLetters.length; j++) {
			uppercaseLetters[j] = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
		}
		return uppercaseLetters;
	}

	// method that returns 100 random numbers
	public static int[] returnNumbers() {
		int[] numbers = new int[100];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
		}
		return numbers;
	}

}
