package chapter02;

import java.util.Scanner;

//  "(For example, 1156 represents 11 dollars and 56 cents.):");
//11,56
public class Exercise02_22 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("How much money have you got in your pocket ? ");
		double pocketMoney = keyboard.nextDouble();
		
		int exPocketMoney =  (int) (pocketMoney * 100);
		int remainingPart =  exPocketMoney % 100;
		
		//---Dolars---
		int mainPart = exPocketMoney / 100;
		
		//---25 cents---
		int c25 = remainingPart / 25;
		remainingPart = remainingPart % 25;
		//---10 cents---
		int c10 = remainingPart / 10;
		remainingPart = remainingPart % 10;
		//---5 cents---
		int c5 = remainingPart / 5;
		//---1 cents---
		int c1 = remainingPart % 5;
		
		System.out.println("Number of Dolars : "+mainPart);
		System.out.println("Number of 25 Cents :"+c25);
		System.out.println("Number of 10 Cents :"+c10);
		System.out.println("Number of 5 Cents :"+c5);
		System.out.println("Number of 1 Cents :"+c1);
		
		
	}

}
