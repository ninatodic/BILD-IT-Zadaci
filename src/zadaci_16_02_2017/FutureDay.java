package zadaci_16_02_2017;

public class FutureDay {
	private static String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	// returns today's day
	public static String getTodayDay(int today) {
		return daysOfTheWeek[today];
	}

	// returns future day
	public static String getFutureDay(int today, int futureDay) {
		int indexOfFutureDay = (today+futureDay)%7;
		return daysOfTheWeek[indexOfFutureDay];
	}

}
