package zadaci_03_03_2017;

public class MyPoint {
	// data fields
	private double x;
	private double y;
	
	// default constructor and constructor with parameters
	public MyPoint (){
		this(0,0);
	}
	
	public MyPoint (double x, double y){
		this.x=x;
		this.y=y;
	}

	// getter methods
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	// method that returns distance between MyPoint object that called the method and MyPoint object that was passed as parameter
	public double distance (MyPoint point1){
		return Math.pow((Math.pow(point1.x-x, 2) + Math.pow(point1.y-y, 2)), 0.5);
	}
}
