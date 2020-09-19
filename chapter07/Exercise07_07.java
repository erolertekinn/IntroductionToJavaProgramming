package chapter07;

/*
7.7 (Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */
public class Exercise07_07 {

	public static void main(String[] args) {
		int[] rndHundert = new int[100];
		generatHundert(rndHundert);

		int[] tenNumbers = new int[10];
		countsForNumber(rndHundert, tenNumbers);

		printrndHundert(rndHundert);
		print(tenNumbers);
	}

	public static void printrndHundert(int[] rndHundert) {
		int counter = 0;
		for (int i = 0; i < rndHundert.length; i++) {
			System.out.print(rndHundert[i] + "  ");
			counter++;
			if (counter % 10 == 0) {
				System.out.println();
			}

		}
	}

	public static void print(int[] tenNumbers) {
		for (int i = 0; i < tenNumbers.length; i++) {
			System.out.println(i + "s :" + tenNumbers[i]);
		}
	}

	public static void countsForNumber(int[] rndHundert, int[] tenNumbers) {
		for (int i = 0; i < rndHundert.length; i++) {
			for (int j = 0; j < tenNumbers.length; j++) {
				if (rndHundert[i] == j) {
					tenNumbers[j]++;
				}
			}

		}
	}

	public static void generatHundert(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
		}
	}

}
