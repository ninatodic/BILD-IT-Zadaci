package zadaci_02_03_2017;

public class Zadatak2TestRegularPolygon {

	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon(6,4);
		RegularPolygon polygon2 = new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println("The perimeter of polygon1 is " + polygon1.getPerimeter() + ", and its area is " + polygon1.getArea());
		System.out.println("The perimeter of polygon2 is " + polygon2.getPerimeter() + ", and its area is " + polygon2.getArea());

	}

}
