package zadaci_17_03_2017;

public class Zadatak4SumFraction2 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(sumF(i));
		}
	}
	
	// method that returns sum of fraction series 1/3+ 2/5 + 3/7 + ...i/2*i+1
	public static double sumF(double i){
		if (i == 1) // Base case
			return 1.0/3; 
		else
			return  i / (2*i+1) + sumF(i - 1); // Recursive call
	}

}
