package chapter07;

import java.util.Scanner;

/*
(Print distinct numbers) Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers. Here is
the sample run of the program:
 */
public class Exercise07_05 {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		int numberOfDistinctNumber=readNumbers(numbers);

		System.out.println("The number of distrinct number is "+numberOfDistinctNumber);
		System.out.print("The distrinct numbers are: ");
		print(numbers);
	}

	public static int readNumbers(int[] numbers) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			int input = keyboard.nextInt();
			if (distinctNumber(numbers, input)){
				numbers[counter]=input;
				counter++;
			}
		}
		return counter;
	}



	public static boolean distinctNumber(int[] numbers,int input) {
		for (int i = 0; i < numbers.length; i++) {
			if (input == numbers[i]) {
				return false;
			}
				
		
		}
		return true;
	}
	public static void print(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]>0) {
				System.out.print(numbers[i]+"  ");
				
			}
		}
	}
}
