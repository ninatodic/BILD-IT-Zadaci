package zadaci_15_03_2017;

public class Zadatk3Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon octagon1 = new Octagon(5);
		
		System.out.println("The area of octagon1 is " + octagon1.getArea());
		System.out.println("The perimeter of octagon1 is " + octagon1.getPerimeter());
		
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		
		System.out.println("The area of octagon2 is " + octagon2.getArea());
		System.out.println("The perimeter of octagon2 is " + octagon2.getPerimeter());
		System.out.println();
		System.out.println("The octagon1 is " + (octagon1.equals(octagon2) ? "" : "not ") +
				"equal to octagon2");
	}

}
