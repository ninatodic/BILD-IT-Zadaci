package mini_4_battleship;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		// create scanner and declare two arrays
		Scanner input = new Scanner(System.in);
		char[][] emptyBoard = new char[10][10];
		char[][] computerPopulatedBoard = new char[10][10];
		
		// declare and initialize variables 
		int count = 0;
		int row = 0;
		int column = 0;
		
		// randomly distribute ships
		Game.computerSetShips(computerPopulatedBoard);
		System.out.println("Input row and column for attack cordinates, if you hit 'X' will be printed on the board and 'o' if you miss. \nWhen you distroy entire ship X's will be turned into C, B, c, S and D for Carrier, Battleship, Cruiser, \nSubmarine and Destroyer respectively. You have 40 attacks, if yo do not destroy all ships you will loose");

		// repeatedly prompt user for row and column - coordinates of attack, until he finds all ships or tries for 40 moves
		while (Game.gameOn(emptyBoard) && count < 40) {
			
			Game.displayEmptyBoard(emptyBoard);
			// prompt for row and column and handle possible exceptions
			boolean ex = true;
			do {
				try {
					System.out.println("Enter a row and column for attack: ");
					row = input.nextInt();
					column = input.nextInt();
					if (row < 0 || row > 9 || column < 0 || column > 9) {
						throw new Exception("Invalid input");
					}
					ex = false;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, try again");
					input.nextLine();
				} catch (Exception e) {
					System.out.println("Row and column have to be integers between 0 and 9, try again");
					input.nextLine();
				}
			} while (ex);
			
			// print 'X' if user hit the ship, otherwise print 'o'
			if (computerPopulatedBoard[row][column]=='C' || computerPopulatedBoard[row][column]=='B' || computerPopulatedBoard[row][column]=='c' || computerPopulatedBoard[row][column]=='S'||computerPopulatedBoard[row][column]=='D'){
				emptyBoard[row][column]='X';
			}
			else{
				emptyBoard[row][column]='o';
			}
			
			// check if the user sunk entire ship
			Game.carrierGuesed(emptyBoard, computerPopulatedBoard);
			Game.battleshipGuesed(emptyBoard, computerPopulatedBoard);
			Game.cruiserGuesed(emptyBoard, computerPopulatedBoard);
			Game.submarineGuesed(emptyBoard, computerPopulatedBoard);
			Game.DestroyerGuesed(emptyBoard, computerPopulatedBoard);
			count++;
		}
		// display board one more time outside of while loop
		Game.displayEmptyBoard(emptyBoard);
		
		// print the message about victory or loss
		if(!Game.gameOn(emptyBoard)){
			System.out.println("Congratulation, you won.");
		}
		else{
			System.out.println("You run out of amo and lost, try again");
		}
		input.close();
	}

}
