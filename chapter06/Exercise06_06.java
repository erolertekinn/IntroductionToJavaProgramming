package chapter06;

import java.util.Scanner;

public class Exercise06_06 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Give me the number of the \"n\" : ");
		int number = keyboard.nextInt();
		displayPattern(number);
	}
	public static void displayPattern(int n) {
		//Spaces
		int lengtSpace = n-1;

		for (int row = 1; row <= n; row++) {
			for (int j = 1; j <= lengtSpace; j++) {
				System.out.print("   ");
			}
			lengtSpace--;
			for (int k = row; k > 0; k--) {
				System.out.printf("%3d",k);
				
			}
			System.out.println();
		}
		}

		
	
}
