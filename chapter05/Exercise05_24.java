package chapter05;

public class Exercise05_24 {
	public static void main(String[] args) {
		double sum=0.0;
		
		for (double i = 1; i <= 97; i+=2) {
			sum = sum + (i / (i + 2));
		}
		System.out.println("Series: 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + " +" ... + 95 / 97 + 97 / 99");		
		System.out.println("Sum equal to :"+sum);
	}
}