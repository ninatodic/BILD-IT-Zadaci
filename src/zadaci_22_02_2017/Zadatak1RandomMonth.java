package zadaci_22_02_2017;

public class Zadatak1RandomMonth {

	public static void main(String[] args) {
		// create array of months to read from
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		
		// randomly chose number
		int month = (int)(1+ Math.random()*12);
		
		// use random number as index for array of months
		System.out.println(months[month-1]);
	}

}
