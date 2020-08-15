package chapter05;

import java.util.Scanner;

public class Exercise05_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 15: ");
		int inputNumber = input.nextInt();
		
		for (int rows = 1; rows <= inputNumber; rows++) {
			for (int space = inputNumber - rows; space >= 1; space--) {
				System.out.print(" ");
			}
			for (int numb1 = rows; numb1 > 0 ; numb1--) {
				System.out.print(numb1);
				
			
			}
			for (int numb2 = 2; numb2 <= rows; numb2++) {
				System.out.print(numb2);
			}


			System.out.println();
		}

	}
}
