package zadaci_02_03_2017;

public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	public Fan(){
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public boolean getOn (){
		return on;
	}
	public void turnOn(boolean onOrOf){
		if (onOrOf == true){
			on = true;
		}
		else{
			on = false;
		}
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public String getColor (){
		return color;
	}
	
	public void setColor (String color){
		this.color = color;
	}
	
	public String toString(){
		String response = "";
		if (on){
			response = "The fan speed is " + getSpeed() + ", its color is " 
					+ getColor() + ", and its radius is " + getRadius();
		}
		else {
			response = "The fan color is " + getColor() + ", its radius is " + getRadius() + " and the fan is off.";
		}
		return response;
	}
	
}
