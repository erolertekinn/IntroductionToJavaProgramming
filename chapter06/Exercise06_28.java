package chapter06;

public class Exercise06_28 {
	public static void main(String[] args) {
		
		System.out.println("p\t\t2^p –1");
		System.out.println("------------------------");
		
		
		for (int p = 2; p <= 31; p++) {
			if (isPrime(p)) {
				System.out.println(p + "\t\t" + ((int) (Math.pow(2, p)) - 1));
				
			}
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
