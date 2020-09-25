package chapter07;

/*
7.13 (Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:

public static int getRandom(int... numbers)
*/
public class Exercise07_13 {

	public static void main(String[] args) {
		
		System.out.println(getRandom(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29}));

	}

	public static int getRandom(int... numbers) {

		int random;
		boolean isRandomInList = false;

		while (true) {

			random = 1 + (int) (Math.random() * 54);

			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == random) {
					isRandomInList = true;

				}
			}
//if the number is not in our list program returns the number that we found between 1-54
			if (!isRandomInList) {
				return random;
			}

		}
	}

}
