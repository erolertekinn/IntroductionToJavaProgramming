package chapter03;

import java.util.Scanner;

public class Exercise03_14 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("## ENTER YOUR GUESS HEADS OR TAILS ##");
		System.out.print("For heads write 0 For tails write 1 = ");
		int guess = keyboard.nextInt();
		
		while(!(guess == 0 || guess == 1)) {
			System.out.print("The value that you enter is not between 0 - 1 please enter again =");
			guess = keyboard.nextInt();
		}
		
		int random = (int)(Math.random() * 100) % 2;
		
		//System.out.println("Random :"+random);
		
		if (random == guess)
			System.out.println("Congratulations! True");
		else
			System.out.println("I am sorry but it is not True");
		
		//System.out.println((guess == random) ? "Your guess is True" : "Your guess is Incorrect");
	}
}
