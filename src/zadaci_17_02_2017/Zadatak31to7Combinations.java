package zadaci_17_02_2017;

public class Zadatak31to7Combinations {

	public static void main(String[] args) {
		// possible combinations of numbers from 1 to 7 
		for (int i= 1; i<8;i++){
			for (int j = i + 1; j < 8; j++) {
				if (i==j){
					continue;
				}
				else{
					System.out.println(i + " " + j);
				}
			}
		}
	}

}
