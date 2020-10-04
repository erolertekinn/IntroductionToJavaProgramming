package chapter10.Exercise10_03;

public class TestMyInteger {
	public static void main(String[] args) {
		System.out.println("--Create OBJ1-- ");
		MyInteger obj1 = new MyInteger(8);

		System.out.println("Value of OBJ1");
		System.out.println(obj1.getValue());
		System.out.println("********************************************");
		System.out.println("Check Even-Odd-Prime");
		System.out.println("isEven(), isOdd(), and isPrime()");
		System.out.println(obj1.isEven());
		System.out.println(obj1.isOdd());
		System.out.println(obj1.isPrime());
		System.out.println("********************************************");
		System.out.println("isEven(int), isOdd(int), and isPrime(int)");
		System.out.println(MyInteger.isEven(8));
		System.out.println(MyInteger.isOdd(8));
		System.out.println(MyInteger.isPrime(8));
		System.out.println("********************************************");
		System.out.println("isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger)");
		System.out.println(MyInteger.isEven(obj1));
		System.out.println(MyInteger.isOdd(obj1));
		System.out.println(MyInteger.isPrime(obj1));
		System.out.println("********************************************");
		
		
		
		System.out.println("--Create OBJ2-- ");
		MyInteger obj2 = new MyInteger(3);
		
		System.out.println("Value of OBJ2");
		System.out.println(obj2.getValue());
		System.out.println("********************************************");
		
		System.out.println("Check For Equality ");
		System.out.println("equals(int) and equals(MyInteger)");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(3));
		
		System.out.println("********************************************");
		System.out.println("parseInt(char[])");
		char[] c = { '1', '2' };
		System.out.println(MyInteger.parseInt(c));
		System.out.println("********************************************");
		System.out.println("parseInt(String)");
		String d = "123";
		System.out.println(MyInteger.parseInt(d));
	}
}