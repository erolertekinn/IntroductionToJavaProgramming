package chapter05;

import java.util.Scanner;

public class Exercise05_27 {
	public static void main(String[] args) {
		int counter = 0;
		System.out.println("Leap years from 101 to 2100:\n");
		for (int i = 101; i <= 2100; i++) {

			boolean leapTrue = ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0));
			if (leapTrue) {
				System.out.print(i + "\t");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
					
				}
				//System.out.print(i + (counter % 10 == 0 ? "\n" : " "));

			}
		}
	}

}