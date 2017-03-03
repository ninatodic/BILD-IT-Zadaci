package zadaci_03_03_2017;

public class MyInteger {
	// data field
	int value = 0;
	
	// constructor with parameter
	public MyInteger(int value){
		this.value = value;
	}
	
	// getter method
	public int getInt (){
		return value;
	}
	
	// method that checks if MyInteger object is even
	public boolean isEven(){
		if (value%2==0){
			return true;
		}
			return false;
	}
	
	// method that checks if MyInteger object is odd
	public boolean isOdd(){
		if (value % 2 == 0){
			return false;
		}
		return true;
	}
	
	// method that checks if MyInteger object is prime
	public boolean isPrime(){
		for (int i = 2; i<value; i++){
			if(value/i==0){
				return false;
			}
		}
		return true;
	}
	
	// Static method that checks if integer entered as parameter is even
	public static boolean isEven(int number){
		if (number%2==0){
			return true;
		}
			return false;
	}
	
	// Static method that checks if integer entered as parameter is odd
	public static boolean isOdd(int number){
		if (number % 2 == 0){
			return false;
		}
		return true;
	}
	
	// Static method that checks if integer entered as parameter is prime
	public static boolean isPrime(int number){
		for (int i = 2; i<number; i++){
			if(number/i==0){
				return false;
			}
		}
		return true;
	}
	
	// Static method that checks if MyInteger object entered as parameter is even
	public static boolean isEven(MyInteger number1){
		if (number1.getInt()%2==0){
			return true;
		}
			return false;
	}
	// Static method that checks if MyInteger object entered as parameter is odd
	public static boolean isOdd(MyInteger number1){
		if (number1.getInt() % 2 == 0){
			return false;
		}
		return true;
	}
	
	// Static method that checks if MyInteger object entered as parameter is prime
	public static boolean isPrime(MyInteger number1){
		for (int i = 2; i<number1.getInt(); i++){
			if(number1.getInt()/i==0){
				return false;
			}
		}
		return true;
	}
	
	// method that checks if number entered as parameter is even to MyInteger object that calls the method
	public boolean equal (int number){
		if (value == number){
			return true;
		}
		return false;
	}
	
	// method that checks if MyInteger object entered as parameter is even to MyInteger object that calls the method
	public boolean equal(MyInteger number1){
		if (value == number1.getInt()){
			return true;
		}
		return false;
	}
	
	// Static method that return int representation of array of characters
	public static int parseInt(char[] ch){
		int result=0;
	    for(int i=0;i<ch.length;i++){
	        result=result*10+(Character.getNumericValue(ch[i]));
	    }
	    return result;
	}
	
	// Static method that return int representation of string
	public static int parseInt(String s){
		int a =0;
		try {
		      a = Integer.parseInt(s);
		} catch (NumberFormatException e) {
		     System.out.println("To use this function you have to enter string that is a number, otherwise it will return 0.");
		}
		return a;
	}
	
}
