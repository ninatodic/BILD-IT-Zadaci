package bonus_zadaci_25_02_2017;

public class LcdDisplay {
	
	// display number, line per line
	public static void displayNumber (int number,int size){
		
		LcdDisplay.printLine1(number, size);
		System.out.println();
		LcdDisplay.printLine2(number, size);
		LcdDisplay.printLine3(number, size);
		System.out.println();
		LcdDisplay.printLine4(number, size);
		LcdDisplay.printLine5(number, size);
	}

	// Display first line
	public static void printLine1(int number, int size) {
		int[] digits = getDigits(number);

		for (int i = 0; i < digits.length; i++) {
			switch (digits[i]) {
			case 0: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print('-');
				}
				System.out.print("  ");
			}
				break;
			case 1: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(' ');
				}
				System.out.print("  ");
			}
				break;
			case 2:
			case 3: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print('-');
				}
				System.out.print("  ");
			}
				break;
			case 4: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(' ');
				}
				System.out.print("  ");
			}
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print('-');
				}
				System.out.print("  ");
			}
				break;
			}
		}
	}

	// Display line 2
	public static void printLine2(int number, int size) {
		int[] digits = getDigits(number);

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < digits.length; j++) {
				switch (digits[j]) {
				case 0: {
					System.out.print("|" + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
					break;
				case 1:
				case 2:
				case 3: {
					System.out.print(" " + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
					break;
				case 4: {
					System.out.print("|" + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
					break;
				case 5:
				case 6: {
					System.out.print("|" + printWhiteSpace(size) + " ");
					System.out.print(" ");
				}
					break;
				case 7: {
					System.out.print(" " + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
				case 8:
				case 9: {
					System.out.print("|" + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
					break;
				}
			} 
			System.out.println();
		}

	}

	// Display line 3
	public static void printLine3(int number, int size) {
		int[] digits = getDigits(number);

		for (int i = 0; i < digits.length; i++) {
			switch (digits[i]) {
			case 0: 
			case 1: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(' ');
				}
				System.out.print("  ");
			}
				break;
			case 2:
			case 3: 
			case 4: 
			case 5:
			case 6: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print('-');
				}
				System.out.print("  ");
			}
				break;
			case 7: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(' ');
				}
				System.out.print("  ");
			}
				break;
			case 8:
			case 9: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print('-');
				}
				System.out.print("  ");
			}
				break;
			}
		}
	}

	// Display line 4
	public static void printLine4(int number, int size) {
		int[] digits = getDigits(number);

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < digits.length; j++) {
				switch (digits[j]) {
				case 0: {
					System.out.print("|" + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
					break;
				case 1: {
					System.out.print(" " + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
					break;
				case 2: {
					System.out.print("|" + printWhiteSpace(size) + " ");
					System.out.print(" ");
				}
					break;
				case 3: 
				case 4: 
				case 5: {
					System.out.print(" " + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
					break;
				case 6: {
					System.out.print("|" + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
					break;
				case 7: {
					System.out.print(" " + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
				break;
				case 8: {
					System.out.print("|" + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
				break;
				case 9: {
					System.out.print(" " + printWhiteSpace(size) + "|");
					System.out.print(" ");
				}
					break;
				}
			} 
			System.out.println();
		}

	}

	// display line 5
	public static void printLine5(int number, int size) {
		int[] digits = getDigits(number);

		for (int i = 0; i < digits.length; i++) {
			switch (digits[i]) {
			case 0: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print('-');
				}
				System.out.print("  ");
			}
				break;
			case 1: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(' ');
				}
				System.out.print("  ");
			}
				break;
			case 2:
			case 3: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print('-');
				}
				System.out.print("  ");
			}
				break;
			case 4: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(' ');
				}
				System.out.print("  ");
			}
				break;
			case 5:
			case 6: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print('-');
				}
				System.out.print("  ");
			}
				break;
			case 7: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(' ');
				}
				System.out.print("  ");
			}
				break;
			case 8:
			case 9: {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print('-');
				}
				System.out.print("  ");
			}
				break;
			}
		}

	}

	// get array of digits
	static int[] getDigits(int number) {
		String numberStr = number + "";
		int[] digits = new int[numberStr.length()];

		for (int i = digits.length-1; i >=0; i--) {
			digits[i] = number%10;
			number =number/10;
		}
		return digits;
	}
	
	// print white space for vertical lines
	private static String printWhiteSpace(int size) {
		String s = "";
		for (int i = 0; i < size; i++) {
			s += " ";
		}
		return s;
	}
}