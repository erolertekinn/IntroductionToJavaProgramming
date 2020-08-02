package chapter03;

import java.util.Scanner;

public class Exercise03_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		boolean inRectangle = Math.pow(Math.pow(x, 2), 0.5) <= 5 || Math.pow(Math.pow(y, 2), 0.5) <= 2.5;
		String result = inRectangle ? ("Points ("+x+" , "+y+") inside of the rectangle") : ("Points ("+x+" , "+y+") outside of the rectangle");
		System.out.println(result);
			
	}

}
