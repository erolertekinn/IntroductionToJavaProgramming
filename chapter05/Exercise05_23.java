package chapter05;

import java.util.Scanner;

public class Exercise05_23 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		double leftToRight = 0;
		double rightToLeft = 0;

		System.out.println();
		for (double i = 1.0; i <= 50000.0; i++) {
			leftToRight = leftToRight + (1 / i);
		
		}
		System.out.println("Sum left to right is equal to = "+leftToRight);
		for (double i = 50000.0; i > 0; i--) {
			rightToLeft = rightToLeft + (1 / i);
			

		}
		System.out.println("Sum right to left is equal to = "+rightToLeft);
		
		System.out.println("(LEFT TO RIGHT) - (RIGHT TO LEFT) = "+(leftToRight-rightToLeft));
		System.out.println("(RIGHT TO LEFT) - (LEFT TO RIGHT) = "+(rightToLeft-leftToRight));
	}
}
