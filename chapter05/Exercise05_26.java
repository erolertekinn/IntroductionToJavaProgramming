package chapter05;

public class Exercise05_26 {
	public static void main(String[] args) {
		double fact = 1;
		double sum = 1;
		for (double i = 1.0; i <= 100000.0; i++) {
			fact = fact * i;
			sum = sum + 1/fact;
			if(i==10000) {
				
				System.out.println("The e value for i = 10000: "+sum);
			}
			if(i==20000) {
				System.out.println("The e value for i = 20000: "+sum);
			}
			if(i==100000) {
				System.out.println("The e value for i = 100000: "+sum);
			}
		}
			
		}

}
