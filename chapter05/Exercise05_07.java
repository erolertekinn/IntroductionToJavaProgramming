package chapter05;

public class Exercise05_07 {

	public static void main(String[] args) {

		double tuition = 10000;
		double interestRate = 0.05;
		double tuitionTenthYear = 0;
		double totalTuitionAfterTenYear = 0;
		for (int i = 1; i < 15; i++) {
			tuition = tuition + (tuition * interestRate);

			if (i == 10) {
				tuitionTenthYear = tuition;

			}
			if (i > 10) {

				totalTuitionAfterTenYear += tuition;

			}

		}
		System.out.println("Tuition in ten years: $" + (int) (tuitionTenthYear * 100) / 100.0);
		System.out.println(
				"Total cost for four years' worth of tuition: $" + (int) (totalTuitionAfterTenYear * 100) / 100.0);

	}

}
