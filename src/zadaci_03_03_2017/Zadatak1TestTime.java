package zadaci_03_03_2017;

public class Zadatak1TestTime {

	public static void main(String[] args) {
		// create time objects
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		// display objects hour, minute and second
		System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
		System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
		
		
	}

}
