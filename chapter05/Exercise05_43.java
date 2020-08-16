package chapter05;

public class Exercise05_43 {
	public static void main(String[] args) {
		int counter = 0;

		for (int i = 1; i < 8; i++) {
			for (int j = i + 1; j < 8; j++) {
				System.out.println(i + "\t" + j);
				counter++;
			}
		}

		System.out.println("\nThe total number of all combinations is " + counter);
	}
}