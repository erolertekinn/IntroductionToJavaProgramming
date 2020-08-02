package chapter04;

import java.util.Scanner;

public class Exercise04_11 {

	public static void main(String[] args) {
		System.out.println("Enter a decimal value (0 to 15)");
		Scanner keyboard = new Scanner(System.in);
		
		int decimalValue = keyboard.nextInt();
		
		if((decimalValue>-1) && (decimalValue<10)){
			System.out.println("The hex value is:"+decimalValue);
			
		}
		else if( (decimalValue>10)&&(decimalValue<16) ){
			switch(decimalValue){
			case(10):System.out.println("The hex value is: A");break;
			case(11):System.out.println("The hex value is: B");break;
			case(12):System.out.println("The hex value is: C");break;
			case(13):System.out.println("The hex value is: D");break;
			case(14):System.out.println("The hex value is: E");break;
			case(15):System.out.println("The hex value is: F");break;
			
			}
		}
		else {
			System.out.println("Enter a value between 1-15");
		}


	}

}
