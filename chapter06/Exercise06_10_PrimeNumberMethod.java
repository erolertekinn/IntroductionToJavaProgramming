package chapter06;

public class Exercise06_10_PrimeNumberMethod {
	public static void main(String[] args) {

	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; // Not Prime
			}
		}

		return true; // Prime
	}

}
