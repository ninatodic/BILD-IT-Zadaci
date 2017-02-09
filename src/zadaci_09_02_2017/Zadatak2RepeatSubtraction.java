package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak2RepeatSubtraction {

	public static void main(String[] args) {
		// Creating a scanner 
		Scanner input = new Scanner (System.in);
		
		// Prompting a user for number of question
		System.out.println("Enter the number of questions: ");
		int numOfQuestions = input.nextInt();
		
		// Invoking a method that prints out the questions and whether the answer is correct or not
		repeatSubtraction(numOfQuestions);
		
		// Closing the scanner
		input.close();
	}

	// Method that prints the questions
	public static void repeatSubtraction(int numOfQuestions) {
		// Creating a scanner
		Scanner input = new Scanner(System.in);
		// Declaring and initializing the variables
		int correctCount = 0;
		int incorrectCount = 0;
		
		// loops through the questions and counts the answers
		for (int i = 0; i<numOfQuestions; i++){
			// generates two integers
			int a = (int)(Math.random()*10);
			int b = (int)(Math.random()*10);
			
			// Swaps them if a is smaller than b
			if (a<b){
				int temp = a;
				a=b;
				b=temp;
			}
			
			System.out.println("What is " + a + " - " + b);
			int userAnswer = input.nextInt();
			
			//checks if the answer is correct or not and counts accordingly 
			if (userAnswer == (a-b)){
				correctCount++;
				System.out.println("Your answer is correct");
			}
			else {
				incorrectCount++;
				System.out.println("Your answer is incorrect");
			}
		}
		
		// Prints out number of correct and incorrect answers
		System.out.println("Number of correct answers is " + correctCount);
		System.out.println("Number of incorrect answers is " + incorrectCount);
		
		//closes the scanner
		input.close();
	}

}
