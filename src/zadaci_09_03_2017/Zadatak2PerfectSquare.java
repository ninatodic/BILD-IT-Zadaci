package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2PerfectSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n = 0;
		int m =1;
		boolean ex = true;
		do{
			try{
				System.out.println("Enter an integer: ");
				n = input.nextInt();
				ex = false;
				} catch (InputMismatchException e){
					System.out.println("Invalid input, try again");
					input.nextLine();
				} 
		}while(ex);
		
		ArrayList <Integer> smallestFactors = getSmallestFactors(n);
		
		
		ArrayList<Integer> uniqueList = new ArrayList<>();
		for (int i = 0; i < smallestFactors.size(); i++) {
			if (uniqueList.contains(smallestFactors.get(i))){
				continue;
			}
			else{
				uniqueList.add(smallestFactors.get(i));
			}
		}
		
		int[] count = new int[uniqueList.size()];
		
		for (int i = 0; i < smallestFactors.size(); i++) {
			if(uniqueList.contains(smallestFactors.get(i))){
				count[uniqueList.indexOf(smallestFactors.get(i))]++;
			}
		}
		
		
		
		for (int i = 0; i < count.length; i++) {
			if(count[i]%2==1){
				m*=uniqueList.get(i);
			}
			
		}
		
		System.out.println("The smallest number m for m * n to be a perfect square is " + m + ". m * n is " +  m*n);
	
		input.close();
	}

	private static ArrayList<Integer> getSmallestFactors(int n) {
		ArrayList <Integer> smallestFactors = new ArrayList<>();
		
		for(int i=2; i<=n; i++){
            while(n%i==0){
                smallestFactors.add(i);
                n = n/i;
            }
        }
    
		return smallestFactors;
	}

}
