package chapter04;

import java.util.Scanner;

public class Exercise04_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double RADIUS = 6371.01;

		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		String firstPoint = input.nextLine();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		String secondPoint = input.nextLine();

		int placeOfComma = firstPoint.indexOf(',');
		//substringde baslangic ve bitis dahil
		double x1 = Double.parseDouble(firstPoint.substring(0, placeOfComma - 1));
		double y1 = Double.parseDouble(firstPoint.substring(placeOfComma + 2));

		placeOfComma = secondPoint.indexOf(',');
		//substringde baslangic ve bitis dahil
		double x2 = Double.parseDouble(secondPoint.substring(0, placeOfComma - 1));
		double y2 = Double.parseDouble(secondPoint.substring(placeOfComma + 2));

		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
				

		System.out.println("The distance between the two points is " + distance);

	}

}
