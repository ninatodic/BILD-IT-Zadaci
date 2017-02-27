package zadaci_27_02_2017;

public class Zadatak56x6matrix {

	public static void main(String[] args) {
		// initialize matrix 6x6 filled with 0's and 1's
		int[][] matrix = generateMatrix();

		// display matrix
		displayMatrix(matrix);

		// check weather rows and columns have even number of ones 
		checkEvenRows(matrix);
		System.out.println();

		checkEvenColumns(matrix);
	}

	private static void checkEvenColumns(int[][] matrix) {
		int countOnes = 0;
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] == 0) {
					countOnes++;
				}
			}
			if (countOnes % 2 == 0) {
				System.out.println("Column " + j + " has even number of ones.");
			} else {
				System.out.println("Column " + j + " does not have even number of ones.");
			}
			countOnes = 0;
		}
	}

	private static void checkEvenRows(int[][] matrix) {
		int countOnes = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					countOnes++;
				}
			}
			if (countOnes % 2 == 0) {
				System.out.println("Row " + i + " has even number of ones.");
			} else {
				System.out.println("Row " + i + " does not have even number of ones.");
			}
			countOnes = 0;
		}
	}

	private static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] generateMatrix() {
		int[][] matrix = new int[6][6];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}

		return matrix;
	}

}
