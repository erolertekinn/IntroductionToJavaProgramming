package chapter05;

import java.util.Scanner;

public class Exercise05_16 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Bir sayi giriniz :");
		int sayi1 = keyboard.nextInt();

		// 1. aldigim sayiyi bölen birden farkli en kücük sayi baslangic noktam
		// 2.
		// a.Sayi mod checknumber 0 `a esitse checknumberi yazdir.
		// Sayi bölü checknumber yap YENI SAYIN BÖLÜM
		// b.Sayi mod checknumber != 0`a checknumber`i 1 arttir.
		// 3. Bu döngü checknumber ve sayimin bölümü 1 e esit olmadigi sürece devam
		// etsin

		int checkNumber = 2;

		while ((sayi1 / checkNumber) != 1) {
			if (sayi1 % checkNumber == 0) {
				System.out.print(checkNumber + ", ");
				sayi1 = sayi1 / checkNumber;
			} else {
				checkNumber++;
			}

		}
		System.out.print(sayi1 + ". ");

	}

}
