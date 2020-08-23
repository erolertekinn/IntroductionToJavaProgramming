package chapter06;

import java.util.Scanner;

public class Exercise06_14 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the \"i\" value : ");
		int i = keyboard.nextInt();
		System.out.printf("%-2s%5s%8s\n", "i", " ", "m(i)");
		System.out.println("-------------------");
		while(i>0) {
		
		
		System.out.printf("%-2d%5s%8.4f\n", i, " ", estimatePi(i));
		i = keyboard.nextInt();
		}

	}

	public static double estimatePi(int i) {
		double sum = 0;
		for (int a = 1; a <= i; a++) {
			if (a % 2 == 0)
				sum = sum - 1 / (2*a-1.0);
			else
				sum = sum + 1 / (2*a-1.0);

		}
		return 4 * sum;

	}
}
