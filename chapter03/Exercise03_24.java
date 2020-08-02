package chapter03;

public class Exercise03_24 {

	public static void main(String[] args) {
		// 1---13
		int rankOfCard = ((int) Math.random() * 13) + 1;

		// 1---4
		int suitOfCard = ((int) Math.random() * 4) + 1;

		System.out.print("The card you picked is ");

		switch (rankOfCard) {
		case 1:
			System.out.print("Ace");
			break;
		case 2:
			System.out.print(rankOfCard);
			break;
		case 3:
			System.out.print(rankOfCard);
			break;
		case 4:
			System.out.print(rankOfCard);
			break;
		case 5:
			System.out.print(rankOfCard);
			break;
		case 6:
			System.out.print(rankOfCard);
			break;
		case 7:
			System.out.print(rankOfCard);
			break;
		case 8:
			System.out.print(rankOfCard);
			break;
		case 9:
			System.out.print(rankOfCard);
			break;
		case 10:
			System.out.print(rankOfCard);
			break;
		case 11:
			System.out.print("Jack");
			break;
		case 12:
			System.out.print("Queen");
			break;
		case 13:
			System.out.print("King");
		}

		switch (suitOfCard) {
		case 1:
			System.out.println(" of Clubs");
			break;
		case 2:
			System.out.println(" of Diamonds");
			break;
		case 3:
			System.out.println(" of Hearts");
			break;
		case 4:
			System.out.println(" of Spades");
		}

	}

}
