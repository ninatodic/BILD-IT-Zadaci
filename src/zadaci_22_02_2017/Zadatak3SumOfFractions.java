package zadaci_22_02_2017;

public class Zadatak3SumOfFractions {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i< 98; i+=2){
			sum += i*1.0/(i+2);
		}
		
		System.out.println(sum);
	}

}
