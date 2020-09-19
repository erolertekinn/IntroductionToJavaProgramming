package chapter07;

import java.util.Scanner;

/*
7.8 (Average an array) Write two overloaded methods that return the average of an
array with the following headers:

public static int average(int[] array)
public static double average(double[] array)

Write a test program that prompts the user to enter ten double values, invokes this
method, and displays the average value.
 */
public class Exercise07_08 {
	
	public static void main(String[] args) {
		
		
		double[]averageDouble=new double[10];
		int[]averageInt=new int[10];
		
		readValues(averageDouble, averageInt);
		
		System.out.println("ortalama double "+ average(averageDouble)); 
		System.out.println("ortalama int "+ average(averageInt));
		
		
	}

	private static void readValues(double[] averageDouble, int[] averageInt) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");

		for (int i=0;i<averageDouble.length;i++) {
			double number= keyboard.nextDouble();
			averageDouble[i]=number;
			averageInt[i]=(int)number;
			
		}
	}

		public static int average(int[] averageInt) {
			int sum=0;
		
			for (int i=0;i<averageInt.length;i++) {
			
			sum+=averageInt[i];
				
			}
			return sum/averageInt.length;
		
		} 
	
	
		public static double average(double[] averageDouble) {
		
			double sum=0;
		
			for (int i=0;i<averageDouble.length;i++) {
			
				sum+=averageDouble[i];
				
			}
			return sum/averageDouble.length;
		
		}
	
}