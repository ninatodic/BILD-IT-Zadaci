package mini_3_tic_tac_toe_and_connect_four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplicationTicTacToe {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		Players player1 = new Players();
		Players player2 = new Players();
		
		System.out.println("Enter player1's name: ");
		player1.setName(input.nextLine());
		System.out.println("Enter player2's name: ");
		player2.setName(input.nextLine());
		
		int playerXrow = 0;
		int playerXcolumn= 0;
		int playerYrow = 0;
		int playerYcolumn= 0;
		int count = 0;
		
		char[][] game = new char[3][3];
		
			Game.printBoard(game);
			
			boolean ex = true;
			
			while(Game.gameOn(game, count)){
				ex = true;
			boolean placeFree = true;
			do{
				do {
				try {
					System.out.println(player1.getName() + ", enter a row (0, 1, or 2)");
					playerXrow = input.nextInt();
					
					if (playerXrow < 0 || playerXrow > 2) {
						throw new Exception("Invalid input");
					}
					System.out.println(player1.getName() + ", enter a column (0, 1, or 2):");
					playerXcolumn = input.nextInt();
					
					if (playerXcolumn < 0 || playerXcolumn > 2) {
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
			
			if(game[playerXrow][playerXcolumn]=='\u0000'){
			game[playerXrow][playerXcolumn] = 'X';
			placeFree = false;
			}else{
				System.out.println("Another token on that position already, try again");
			}
			}while(placeFree);
			
			count++;
			Game.printBoard(game);
			if(!(Game.gameOn(game, count))){
				break;
			}
			ex = true;
			placeFree = true;
			do{
			do {
				try {
					System.out.println(player2.getName() + ", enter a row (0, 1, or 2):");
					playerYrow = input.nextInt();
					
					if (playerYrow < 0 || playerYrow > 2) {
						throw new Exception("Invalid input");
					}
					System.out.println(player2.getName() + ", enter a column (0, 1, or 2):");
					playerYcolumn = input.nextInt();
					
					if (playerYcolumn < 0 || playerXcolumn > 2) {
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
			
			if(game[playerYrow][playerYcolumn]=='\u0000'){
				game[playerYrow][playerYcolumn] = 'O';
				placeFree = false;
				}else{
					System.out.println("Another token on that position already, try again");
				}
				}while(placeFree);
			
			Game.printBoard(game);
			count++;
		}
			
			if(count == 9){
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
