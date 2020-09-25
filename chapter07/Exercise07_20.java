package chapter07;

import java.util.Scanner;

/*
7.20 (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
The selection-sort method repeatedly finds the smallest number in the current
array and swaps it with the first. Rewrite this program by finding the largest number
and swapping it with the last. Write a test program that reads in ten double
numbers, invokes the method, and displays the sorted numbers.
 */
public class Exercise07_20 {
	public static void main(String[] args) {
		double[] array = new double[10];
		readValues(array);
		selectionSortMintoMax(array);
		writeValues(array);
		System.out.println();
		selectionSortMaxtoMin(array);
		writeValues(array);

	}

	public static void writeValues(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

	  public static void selectionSortMintoMax(double[] array){  
	        for (int i = 0; i < array.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < array.length; j++){  
	                if (array[j] < array[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            double smallerNumber = array[index];   
	            array[index] = array[i];  
	            array[i] = smallerNumber;  
	        }  
	    }  
	
	  public static void selectionSortMaxtoMin(double[] array){  
	        for (int i = array.length - 1; i >=0 ; i--)  
	        {  
	            int index = i;  
	            for (int j = i -1; j >=0; j--){  
	                if (array[j] < array[index]){  
	                    index = j;//searching for largest index  
	                }  
	            }  
	            double largestNumber = array[index];   
	            array[index] = array[i];  
	            array[i] = largestNumber;  
	        }  
	    }  
	

	public static void readValues(double[] array) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the values:");
		for (int i = 0; i < array.length; i++) {
			array[i] = keyboard.nextDouble();

		}

	}

}
