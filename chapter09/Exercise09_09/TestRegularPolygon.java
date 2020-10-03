package chapter09.Exercise09_09;

public class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon regPol1 = new RegularPolygon();
		RegularPolygon regPol2 = new RegularPolygon(6, 4);
		RegularPolygon regPol3 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println("Perimeter: " + regPol1.getPerimeter()+"\t\t Area: " + regPol1.getArea());
		System.out.println("Perimeter: " + regPol2.getPerimeter()+"\t\t Area: " + regPol2.getArea());
		System.out.println("Perimeter: " + regPol3.getPerimeter()+"\t\t Area: " + regPol3.getArea());
	}
}