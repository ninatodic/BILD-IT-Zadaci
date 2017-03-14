package zadaci_13_03_2017;

import java.util.ArrayList;

public class Zadatak4ShuffleArrayList {

	public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) list.add(i);

        System.out.println(list);
        System.out.println("Shuffling list...");
        shuffle(list);
        System.out.println(list);
	}
	
	// method that shuffle arrayList
	public static void shuffle(ArrayList<Number> list) {

        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            Number temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }

    }

}
