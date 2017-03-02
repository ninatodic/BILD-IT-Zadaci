package zadaci_25_02_2017;

public class Zadatak2RandomNumberChooser {

	public static void main(String[] args) {

		
		
		// prints random number from 1 to 54, excluding those added as parameter in getRandom method
		System.out.println("Random number is " + getRandom(5,6,8,9));
	}
	
	// method that returns random number from 1 to 54, excluding those added as parameter in getRandom method
	public static int getRandom(int... numbers){
		int[] excludedNumbers = numbers;
		int randomNumber = (int)(1+Math.random()*54);
		boolean x = true;
		while(x){
			for (int i = 0; i < excludedNumbers.length; i++) {
				if(randomNumber==excludedNumbers[i]){
					randomNumber = (int)(Math.random()*52);
				}
			}
			x = false;
		}
		return randomNumber;
	}

}
