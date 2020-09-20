package chapter07;

import java.util.Scanner;

/*
7.9 (Find the smallest element) Write a method that finds the smallest element in an
array of double values using the following header:
public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value. Here is a
sample run of the program:

Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
The minimum number is: 1.5
 */
public class Exercise07_09 {
	public static void main(String[] args) {
		double[] array = new double[10];
		
		readValues(array);
		System.out.println("The minimum number is:" +min(array));
		
	}
	
	public static void readValues(double[] array) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter ten numbers:");

		for (int i = 0; i < array.length; i++) {
			array[i]=keyboard.nextDouble();
		}
	}
	public static double min(double[] array) {
		double minimum = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i]<minimum)
			minimum = array[i];
		}
		
		return minimum;
	}
}
