package zadaci_14_03_2017;

public class Zadatak2GOComparable {

	public static void main(String[] args) {
		// Create two Circle objects
		Circle circle1 = new Circle(15, "red", true);
		Circle circle2 = new Circle(10, "blue", false);

		// Display circle1
		System.out.println("\nCircle 1: ");
		System.out.println(circle1);

		// Display circle2
		System.out.println("\nCircle 2: ");
		System.out.println(circle2);

		// Display larger circle
		System.out.println("\nThe larger of the two circles is ");
		System.out.println((Circle.max(circle1, circle2).equals(circle1) ? "circle 1" : "circle 2"));

		// Create two Rectangle objects
		Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
		Rectangle rectangle2 = new Rectangle(4.2, 5, "orange", true);

		// Display rectangle1
		System.out.println("\nRectangle 1: ");
		System.out.println(rectangle1);

		// Display rectangle2
		System.out.println("\nRectangle 2: ");
		System.out.println(rectangle2);

		// Display larger rectangle
		System.out.println("\nThe larger of the two rectangles is ");
		System.out.println((Rectangle.max(rectangle1, rectangle2).equals(rectangle1) ? "rectangle 1" : "rectangle 2"));
	}

}
