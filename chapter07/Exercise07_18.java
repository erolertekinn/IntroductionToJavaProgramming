package chapter07;

import java.util.Scanner;

/*
**7.18 (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort
algorithm makes several passes through the array. On each pass, successive
neighboring pairs are compared. If a pair is not in order, its values are swapped;
otherwise, the values remain unchanged. The technique is called a bubble sort or
sinking sort because the smaller values gradually “bubble” their way to the top
and the larger values “sink” to the bottom. Write a test program that reads in ten
double numbers, invokes the method, and displays the sorted numbers.
 */
public class Exercise07_18 {
	public static void main(String[] args) {
		double[] array = new double [10];
		
		readValues(array);
		bubbleSort(array);
		writeValues(array);
	}

	public static void writeValues(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void bubbleSort(double[] array) {
		for (int j = 0; j < array.length-1; j++) {

			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {
					double temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;

				}
			}
		}
	}

	public static void readValues(double[] array) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter ten numbers :");
		for (int i = 0; i < array.length; i++) {
			array[i] = keyboard.nextDouble();
			
		}
		
		
		
	}
}
