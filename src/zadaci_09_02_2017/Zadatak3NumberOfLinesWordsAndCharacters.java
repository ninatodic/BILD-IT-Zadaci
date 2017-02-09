package zadaci_09_02_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak3NumberOfLinesWordsAndCharacters {

	public static void main(String[] args)   {
		// declaring and initializing variables

		String fileName = args[0];
		Path path = Paths.get(fileName);
		int countLines = 0;
		int countWords = 0;
		int countChars = 0;

		// wrapping the code in try and catch block 
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String line;

			//counting the lines, words and characters
			while ((line = reader.readLine()) != null) {
				countLines++;
				String[] words = line.split(" ");
				countWords += words.length;

				countChars += line.length();
			}

			// Printing the lines, words and characters
			System.out.println("Number of lines is " + countLines);
			System.out.println("Number of words is " + countWords);
			System.out.println("Number of characters is " + countChars);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
