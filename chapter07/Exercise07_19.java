package chapter07;

import java.util.Scanner;

/*
**7.19 (Sorted?) Write the following method that returns true if the list is already sorted
in increasing order.

public static boolean isSorted(int[] list)

Write a test program that prompts the user to enter a list and displays whether
the list is sorted or not. Here is a sample run. Note that the first number in the
input indicates the number of the elements in the list. This number is not part
of the list.

Enter list: 8 10 1 5 16 61 9 11 1
The list is not sorted
 */
public class Exercise07_19 {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		readValues(array);
		System.out.println(isSorted(array) ? "The list is already sorted" : "The list is not sorted");

	}
	public static void readValues(int[] array) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter list: ");
		for (int i = 0; i < array.length; i++) {
			array[i]=keyboard.nextInt();
			
		}
		
	}
	public static boolean isSorted(int[] array) {
		boolean result = true;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					result = false;
				}
			}
		}
		
		return result;
	}

}
