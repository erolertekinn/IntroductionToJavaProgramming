package chapter02;

import java.util.Scanner;

public class Exercise02_16 {

	public static void main(String[] args) {
		double side,area;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the side : ");
		side = keyboard.nextDouble();
		area = 3 * Math.sqrt(3) / 2 *Math.pow(side, 2);
		System.out.print("The area of the hexagon is "+area);
		
	}

}
