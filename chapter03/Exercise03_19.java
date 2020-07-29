package chapter03;

import java.util.Scanner;

public class Exercise03_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edge1,edge2,edge3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the three edges of a triangle :");
		edge1 = keyboard.nextInt();
		edge2 = keyboard.nextInt();
		edge3 = keyboard.nextInt();
		
		if(edge1 < (edge2 + edge3) && edge2 < (edge1 + edge3) && edge3 < (edge2 + edge3)) {
			System.out.println("Perimeter = "+(edge1+edge2+edge3));
		}
		else {
			System.out.println("The values that you enter is not represent a Triangle");
		}
	}

}
