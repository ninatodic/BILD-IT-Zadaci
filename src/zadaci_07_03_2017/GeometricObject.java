package zadaci_07_03_2017;

public class GeometricObject {
	private String color = "white";
	private boolean isFilled = true;
	private java.util.Date dateCreated;
	
	// default constructor
	public GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	// getter and setter methods
	public String getColor (){
		return color;
	}
	
	public void setColor (String color){
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}
	
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public java.util.Date getDate() {
		return dateCreated;
	}
	
	
}
