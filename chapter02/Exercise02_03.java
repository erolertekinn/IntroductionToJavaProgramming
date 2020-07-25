package chapter02;

import java.util.Scanner;

public class Exercise02_03 {

	public static void main(String[] args) {
		
		double feet, meter;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		feet = keyboard.nextDouble();
		
		meter = feet * (0.305);
		
		System.out.println(feet+" feet is "+meter+" meters");
		

	}

}
