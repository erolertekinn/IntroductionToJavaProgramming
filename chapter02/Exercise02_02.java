package chapter02;

import java.util.Scanner;
/*
area = radius * radius * pi
volume = area * length
*/
public class Exercise02_02 {

	public static void main(String[] args) {
		
		double area,radius,pi,volume,length;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the radius of the Cylinder :");
		radius = keyboard.nextDouble();
		System.out.print("Please enter the length of the Cylinder :");
		length = keyboard.nextDouble();
		
		area = radius * radius * Math.PI;
		volume =area * length;
		
		System.out.println("The Area of this Cylinder = "+area);
		System.out.println("The Volume of this Cylinder = "+volume);

	}

}
