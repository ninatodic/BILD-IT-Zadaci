package zadaci_15_03_2017;

import java.util.ArrayList;

public class Zadatak5CourseTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Course course1 = new Course("Data Structures");

		// Add three students to course1
		course1.addStudent("Nina Todic");
		course1.addStudent("Milan Zagorac");
		course1.addStudent("Nevena Stojanovic");

		// Clone course1
		Course course2 = course1.clone();

		// Add two students to course2
		course2.addStudent("Aleksandar Vukmirovic");
		course2.addStudent("Nikita Durango");

		// Display students in course1
		System.out.println("\nNumber of students in course1: "
			+ course1.getNumberOfStudents());
		ArrayList<String> students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students.get(i) + ", ");
		System.out.println();

		// Display students in course2
		System.out.println("\nNumber of students in course2: "
			+ course2.getNumberOfStudents());
		ArrayList<String> students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students2.get(i) + ", ");
		System.out.println();
	}

}
