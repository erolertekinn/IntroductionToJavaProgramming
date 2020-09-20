package chapter07;

import java.util.Scanner;

/*
7.10 (Find the index of the smallest element) Write a method that returns the index of
the smallest element in an array of integers. If the number of such elements is
greater than 1, return the smallest index. Use the following header:
public static int indexOfSmallestElement(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the index of the smallest element, and displays the index.

 */
public class Exercise07_10 {
	public static void main(String[] args) {
		double[] array = new double[10];
		readNumbers(array);
		System.out.print("Index of the smallest element: "+indexOfSmallestElement(array));
		indexOfSmallestElement(array);
	}

	public static void readNumbers(double[] array) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = keyboard.nextDouble();
		}
	}

	public static int indexOfSmallestElement(double[] array) {
		int indexOfSmallest = 0;
		double minimum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimum) {
				minimum = array[i];
				indexOfSmallest = i;
			}
		}
		return indexOfSmallest;
	}
}
