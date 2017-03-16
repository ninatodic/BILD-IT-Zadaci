package zadaci_14_03_2017_2Dio;


public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	//default constructor and constructors with parameters
	public ComparableCircle() {
	}

	public ComparableCircle(double radius) {
		super(radius);
	}

	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
	}

	@Override // Implement the compareTo method defined in Comparable
	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override // Implement the toString method defined in Circle
	public String toString() {
		return super.toString() + "\nArea: " + getArea();
	}
}
