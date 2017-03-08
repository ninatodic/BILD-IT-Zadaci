package mini_4_hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ListOfWords {

	public static ArrayList<Character> getWord() {
		// create array list to store random word as list of characters
		ArrayList <Character> word = new ArrayList<>();
		String fileName = ("listOfWords.txt");
		Path path = Paths.get(fileName);
		String randomWord = "";
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String line;
			while ((line = reader.readLine()) !=null){
			// create array of all words in the list
			String[] words = line.split(" ");
			// randomly choose index of word to be returned
			int n = (int)(Math.random()*words.length);
			randomWord = words[n];
			}
			
			// create array list of characters from random word
			for (int i = 0; i < randomWord.length(); i++) {
				word.add(randomWord.charAt(i));
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return word; // return list of characters
	}

}
