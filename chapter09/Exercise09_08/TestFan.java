package chapter09.Exercise09_08;

public class TestFan {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("YELLOW");
		fan1.setOn(true);
		
		System.out.println(fan1.toString());
		
		
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("BLUE");
		fan2.setOn(false);
		
		System.out.println(fan2.toString());

	}
}
