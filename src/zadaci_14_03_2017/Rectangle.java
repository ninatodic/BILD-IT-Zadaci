package zadaci_14_03_2017;

public class Rectangle extends GeometricObject {
	private double width;
	private double height;

	//default constructor and constructors with parameters
	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	// getters and setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

	// method that returns area
	@Override 
	public double getArea() {
		return width * height;
	}

	// method that returns area
	@Override 
	public double getPerimeter() {
		return 2 * (width * height);
	}

	// method that returns String description of this rectangle
	@Override
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height + "\nArea: " + getArea() + "\nPerimeter: "
				+ getPerimeter();
	}
}
