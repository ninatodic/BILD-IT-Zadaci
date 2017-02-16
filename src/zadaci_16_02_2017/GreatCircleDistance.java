package zadaci_16_02_2017;

public class GreatCircleDistance {
	private double x1;
	private double y1;
	private double x2;
	private double y2;

	public GreatCircleDistance(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// returns the distance for designated points
	public double getDistance() {
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		return (6371.01  * Math.acos (Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
	}
	
	

}
