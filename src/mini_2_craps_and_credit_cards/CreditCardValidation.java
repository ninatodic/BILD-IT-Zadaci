package mini_2_craps_and_credit_cards;

public class CreditCardValidation {
	long cardNumber;

	// constructor
	public CreditCardValidation(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	// getter 
	public long getCardNumber() {
		return cardNumber;
	}
	
	// method that returns number of digits
	private  int getSize(long d) {
		int count = 0;
		while (d != 0) {
			d /= 10;
			count++;
		}
		return count;
	}
	
	// method that checks if the number has right size
	private boolean isRightLength (){
		if (((getSize(cardNumber)>= 13) && (getSize(cardNumber)<=16))){
			return true;
		}
		return false;
	}
	
	// method that checks does the card number starts with certain number
	private boolean prefixMatched(int d) {

		String cardNumberString = "" + cardNumber;
		String prefix = "" + d;

		if (cardNumberString.startsWith(prefix)) {
			return true;
		} else {
			return false;
		}
	}
	
	// method that checks does the card starts with designated numbers
	private boolean isValidPrefix(){
		if(prefixMatched(4)||prefixMatched(5)||prefixMatched(37)||prefixMatched(6)){
			return true;
		}
		return false;
	}
	
	// method that returns sum of digits in odd places
	private int sumOfOddPlace() {
		int sum = 0;
		while (cardNumber != 0) {
			sum += (cardNumber % 10);
			cardNumber /= 100;
		}
		return sum;
	}

	// method that returns sum of digits of double values of digits on even places
	private int getDigit(int number) {
		if (number < 10) {
			return number;
		} else {
			int digit1 = number % 10;
			int digit2 = number / 10;
			int sum = digit1 + digit2;
			return sum;
		}
	}

	// method that returns sum of double values of digits on even places
	private int sumOfDoubleEvenPlace() {
		int sum = 0;
		long number2 = cardNumber / 10;
		while (number2 != 0) {
			int digit = (int) ((number2 % 10) * 2);
			sum = sum + getDigit(digit);
			number2 /= 100;
		}
		return sum;
	}
	
	// method that checks if the sum of double even digits and sum of digits in the odd places is divisible with 10
	boolean isDivisible10(){
		if ((sumOfDoubleEvenPlace() + sumOfOddPlace())%10==0) {
			return true;
		}
		return false;
	}
	
	// method that checks if the card is valid
	public boolean isValidCard(){
		
	return isValidPrefix() && isRightLength() && isDivisible10();
	
	}
	
}