package chapter05;

import java.util.Scanner;

public class Exercise05_02 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		long begin = System.currentTimeMillis();
		int correct = 0;
		int uncorrect = 0;
		String output = "";
		int i = 0;
		while (i < 10) {
			int sayi1 = (int) (Math.random() * 16);
			int sayi2 = (int) (Math.random() * 16);
			System.out.print(sayi1 + " + " + sayi2 + "? ");
			int answer = keyboard.nextInt();

			if ((sayi1 + sayi2 == answer)) {
				System.out.println("Answer is correct.");
				correct++;
			} else {
				System.out.println("Answer is false " + sayi1 + " + " + sayi2 + " is equal to " + (sayi1 + sayi2));
				uncorrect++;
			}
			i++;
			output = output +"\n"+ sayi1 + " + " + sayi2+" = "+ answer + ((sayi1+sayi2==answer)?" your answer is true":" your answer is false");
					

		}
		System.out.println(output);
		System.out.println("Number of correct answers: "+correct);
		System.out.println("Number of uncorrect answers: "+uncorrect);
		long end = System.currentTimeMillis();
		long processSeconds = (end-begin)/1000;
		System.out.println("Test time in Seconds  "+processSeconds);
	}
}
