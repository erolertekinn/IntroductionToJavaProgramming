package chapter07;

import java.util.Scanner;

/*
7.15 (Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in ten integers, invokes the method, and displays
the result. Here is the sample run of the program: 
 
Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5
 */
public class Exercise07_15 {
	public static void main(String[] args) {
		int[] array = new int[10];
		readNumbers(array);

		printEliminatedList(array);
	}

	public static void printEliminatedList(int[] array) {
		int[] lasteliminatedList = eliminateDuplicates(array);
		System.out.print("The distinct numbers are:");
		for (int i = 0; i < lasteliminatedList.length; i++) {
			
			System.out.print(lasteliminatedList[i]+" ");
			
		}
	}

	public static void readNumbers(int[] array) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter ten numbers:");

		for (int i = 0; i < array.length; i++) {
			array[i] = keyboard.nextInt();

		}
	}

	public static int[] eliminateDuplicates(int[] array) {
		int[] eliminatedList = new int[array.length];

		int i = 0;

		for (int valueOfEach : array) {
			if (linearSearchIfThereIsRepetition(eliminatedList, valueOfEach)) {
				eliminatedList[i] = valueOfEach;
				i++;
			}
		}
		int[] lasteliminatedList = new int[i];
		for (int j = 0; j < lasteliminatedList.length; j++) {
			lasteliminatedList[j]=eliminatedList[j];
		}
		return lasteliminatedList;
	}

	private static boolean linearSearchIfThereIsRepetition(int[] eliminatedList, int valueOfEach) {
		for (int i = 0; i < eliminatedList.length; i++) {
			if (valueOfEach == eliminatedList[i])
				return false;
		}
		return true;
	}
}
