package zadaci_06_03_2017;

public class MyString2 {
	// Data fields
	private String s;

	// constructor
	public MyString2(String s) {
		this.s = "";
		for (int i = 0; i < s.length(); i++) {
			this.s += s.charAt(i) + "";
		}
	}

	// method that returns an integer greater than 0, equal to 0, or less than 0
	// to indicate
	// whether this string is greater than, equal to, or less than this s
	public int compare(String s) {
		int index = 0;
		if (this.s.length() < s.length())
			index = -1;
		if (s.length() < this.s.length())
			index = 1;

		for (int i = 0; i < this.s.length(); i++) {
			if (this.s.charAt(i) < s.charAt(i))
				index = -(i + 1);
			if (this.s.charAt(i) > s.charAt(i))
				index = i + 1;
		}
		return index;
	}

	// Method that returns a new MyString2 object that is a substring with a
	// specified beginning index
	public MyString2 substring(int begin) {
		String b = "";
		for (int i = begin; i < s.length(); i++) {
			b += s.charAt(i) + "";
		}
		return new MyString2(b);
	}

	// Method that returns a new MyString2 object in upper case 
	public MyString2 toUpperCase() {
		String n = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				n += String.valueOf((char) (s.charAt(i) - 32));
			else
				n += String.valueOf(s.charAt(i));
		}
		return new MyString2(n);
	}

	// Method that returns string as an array of characters
	public char[] toChars() {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}

	// Method that returns the boolean value as a MyString2 object
	public static MyString2 valueOf(boolean b) {
		if (b){
			return new MyString2("true");
		}
		else{
			return new MyString2("false");
		}
	}
}
