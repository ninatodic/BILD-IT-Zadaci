package mini_2_craps_and_credit_cards;

public class Craps {

	public static void main(String[] args) {
		int dice1 = 1 + (int) (Math.random() * 6);
		int dice2 = 1 + (int) (Math.random() * 6);

		int sum = dice1 + dice2;

		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You lose.");
		} else if (sum == 7 || sum == 11) {
			System.out.println("You win.");
		} else {
			int point = sum;
			System.out.println("The point is " + point);
			dice1 = 1 + (int) (Math.random() * 6);
			dice2 = 1 + (int) (Math.random() * 6);

			sum = dice1 + dice2;

			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);

			if (sum == point) {
				System.out.println("You win.");
			} else {
				System.out.println("You lose");
			}

		}
	}

}
