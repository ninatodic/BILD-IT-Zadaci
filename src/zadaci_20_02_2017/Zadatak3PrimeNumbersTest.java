package zadaci_20_02_2017;

public class Zadatak3PrimeNumbersTest {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i<=100000; i++){ // prints prime numbers from 0 to 100 000 ten per line
			if (isPrime(i) >1){
				count++;
				if (count%10==0){
					System.out.println(i);
				}
				else{
					System.out.print(i + " ");
				}
				
			}
		}
	}
	
	// method that checks if the number is prime
	public static int isPrime(int number) {
		for (int i = 2; i <= number/2 ; i++) {
			if (number % i == 0) {
				return -1;
			}
			
		}
		return number;
	}

}
