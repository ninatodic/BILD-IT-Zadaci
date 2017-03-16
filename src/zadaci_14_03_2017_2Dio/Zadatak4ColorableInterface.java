package zadaci_14_03_2017_2Dio;

public class Zadatak4ColorableInterface {

	public static void main(String[] args) {
		// Create an array of five GeometricObjects
		GeometricObject[] objects = { new Square(4.5), new Circle(14), new Square(8.2), new Square(12),
				new Circle(10) };

		// Display the area and invoke the howToColor
		// method if GeometricObject is instance of Colorable
		for (int i = 0; i < objects.length; i++) {
			System.out.println("\nObject #" + (i + 1));
			System.out.println("Area: " + objects[i].getArea());
			if (objects[i] instanceof Colorable) {
				System.out.println("How to color: " );
				 ((Square) objects[i]).howToColor();
			}
		}
	}

}
