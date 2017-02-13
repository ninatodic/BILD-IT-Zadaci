package zadaci_10_02_2017;

public class Zadatak1PrimeNumbers {

	public static void main(String[] args) {
		// invoking a method that print prime numbers in the range from parameter1 to parameter2
		printPrimes(1, 10);
		System.out.println();
		// invoking an overloaded method that prints prime numbers with designated number per line  
		printPrimes(1, 30, 5);
	}
	
	// Method that prints prime numbers in the range from parameter1 to parameter2
	public static void printPrimes(int num1, int num2){
		for (int i = num1; i<=num2; i++){
			if (isPrime(i) && i!=1){
				System.out.print(i + " ");
			}
		}
	}
	
	// Overloaded method that prints prime numbers with designated number per line 
	public static void printPrimes (int num1, int num2, int numbPerLine){
		int count = 0;
		for (int i = num1; i<=num2; i++){
			if (isPrime(i) && i!=1){
				count++;
				if (count%numbPerLine==0){
					System.out.println(i);
				}
				else{
					System.out.print(i + " ");
				}
				
			}
		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= number/2 ; i++) {
			if (number % i == 0) {
				return false;
			}
			
		}
		return true;
	}
}
