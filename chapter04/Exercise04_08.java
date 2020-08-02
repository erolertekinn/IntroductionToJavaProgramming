package chapter04;

import java.util.Scanner;

public class Exercise04_08 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);


		System.out.print("Enter an ASCII code: ");
		int number = keyboard.nextInt();
		
		if(!((number >= 0) && (number <=127))){
			while(!((number >= 0) && (number <=127))) {
			System.out.print("Enter an ASCII code again: ");
			number = keyboard.nextInt();
			
			}
		}
		char character = (char)number;
		

		System.out.println(	"The character for ASCII code "+number+" is "+character);
	}
}
