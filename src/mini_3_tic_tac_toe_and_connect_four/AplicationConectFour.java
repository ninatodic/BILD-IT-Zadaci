package mini_3_tic_tac_toe_and_connect_four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplicationConectFour {

	public static void main(String[] args) {
		// create scanner and two players object
		Scanner input = new Scanner(System.in);

		Players player1 = new Players();
		Players player2 = new Players();

		// enter players names and set them
		System.out.println("Enter player1's name: ");
		player1.setName(input.nextLine());
		System.out.println("Enter player2's name: ");
		player2.setName(input.nextLine());

		// declare and initialize variables and array that represents board
		int player1column = 0;
		int player2column = 0;
		int count = 0;

		char[][] game = new char[6][7];

		// print board
		GameConectFour.printBoard(game);

		boolean ex = true;
		// while game is on repeat 
		while (GameConectFour.gameOn(game, count)) {
			ex = true;
			boolean placeFree = true;
			// do while loop that checks if the column is filled
			do {
				// do while loop that checks if the player1 input is valid and stores that input
				do {
					try {
						System.out.println(player1.getName() + ", enter a column (0-6)");
						player1column = input.nextInt();

						if (player1column < 0 || player1column > 6) {
							throw new Exception("Invalid input");
						}
						ex = false;
					} catch (InputMismatchException e) {
						System.out.println("Invalid input, try again");
						input.nextLine();
					} catch (Exception e) {
						System.out.println("You can only enter 0, 1 or 2");
						input.nextLine();
					}

				} while (ex);

				// takes the input from player 1 and sets the token on the right place
				if(game[0][player1column]=='\u0000'){
				for (int i = 5; i >= 0; i--) {
					if (game[i][player1column] == '\u0000') {
						game[i][player1column] = 'R';
						placeFree = false;
						break;
					} 
				}
				}else{
					System.out.println("That row is full, try again");
				}
			} while (placeFree);
			
			count++;
			// prints board and if player one connected four breaks the do while loop
			GameConectFour.printBoard(game);
			if(!(GameConectFour.gameOn(game, count))){
				break;
			}
			
			
			ex = true;
			placeFree = true;
			
			// do while loop that checks if the player2 input is valid and stores that input
			do {
				do {
					try {
						System.out.println(player2.getName() + ", enter a column (0-6)");
						player2column = input.nextInt();

						if (player2column < 0 || player2column > 6) {
							throw new Exception("Invalid input");
						}
						ex = false;
					} catch (InputMismatchException e) {
						System.out.println("Invalid input, try again");
						input.nextLine();
					} catch (Exception e) {
						System.out.println("You can only enter 0, 1 or 2");
						input.nextLine();
					}

				} while (ex);

				// takes the input from player 2 and sets the token on the right place
				if(game[0][player2column]=='\u0000'){
				for (int i = 5; i >= 0; i--) {
					if (game[i][player2column] == '\u0000') {
						game[i][player2column] = 'Y';
						placeFree = false;
						break;
					} 
				}
				}else{
					System.out.println("That row is full, try again");
				}
			} while (placeFree);
			
			count++;
			GameConectFour.printBoard(game);
			
		}
		
		// prints who won or weather it was a draw
		if(count == 42){
			System.out.println("It is a draw!");
		}
		else if(count%2 == 1){
			System.out.println(player1.getName() + " won!");
		}
		else{
			System.out.println(player2.getName() + " won!");
		}
		
		input.close();
	}

}
