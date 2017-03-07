package bonus_zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LcdDisplayTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		int size = 0;
		boolean ex = true;
		
		do{
			try{
				System.out.println("Enter the number you want to display: ");
				number = input.nextInt();
				ex = false;
			} catch (InputMismatchException e){
				System.out.println("Invalid input, please try again");
				input.nextLine();
			}
			
		}while(ex);
		
		ex = true;
		do{
			try{
				System.out.println("Enter the size in which numbers should be displayed: ");
				size = input.nextInt();
				ex = false;
				if (size<2 || size>5){
					throw new Exception("Invalid input");
				}
			} catch (InputMismatchException e){
				System.out.println("Invalid input, please try again");
				input.nextLine();
			} catch (Exception e){
				System.out.println("You can only enter 2, 3, 4 or 5 for size");
				input.nextLine();
			}
			
		}while(ex);
		
		LcdDisplay.displayNumber(number,size);
		
		input.close();
	}
	
	

}
