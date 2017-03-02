package zadaci_02_03_2017;

public class IntersectingPoint {
	double x1;
	double y1;
	double x2;
	double y2;
	double x3;
	double y3;
	double x4;
	double y4;
	double a;
	double b;
	double c;
	double d;
	double e;
	double f;
	LinearEquation intersecting;
	
	public IntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		intersecting = new LinearEquation(getA(), getB(), getC(), getD(), getE(), getF());

	}

	public double getA() {
		return y1 - y2;
	}

	public double getB() {
		return x1 - x2;
	}

	public double getC() {
		return y3-y4;
	}

	public double getD() {
		return x3-x4;
	}

	public double getE() {
		return (y1 - y2) * x1 - (x1 - x2) * y1;
	}

	public double getF() {
		return (y3 - y4) * x3 - (x3 - x4) * y3;
	}

	
	
	
	public boolean areInersecting (){
		if (intersecting.isSolvable()){
			return true;
		}
		return false;
	}
	
	public double coordinateX(){
		return intersecting.getX();
	}
	
	public double coordinateY(){
		return intersecting.getY();
	}
}
