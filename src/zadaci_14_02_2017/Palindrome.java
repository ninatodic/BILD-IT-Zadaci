package zadaci_14_02_2017;

public class Palindrome {
	
	// Static method that returns true if number is palindrome
	public static boolean isPalindrome(int number){
		if(number==reversedNumber(number)){
			return true;
		}
		else{
			return false;
		}
	}

	// Static method that return reversed number
	public static int reversedNumber(int number) {
		String stringNumber;
		String reverseString;
		int reverse;
		// code to return reversed number if the number is negative
		if (number < 0) {
			stringNumber = number + "";
			String stringNumberPositive = "";
			for (int i = 1; i < stringNumber.length(); i++) {
				 stringNumberPositive = stringNumberPositive + stringNumber.charAt(i);
			}
			String reverseStringPositive =  new StringBuffer(stringNumberPositive).reverse().toString();
			reverseString = "-" + reverseStringPositive;
			reverse = Integer.parseInt(reverseString);
			return reverse;
			// code that returns reversed number if the number is positive
		} else {
			stringNumber = number + "";
			reverseString = new StringBuffer(stringNumber).reverse().toString();
			reverse = Integer.parseInt(reverseString);
			return reverse;
		}
	}
}
