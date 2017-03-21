package zadaci_17_03_2017;

public class Zadatak3SumFraction1 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(sumF(i));
		}
	}
	
	// method that returns sum of fraction series 1+ 1/2 + 1/3 + ...1/i
	public static double sumF(double i){
		if (i == 1) // Base case
			return 1; 
		else
			return  1 / i + sumF(i - 1); // Recursive call
	}
}
