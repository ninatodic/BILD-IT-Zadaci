package zadaci_15_02_2017;

public class Password {
	
	// method that checks weather all three conditions are met for validating a password
	public static boolean isValid (String password){
		if (isAtLeast8ChLong(password) && isOnlyLettersAndDigits(password) && hasAtLeastTwoDigits(password)){
			return true;
		}
			return false;
	}

	// method that returns true if password has at least two digits
	private static boolean hasAtLeastTwoDigits(String password) {
		int countDigit =0;
		for (int i = 0; i<password.length(); i++){
			if(Character.isDigit(password.charAt(i))){
				countDigit++;
			}
		}
		if(countDigit<2){
			return false;
		}
		else{
			return true;
		}
	}
	
	// method that returns true if password is made only out of digits and letters
	private static boolean isOnlyLettersAndDigits(String password) {
		for (int i = 0; i<password.length(); i++){
			if (!Character.isLetterOrDigit(password.charAt(i))){
				return false;
			}
		}
		return true;
	}

	// method that returns true if password is at least 8 characters long
	private static boolean isAtLeast8ChLong(String password) {
		if (password.length()>=8){
			return true;
		}
		return false;
	}

}
