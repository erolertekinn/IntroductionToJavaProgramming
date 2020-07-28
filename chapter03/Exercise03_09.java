package chapter03;

import java.util.Scanner;

public class Exercise03_09 {
	
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter the first 9 digits of an ISBN as integer : ");
	int isbn = keyboard.nextInt();
	
	//013601267
	//01360126 7
	int d9 = isbn % 10;
	//0136012  6 7
	int d8 = (isbn % 100) / 10;
	//013601   2 67
	int d7 = (isbn % 1000) / 100;
	//01360    1 267
	int d6 = (isbn % 10000) / 1000;
	//0136     0 1267
	int d5 = (isbn % 100000) / 10000;
	//013      6 01267
	int d4 = (isbn % 1000000) / 100000;
	//01       3 601267
	int d3 = (isbn % 10000000) / 1000000;
	//0        1 3601267
	int d2 = (isbn % 100000000) / 10000000;
	//         0 13601267
	int d1 = (isbn % 1000000000) / 100000000;
	
	int d10 = (d1 * 1 + d2 * 2 + d3 *3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
	
	System.out.print("The ISBN-10 number is "+ d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
	
	if (d10 == 10) {
		System.out.println("X");
	}
	else {
		System.out.println(d10);
	}
	
}
}
