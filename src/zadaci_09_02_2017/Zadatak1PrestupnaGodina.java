package zadaci_09_02_2017;

public class Zadatak1PrestupnaGodina {

	public static void main(String[] args) {
		// declaring and initializing variables
		final int YEARS_PER_ROW = 10; 
		int countPerRow = 0;
		int count=0;
		
		//Printing out leaping years 10 per row
		for (int i = 101; i<=2100; i++){
			if (isLeapYear(i)){ //invoking method that checks for every i, if it is a leap year
				countPerRow++;
				if (countPerRow%YEARS_PER_ROW==0){
					System.out.println(i);
				}
				else{
					System.out.print(i + " ");
				}
				count++;
			}
		}
		
		// printing out total number of leaping years
		System.out.println();
		System.out.println("Number of leap years from 101 to 2100 is " + count);
	}
	
	// Returns true if the year is leap year
	public static boolean isLeapYear (int year){
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
			return true;
		}
		else{
			return false;
		}
	}

}
