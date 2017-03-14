package zadaci_11_03_2017;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak5LargeDataSet {

	public static void main(String[] args) throws IOException {
		// create path and check whether file exist, if it does not create one
		Path path = Paths.get("scores.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		// create bufferedWriter
		BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);

		// generate 1000 employees with randomly generated rank and pay 
		for (int i = 0; i < 1000; i++) {
			String rank = generateRank();
			double salary = generateSalary(rank);
			writer.write("FirstName" + i + " ");
			writer.write("LastName" + i + " ");
			writer.write(rank + " ");
			writer.write(salary + " ");
			writer.newLine();
		}
		writer.close();
	}

	// method that generates salary depending on the rank
	private static double generateSalary(String rank) {
		double salary = 0;
		if(rank.equals("assistant")){
			int salary1 = (int)(50000 + Math.random()*30000);
			double salary2 = Math.random();
			salary=salary1+salary2;
		}else if(rank.equals("associate")){
			int salary1 = (int)(50000 + Math.random()*60000);
			double salary2 = Math.random();
			salary=salary1+salary2;
		}else{
			int salary1 = (int)(75000 + Math.random()*65000);
			double salary2 = Math.random();
			salary=salary1+salary2;
		}
		return salary;
	}

	// method that randomly generates rank 
	private static String generateRank() {
		int rank = (int) ((Math.random()) * 3);
		if(rank == 0)
			return "assistant";
		else if (rank == 1)
			return "associate";
		else
			return "full";
		}

}
