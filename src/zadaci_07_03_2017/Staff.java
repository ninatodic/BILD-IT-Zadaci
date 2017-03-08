package zadaci_07_03_2017;

public class Staff extends Employee{
	private String title;

	// Constructor with parameters
	public Staff(String name, String address, String phone,  
		String email, int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

	// getter and setter methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// Method that returns string description of the class 
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}
