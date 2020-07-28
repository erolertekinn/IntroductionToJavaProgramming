package chapter03;

import java.util.Scanner;

public class Exercise03_07 {

	public static void main(String[] args) {
		double pocketMoney,pocketMoneyInCents;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Please enter the money in your pocket = ");
		pocketMoney = keyboard.nextDouble();
		pocketMoneyInCents = pocketMoney * 100;
		
		int dolars = (int) (pocketMoneyInCents / 100);
		int cents = (int) (pocketMoneyInCents % 100);
	
		int c25 = cents / 25;
		cents = cents % 25;
		
		int c10 = cents / 10;
		cents = cents % 10;
		
		int c5 = cents / 5;
		int c1 = cents % 5;
		
		System.out.println("Your pocket money consist of :");
		System.out.println(dolars+ (dolars == 1 ? " dolar" : " dolars"));
		System.out.println(c25+ (c25 == 1 ? " quarter" : " quarters"));
		System.out.println(c10+ (c10 == 1 ? " dime" : " dimes"));
		System.out.println(c5+ (c5 == 1 ? " nickel" : " nickels"));
		System.out.println(c1+ (c1 == 1 ? " pennie" : " pennies"));
		
	}

}
