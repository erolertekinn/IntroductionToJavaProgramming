package chapter05;

import java.util.Scanner;

public class Exercise05_46 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a text please : ");
		String text = keyboard.next();
		String textReverse = "";
		for (int i = text.length()-1; i>=0 ; i--) {
			textReverse = textReverse + text.charAt(i);
	
		}
		System.out.println("The reverse of the given Text is : "+textReverse);
	}

}
