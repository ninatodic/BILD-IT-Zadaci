package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1MatrixHighestRowAndColumn {

	public static void main(String[] args) {
		// create two arrayLists for storing indexes of highest row and column
		ArrayList <Integer> rows = new ArrayList<>();
		ArrayList <Integer> columns = new ArrayList<>();
		
		// get user input for matrix sizes
		int size = getUserInput();
		
		
		// create matrix with randomly generated 0's and 1's
		int [][] matrix= new int[size][size];
		
		// print generated matrix
		printMatrix(matrix);
		
		// get indexes of highest row and print it
		rows = getLargestRows(matrix);
		System.out.print("The largest row index: " );
		for (int i = 0; i < rows.size(); i++) {
			System.out.print(rows.get(i) + " ");
		}
		 System.out.println();
		 
		 // get indexes of highest columns and print it
		columns = getLargestColumns(matrix);
		System.out.print("The largest column index: " );
		for (int i = 0; i < columns.size(); i++) {
			System.out.print(columns.get(i) + " ");
		}
		
	}

	// method that returns largest column
	private static ArrayList<Integer> getLargestColumns(int[][] matrix) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] count = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	// method that returns highest rows
	private static ArrayList<Integer> getLargestRows(int[][] matrix) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] count = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	}
	
	// method that returns number of 1's in highest column or row
	public static int max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	// method that returns indexes of all rows and column that have max number of 1's
	public static void getIndex(ArrayList<Integer> list, int[] count, int x) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] == x)
				list.add(i);
		}
	}
	

	

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*2);
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	

	private static int getUserInput() {
		Scanner input = new Scanner(System.in);
		int size = 0;;
		boolean ex = true;
		do{
			try{
				System.out.println("Enter size of the matrix");
				size = input.nextInt();
				if (size<2||  size > 100){
					throw new IllegalArgumentException();
				}
				ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input, please enter integers only.");
				input.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println("The input must be positive number bigger than 2 and smaller than 100.");
			}
		}while(ex);
		
		input.close();
		return size;
	}

}
