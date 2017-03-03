package zadaci_03_03_2017;

public class Zadatak3TestMyPoint {

	public static void main(String[] args) {
		// create two points
		MyPoint point = new MyPoint();
		MyPoint point1 = new MyPoint (10, 30.5);
		
		// display distance by invoking distance method
		System.out.printf("%.2f",point.distance(point1));
	}

}
