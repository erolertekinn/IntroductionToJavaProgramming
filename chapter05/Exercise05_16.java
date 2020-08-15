package chapter05;

import java.util.Scanner;

public class Exercise05_16 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Bir sayi giriniz :");
		int sayi1 = keyboard.nextInt();

		// 1. aldigim sayiyi b�len birden farkli en k�c�k sayi baslangic noktam
		// 2.
		// a.Sayi mod checknumber 0 `a esitse checknumberi yazdir.
		// Sayi b�l� checknumber yap YENI SAYIN B�L�M
		// b.Sayi mod checknumber != 0`a checknumber`i 1 arttir.
		// 3. Bu d�ng� checknumber ve sayimin b�l�m� 1 e esit olmadigi s�rece devam
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
