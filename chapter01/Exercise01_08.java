package chapter01;

public class Exercise01_08 {

	public static void main(String[] args) {
		
		double perimeter, area, r, pi;
		r = 5.5;
		pi=Math.PI;
		
		perimeter = 2 * r * pi;
		area = pi * (Math.pow(r,2));
		
		System.out.println("perimeter="+perimeter);
		System.out.println("area="+area);
		
	}

}


/*
		//Solution 2
		System.out.print("Cevre = ");
		System.out.println(2 * 5.5 * 3.14);
		System.out.print("Alan = ");
		System.out.println(3.14 * 5.5 * 5.5);

*/