package mini_3_tic_tac_toe_and_connect_four;

public class Game {

	public static void printBoard(char[][] game) {
		System.out.println(" -----------");
		
		for (int i = 0; i < game.length; i++) {
			System.out.print("|");
			for (int j = 0; j < game.length; j++) {
				
				System.out.print(" " + game[i][j] + " |");
			}
		System.out.println();
			System.out.println(" -----------");
		}
	}
	
	public static boolean gameOn(char[][] game, int count) {
		if(playerWon(game)||count>8){
			return false;
		}
		return true;
	}
	
	private static boolean playerWon(char[][]game) {
		if(threeInARow(game)||threeInAColumn(game) || mainDiagonal(game)||secondDiagonal(game)){
			return true;
		}
		return false;
	}

	

	private static boolean threeInARow(char[][] game) {
		for(int i = 0;i<2;i++){
		if((game[i][0]==game[i][1]&&game[i][1]==game[i][2])&&(game[i][0]=='X'||game[i][0]=='O')){
			return true;
		}
		}
		return false;
	}
	
	private static boolean threeInAColumn(char[][] game) {
		for(int i = 0;i<2;i++){
			if((game[0][i]==game[1][i]&&game[1][i]==game[2][i])&&(game[0][i]=='X'||game[0][i]=='O')){
				return true;
			}
			}
			return false;
	}
	
	private static boolean mainDiagonal(char[][] game) {
		if((game[0][0]==game[1][1]&&game[1][1]==game[2][2])&&(game[0][0] == 'X'|| game [0][0] == 'O')){
			return true;
		}
		return false;
	}
	
	private static boolean secondDiagonal(char[][] game) {
		if((game[0][2]==game[1][1]&&game[1][1]==game[2][0])&&(game[0][2] == 'X'|| game [0][2] == 'O')){
			return true;
		}
		return false;
	}
}
