package zadaci_18_02_2017;

public class Zadatak2PrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		// looping through numbers from 2 to 1000 and printing prime numbers, 8 per line
		for(int i = 2; i<1001; i++){
			if(isPrime(i)){
				count++;
				if(count%8==0){
					System.out.println(i);
				}
				else {
					System.out.print(i + " ");
				}
			}
		}
	}

	// method that return true if the number is prime
		public static boolean isPrime(int number) {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
}
