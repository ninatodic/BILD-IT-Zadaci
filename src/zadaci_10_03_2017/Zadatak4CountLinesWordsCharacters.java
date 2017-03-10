package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak4CountLinesWordsCharacters {

	public static void main(String[] args) {
		String fileName = args[0];
		
		// create path and initialize variables
		Path path = Paths.get(fileName);
		int countLines = 0;
		int countWords = 0;
		int countChars = 0; 
		
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String line;
			
			
			while ((line = reader.readLine()) !=null){
				countLines++; //  count lines
				String[] words = line.split(" ");
				countWords += words.length; // count words in every line and add them together
				
				countChars += line.length(); // count character in every line and add them together
			}
			
			// display result
			System.out.println("Number of lines is " + countLines);
			System.out.println("Number of words is " + countWords);
			System.out.println("Number of characters is " + countChars);

		}
		catch(IOException e){ // catch exception
			e.printStackTrace();
		}
	}

}
