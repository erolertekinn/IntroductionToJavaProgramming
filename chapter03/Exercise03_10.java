package chapter03;

import java.util.Scanner;

public class Exercise03_10 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		
		System.out.print(a+"+"+b+" = ? ");
		int answer = keyboard.nextInt();
		String c = (a+b==answer) ? "true" : "false.The right answer is "+(a+b);
		System.out.println("Your answer is "+c);
		
	}

}
