package teknolur;

import java.util.Scanner;

public class odev {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner deger = new Scanner(System.in);
		int[] dizi = new int[4];
		System.out.println("Lütfen 4 adet sayýmýzý giriniz!...");
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = deger.nextInt();
			System.out.println("Dizimizin " + (i + 1) + ".ncý elemaný :" + dizi[i]);

		}

		performansHesapla(dizi);
	}

	public static void performansHesapla(int[] dizi) {
		dogruluk(dizi);
		kesinlik(dizi);
		hassasiyet(dizi);
		Fskor(dizi);
	}

	public static void dogruluk(int[] dizi) {
		System.out.println("Dogruluk puaný:" + (dizi[0] + dizi[3]) / (float) (dizi[0] + dizi[1] + dizi[2] + dizi[3]));
	}

	public static void kesinlik(int[] dizi) {
		System.out.println("Kesinlik puaný:" + dizi[0] / (float) (dizi[0] + dizi[2]));
	}

	public static void hassasiyet(int[] dizi) {
		System.out.println("Kesinlik:" + (dizi[0]) / (float) (dizi[0] + dizi[1]));
	}

	public static void Fskor(int[] dizi) {
		System.out.println(
				"F-skoru:" + 2 * (dizi[0] / (float) (dizi[0] + dizi[2]) * ((dizi[0] / (float) (dizi[0] + dizi[1])))
						/ (dizi[0] / (float) (dizi[0] + dizi[1]) + dizi[0] / (float) (dizi[0] + dizi[2]))));

	}
}
