package chapter05;

public class Exercise05_15 {

	public static void main(String[] args) {
		int counter = 1;
		for (int i = 33; i <= 126; i++) {

			if ((counter % 10) == 0) {
				System.out.println("\t" + (char) i);

			} else {
				System.out.print("\t" + (char) i);
			}

			counter++;

		}
		System.out.println();

	}

}
