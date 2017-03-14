package zadaci_13_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3BabyPopularityNames {

	public static void main(String[] args) {
		// create scanner and initialize variables
		Scanner input = new Scanner (System.in);
		
		int year = 0;
		char gender ='\u0000';
		String name = "";
		boolean ex = true;
		// prompt user for year (only files for 2001 and 2002 are made)
		do{
			try{
				System.out.println("Enter the year: ");
				year = input.nextInt();
				if(year<2001|| year>2002){
					throw new IllegalArgumentException("Invalid input");
				}
				ex = false;
			}catch(InputMismatchException e){
				System.out.println("Invalid input, try again");
			} catch(IllegalArgumentException e){
				System.out.println("You have to enter year between 2001 and 2002");
			}
		}while(ex);
		
		 ex = true;
		// prompt user for gender
		 do{
				System.out.println("Enter the gender: ");
				gender = input.next().charAt(0);
				if(gender=='M'|| gender=='F'){
					ex = false;
				}
				else{
					System.out.println("Enter M for male or F for female.");
				}
			
		}while(ex);
		
		// prompt user for name
		 System.out.println("Enter the name: ");
		name = input.next();
		
		Path path = Paths.get("babynameranking" + year + ".txt");
		// if file exists print out the rank of the name 
		if(Files.exists(path)){
		
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String line;
			
			while ((line = reader.readLine()) !=null){
				
				String[] words = line.split("\\t");
				if(line.contains(name)){
					System.out.println(name + " is ranked " + words[0] + " in year " + year);
				} else{
					System.out.println("The name you entered is not on the list.");
				}
				
			}
			
			

		}
		catch(IOException e){
			e.printStackTrace();
		}
		} else{
			System.out.println("File does not exist, restart program and enter proper fileName");
		}
		
		input.close();
	}

}
