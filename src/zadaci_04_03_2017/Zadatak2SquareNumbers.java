package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak2SquareNumbers {

	public static void main(String[] args) {
		System.out.println("First 10 square numbers larger than maximum long value are: ");
		
		int count = 0;
		// square root of maximum long value 
		long k = (long) Math.sqrt(Long.MAX_VALUE);
		// create bitInteger of that value
		String possibleRoot = k + "";
		BigInteger p = new BigInteger(possibleRoot);
		
		while(count<10){
			// add one to p and multiply it with itself until get 10 of those 
			p = p.add(new BigInteger("1"));
			System.out.println(p.pow(2));
			count++;
		}
	}

}
