package chapter05;

public class Exercise05_12 {

	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n, 2)<12_000) {
			
			n++;
		}
		System.out.println("The smallest integer n such that n^2 > 12,000: "+n);
	}
}
