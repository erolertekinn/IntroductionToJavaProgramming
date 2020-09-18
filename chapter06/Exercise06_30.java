package chapter06;

import java.util.Scanner;

public class Exercise06_30 {
	public static void main(String[] args) {

		int dice1 = (int) ((Math.random() * 6) + 1);
		int dice2 = (int) ((Math.random() * 6) + 1);
		
		System.out.println("You rolled " + dice1 + "+" + dice2 + "=" + sum(dice1, dice2));
		
		if (sum(dice1, dice2) == 2 || sum(dice1, dice2) == 3 || sum(dice1, dice2) == 12) {
			System.out.println("You lose");
		} else if (sum(dice1, dice2) == 7 || sum(dice1, dice2) == 11) {
			System.out.println("You win");
		} else {
			System.out.println("point is " + sum(dice1, dice2));
			boolean control = true;
			while (control) {
				int dice3 = (int) ((Math.random() * 6) + 1);
				int dice4 = (int) ((Math.random() * 6) + 1);
				System.out.println("You rolled " + dice3 + "+" + dice4 + "=" + sum(dice3, dice4));
				
				if(sum(dice1, dice2)==sum(dice3, dice4)) {
					System.out.println("You win");
					control=false;
				}
				else if(sum(dice3, dice4)==7) {
					System.out.println("You lose");
					control=false;
				}
			}
		}
	}

	public static int sum(int dice1, int dice2) {
		return dice1 + dice2;
	}

}
