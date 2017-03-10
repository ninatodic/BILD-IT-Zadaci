package zadaci_10_03_2017;

public class Zadatak1Bin2Dec {

	public static void main(String[] args) {
		// create string that holds binary number
		String binaryString = "10010";
		// try to covert it into decimal number, if it is not a binary
		// representation of a number throw exception
		try {
			System.out.println(bin2Dec(binaryString));
		} catch (NumberFormatException e) { // catch exception
			System.out.println("The string is not a binary string");
		}

	}

	// method that returns decimal value  form binary string
	public static int bin2Dec(String binaryString) throws NumberFormatException {
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
				throw new NumberFormatException("The string is not a binary string");
		}
		int decimal = Integer.parseInt(binaryString, 2);
		return decimal;
	}

}
