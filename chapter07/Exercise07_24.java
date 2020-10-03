package chapter07;
/*********************************************************************************
* (Simulation: coupon collector’s problem) Coupon collector is a classic         *
* statistics problem with many practical applications. The problem is to pick    *
* objects from a set of objects repeatedly and find out how many picks are       *
* needed for all the objects to be picked at least once. A variation of the      *
* problem is to pick cards from a shuffled deck of 52 cards repeatedly and find  *
* out how many picks are needed before you see one of each suit. Assume a picked *
* card is placed back in the deck before picking another. Write a program to     *
* simulate the number of picks needed to get four cards from each suit and       *
* display the four cards picked (it is possible acard may be picked twice).      *
*********************************************************************************/
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
