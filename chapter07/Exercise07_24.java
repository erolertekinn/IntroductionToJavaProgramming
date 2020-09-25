package chapter07;

public class Exercise07_24 {

	public static void main(String[] args) {
		// karo, maca, sinek, kupa
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		int[] deck = new int[52];

		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}

		for (int i = 0; i < deck.length; i++) {
			int randomIndex = (int) (Math.random() * 52);

			int temp = deck[i];
			deck[i] = deck[randomIndex];
			deck[randomIndex] = temp;
		}

		for (int i = 0; i < 4; i++) {
			String randomSuits = suits[deck[i] / 13];
			String randomRanks = ranks[deck[i] % 13];
			System.out.println(randomSuits + " - " + randomRanks);
		}
	}

}
