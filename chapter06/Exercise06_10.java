package chapter06;

public class Exercise06_10 {
	public static void main(String[] args) {
		int numberOfPrimes = 0;

		for (int i = 2; i < 1000; i++) {
			if (Exercise06_10_PrimeNumberMethod.isPrime(i)) {
				System.out.printf("%5d ", i);
				numberOfPrimes++;
				if (numberOfPrimes % 10 == 0)
					System.out.println();
			}

		}

		System.out.println("\n\nThe number of prime numbers less than 10000: " + numberOfPrimes);
	}
}