package chapter10.Exercise10_02;

public class BMITest {

	public static void main(String[] args) {
		//BMI bmi1 = new BMI(name, weight, height);
		BMI bmi1 = new BMI("Erol", 300, 180);
		System.out.println("BMI of the canditate " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
		//BMI bmi2 = new BMI(name, age, weight, height);
		BMI bmi2 = new BMI("Ozgur", 45, 300,170);
		System.out.println("BMI of the canditate " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
		//BMI bmi3 = new BMI(name, age, weight, feet, inches);
		BMI bmi3 = new BMI("Ozgur", 45, 300,15,6);
		System.out.println("BMI of the canditate " + bmi3.getName() + " is " + bmi3.getBMI() + " " + bmi3.getStatus());
		
		

	}

}