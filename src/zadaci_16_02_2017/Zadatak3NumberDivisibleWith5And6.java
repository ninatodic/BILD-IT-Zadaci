package zadaci_16_02_2017;

public class Zadatak3NumberDivisibleWith5And6 {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Numbers ranging from 100 to 1000 that are divisible with 5 and 6 are: ");
		System.out.println();
		
		// loops trough all the numbers from 100 to 1000 printing those that are divisible with 5 and 6
		for (int i = 100; i<=1000; i++){
			if ((i%5==0)&&(i%6==0)){
				count++;
				if(count%10==0){
					System.out.println(i);
				}
				else{
					System.out.print(i + " ");
				}
			}
		}
	}

}
