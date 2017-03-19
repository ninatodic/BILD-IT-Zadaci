package zadaci_15_03_2017;

public class Zadatak1Test {

	public static void main(String[] args) {
		Circle circle1 = new Circle(5, "red", true);
		Circle circle2 = new Circle(5, "green", false);
		Circle circle3 = new Circle(4, "green", false);

		

		System.out.println("Circle1 which has radius of " + circle1.getRadius() + " is " + (circle1.equals(circle2) ? "" : "not ") +
			"equal to circle2 which has radius of " + circle2.getRadius());

		System.out.println("Circle1 which has radius of " + circle1.getRadius() + " is " + (circle1.equals(circle3) ? "" : "not ") +
			"equal to circle3 which has radius of " + circle3.getRadius());
	}

}
