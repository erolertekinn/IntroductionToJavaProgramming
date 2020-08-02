package chapter03;

import java.util.Scanner;

public class Exercise03_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create Scanner

		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		boolean k = (egim(x0,y0,x1,y1) == egim(x0,y0,x2,y2)) == (egim(x1,y1,x0,y0) == egim(x1,y1,x2,y2)) == (egim(x2,y2,x0,y0) == egim(x2,y2,x1,y1));
		if(k){
			System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + x1 + ")");
		}
		
		else {
			System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + x1 + ")");
		}

	}

	private static double egim(double a0,double a1,double b0,double b1) {
		double m = (b1-b0)/(a1-a0);
		return m;
	
	}

}
