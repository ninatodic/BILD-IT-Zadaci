package zadaci_14_02_2017;

public class MinimumRunwayLength {
	double a;
	double v;

	public MinimumRunwayLength(double a, double v) {
		this.a = a;
		this.v = v;
	}
	
	// method that returns minimum runway length
	public double getMinimumRunwayLength(){
		return (v*v)/(2*a);
	}
}
