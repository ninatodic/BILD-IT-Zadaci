package zadaci_14_03_2017_2Dio;

public class Square extends GeometricObject implements Colorable{
	private double a;
	
	// default constructor and constructors with parameters
	public Square(){
	}
	
	public Square(double a){
		this.a = a;
	}
	
	public Square(double a, String color, boolean filled) {
		this.a = a;
		setColor(color);
		setFilled(filled);
	}
	
	// getters and setters
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override// override method from Colorable interface
	public void howToColor() {
		System.out.println("Color all four sides");
	}

	@Override // override abstract method getArea
	public double getArea() {
		return a*a;
	}

	@Override // override abstract method getPerimeter
	public double getPerimeter() {
		return 4*a;
	}
	
	@Override // override toString and return String description of Square object 
	public String toString() {
		return super.toString() + "\nSide: " + a + "\nArea: " + getArea() +  "\nPerimeter: " + getPerimeter();
	}

}
