package chapter09.Exercise09_01;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle rectangle1= new Rectangle(4,40);
		Rectangle rectangle2= new Rectangle(3.5, 35.9);
		// A no-arg constructor that creates a default rectangle.(ADITIONAL)
		Rectangle rectangle3= new Rectangle();
		
		System.out.println( "Rectangle 1: "
				+ "\nwidth: " + rectangle1.width + 
				  "\nheight: " + rectangle1.height + 
				  "\narea: " +rectangle1.getArea() + 
				  "\nperimeter: " + rectangle1.getPerimeter()+
				  "\n*****************************");
		
		
		System.out.println( "Rectangle 2: "
				+ "\nwidth: " + rectangle2.width + 
				  "\nheight: " + rectangle2.height + 
				  "\narea: " +rectangle2.getArea() + 
				  "\nperimeter: " + rectangle2.getPerimeter()+
				  "\n*****************************");
		
		// Print no-arg constructor
		System.out.println( "Rectangle 3: "
				+ "\nwidth: " + rectangle3.width + 
				  "\nheight: " + rectangle3.height + 
				  "\narea: " +rectangle3.getArea() + 
				  "\nperimeter: " + rectangle3.getPerimeter());

	}

}