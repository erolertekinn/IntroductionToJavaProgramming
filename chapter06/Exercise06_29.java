package chapter06;

public class Exercise06_29 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 2; i < 1000; i++) {
			if(isPrime(i) && isPrime(i + 2))
				System.out.println("(" + i + ", " + (i + 2) + ")");
				
		}
	}

	public static boolean isPrime(int p) {
		boolean isPrime = true;
		for (int i = 2; i <= p/2; i++) {
			if(p%i==0) {
				isPrime = false;
			}
			
		}
		

		return isPrime;
	}
}
