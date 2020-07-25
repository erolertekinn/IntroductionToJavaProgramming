package chapter02;

import java.util.Scanner;

public class Exercise02_15 {

	public static void main(String[] args) {
		
		double x1,x2,y1,y2,distance;
		Scanner klavye = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		x1 = klavye.nextDouble();
		y1 = klavye.nextDouble();
		System.out.print("Enter x2 and y2: ");
		x2 = klavye.nextDouble();
		y2 = klavye.nextDouble();
		distance = Math.pow((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)), 0.5);
		System.out.println("The distance between the two points is "+distance);
	}

}
