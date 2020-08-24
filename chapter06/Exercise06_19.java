package chapter06;

import java.util.Scanner;

public class Exercise06_19 {
	public static void main(String[] args) {
		double x1, x2, x3, y1, y2, y3, side1, side2, side3;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter three points for a triangle : ");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		x2 = keyboard.nextDouble();
		y2 = keyboard.nextDouble();
		x3 = keyboard.nextDouble();
		y3 = keyboard.nextDouble();

		side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

		System.out.printf("The area of the triangle is %5.2f \n" , area(side1, side2, side3));
		System.out.println(isValid(side1, side2, side3)?"Input is Valid":"Input is not Valid");
	}

	public static boolean isValid(double side1, double side2, double side3) {
		return ((side1+side2)>side3) && ((side1+side3)>side2) && ((side2+side3)>side1);
		
	}

	public static double area(double side1, double side2, double side3) {

		double u = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));
		return area;

	}

}
