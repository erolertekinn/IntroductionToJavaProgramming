package chapter10.Exercise10_03;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public boolean isEven() {
		return isEven(value);
	}

	public boolean isOdd() {
		return isOdd(value);
	}

	public boolean isPrime() {
		return isPrime(value);
	}

	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}

	public static boolean isOdd(int value) {
		return (value % 2 != 0);
	}

	public static boolean isPrime(int value) {
		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}

	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}

	public static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}

	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger myInteger) {
		return(this.value==myInteger.value);		
	}

	public static int parseInt(char[] ch){
	    int result=0;
	    for(int i=0;i<ch.length;i++){
	    	// birler onlar yüzler`i result*10 ile sagliyoruz
	        result=result*10+(ch[i]-'0');
	    }
	    return result;
	}

	public static int parseInt(String a) {
		int value = 0;
		for (int i = 0, j = (int) Math.pow(10, a.length() - 1); i < a.length(); i++, j /= 10) {
			value += (a.charAt(i) - '0') * j;
		}
		return value;
	}

	public int getValue() {
		return value;
	}

}