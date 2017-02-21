package mini_2_craps_and_credit_cards;

public class Craps {

	public static void main(String[] args) {
		// use math random to simulate throwing the dices
		int dice1 = 1 + (int) (Math.random() * 6);
		int dice2 = 1 + (int) (Math.random() * 6);

		int sum = dice1 + dice2;

		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);// print the result
		if (sum == 2 || sum == 3 || sum == 12) { // in this cases player loose
			System.out.println("You lose.");
		} else if (sum == 7 || sum == 11) { // in this cases player wins
			System.out.println("You win.");
		} else {                              // in other cases player throws again trying to get the same sum as in first throw
			int point = sum;
			System.out.println("The point is " + point); // printing the result of first throw
			dice1 = 1 + (int) (Math.random() * 6);  // simulate throwing again
			dice2 = 1 + (int) (Math.random() * 6);

			sum = dice1 + dice2;

			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum); // print the result

			if (sum == point)   // if the result is the same player won
				System.out.println("You win.");
			else 		// otherwise player lost
				System.out.println("You lose");
			

		}
	}

}
