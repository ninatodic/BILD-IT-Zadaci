package zadaci_03_03_2017;

public class Time {
	// data fields
	private int hour;
	private int minute;
	private int second;
	
	// Default constructor and constructors with parameters
	public Time(){
		this(System.currentTimeMillis());
	}
	
	public Time (long milliseconds){
		long seconds = milliseconds/1000;
		 second = (int)(seconds%60);
		long minutes = seconds/60;
		 minute = (int)(minutes%60);
		long hours = minutes/60;
		 hour = (int)(hours%24);
	}
	
	public Time (int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// getter methods
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	// Method that sets time
	public void setTIme(long milliseconds){
		long seconds = milliseconds/1000;
		 second = (int)(seconds%60);
		long minutes = seconds/60;
		 minute = (int)(minutes%60);
		long hours = minutes/60;
		 hour = (int)(hours%24);
	}
}
