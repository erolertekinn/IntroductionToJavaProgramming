package chapter06;

import java.util.Scanner;

public class Exercise06_31 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a credit card number as a long integer : ");
		long number = keyboard.nextLong();

		System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));

	}

	public static boolean isValid(long number) {

		boolean digits = getSize(number) >= 13 && getSize(number) <= 16;
		boolean prefixs = prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
				|| prefixMatched(number, 6);
		boolean summation = ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

		return digits && prefixs && summation;

	}

	public static int getSize(long number) {
		String numStr = number + "";
		return numStr.length();
	}

	public static long getPrefix(long number, int k) {

		int length = (int) (Math.log10(k) + 1);
		String numberStr = number + "";
		String resultStr = "";
		for (int i = 0; i < length; i++) {

			resultStr = resultStr + numberStr.charAt(i);
		}
		int result = Integer.parseInt(resultStr);
		return result;
	}

	public static boolean prefixMatched(long number, int d) {
		boolean result = false;

		if (getPrefix(number, d) == d) {
			result = true;
		}

		return result;

	}

	public static int sumOfDoubleEvenPlace(long number) {
		String numberStr = number + "";

		int sum = 0;
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {

			int a = Character.getNumericValue(numberStr.charAt(i)) * 2;

			sum = sum + getDigit(a);

		}
		return sum;
	}

	public static int getDigit(int number) {
		if (number < 9)
			return number;
		else
			return number / 10 + number % 10;
	}

	public static int sumOfOddPlace(long number) {
		String numberStr = number + "";

		int sum = 0;
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {

			int a = Character.getNumericValue(numberStr.charAt(i));

			sum = sum + a;

		}
		return sum;

	}
}
