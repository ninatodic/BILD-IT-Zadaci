package printCalendar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Reminder {
	static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
			"November", "December" };
	
	// adds the reminder in a text file
	public static void addTheReminder(int month, int date, int year, String reminderText) throws IOException{
		Path path = Paths.get("reminder.txt");
		if (!Files.exists(path)){
			Files.createFile(path);
		}
		
		BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
		writer.write(months[month-1] + " ");
		writer.write(year + " - ");
		writer.write(reminderText);
		writer.newLine();
		writer.close();
	}
// prints all reminders
	public static void printAllReminders() throws IOException {
		Path path = Paths.get("reminder.txt");
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
	}
}
	// prints reminders for designated month 
	public static void printReminderForDesignatedMonth(int month) throws IOException {
		Path path = Paths.get("reminder.txt");
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String line;

			while ((line = reader.readLine()) != null) {
				if (line.indexOf(months[month-1]) >= 0){
					System.out.println(line);
				}
			}
	}
}
}
