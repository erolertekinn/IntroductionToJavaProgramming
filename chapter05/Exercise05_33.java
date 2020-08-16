package chapter05;

public class Exercise05_33 {
	public static void main(String[] args) {
		// TODO fazladan deger buluyor.

		for (int i = 1; i <= 10_000; i++) {
			int perfekMi = 0;
			for (int j = 1; j < i; j++) {

				if (i % j == 0) {
					perfekMi = perfekMi + j;

				}
			}
			if (i == perfekMi) {
				System.out.println(i);

			}
		}
	}
}
