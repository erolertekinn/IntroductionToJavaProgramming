package chapter03;

import java.util.Scanner;

public class Exercise03_03 {

	public static void main(String[] args) {
		double a,b,c,d,e,f,x,y,control;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("## PROGRAMS THAT CALCULATE THE VALUE OF X AND Y ##");
		System.out.println("ax + by = e");
		System.out.println("cx + dy = f");
		System.out.print("Enter a, b, c, d, e, f : ");
		a = keyboard.nextDouble();
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();
		d = keyboard.nextDouble();
		e = keyboard.nextDouble();
		f = keyboard.nextDouble();
		
		control = a * d - b * c;
		
		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);
		
		if(control == 0) {
			System.out.println("The equation has no solution");
		}
		else {
        System.out.println("x is " + x + " and y is " +y);
		}
        

	}

}
