package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5ShuffleArray {
	public static void main(String[] args) {
		// Create scanner and an ArrayList
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		// add elements to arrayList
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}

		// Invoke shuffle method
		shuffle(list);

		// Display shuffled list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		input.close();
	}

	// method that returns shuffled list
	private static void shuffle(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            int temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }
	}

}
