package zadaci_11_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Zadatak1ReformatJavaSourceCode {

	public static void main(String[] args) {
		String fileName = args[0];

		// create path and initialize variables
		Path path = Paths.get(fileName);
		ArrayList<String> list = new ArrayList<>();
		// add open bracket to the end of the line and delete line with open brackets
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String line;
			String line2 = "";

			line = reader.readLine();
			while ((line2 = reader.readLine()) != null) {
				if (line2.charAt(line2.length() - 1) == '{') {
					list.add(line.concat(" {"));
					line = reader.readLine();
				} else {
					list.add(line);
					line = line2;
					
				}
			}
			list.add(line);

		} catch (IOException e) { // catch exception
			e.printStackTrace();
		}
		// print reformatted source code
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		
	}

}
