package chapter07;

import java.util.Scanner;

/*
 *7.2 (Reverse the numbers entered) Write a program that reads ten integers and displays
 *them in the reverse of the order in which they were read.
 *
*/
public class Exercise07_02 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter ten integers : ");

		int[] tenInteger = new int[10];

		for (int i = 0; i < tenInteger.length; i++) {
			tenInteger[i] = keyboard.nextInt();
		}

		int[] reverseTenInteger = new int[10];

		reverseOfTenIntegerValue(tenInteger, reverseTenInteger);

		print(reverseTenInteger);
	}

	public static void print(int[] reverseTenInteger) {
		System.out.print("Reverse of this ten integers : ");

		for (int i = 0; i < reverseTenInteger.length; i++) {
			System.out.print(reverseTenInteger[i]+"  ");
		}
	}

	public static int[] reverseOfTenIntegerValue(int[] tenInteger, int[] reverseTenInteger) {
		for (int i = 0, j = tenInteger.length - 1; i < tenInteger.length; i++, j--) {
			reverseTenInteger[j] = tenInteger[i];

		}
		return reverseTenInteger;
	}

}
