package chapter05;

public class Exercise05_40 {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;

		System.out.println("Fipping a coin one millon times");
		for (int i = 0; i < 1000000; i++) {
			int coin = (int) (Math.random() * 2);
			if (coin == 0) {
				heads++;
			} else {
				tails++;
			}

		}

		System.out.println("Number of the Heads: " + heads + "\nNumber of the Tails: " + tails);
	}
}