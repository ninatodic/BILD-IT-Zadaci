package zadaci_15_03_2017;

import java.util.ArrayList;

public class Course implements Cloneable {
	private String courseName;
	private int numberOfStudents;
	private  ArrayList <String>students = new ArrayList<>();
	

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students.add(student);
		numberOfStudents++;
	}

	public ArrayList<String> getStudents() {
		return students;
	}


	public int getNumberOfStudents() {
		return numberOfStudents;
	}


	public String getCourseName() {
		return courseName;
	}

	@Override //Override the protected clone method defined in the Object class
	public Course clone() throws CloneNotSupportedException {
		// Perform a shallow copy
		Course courseClone =	(Course)super.clone();
		// Deep copy on students
		courseClone.students = (ArrayList<String>) students.clone();
		return courseClone;
	}

	public void dropStudent(String student) {
		students.add(student);
		numberOfStudents--;
	}

	
}
