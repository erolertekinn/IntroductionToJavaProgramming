package chapter06;

import java.util.Scanner;

public class Exercise06_17 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter n : ");
		int number = keyboard.nextInt();
		printMatrix(number);
	}
	public static void printMatrix(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				int a =(int) (Math.random()*2);
				System.out.print(a+"\t");
			}
			System.out.println();
		}
	}
}