package mini_4_battleship;

public class Game {

	// method that displays empty board that gets filled during the game
	public static void displayEmptyBoard(char[][] emptyBoard) {
		System.out.println("  0 1 2 3 4 5 6 7 8 9 ");
		for (int i = 0; i < emptyBoard.length; i++) {
			System.out.print(i + "|");
			for (int j = 0; j < emptyBoard[i].length; j++) {
				System.out.print(emptyBoard[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println(" ---------------------");
	}

	// method that prints board with randomly distributed ships (made for
	// testing)
//	private static void displayCompBoard(char[][] computerPopulatedBoard) {
//		System.out.println("  0 1 2 3 4 5 6 7 8 9 ");
//		for (int i = 0; i < computerPopulatedBoard.length; i++) {
//			System.out.print(i + "|");
//			for (int j = 0; j < computerPopulatedBoard[i].length; j++) {
//				System.out.print(computerPopulatedBoard[i][j] + "|");
//			}
//			System.out.println();
//		}
//		System.out.println(" ---------------------");
//	}

	// method that randomly distribute 5 ships on board
	public static void computerSetShips(char[][] computerPopulatedBoard) {
		setCarrier(computerPopulatedBoard);
		setBattleship(computerPopulatedBoard);
		setCruiser(computerPopulatedBoard);
		setSubmarine(computerPopulatedBoard);
		setDestroyer(computerPopulatedBoard);
	}

	// method that sets destroyer ship randomly choosing one field and
	// direction, afterwhat it checks if the fields needed are free, if not it
	// generates fields again, until it finds it
	private static void setDestroyer(char[][] computerPopulatedBoard) {
		int row = (int) (Math.random() * 10);
		int column = (int) (Math.random() * 10);
		int direction = (int) (Math.random() * 4);
		boolean emptySpot = true;
		do {
			if (computerPopulatedBoard[row][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'D';
				emptySpot = false;
			} else {
				row = (int) (Math.random() * 10);
				column = (int) (Math.random() * 10);
			}
		} while (emptySpot);
		boolean notSet = true;
		do {
			if (direction == 3 && (row + 1 <= 9) && computerPopulatedBoard[row + 1][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'D';
				computerPopulatedBoard[row + 1][column] = 'D';
				notSet = false;
			} else if (direction == 2 && (row - 1 >= 0) && computerPopulatedBoard[row - 1][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'D';
				computerPopulatedBoard[row - 1][column] = 'D';
				notSet = false;
			} else if (direction == 1 && (column - 1 >= 0) && computerPopulatedBoard[row][column - 1] == '\u0000') {
				computerPopulatedBoard[row][column] = 'D';
				computerPopulatedBoard[row][column - 1] = 'D';
				notSet = false;
			} else if (direction == 0 && (column + 1 <= 9) && computerPopulatedBoard[row][column + 1] == '\u0000') {
				computerPopulatedBoard[row][column] = 'D';
				computerPopulatedBoard[row][column + 1] = 'D';
				notSet = false;
			} else {
				direction = (int) (Math.random() * 3);
			}
		} while (notSet);
	}

	// method that sets submarine  randomly choosing one field and
		// direction, afterwhat it checks if the fields needed are free, if not it
		// generates fields again, until it finds it
	private static void setSubmarine(char[][] computerPopulatedBoard) {
		int row = (int) (Math.random() * 10);
		int column = (int) (Math.random() * 10);
		int direction = (int) (Math.random() * 4);
		boolean emptySpot = true;
		do {
			if (computerPopulatedBoard[row][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'c';
				emptySpot = false;
			} else {
				row = (int) (Math.random() * 10);
				column = (int) (Math.random() * 10);
			}
		} while (emptySpot);
		boolean notSet = true;
		do {
			if (direction == 3 && (row + 2 <= 9) && computerPopulatedBoard[row + 1][column] == '\u0000'
					&& computerPopulatedBoard[row + 2][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'S';
				computerPopulatedBoard[row + 1][column] = 'S';
				computerPopulatedBoard[row + 2][column] = 'S';
				notSet = false;
			} else if (direction == 2 && (row - 2 >= 0) && computerPopulatedBoard[row - 1][column] == '\u0000'
					&& computerPopulatedBoard[row - 2][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'S';
				computerPopulatedBoard[row - 1][column] = 'S';
				computerPopulatedBoard[row - 2][column] = 'S';
				notSet = false;
			} else if (direction == 1 && (column - 2 >= 0) && computerPopulatedBoard[row][column - 1] == '\u0000'
					&& computerPopulatedBoard[row][column - 2] == '\u0000') {
				computerPopulatedBoard[row][column] = 'S';
				computerPopulatedBoard[row][column - 1] = 'S';
				computerPopulatedBoard[row][column - 2] = 'S';
				notSet = false;
			} else if (direction == 0 && (column + 2 <= 9) && computerPopulatedBoard[row][column + 1] == '\u0000'
					&& computerPopulatedBoard[row][column + 2] == '\u0000') {
				computerPopulatedBoard[row][column] = 'S';
				computerPopulatedBoard[row][column + 1] = 'S';
				computerPopulatedBoard[row][column + 2] = 'S';
				notSet = false;
			} else {
				direction = (int) (Math.random() * 3);
			}
		} while (notSet);
	}

	// method that sets cruiser ship randomly choosing one field and
		// direction, afterwhat it checks if the fields needed are free, if not it
		// generates fields again, until it finds it
	private static void setCruiser(char[][] computerPopulatedBoard) {
		int row = (int) (Math.random() * 10);
		int column = (int) (Math.random() * 10);
		int direction = (int) (Math.random() * 4);
		boolean emptySpot = true;
		do {
			if (computerPopulatedBoard[row][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'c';
				emptySpot = false;
			} else {
				row = (int) (Math.random() * 10);
				column = (int) (Math.random() * 10);
			}
		} while (emptySpot);
		boolean notSet = true;
		do {
			if (direction == 3 && (row + 2 <= 9) && computerPopulatedBoard[row + 1][column] == '\u0000'
					&& computerPopulatedBoard[row + 2][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'c';
				computerPopulatedBoard[row + 1][column] = 'c';
				computerPopulatedBoard[row + 2][column] = 'c';
				notSet = false;
			} else if (direction == 2 && (row - 2 >= 0) && computerPopulatedBoard[row - 1][column] == '\u0000'
					&& computerPopulatedBoard[row - 2][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'c';
				computerPopulatedBoard[row - 1][column] = 'c';
				computerPopulatedBoard[row - 2][column] = 'c';
				notSet = false;
			} else if (direction == 1 && (column - 2 >= 0) && computerPopulatedBoard[row][column - 1] == '\u0000'
					&& computerPopulatedBoard[row][column - 2] == '\u0000') {
				computerPopulatedBoard[row][column] = 'c';
				computerPopulatedBoard[row][column - 1] = 'c';
				computerPopulatedBoard[row][column - 2] = 'c';
				notSet = false;
			} else if (direction == 0 && (column + 2 <= 9) && computerPopulatedBoard[row][column + 1] == '\u0000'
					&& computerPopulatedBoard[row][column + 2] == '\u0000') {
				computerPopulatedBoard[row][column] = 'c';
				computerPopulatedBoard[row][column + 1] = 'c';
				computerPopulatedBoard[row][column + 2] = 'c';
				notSet = false;
			} else {
				direction = (int) (Math.random() * 3);
			}
		} while (notSet);
	}

	// method that sets battleship randomly choosing one field and
		// direction, afterwhat it checks if the fields needed are free, if not it
		// generates fields again, until it finds it
	private static void setBattleship(char[][] computerPopulatedBoard) {
		int row = (int) (Math.random() * 10);
		int column = (int) (Math.random() * 10);
		int direction = (int) (Math.random() * 4);
		boolean emptySpot = true;
		do {
			if (computerPopulatedBoard[row][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'B';
				emptySpot = false;
			} else {
				row = (int) (Math.random() * 10);
				column = (int) (Math.random() * 10);
			}
		} while (emptySpot);
		boolean notSet = true;
		do {
			if (direction == 3 && (row + 3 <= 9) && computerPopulatedBoard[row + 1][column] == '\u0000'
					&& computerPopulatedBoard[row + 2][column] == '\u0000'
					&& computerPopulatedBoard[row + 3][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'B';
				computerPopulatedBoard[row + 1][column] = 'B';
				computerPopulatedBoard[row + 2][column] = 'B';
				computerPopulatedBoard[row + 3][column] = 'B';
				notSet = false;
			} else if (direction == 2 && (row - 3 >= 0) && computerPopulatedBoard[row - 1][column] == '\u0000'
					&& computerPopulatedBoard[row - 2][column] == '\u0000'
					&& computerPopulatedBoard[row - 3][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'B';
				computerPopulatedBoard[row - 1][column] = 'B';
				computerPopulatedBoard[row - 2][column] = 'B';
				computerPopulatedBoard[row - 3][column] = 'B';
				notSet = false;
			} else if (direction == 1 && (column - 3 >= 0) && computerPopulatedBoard[row][column - 1] == '\u0000'
					&& computerPopulatedBoard[row][column - 2] == '\u0000'
					&& computerPopulatedBoard[row][column - 3] == '\u0000') {
				computerPopulatedBoard[row][column] = 'B';
				computerPopulatedBoard[row][column - 1] = 'B';
				computerPopulatedBoard[row][column - 2] = 'B';
				computerPopulatedBoard[row][column - 3] = 'B';
				notSet = false;
			} else if (direction == 0 && (column + 3 <= 9) && computerPopulatedBoard[row][column + 1] == '\u0000'
					&& computerPopulatedBoard[row][column + 2] == '\u0000'
					&& computerPopulatedBoard[row][column + 3] == '\u0000') {
				computerPopulatedBoard[row][column] = 'B';
				computerPopulatedBoard[row][column + 1] = 'B';
				computerPopulatedBoard[row][column + 2] = 'B';
				computerPopulatedBoard[row][column + 3] = 'B';
				notSet = false;
			} else {
				direction = (int) (Math.random() * 3);
			}
		} while (notSet);

	}
	
	// method that sets carrier ship randomly choosing one field and
		// direction, afterwhat it checks if the fields needed are free, if not it
		// generates fields again, until it finds it
	private static void setCarrier(char[][] computerPopulatedBoard) {
		int row = (int) (Math.random() * 10);
		int column = (int) (Math.random() * 10);
		int direction = (int) (Math.random() * 4);
		computerPopulatedBoard[row][column] = 'C';
		boolean notSet = true;
		do {
			if (direction == 3 && (row + 4 <= 9) && computerPopulatedBoard[row + 1][column] == '\u0000'
					&& computerPopulatedBoard[row + 2][column] == '\u0000'
					&& computerPopulatedBoard[row + 3][column] == '\u0000'
					&& computerPopulatedBoard[row + 4][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'C';
				computerPopulatedBoard[row + 1][column] = 'C';
				computerPopulatedBoard[row + 2][column] = 'C';
				computerPopulatedBoard[row + 3][column] = 'C';
				computerPopulatedBoard[row + 4][column] = 'C';
				notSet = false;
			} else if (direction == 2 && (row - 4 >= 0) && computerPopulatedBoard[row - 1][column] == '\u0000'
					&& computerPopulatedBoard[row - 2][column] == '\u0000'
					&& computerPopulatedBoard[row - 3][column] == '\u0000'
					&& computerPopulatedBoard[row - 4][column] == '\u0000') {
				computerPopulatedBoard[row][column] = 'C';
				computerPopulatedBoard[row - 1][column] = 'C';
				computerPopulatedBoard[row - 2][column] = 'C';
				computerPopulatedBoard[row - 3][column] = 'C';
				computerPopulatedBoard[row - 4][column] = 'C';
				notSet = false;
			} else if (direction == 1 && (column - 4 >= 0) && computerPopulatedBoard[row][column - 1] == '\u0000'
					&& computerPopulatedBoard[row][column - 2] == '\u0000'
					&& computerPopulatedBoard[row][column - 3] == '\u0000'
					&& computerPopulatedBoard[row][column - 4] == '\u0000') {
				computerPopulatedBoard[row][column] = 'C';
				computerPopulatedBoard[row][column - 1] = 'C';
				computerPopulatedBoard[row][column - 2] = 'C';
				computerPopulatedBoard[row][column - 3] = 'C';
				computerPopulatedBoard[row][column - 4] = 'C';
				notSet = false;
			} else if (direction == 1 && (column + 4 <= 9) && computerPopulatedBoard[row][column + 1] == '\u0000'
					&& computerPopulatedBoard[row][column + 2] == '\u0000'
					&& computerPopulatedBoard[row][column + 3] == '\u0000'
					&& computerPopulatedBoard[row][column + 4] == '\u0000') {
				computerPopulatedBoard[row][column] = 'C';
				computerPopulatedBoard[row][column + 1] = 'C';
				computerPopulatedBoard[row][column + 2] = 'C';
				computerPopulatedBoard[row][column + 3] = 'C';
				computerPopulatedBoard[row][column + 4] = 'C';
				notSet = false;
			} else {
				direction = (int) (Math.random() * 4);
			}
		} while (notSet);
	}

	// method that returns true until all 17 fields with ships are discovered
	public static boolean gameOn(char[][] emptyBoard) {
		int count = 0;
		for (int i = 0; i < emptyBoard.length; i++) {
			for (int j = 0; j < emptyBoard[i].length; j++) {
				if (emptyBoard[i][j] == 'C' || emptyBoard[i][j] == 'B' || emptyBoard[i][j] == 'c'
						|| emptyBoard[i][j] == 'S' || emptyBoard[i][j] == 'D' || emptyBoard[i][j] == 'X') {
					count++;
				}
			}
		}
		if (count == 17) {
			return false;
		}
		return true;
	}

	// methods that changes 'X' into first letter of a ship when all fields are revealed to inform the user that he sank the ship
	public static void carrierGuesed(char[][] emptyBoard, char[][] computerPopulatedBoard) {
		int count = 0;
		for (int i = 0; i < computerPopulatedBoard.length; i++) {
			for (int j = 0; j < computerPopulatedBoard[i].length; j++) {
				if (computerPopulatedBoard[i][j] == 'C' && emptyBoard[i][j] == 'X') {
					count++;
				}
			}
		}
		if (count == 5) {
			for (int i = 0; i < emptyBoard.length; i++) {
				for (int j = 0; j < emptyBoard.length; j++) {
					if (computerPopulatedBoard[i][j] == 'C') {
						emptyBoard[i][j] = 'C';
					}
				}
			}
		}
	}

	public static void battleshipGuesed(char[][] emptyBoard, char[][] computerPopulatedBoard) {
		int count = 0;
		for (int i = 0; i < computerPopulatedBoard.length; i++) {
			for (int j = 0; j < computerPopulatedBoard[i].length; j++) {
				if (computerPopulatedBoard[i][j] == 'B' && emptyBoard[i][j] == 'X') {
					count++;
				}
			}
		}
		if (count == 4) {
			for (int i = 0; i < emptyBoard.length; i++) {
				for (int j = 0; j < emptyBoard.length; j++) {
					if (computerPopulatedBoard[i][j] == 'B') {
						emptyBoard[i][j] = 'B';
					}
				}
			}
		}
	}

	public static void cruiserGuesed(char[][] emptyBoard, char[][] computerPopulatedBoard) {
		int count = 0;
		for (int i = 0; i < computerPopulatedBoard.length; i++) {
			for (int j = 0; j < computerPopulatedBoard[i].length; j++) {
				if (computerPopulatedBoard[i][j] == 'c' && emptyBoard[i][j] == 'X') {
					count++;
				}
			}
		}
		if (count == 3) {
			for (int i = 0; i < emptyBoard.length; i++) {
				for (int j = 0; j < emptyBoard.length; j++) {
					if (computerPopulatedBoard[i][j] == 'c') {
						emptyBoard[i][j] = 'c';
					}
				}
			}
		}
	}

	public static void submarineGuesed(char[][] emptyBoard, char[][] computerPopulatedBoard) {
		int count = 0;
		for (int i = 0; i < computerPopulatedBoard.length; i++) {
			for (int j = 0; j < computerPopulatedBoard[i].length; j++) {
				if (computerPopulatedBoard[i][j] == 'S' && emptyBoard[i][j] == 'X') {
					count++;
				}
			}
		}
		if (count == 3) {
			for (int i = 0; i < emptyBoard.length; i++) {
				for (int j = 0; j < emptyBoard.length; j++) {
					if (computerPopulatedBoard[i][j] == 'S') {
						emptyBoard[i][j] = 'S';
					}
				}
			}
		}
	}

	public static void DestroyerGuesed(char[][] emptyBoard, char[][] computerPopulatedBoard) {
		int count = 0;
		for (int i = 0; i < computerPopulatedBoard.length; i++) {
			for (int j = 0; j < computerPopulatedBoard[i].length; j++) {
				if (computerPopulatedBoard[i][j] == 'D' && emptyBoard[i][j] == 'X') {
					count++;
				}
			}
		}
		if (count == 2) {
			for (int i = 0; i < emptyBoard.length; i++) {
				for (int j = 0; j < emptyBoard.length; j++) {
					if (computerPopulatedBoard[i][j] == 'D') {
						emptyBoard[i][j] = 'D';
					}
				}
			}
		}
	}

}
