package chapter03;

import java.util.Scanner;

public class Exercise03_32 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = keyboard.nextDouble();
		double y0 = keyboard.nextDouble();
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		
		double positionOfP2 = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		

		
		if (positionOfP2 > 0) {
			System.out.print("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
			
		else if (positionOfP2 < 0) {
			System.out.print("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
		
		else {
			System.out.print("(" + x2 + ", " + y2 + ") is on the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}

	}

}
