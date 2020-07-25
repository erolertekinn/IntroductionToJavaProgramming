package chapter02;

public class Exercise02_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		System.out.println("a     b     pow(a, b)");
		for(a=1; a<6;a++) {
			b = a + 1;
			c = (int) Math.pow(a, b);
			System.out.println(a+"     "+b+"     "+c+"     ");
			
		}

	}

}
