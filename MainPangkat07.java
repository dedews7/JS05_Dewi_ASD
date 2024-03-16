package minggu5;

import java.util.Scanner;

public class MainPangkat07{

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int pilihan = 0;

        System.out.println("=====================================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int jumlahElemen = masukan.nextInt();

        Pangkat07[] pangkatArr = new Pangkat07[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = masukan.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = masukan.nextInt();

            pangkatArr[i] = new Pangkat07(nilai, pangkat);
        }

        while (true) {
            System.out.println();
            System.out.println("=====================================================================");
            System.out.println("Menu Perhitungan Pangkat");
            System.out.println("=====================================================================");

            System.out.println("1. Metode Brute Force");
            System.out.println("2. Metode Divide and Conquer");
            System.out.println("3. Keluar");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("Masukkan pilihan Anda (1/2/3): ");
            pilihan = masukan.nextInt();

            // Switch case untuk memilih metode
            switch (pilihan) {
                case 1:
                        System.out.println("=====================================================================");
                        System.out.println("Hasil Pangkat dengan Metode Brute Force");
                        for (int i = 0; i < jumlahElemen; i++) {
                            System.out.println("Nilai " + pangkatArr[i].nilai + " pangkat " + pangkatArr[i].pangkat + " adalah : " + pangkatArr[i].pangkatBF(pangkatArr[i].nilai, pangkatArr[i].pangkat));
                        };
                    break;
                case 2:
                        System.out.println("=====================================================================");
                        System.out.println("Hasil Pangkat dengan Metode Divide and Conquer");
                        for (int i = 0; i < jumlahElemen; i++) {
                            System.out.println("Nilai " + pangkatArr[i].nilai + " pangkat " + pangkatArr[i].pangkat + " adalah : " + pangkatArr[i].pangkatDC(pangkatArr[i].nilai, pangkatArr[i].pangkat));
                        };
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
