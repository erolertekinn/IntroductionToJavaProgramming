package chapter06;

import java.util.Scanner;

public class Exercise06_02_2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 

		System.out.print("Enter a integer: ");
		long number = keyboard.nextLong();


		System.out.println("The sum of the digits is "+sumDigits(number));
	}

	
	public static long sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			//546   sum=6  n=54   sum=6+4   n=5  sum=6+4+5 n=0
			sum =  sum + (int)(n % 10);

			n = n / 10;
		}

		return sum;
	}
}