package chapter04;

import java.util.Scanner;

public class Exercise04_03 {

	public static void main(String[] args) {
		// THIS QUESTION IS NOT FINISHED YET
		
		double atlX = 33.8443700;
		double atlY = -84.4740500;
		
		double orlX = 28.5110300;
		double orlY = -81.3578400;	
		
		double floX = -28.0218230;
		double floY = 153.4234950;
		
		double savX = 32.0753000;
		double savY = -81.1288600;
		
		double chaX = 35.2270869;
		double chaY = -80.84312669999997;

		double atlOrlDistance = distance(atlX,atlY,orlX,orlY);
		double atlFloDistance = distance(atlX,atlY,floX,floY);	
		double atlSavDistance = distance(atlX,atlY,savX,savY);	
		double atlChaDistance = distance(atlX,atlY,chaX,chaY);
		
		double orlFloDistance = distance(orlX, orlX, floX, floY);
		double orlSavDistance = distance(orlX, orlY, floX, floY);
		double orlChaDistance = distance(orlX, orlY, chaX, chaY);
		
		double savChaDistance = distance(savX, savY, chaX, chaY);
		
		boolean reallyTriangle1 = reallyTriangle(atlOrlDistance,atlFloDistance,atlSavDistance);
		
		
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		final double RADIUS = 6371.01;
		double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		return distance;
		
	}
	
	public static double area (double a, double b, double c) {

		double u = (a + b + c) / 2;
		double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		return area;
	}
	
	public static boolean reallyTriangle(double side1, double side2, double side3) {

        return  ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));
                
                

    }

}
