package chapter04;

import java.util.Scanner;

public class Exercise04_05 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		double numberOfSides = keyboard.nextDouble();
		
		System.out.print("Enter the side: ");
		double lengthOfSide = keyboard.nextDouble();
		
		double area = (numberOfSides*Math.pow(lengthOfSide, 2))/(4*(Math.tan(Math.PI/numberOfSides)));
		
		
		System.out.println("The area of the polygon is "+area);

	}

}
