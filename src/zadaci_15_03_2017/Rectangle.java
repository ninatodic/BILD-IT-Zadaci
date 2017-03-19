package zadaci_15_03_2017;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
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


	// method that compares two rectangle
	@Override
	public int compareTo(Rectangle o) {
		if(getArea()>o.getArea()){
			return 1;
		}else if(getArea()<o.getArea()){
			return -1;
		}else{
			return 0;
		}
			
	}
	
	// method that returns true if two rectangles are the same
	@Override
	public boolean equals(Object o) {
		return this.compareTo((Rectangle)o) == 0;
	}
}
