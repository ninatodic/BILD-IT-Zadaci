package zadaci_25_02_2017;

public class Zadatak2RandomNumberChooser {

	public static void main(String[] args) {

		int[] list = new int [52]; // array that holds numbers from 1 to 54, excluding 1 and 54
		
		for (int i = 0; i < 52; i++) { // fill the array
			list[i] = i+2;
		}
		
		// print random list using getRandom method
		System.out.println("Random number is " + getRandom(list));
	}
	
	// method that returns random number from array or 0 if array is empty
	public static int getRandom(int... numbers){
		int randomNumber = 0;
		if(numbers.length==0){
			return 0;
		}
		else{
			randomNumber = (int)(Math.random()*52);
			return numbers[randomNumber];
		}
	}

}
