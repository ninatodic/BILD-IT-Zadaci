package zadaci_11_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Zadatak4ProcesScoresWeb {

	public static void main(String[] args) throws IOException {
		// Create a URL object
		try{
		java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");

		// initialize sum variable and create arrayList to store individual
		// scores
		int sum = 0;
		ArrayList<Integer> number = new ArrayList<>();

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = in.readLine()) != null) {
				if (line.length() > 0) {
					String[] words = line.split(" ");

					for (int i = 0; i < words.length; i++) {
						System.out.print(words[i] + " ");
						number.add(Integer.parseInt(words[i]));
						sum += number.get(i);
					}
				}
			}

			System.out.println("\nTotal of scores: " + sum);
			System.out.println("Their average is: " + (sum / number.size()));

		} catch (java.io.IOException ex) {
			System.out.println("I/0 Errors: no such file");
		}
	}

}
