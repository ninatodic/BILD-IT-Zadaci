package zadaci_07_03_2017;

public class Circle {
	private double radius = 1;
	private static int numberOfObjects = 0;

	// default constructor
	public Circle() {
		numberOfObjects++;
	}

	// constructor with parameters
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	// getter and setter methods
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	// method that returns area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public String toString(){
		return "Circle with radius " + radius + " has and area of " + getArea();
	}
}
