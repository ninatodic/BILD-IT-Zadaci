package zadaci_06_03_2017;

public class Zadatak2MyString2Test {

	public static void main(String[] args) {
		// Create two MyStirng2 objects
		MyString2 str1 = new MyString2("try");
		MyString2 str2 = new MyString2("something");

		// Test compare method
		System.out.println("Test compare method");
		System.out.println(str1.compare("test"));
		System.out.println();

		// Test substring method
		System.out.println("Test substring method");
		print(str2.substring(3));
		System.out.println();

		// Test toUpperCase method
		System.out.println("Test toUpperCase method");
		print(str2.toUpperCase());
		System.out.println();

		// Test valueOf method
		System.out.println("Test valueOf method");
		print(MyString2.valueOf(true)); 
	}

	// method that prints MyString2 objects by invoking toChar method
	public static void print(MyString2 str) {
		print(str.toChars());
	}

	// method that prints array of chars that represent MyString2 object
	public static void print(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
	}
	

}
