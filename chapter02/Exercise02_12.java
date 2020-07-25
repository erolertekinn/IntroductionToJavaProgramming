package chapter02;

import java.util.Scanner;

public class Exercise02_12 {

	public static void main(String[] args) {
		
		double speed,acceleration,minRunway;
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration : ");
		speed = klavye.nextDouble();
		acceleration = klavye.nextDouble();
		
		minRunway = Math.pow(speed, 2) / (2*acceleration);
		System.out.println("The minimum runway length for this airplane is "+minRunway);

	}

}
