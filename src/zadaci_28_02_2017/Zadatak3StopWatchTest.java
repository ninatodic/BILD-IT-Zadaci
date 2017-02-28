package zadaci_28_02_2017;

public class Zadatak3StopWatchTest {

	public static void main(String[] args) {
		StopWatch stopWatch1 = new StopWatch();
		int[] array = new int [100000];
		
		for (int i = 0; i < array.length; i++) {
			array[i]= (int)(Math.random() * 100);
		}
		
		stopWatch1.start();
		for (int i = 0; i<array.length-1; i++){
			int currentMin = array[i];
			int currentMinIndex = i;
			
			for(int j = i +1; j<array.length; j++){
				if (currentMin>array[j]){
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex !=i){
				array[currentMinIndex] = array [i];
				array[i] = currentMin;
			}
		}
		
		stopWatch1.stop();
		
		System.out.println("Time needed for sorting 100 000 random numbers is " + stopWatch1.getElapsedTime() + " milliseconds");
	}

}
