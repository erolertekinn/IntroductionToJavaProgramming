package chapter05;

import java.util.Scanner;

public class Exercise05_35 {
	
	public static void main(String[] args) {
		double equation = 0;
		for (double i = 1; i <= 624; i++) {
			equation = equation + 1/(Math.pow((i), 0.5)+Math.pow((i+1), 0.5));
		}
		System.out.println("Summation is equal = "+equation);
	}
}