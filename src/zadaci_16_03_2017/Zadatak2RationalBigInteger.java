package zadaci_16_03_2017;

import java.math.BigInteger;

public class Zadatak2RationalBigInteger {
	public static void main (String args[]){
	RationalBI r3 = new RationalBI (new BigInteger("2"), new BigInteger("3"));
	RationalBI r4 = new RationalBI (new BigInteger("1"), new BigInteger("3"));
	
	System.out.println(r3 + " + " + r4 + " = " + r3.add(r4));
	System.out.println(r3 + " - " + r4 + " = " + r3.subtract(r4));
	System.out.println(r3 + " * " + r4 + " = " + r3.multiply(r4));
	System.out.println(r3 + " / " + r4 + " = " + r3.divide(r4));
	System.out.println(r4 + " is " + r4.doubleValue());
	}
}
