package chapter04;

import java.util.Scanner;

public class Exercise04_15 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a letter : ");
		String str = keyboard.nextLine();
		
		char chr = str.charAt(0);
		chr = Character.toUpperCase(chr);
		int chrInt = (int) chr;
		
		System.out.print("The corresponding number is "+correspondingNumber(chrInt));
	}
	public static int correspondingNumber(int chr) {
		int result = 0;
		if(chr>=87 || chr==39)
			result = 9;
		else if(chr>=84|| chr==38)
			result = 8;
		else if(chr>=80|| chr==37)
			result = 7;
		else if(chr>=77|| chr==36)
			result = 6;
		else if(chr>=74|| chr==35)
			result = 5;
		else if(chr>=71|| chr==34)
			result = 4;
		else if(chr>=68|| chr==33)
			result = 3;
		else if(chr>=65|| chr==32)
			result = 2;
		else if (chr==31)
			result = 1;
		else if (chr ==30)
			result = 0;
		
		return result;
		
	}

}
