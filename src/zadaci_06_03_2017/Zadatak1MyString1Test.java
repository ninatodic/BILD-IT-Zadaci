package zadaci_06_03_2017;

public class Zadatak1MyString1Test {

	public static void main(String[] args) {
		// declare and initialize two char arrays
		char[] a = { 'w', 'o', 'r', 'd' };
		char[] b = { 'w', 'o', 'r', 'l', 'd' };

		// create two MyString1 objects
		MyString1 string1 = new MyString1(a);
		MyString1 string2 = new MyString1(b);

		// test charAt method
		System.out.println("Test charAt method");
		System.out.println(string1.charAt(2));
		System.out.println(string2.charAt(3));
		System.out.println();

		// test length method
		System.out.println("Test length method");
		System.out.println(string1.length());
		System.out.println(string2.length());
		System.out.println();

		// create two MyString1 objects that will hold substrings and print them
		// out, to test substring method
		System.out.println("Test substring method");
		MyString1 substring1 = string1.substring(1, 3);
		MyString1 substring2 = string2.substring(1, 4);

		for (int i = 0; i < substring1.length(); i++) {
			System.out.print(substring1.charAt(i));
		}
		System.out.println();
		for (int i = 0; i < substring2.length(); i++) {
			System.out.print(substring2.charAt(i));
		}
		System.out.println();
		System.out.println();

		// create MyString1 object that will hold string1 converted to lower
		// case and print it out
		System.out.println("Test toLowerCase method");
		MyString1 lcstring = string1.toLowerCase();
		for (int i = 0; i < lcstring.length(); i++) {
			System.out.print(lcstring.charAt(i));
		}
		System.out.println();
		System.out.println();

		// test equals method
		System.out.println("Test equal method");
		System.out.println(string1.equals(string2));
		System.out.println();

		// test valueOf method
		System.out.println("Test valueOf method");
		MyString1 stringValue = MyString1.valueOf(45);
		for (int i = 0; i < stringValue.length(); i++) {
			System.out.print(stringValue.charAt(i));
		}
		System.out.println();
	}

}
