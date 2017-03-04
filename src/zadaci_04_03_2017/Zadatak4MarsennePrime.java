package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak4MarsennePrime {

	public static void main(String[] args) {
		// print header
		System.out.println("p       2^p - 1");

		// Display all M. primes with p<100
		for (BigInteger p = new BigInteger("2"); p.compareTo(new BigInteger("100")) <= 0; p = p
				.add(new BigInteger("1"))) {
			if (isPrime(p)) {
				System.out.printf("%-3d", p);
				System.out.println("       " + mersennePrime(p));
			}
		}
	}

	// Method that returns the mersenne prime of n */
	public static BigInteger mersennePrime(BigInteger n) {
		BigInteger two = new BigInteger("2");
		BigInteger x = new BigInteger("2");
		for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0; i = i.add(new BigInteger("1"))) {
			x = x.multiply(two);
		}
		return x.subtract(new BigInteger("1"));
	}

	// Method that returns true if BigIntegerIsPrime is prime 
	public static boolean isPrime(BigInteger n) {
		if(n.isProbablePrime(100)) {
			return true;
		}
		return false;
	}
}
