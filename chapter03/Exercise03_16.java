package chapter03;

public class Exercise03_16 {

	public static void main(String[] args) {
		
//		(Random point) Write a program that displays a random coordinate in a rectangle.
//		The rectangle is centered at (0, 0) with width 100 and height 200.

		int w = (int)(Math.random() * 100);
		int h = (int)(Math.random() * 200);

		
		System.out.println("(0,"+h+")---------("+w+","+h+")");
		System.out.println("|                      |");
		System.out.println("|                      |");
		System.out.println("|                      |");
		System.out.println("(0,0)-------------("+w+",0)");
		
	}

}
