package zadaci_15_03_2017;

public class Circle extends GeometricObject implements Comparable<Circle>{
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

	// method that compares two circles
	@Override
	public int compareTo(Circle a) {
		if(radius>a.radius){
			return 1;
		}else if(radius<a.radius){
			return -1;
		}else{
			return 0;
		}
	}
	
	// method that returns true if two circles have same diameter
	@Override
	public boolean equals(Object o) {
		return this.compareTo((Circle)o) == 0;
	}
	
}
