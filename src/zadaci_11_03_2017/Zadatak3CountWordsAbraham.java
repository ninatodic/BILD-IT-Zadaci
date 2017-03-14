package zadaci_11_03_2017;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak3CountWordsAbraham {

	public static void main(String[] args) {
		try {
			// Create a URL object
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");

			int count = 0; // Counts words

			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = in.readLine()) != null) {
				if (line != null && line.length() > 0) {
					String[] words = line.split(" "); // split words 

					for (int j = 0; j < words.length; j++) {

						// count words if they start with letter
						if (Character.isLetter(words[j].charAt(0))) {
							count++;
						}
					}
				}
			}

			// Display result
			System.out.println("Number of words in President Abraham Lincoln's Gettysburg address: " + count);

		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/0 Errors: no such file");
		}

	}

}
