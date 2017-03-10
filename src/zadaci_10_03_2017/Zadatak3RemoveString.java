package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak3RemoveString {

	public static void main(String[] args) {
		
		String fileName = args[0];
		
		// create path
		Path path = Paths.get(fileName);
		try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String line;
			// read line by line and if line contains substring John replace it with ""
			while((line = reader.readLine()) != null){
				System.out.println("Line before removing string"); // created for testing
				System.out.println(line);
				if (line.contains("John")){
					line = line.replaceAll("John", "");
				}
				System.out.println("Line after removing string");
				System.out.println(line);
				
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}

}
