package chapter07;

import java.util.Scanner;

/*
 7.14 (Computing gcd) Write a method that returns the gcd of an unspecified number
of integers. The method header is specified as follows:
public static int gcd(int... numbers)
Write a test program that prompts the user to enter five numbers, invokes the
method to find the gcd of these numbers, and displays the gcd.
 */
public class Exercise07_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 5 integers: ");

		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();

		}

		System.out.println(gcd(numbers));

	}


	public static int gcd(int... numbers) {
		int gcd = 1;

		boolean flag;
		for (int i = 2; i < minNumber(numbers); i++) {
			flag = true;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] % i != 0) {
					flag = false;
					break;
				}

			}
			if (flag) {
				gcd = i;
			}
		}
		return gcd;
	}
	public static int minNumber(int... numbers) {
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}

		}
		return min;
	}

}
