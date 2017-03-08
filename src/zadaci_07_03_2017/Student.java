package zadaci_07_03_2017;

public class Student extends Person {
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

	// constructor with parameters
	public Student(String name, String address,  
		String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	// getter and setter methods
	public void setStatus(int status) {
		this.status = status; 
	}

	public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}

	// Method that returns string description of the class 
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}
