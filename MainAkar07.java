package minggu5;

import java.util.Scanner;

public class MainAkar07 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan bilangan yang ingin dihitung akarnya: ");
        double angka = masukan.nextDouble();

        Akar07 akar = new Akar07();
        System.out.println("=====================================================");
        System.out.println("Hasil akar dengan Metode Brute Force");
        System.out.println("Akar dari " + angka + " adalah : " + akar.akarBF(angka));

        System.out.println("=====================================================");
        System.out.println("Hasil akar dengan Metode Divide and Conquer");
        System.out.println("Akar dari " + angka + " adalah : " + akar.akarDC(angka, 0, angka));
    }
}

