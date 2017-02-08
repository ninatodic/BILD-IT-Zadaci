package zadaci_08_02_2017;

public class Zadatak4Generate100Numbers {

	public static void main(String[] args) {
		// declare and create array
		int[] numbers = new int[100];
		
		// fills the array with random numbers
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*10);
		}
		
		// declaring and creating an array that holds the number of occurrence of each number
		int[] counts = countNumbers(numbers);
		
		// display occurrence by invoking displayCounts method
		System.out.println("The occurrences of each integer is: ");
		displayCounts(counts);
		
		
		
	}

	// returns an array that holds the number of occurrences of the integers
	public static int[] countNumbers(int[] numbers) {
		int[] counts = new int[10];
		for (int i = 0; i<numbers.length; i++){
			counts[numbers[i]]++;
		}
		return counts;
	}
	
	//displays occurrence of every integer
	public static void displayCounts(int[] counts){
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + " - " + counts[i] );
		}
	}

}
