package chapter07;

import java.util.Scanner;

/*
7.12 (Reverse an array) The reverse method in Section 7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter ten numbers, invokes the method to reverse the numbers, and displays the
numbers.
 */
public class Exercise07_12 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int[] reverseArray = new int[10];

		readNumbers(array);
		reverseArrays(array, reverseArray);

		System.out.print("Array : ");
		printArray(array);
		System.out.print("\nReverse of this Array : ");
		printArray(reverseArray);
	}

	public static void readNumbers(int[] array) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = keyboard.nextInt();
		}
	}

	public static void reverseArrays(int[] array, int[] reverseArray) {

		for (int i = 0, j = (reverseArray.length - 1); i < array.length; i++, j--) {

			reverseArray[j] = array[i];
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
}
