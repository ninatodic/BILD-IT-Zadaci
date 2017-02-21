package zadaci_21_02_2017;

public class Zadatak3EmirpNumbers {

	public static void main(String[] args) {
		// prints first 100 emirp numbers ten per line
		int number = 2;
		int count = 1;
		while(count<101){
			if (isPrime(number)&&isPrime(reversedNumber(number))&& (number!=reversedNumber(number))){// checks if the number is prime, if its reversed version is prime and weather the number is not palindrome
				if (count%10==0){
					System.out.println(number);
				}
				else{
					System.out.print(number + " ");
				}
				count++;
			}
			number ++;
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
		
		// method that returns reversed number
		public static int reversedNumber(int number) {
			String stringNumber = number + "";
			String reverseString = new StringBuffer(stringNumber).reverse().toString();
			int reverse = Integer.parseInt(reverseString);
			return reverse;
		}
}
