 package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak3LargePrimeNumbers {

	public static void main(String[] args) {
		System.out.println("5 prime numbers larger than maximum long value are");
		
		int count = 0;
		long k = Long.MAX_VALUE;
		String s = k + "";
		BigInteger p = new BigInteger(s);
		p = p.add(new BigInteger("1"));
		
		while (count<5){
			if(p.isProbablePrime(100)){
				System.out.println(p);
				count++;
			}
			p = p.add(new BigInteger("1"));
		}
	}

}
