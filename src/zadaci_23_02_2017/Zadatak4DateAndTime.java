package zadaci_23_02_2017;

import java.util.Date;

public class Zadatak4DateAndTime {

	public static void main(String[] args) {
		String dateAndTIme = returnDateAndTime();
		// print current date and time
		System.out.println(dateAndTIme);
	}
	
	// method that returns current date and time
	public static String returnDateAndTime(){
		// Create Date object
	      Date date = new Date();

	      String DateAndTime = date.toString();
	      return DateAndTime;
	}
}
