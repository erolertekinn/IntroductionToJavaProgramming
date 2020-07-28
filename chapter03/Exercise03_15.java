package chapter03;

import java.util.Scanner;

public class Exercise03_15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int lottery = (int)(Math.random() * 1000);
		// l3 l2 l1
		int l1 = (lottery % 100) / 10;
		int l2 = (lottery % 100) % 10;
		int l3 = lottery / 10;
		
		System.out.print("Enter a three-digit number = ");
		int number = keyboard.nextInt();
		
		// n3 n2 n1
		int n1 = (number % 100) / 10;
		int n2 = (number % 100) % 10;
		int n3 = number / 10;
		
		while (!(number < 1000 && number > 99)) {
			System.out.println("The number that you give is not a three-digit number");
			System.out.print("Enter a three-digit number = ");
			number = keyboard.nextInt();
		}
		
		System.out.println("Lottery number = "+lottery);
		
		
		if (lottery == number) {
			System.out.println("Your award is $10000");
		}
		
		else if ((l3 == n1 || l3 == n2) && (l2 == n1 || l2 == n3) && (l1 == n2 || l1 == n3)) {
			System.out.println("Your award is $3000");
		}
		
		else if ((l1 == n1 || l2 == n2 || l3 == n3) || (l1 == n2 || l1 == n3 || l2 == n1 || l2 == n3 || l3 == n1 || l3 == n2)) {
			System.out.println("Your award is $1000");
		}
		
		else {
			System.out.println("You are a total loser.. :(");
		}	
		

	}

}
