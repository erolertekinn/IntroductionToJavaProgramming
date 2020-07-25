package chapter02;
//C(ABC) = a + b + c
//u = C(ABC) / 2
//A(ABC) = sqrt(u.(u-a).(u-b).(u-c))
import java.util.Scanner;

public class Exercise02_19 {
	public static void main(String[] args) {
		double x1,x2,x3,y1,y2,y3,a,b,c,u,area;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter three points for a triangle : ");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		x2 = keyboard.nextDouble();
		y2 = keyboard.nextDouble();
		x3 = keyboard.nextDouble();
		y3 = keyboard.nextDouble();
		
		a = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2));
		b = Math.sqrt(Math.pow((x3 - x2) , 2) + Math.pow((y3 - y2) , 2));
		c = Math.sqrt(Math.pow((x3 - x1) , 2) + Math.pow((y3 - y1) , 2));
		u = (a + b + c) / 2;
		area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.print("The area of the triangle is "+area);
	}

}
