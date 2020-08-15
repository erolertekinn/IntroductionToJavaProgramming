package chapter05;

public class Exercise05_13 {
	public static void main(String[] args) {
		int n = 0;
		while (n*n*n < 12_000) {

			n++;
		}
	
		System.out.println("The largest integer n such that n^3 < 12,000: " + (--n));
	}

}
