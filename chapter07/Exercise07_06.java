package chapter07;

import java.util.Scanner;

/*
7.6 (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number
n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
is found, n is not prime. A more efficient approach is to check whether any of the
prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
You need to use an array to store the prime numbers and later use them to check
whether they are possible divisors for n.
 */
public class Exercise07_06 {

	public static void main(String[] args) {
		
		System.out.print("Enter  number: ");
		Scanner keyboard = new Scanner(System.in);
		double input = keyboard.nextInt();

		int[] primeList = new int[50];

		first50prime(primeList);

		isPrimeCheck(input, primeList);

	}

	public static void isPrimeCheck(double input, int[] primeList) {
		boolean asalMi = true;
		for (int i = 0; i < primeList.length; i++) {

			if ((primeList[i] <= Math.sqrt(input)) && (input % primeList[i] == 0)) {
				asalMi = false;
				break;
			}
		}
		if (asalMi) {
			System.out.println(input + " is prime number");
		} else {
			System.out.println(input + " is not a prime number ");
		}
	}

	public static void first50prime(int[] primeList) {
		int primeCounter = 0;
		int iniValue = 2;
		while (primeCounter < 50) {
			boolean isPrime = true;
			for (int i = 2; i < iniValue; i++) {
				if (iniValue % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {		
				primeList[primeCounter] = iniValue;
				primeCounter++;
				System.out.println(primeCounter + ". prime number " + primeList[primeCounter - 1]);
			}
			iniValue++;
		}
	}
}
