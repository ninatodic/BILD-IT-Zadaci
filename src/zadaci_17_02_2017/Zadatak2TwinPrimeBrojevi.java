package zadaci_17_02_2017;

public class Zadatak2TwinPrimeBrojevi {

	public static void main(String[] args) {
		int count = 0;
		
		
		for (int i = 2; i < 10000; i++) {
			if (isPrime(i) && isPrime(i + 2)) {// condition that checks if the number is prime and if it does have its twin prime
				count++;
				if (count % 10 == 0) { // inner condition that prints ten twin primes per line
					System.out.println("(" + i + ", " + (i + 2) + ")");
				} else {
					System.out.print("(" + i + ", " + (i + 2) + ")" + "");
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
