package zadaci_16_02_2017;

public class Zadatak5MillisecondsInHours {

	public static void main(String[] args) {
		System.out.println(convertMillis(100000));
	}
	
	// returns the string that prints milliseconds in hours
	public static String convertMillis(long millis){
		long seconds = millis/1000;
		int secondsRemaining = (int)(seconds%60);
		long minutes = seconds/60;
		int minutesRemaining = (int)(minutes % 60);
		long hours = minutes/24;
		
		return millis + " milliseconds is " + hours + ":" + minutesRemaining + ":" + secondsRemaining;
		
	}

}
