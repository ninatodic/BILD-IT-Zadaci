package zadaci_07_03_2017;

public class Faculty extends Employee{
	private String officeHours;
	private String rank;

	// Constructor with parameters
	public Faculty(String name, String address, String phone, String email, 
		int office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	// getter and setter methods
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	// Method that returns string description of the class 
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
}
