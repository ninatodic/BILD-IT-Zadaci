package zadaci_02_03_2017;

public class Zadatak1FanTest {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.turnOn(true);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(fan2.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.turnOn(false);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

}
