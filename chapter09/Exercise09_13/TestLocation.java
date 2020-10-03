package chapter09.Exercise09_13;

import java.util.Scanner;

public class TestLocation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");
		int row=input.nextInt();
		int column=input.nextInt();
		System.out.println("Enter the array: ");
		double [][] arr = new double[row][column];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j]=input.nextDouble();
			}
		}
		
	
	Location max = locateLargest(arr);
	System.out.println("Largest element " + max.maxValue + "\nRow: " + max.row + " column: " + max.column);
}

public static Location locateLargest(double[][] a) {
	return new Location(a);
}
}