package chapter06;

public class Exercise06_13 {
	public static void main(String[] args) {
		int n = 20;
		System.out.printf("%-2s%5s%8s\n", "i", " ", "m(i)");
		System.out.println("-------------------");
		sumSeries(n);

	}

	public static void sumSeries(int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i / (i + 1.0);
			
			System.out.printf("%-2d%5s%8.4f\n",i," ",sum);
		}

	}
}
