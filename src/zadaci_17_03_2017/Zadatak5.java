package zadaci_17_03_2017;

public class Zadatak5 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(sumF(i));
		}
	}
	
	// method that returns sum of fraction series 1/2+ 2/3 + 3/4 + ...i/i+1
	public static double sumF(double i){
		if (i == 1) // Base case
			return 1.0/2; 
		else
			return  i / (i+1) + sumF(i - 1); // Recursive call
	}

}
