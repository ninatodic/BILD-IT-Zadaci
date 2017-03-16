package zadaci_14_03_2017;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

	//default constructor and constructors with parameters
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	// method that returns String description of  object
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}

	// Implement the compareTo method defined in Comparable
	@Override 
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	//Static method getMax 
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if( o1.compareTo(o2) == 1){
			return o1;
		}
		return o2;
	}

	//Abstract method getArea 
	public abstract double getArea();

	// Abstract method getPerimeter 
	public abstract double getPerimeter();

}
