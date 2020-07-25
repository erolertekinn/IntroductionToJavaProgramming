package chapter01;

public class Exercise01_07 {
	public static void main(String[] args) {
		
		double pi1,pi2;
		pi1 = 4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11));
		pi2 = 4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11) + (1 / 13));
		
		System.out.println("π1="+pi1);
		System.out.println("π2="+pi2);
		
	}


}


/*
		//Solution 2
		System.out.println(4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)));
		System.out.println(4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11) + (1 / 13)));
*/