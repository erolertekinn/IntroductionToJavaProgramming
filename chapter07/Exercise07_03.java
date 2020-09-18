package chapter07;

import java.util.Scanner;

public class Exercise07_03 {
	public static void main(String[] args) {
		System.out.print("Enter the integers between 1 and 100 : ");

		int[] numbers = new int[100];
		repetation(numbers);
		print(numbers);
	}

	public static void print(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				if (numbers[i] == 1) {
					System.out.println((i + 1) + " occur " + numbers[i] + " time");
				} else {
					System.out.println((i + 1) + " occur " + numbers[i] + " times");
				}
			}
		}
	}

	public static void repetation(int[] numbers) {
		Scanner keyboard = new Scanner(System.in);

		int nbr;

		do {
			nbr = keyboard.nextInt();
			if (nbr >= 1 && nbr <= 100) {
				numbers[nbr - 1]++;
			}
		} while (nbr != 0);

	}
}
