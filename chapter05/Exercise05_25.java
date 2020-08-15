package chapter05;

public class Exercise05_25 {
	public static void main(String[] args) {
		// for 1000
		double sum1 = 0;
		for (double i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 - 1 / (2 * i - 1);

			} else {
				sum1 = sum1 + 1 / (2 * i - 1);
			}

		}
		sum1 = sum1 * 4;
		System.out.println("PI(i = 10000):" + sum1);
		
		double sum2 = 0;
		for (double i = 1; i <= 2000; i++) {
			if (i % 2 == 0) {
				sum2 = sum2 - 1 / (2 * i - 1);

			} else {
				sum2 = sum2 + 1 / (2 * i - 1);
			}

		}
		sum2 = sum2 * 4;
		System.out.println("PI(i = 10000):" + sum2);
		
		double sum3 = 0;
		for (double i = 1; i <= 10000; i++) {
			if (i % 2 == 0) {
				sum3 = sum3 - 1 / (2 * i - 1);

			} else {
				sum3 = sum3 + 1 / (2 * i - 1);
			}

		}
		sum3 = sum3 * 4;
		System.out.println("PI(i = 10000):" + sum3);
	}
}
