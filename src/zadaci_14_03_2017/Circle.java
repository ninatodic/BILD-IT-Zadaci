package zadaci_14_03_2017;

public class Circle extends GeometricObject {
	private double radius;

	//default constructor and constructors with parameters
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	// getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// method that returns area 
	@Override 
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// method that returns diameter
	public double getDiameter() {
		return 2 * radius;
	}

	// method that returns perimeter
	@Override 
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// method that returns String description of Circle object 
	@Override 
	public String toString() {
		return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() + "\nDiameter: " + getDiameter()
				+ "\nPerimeter: " + getPerimeter();
	}
}
