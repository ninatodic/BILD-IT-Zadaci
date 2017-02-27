package zadaci_27_02_2017;

public class Zadatak3LargestRowAndColumn {

	public static void main(String[] args) {
		// initialize matrix by invoking getMatrix method
		int [][] matrix = getMatrix();
		
		// print matrix and result
		printMatrix(matrix);
		
		System.out.println("The largest row index is: " + largestRowIndex(matrix));
		System.out.println("The largest column index is: " + largestColumnIndex(matrix));
	}
	
	// method that prints out the matrix
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i<matrix.length; i++){
			for (int j = 0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	// creates 4x4 matrix and fills it with random 0's and 1's
	public static int[][] getMatrix (){
		int[][] matrix = new int [4][4];
		
		for (int i = 0; i<matrix.length; i++){
			for (int j = 0; j<matrix[i].length; j++){
				matrix[i][j]= (int)(Math.random()*2);
			}
		}
		return matrix;
	}
	
	// method that returns largestRowIndes
	public static int largestRowIndex (int[][] matrix){
			int maxRowSum = 0;
			int maxRowSumIndex=0;
			
			for (int i = 0; i<matrix.length; i++){
			int sumRow = 0;
			for (int j = 0; j<matrix[i].length; j++){
				sumRow += matrix[i][j];
			}
			if (sumRow>maxRowSum){
				maxRowSum = sumRow;
				maxRowSumIndex = i;
			}
				
			}
			
			return maxRowSumIndex;
	}
	
	// method that returns largest column index
	public static int largestColumnIndex (int[][] matrix){
		int maxColumnSum = 0;
		int maxColumnSumIndex = 0;
		
		for (int j = 0; j<matrix[0].length; j++){
			int sumColumn = 0;
			for (int i = 0; i<matrix.length; i++){
				sumColumn += matrix[i][j];
			}
			if (sumColumn>maxColumnSum){
				maxColumnSum = sumColumn;
				maxColumnSumIndex = j;
			}
				
			}
			
			return maxColumnSumIndex;
	}

}
