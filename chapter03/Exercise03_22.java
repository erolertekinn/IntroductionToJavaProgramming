package chapter03;

import java.util.Scanner;

public class Exercise03_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double formula = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		int inTheCircleOrNot = (formula <= 10) ? 1: -1;
		System.out.println(("("+x+" , "+y+")")+" is "+(inTheCircleOrNot == 1 ? "in the circle" : "not in the circle"));
		
	}

}
