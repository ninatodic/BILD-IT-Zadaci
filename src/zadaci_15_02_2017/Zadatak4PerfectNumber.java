package zadaci_15_02_2017;

public class Zadatak4PerfectNumber {

	public static void main(String[] args) {
		int sum = 0;
		
		// nested loop that prints out perfect number
		for (int j = 1; j < 10000; j++) {
			for (int i = 1; i < j; i++) {
				if (j % i == 0) {
					sum = sum + i;
				}
			}
			if (j == sum) {
				System.out.println(j);
			}

			sum = 0;
		}
	}

}
