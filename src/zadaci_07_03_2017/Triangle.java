package zadaci_07_03_2017;

public class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	// default constructor
	public Triangle(){
	}
	
	// constructor with parameters
	public Triangle (double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// getter and setter methods
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	// method that returns perimeter of triangle
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	// method that returns area of triangle
	public double getArea(){
		double s = getPerimeter()/2;
		return Math.pow(s*(s-side1) * (s-side2) * (s-side3), 0.5);
	}

	// Method that returns string description of the class 
	public String toString (){
		return "Triangle: side1 = "+side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
