package zadaci_15_03_2017;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side;

	//  default constructor and constructors with parameters
	public Octagon() {
	}

	public Octagon(double side) {
		this.side = side;
	}

	public Octagon(double side, String color, boolean filled) {
		this.side = side;
		setColor(color);
		setFilled(filled);
	}

	// getters and setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// method that returns area
	@Override
	public double getArea() {
		return (2 + (4 / Math.sqrt(2)) * side * side);
	}

	// method that returns perimeter
	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		return this.compareTo((Octagon)o) == 0;
	}

	@Override // Override the protected clone in method defined in the Object class, and strengthen its accessiblity
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override //Retrun a String description of this Octagon object 
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}
