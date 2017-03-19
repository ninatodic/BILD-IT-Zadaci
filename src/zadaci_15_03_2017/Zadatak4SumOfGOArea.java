package zadaci_15_03_2017;

public class Zadatak4SumOfGOArea {

	public static void main(String[] args) {

		GeometricObject[] a = { new Circle(5), new Circle(7), new Rectangle(4, 5), new Rectangle(3, 4) };

		System.out.println("Sum of all objects area is " + sumArea(a));

	}

	public static double sumArea(GeometricObject[] a) {
		double sumArea = 0;
		for (int i = 0; i < a.length; i++) {
			sumArea += a[i].getArea();
		}
		return sumArea;
	}

}
