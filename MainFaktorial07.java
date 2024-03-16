package minggu5;

import java.util.Scanner;

import java.util.Scanner;

public class MainFaktorial07 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.println("=====================================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int jumlahElemen = masukan.nextInt();

        Faktorial07[] faktorial = new Faktorial07[jumlahElemen];
        for(int i = 0; i < jumlahElemen; i++) {
            faktorial[i] = new Faktorial07();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            faktorial[i].nilai = masukan.nextInt();
        }

        System.out.println("=====================================================================");
        System.out.println("Hasil faktorial dengan Metode Brute Force");
        long startTimeBF = System.nanoTime();
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Faktorial dari nilai " + faktorial[i].nilai + " adalah : " + faktorial[i].faktorialBF(faktorial[i].nilai));
        }
        long endTimeBF = System.nanoTime();
        System.out.println("Waktu eksekusi Metode Brute Force untuk n=" + jumlahElemen + ": " + (endTimeBF - startTimeBF) + " nanodetik");

        System.out.println("=====================================================================");
        System.out.println("Hasil faktorial dengan Metode Divide and Conquer");

        long startTimeDC = System.nanoTime();
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Faktorial dari nilai " + faktorial[i].nilai + " adalah : " + faktorial[i].faktorialDC(faktorial[i].nilai));
        }
        long endTimeDC = System.nanoTime();
        System.out.println("Waktu eksekusi Metode Divide and Conquer untuk n=" + jumlahElemen + ": " + (endTimeDC - startTimeDC) + " nanodetik");

        System.out.println("=====================================================================");
    }
}
