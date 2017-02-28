package mini_3_tic_tac_toe_and_connect_four;

public class GameConectFour {
	
	
	//method that prints the board
	public static void printBoard(char[][] game) {
		for (int i = 0; i < game.length; i++) {
			System.out.print("|");
			for (int j = 0; j < game[i].length; j++) {
				System.out.print(game[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	// method that checks if one of the players won or the board is filled
	public static boolean gameOn(char[][] game, int count) {
		if (playerWon(game) || count > 41) {
			return false;
		}
		return true;
	}

	// method that checks if one of the players connected four
	public static boolean playerWon(char[][] game) {
	    final char EMPTY_SLOT = '\u0000';
	    for (int r = 0; r < game.length; r++) { 
	        for (int c = 0; c < game[0].length; c++) { 
	            char player = game[r][c];
	            if (player == EMPTY_SLOT){
	                continue; 
	            }

	            if (c + 3 < game[0].length && player == game[r][c+1] && 
	                player == game[r][c+2] && player == game[r][c+3]){
	                return true;
	            }
	            if (r + 3 < game.length) {
	                if (player == game[r+1][c] && player == game[r+2][c] && player == game[r+3][c]){
	                    return true;
	                }
	                if (c + 3 < game[0].length && player == game[r+1][c+1] && 
	                    player == game[r+2][c+2] && player == game[r+3][c+3]){
	                    return true;
	                }
	                if (c - 3 >= 0 && player == game[r+1][c-1] && 
	                    player == game[r+2][c-2] && player == game[r+3][c-3]){
	                    return true;
	                }
	            }
	        }
	    }
	    return false; 
	}
}
