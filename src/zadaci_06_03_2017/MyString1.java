package zadaci_06_03_2017;

import java.util.ArrayList;

public class MyString1 {
	
	private char[] chars;

	// Constructor
	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}


	// Methods that returns the character at the specified index 
	public char charAt(int index) {
		return chars[index];
	}

	// Methods that returns length 
	public int length() {
		return chars.length;
	}

	// Methods that returns a substring of string 
	public MyString1 substring(int begin, int end) {
		char[] ch = new char[end - begin];
		for (int i = begin, j = 0; i < end; i++, j++) {
		 	ch[j] = chars[i];
		}
		return new MyString1(ch); 
	}

	// Methods that returns new MyString1 in lower case
	public MyString1 toLowerCase() {
		char[] ch = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z')
				ch[i] = (char)(chars[i] + 32);
			else
				ch[i] = chars[i];
		}
		return new MyString1(ch);
	}

	// Methods that returns true if the two strings are equal 
	public boolean equals(MyString1 s) {
		if (chars.length != s.length())
			return false;
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] != s.charAt(i))
				return false;
		}
		return true;
	}

	// Methods that returns i as a MyString object 
	public static MyString1 valueOf(int i) {
		ArrayList<Integer> digits = new ArrayList<>();
		while(i != 0){ // add digits to list
			digits.add(i % 10);
			i /= 10;
		}

		// create char array
		char[] ch = new char[digits.size()];
		//fill in the array
		for(int j = digits.size()-1,  k =0; j >=0; j--, k++) {
		    ch[k] = (char)(digits.get(j) + '0');
		}
		
		return new MyString1(ch);
	}
	
	
}
