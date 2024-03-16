package minggu5;

import java.util.Scanner;

public class MainSum07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5,9)");
        
        System.out.print("Masukkan jumlah bulan : ");
        int elemen = sc.nextInt();
        
        
        Sum07[] phs = new Sum07[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + " : ");
            int month = sc.nextInt();
            phs[i] = new Sum07(month);

            System.out.println("Masukkan keuntungan untuk perusahaan ke-" + (i + 1));
            for (int j = 0; j < phs[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " : ");
                phs[i].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("==============================================================");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + phs[i].elemen + " bulan adalah = " + String.format("%.2f",phs[i].totalBF(phs[i].keuntungan)));
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + phs[i].elemen + " bulan adalah = " + String.format("%.2f",phs[i].totalDC(phs[i].keuntungan, 0, phs[i].elemen - 1)));
            System.out.println("==============================================================");
        }
    }
}