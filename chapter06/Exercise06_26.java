package chapter06;

import java.util.Scanner;

public class Exercise06_26 {
	public static void main(String[] args) {

		int counter=0;
			for (int i = 2; counter<=99; i++) {
				if(palidron(i) && prime(i)) {
					counter++;
					System.out.print(i+"\t");
					if(counter%10==0) {
						System.out.println();
					}
				}
			}
	

	}
	public static boolean palidron(int i) {
		boolean isPalindromic=false;
		String iStr = ""+i;
		String rStr="";
		
		for (int j = iStr.length()-1; j >= 0; j--) {
			rStr=rStr+iStr.charAt(j);
		}
		
		if(rStr.equals(iStr))
			isPalindromic=true;
		return isPalindromic;
	}
	public static boolean prime(int i) {
		boolean result=true;
		for (int j = 2; j <= i/2; j++) {
			if(i%j==0) {
				result = false;
			}

		}

		
		return result;
	}
	

}
