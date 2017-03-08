package zadaci_07_03_2017;

public class Zadatak2PersonTest {

	public static void main(String[] args) {
		// Create a Person, Student, Employee, Faculty, and Staff objects
				Person person = new Person("Goran", "Sv. Save 34", 
					"065985632", "goran@gmail.com");

				Student student = new Student("Marija", "Ive Andrica 35", "066589555", 
					"marija@gmail.com", Student.FRESHMAN);

				Employee employee = new Employee("Zoran", "Stadionska 23", "066954123",
					"zoran80@gmail.com", 910, 60000);

				Faculty faculty = new Faculty("Sandra", "26. Avgusta 89", "065852369",
					"sandra@gmail.com", 101, 50000, "4pm to 6pm", "Professor");

				Staff staff = new Staff("Sanja", "Ive Andrica 56", "066325523",
					"sanja@gmail.com", 12, 65000, "Secretary");

				// Invoke toString of Person, Student, Employee, Faculty and Staff
				System.out.println(person.toString());
				System.out.println(student.toString());
				System.out.println(employee.toString());
				System.out.println(faculty.toString());
				System.out.println(staff.toString());
			}
	

}
