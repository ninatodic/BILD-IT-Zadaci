package zadaci_20_02_2017;

public class GreatestCommonDivisor {

	// returns gcd
	public static int getGcd(int num1, int num2) {
		int gcd = 1;

		// code for returning gcd if the first integer is bigger
		if (num1 > num2) {

			for (int i = num2; i >= 1; i--) {
				if (num1 % i == 0 && num2 % i == 0) {
					gcd = i;
					break;
				}
			}
			// code for returning gcd if the second integer is bigger
		} else {
			for (int j = num1; j >= 1; j--) {
				if (num1 % j == 0 && num2 % j == 0) {
					gcd = j;
					break;
				}
			}
		}
		return gcd;

	}

}
