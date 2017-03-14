package zadaci_13_03_2017;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak1ProccesSalary {

	public static void main(String[] args) {
		try{
			// Create an URL object
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Salary.txt");

			// initialize  variables 
			double sumAssistant = 0;
			double sumAssociate  = 0;
			double sumFull = 0;
			double sumAll = 0;
			int countAssistant=0;
			int countAssociate = 0;
			int countFull = 0;
			
			// create bufferedReader object
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
				String line;
				while ((line = in.readLine()) != null) { // read the document line by line
					String[] words = line.split(" "); // split every line in words
					if(line.contains("assistant")){ // if line contains assistant sum and count
						countAssistant++;
						sumAssistant += Double.parseDouble(words[3]);
					}
					else if(line.contains("associate")){// if line contains associate sum and count
						countAssociate++;
						sumAssociate += Double.parseDouble(words[3]);
						}
					else { // if line contains full sum and count
						countFull++;
						sumFull += Double.parseDouble(words[3]);
					}
					
					sumAll += Double.parseDouble(words[3]); // sum all salaries
						
				}
			
				// print out results
				System.out.printf("Total salary of assistant proffesors is: %.2f", sumAssistant );
				System.out.printf("\nAverage salary of assistant proffesors is:  %.2f", (sumAssistant/countAssistant));
				
				System.out.printf("\nTotal salary of associate proffesors is: %.2f", sumAssociate );
				System.out.printf("\nAverage salary of associate proffesors is: %.2f", (sumAssociate/countAssociate));
				
				System.out.printf("\nTotal salary of full proffesors is: %.2f", sumFull );
				System.out.printf("\nAverage salary of full proffesors is: %.2f", (sumFull/countFull));
				
				System.out.printf("\nTotal salary of all proffesors is: %.2f", sumAll );
				System.out.printf("\nAverage salary of all proffesors is: %.2f", (sumAll/1000));
				
			}catch (java.net.MalformedURLException ex) {
				System.out.println("Invalid URL");
			} catch (java.io.IOException ex) {
				System.out.println("I/0 Errors: no such file");
			}
	
}
}