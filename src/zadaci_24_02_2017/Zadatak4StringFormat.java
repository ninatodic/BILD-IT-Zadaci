package zadaci_24_02_2017;

public class Zadatak4StringFormat {

	public static void main(String[] args) {
		// invoking format method with different parameters
		System.out.println(format(34,4));
		System.out.println(format(34,5));
		System.out.println(format(34,1));
		
	}
	
	// method that returns first number formated in the length of second number by adding 0s
	public static String format(int number, int width){
		String stringNumber = number + "";
		String stringNumberFormated = stringNumber;
		if(stringNumber.length()>=width){ // if width is smaller than number
			return stringNumber;
		}
		else{
			for (int i = 0; i < (width-stringNumber.length()); i++) {
				stringNumberFormated = "0" + stringNumberFormated;
			}
			return stringNumberFormated;
		}
	}

}
