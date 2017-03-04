package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak1BigIntegerDivisibleWith2and3 {

	public static void main(String[] args) {
		System.out.println("BigIntegers divisible with 2 or 3 are: ");
		
		int count = 0;
		// create bigInteger object with 50 digits and one with value 0
		BigInteger n = new BigInteger("10000000000000000000000000000000000000000000000000");
		BigInteger z = new BigInteger("0");

		// check if z (0) is equal to reminder from n divided with 2 or 3 and print n if it is
		while (count < 10) {
			if (z.compareTo(n.remainder(new BigInteger("2"))) == 0 || 
				z.compareTo(n.remainder(new BigInteger("3"))) == 0) {
				System.out.println(n);
				count++;
			}
			n = n.add(new BigInteger("1")); // add one to n
		}
	}

}
