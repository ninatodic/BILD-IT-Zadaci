package zadaci_15_03_2017;

public abstract class GeometricObject {
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

	@Override // override toString method
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}


	//Abstract method getArea 
	public abstract double getArea();

	//Abstract method getPerimeter 
	public abstract double getPerimeter();
}
