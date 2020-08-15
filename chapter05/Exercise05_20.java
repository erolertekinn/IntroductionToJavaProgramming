package chapter05;

public class Exercise05_20 {
	public static void main(String[] args) { 
		
		int asalSayiSayaci = 0;
		int sayi = 2;

		while (sayi < 1000) {
			boolean asalMi = true;

			for (int i = 2; i < sayi; i++) {

				if (sayi % i == 0) {
					asalMi = false;
				}

				
			}
			if(asalMi==true) {
				asalSayiSayaci++;
				System.out.print(sayi+"\t");
				if(asalSayiSayaci % 8 ==0) {
					System.out.println();
					
				}
			}
			sayi++;
		}

	}

}