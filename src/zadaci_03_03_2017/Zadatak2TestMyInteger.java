package zadaci_03_03_2017;

public class Zadatak2TestMyInteger {

	public static void main(String[] args) {
		// create two MyInteger objects
		MyInteger mi1 = new MyInteger (5);
		MyInteger mi2 = new MyInteger (127);
		
		// invoke every method that exist in MyInteger class
		System.out.println(mi1.isEven());
		System.out.println(mi1.isOdd());
		System.out.println(mi1.isPrime());
		System.out.println();
		
		System.out.println(MyInteger.isEven(7));
		System.out.println(MyInteger.isOdd(7));
		System.out.println(MyInteger.isPrime(7));
		System.out.println();
		
		System.out.println(MyInteger.isEven(mi2));
		System.out.println(MyInteger.isOdd(mi2));
		System.out.println(MyInteger.isPrime(mi2));
		System.out.println();
		
		System.out.println(mi1.equal(3));
		System.out.println(mi1.equal(mi2));
		
		char[] ch = {'a', '2', 'c'};
		System.out.println(MyInteger.parseInt(ch));
		
		String s = "123";
		String a = "hgd23";
		
		System.out.println(MyInteger.parseInt(s));
		System.out.println(MyInteger.parseInt(a));
	}

}
