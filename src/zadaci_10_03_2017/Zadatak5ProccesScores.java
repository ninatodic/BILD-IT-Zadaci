package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak5ProccesScores {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the name of the file: ");
		String fileName = input.nextLine();
		
		Path path = Paths.get(fileName);
		int count = 0;
		int sum = 0;
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String line;
			
			while ((line = reader.readLine()) !=null){
				
				String[] words = line.split(" ");
				for (int i = 0; i < words.length; i++) {
					count+=1;
					sum += Integer.parseInt(words[i]);
				}
				System.out.println("The scores total is: " + sum);
				System.out.println("The scores average is: " + (sum/count));
			}
			
			

		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		input.close();
	}

}
