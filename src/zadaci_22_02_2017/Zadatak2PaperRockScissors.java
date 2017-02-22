package zadaci_22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2PaperRockScissors {

	public static void main(String[] args) {
		// create scanner and declare and initialize variables
		Scanner input = new Scanner(System.in);

		int user = 0;

		boolean ex = true;
		// prompt user for input and handle possible exceptions
		do {
			try {
				System.out.println("Enter scissor (0), rock (1) or paper (2): ");
				user = input.nextInt();
				if (user < 0 || user > 2) {
					throw new Exception("Invalid input.");
				}
				ex = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				input.next();
			} catch (Exception e) {
				System.out.println("You have to enter 0, 1 or 2 for scissor, rock or paper respectively.");
				input.next();
			}
		} while (ex);

		// create random 0, 1 or 2 for computer
		int computer = (int) (Math.random() * 3);

		// cover all combination with switch statement and print result
		switch (computer) {
		case 0: {
			if (user == 0) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw.");
			} else if (user == 1) {
				System.out.println("The computer is scissor. You are rock. You won.");
			} else {
				System.out.println("The computer is scissor. You are paper. Computer won.");
			}
			break;
		}
		case 1: {
			if (user == 0) {
				System.out.println("The computer is rock. You are scissor. Computer won.");
			} else if (user == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw.");
			} else {
				System.out.println("The computer is rock. You are paper. You won.");
			}
			break;
		}
		case 2: {
			if (user == 0) {
				System.out.println("The computer is paper. You are scissor. You won.");
			} else if (user == 1) {
				System.out.println("The computer is paper. You are rock. Computer won.");
			} else {
				System.out.println("The computer is paper. You are paper too. It is a draw.");
			}
			break;
		}

		}
		input.close();
	}
}
