package chapter06;

public class Exercise06_11 {

	public static void main(String[] args) {
		// Display table
		System.out.println("\n SalesAmount     Commission");
		System.out.println("-----------------------------");
		for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.printf(" %-16.0f", salesAmount);
			System.out.printf("%8.1f\n", computeCommission(salesAmount));
		}
	}

	
	public static double computeCommission(double salesAmount) {
		double balance, 
				commission; 
		balance = commission = 0.0; 
		// 12000 20000
		if (salesAmount >= 10000.01) {
			balance = salesAmount - 10000;
			commission = commission + (balance) * 0.12;
			salesAmount = 10000;

		}
		// 10000 5000
		if (salesAmount >= 5000.01) {
			balance = salesAmount - 5000;
			commission = commission + (balance) * 0.10;
			salesAmount = 5000;
		}
		// 5000
		if (salesAmount >= 0.01) {
			balance = salesAmount - 0.01;
			commission = commission + (balance * 0.08);
		}
		return commission;
	}
}