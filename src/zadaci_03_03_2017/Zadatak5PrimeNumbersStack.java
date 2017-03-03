package zadaci_03_03_2017;

public class Zadatak5PrimeNumbersStack {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		// Find and push all prime numbers less than 120 to stack
		for (int i = 2; i < 120; i++) {
			if (isPrime(i))
				stack.push(i);
		}

		// Displays all the prime numbers less than 120 in decreasing order
		System.out.println(
			"All the prime numbers less than 120 in decreasing order:");
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	// Method that returns true if n is a prime number 
	public static boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0) 
				return false;
		}
		return true;
	}

}
